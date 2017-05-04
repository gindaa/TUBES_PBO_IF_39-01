/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Buku;
import java.sql.*;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.TableModel;

/**
 *
 * @author GIN
 */
public class insertBuku extends javax.swing.JFrame {

    /**
     * Creates new form ABuku
     */
    public insertBuku() {
        initComponents();
        Show_buku();
    }

    public Connection getConnection()
    {
        Connection con;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/perpus","root","" );
            return con;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public ArrayList<Buku> getBukuList()
    {
        ArrayList<Buku> BukuList = new ArrayList<Buku>();
        Connection connection = getConnection();
        String query = "SELECT * FROM perpus.buku" ;
        Statement st;
        ResultSet rs; 
        try{
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Buku buku = null;
            while(rs.next()){
                buku = new Buku(rs.getString("idBuku"),rs.getString("namaBuku"),rs.getInt("Halaman"),rs.getString("penerbit"),rs.getString("pengarang"),rs.getString("genre"),rs.getString("kategori"));
                BukuList.add(buku);
            }
        }catch (Exception e) {
                e.printStackTrace();
                }
        return BukuList;
                }
    public void Show_buku()
    {
        ArrayList<Buku> list = getBukuList();
        DefaultTableModel model = (DefaultTableModel) ViewBuku.getModel();
        Object[] row = new Object[8];
        for (int i= 0; i <list.size();i++)
        {
            row[0] = list.get(i).getIdBuku();
            row[1] = list.get(i).getNamaBuku();
            row[2] = list.get(i).getJumlahHalaman();
            row[3] = list.get(i).getPenerbit();
            row[4] = list.get(i).getPengarang();
            row[5] = list.get(i).getGenre();
            row[6] = list.get(i).getKategori();
            
            model.addRow(row);
            
        }
    }
        public void executeSQLQuery(String query,String message)
        {
            Connection con = getConnection();
            Statement st;
            try{
                st = con.createStatement();
                if((st.executeUpdate(query) == 1)){
                    JOptionPane.showMessageDialog(null, "Data"+ message + "Succesfully");
                    DefaultTableModel model = (DefaultTableModel)ViewBuku.getModel();
                    model.setRowCount(0);
                    Show_buku();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Data not " + message);
                }
            }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inIdBuku = new javax.swing.JTextField();
        inKategori = new javax.swing.JTextField();
        inPengarang = new javax.swing.JTextField();
        inNamaBuku = new javax.swing.JTextField();
        inHal = new javax.swing.JTextField();
        inPenerbit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inGenre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewBuku = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID BUKU");

        jLabel2.setText("NAMA BUKU");

        jLabel3.setText("JUMLAH HALAMAN");

        jLabel4.setText("PENERBIT");

        jLabel5.setText("PENGARANG");

        jLabel6.setText("KATEGORI");

        jLabel7.setText("GENRE");

        ViewBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID BUKU", "NAMA BUKU", "HALAMAN", "PENGARANG", "PENERBIT", "GENRE", "KATEGORI"
            }
        ));
        ViewBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ViewBuku);

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inPengarang)
                                .addComponent(inKategori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inNamaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inHal, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapus))
                            .addComponent(inGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inNamaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inHal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(inPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(inGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus)
                    .addComponent(simpan))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String querry = "INSERT INTO `buku`(`idBuku`, `namaBuku`, `Halaman`, `pengarang`, `penerbit`, `kategori`, `genre`) VALUES ('"+inIdBuku.getText()+"','"+inNamaBuku.getText()+"','"+inHal.getText()+"','"+inPengarang.getText()+"','"+inPenerbit.getText()+"','"+inKategori.getText()+"','"+inGenre.getText()+"')";
        executeSQLQuery(querry, "Inserted");
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        String querry = "DELETE FROM `buku` WHERE idBuku = "+inIdBuku.getText();
            executeSQLQuery(querry, "Deleted");
    }//GEN-LAST:event_hapusActionPerformed

    private void ViewBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewBukuMouseClicked
        int i = ViewBuku.getSelectedRow();
        TableModel model = ViewBuku.getModel();
        inIdBuku.setText(model.getValueAt(i,0).toString());
        inNamaBuku.setText(model.getValueAt(i,1).toString());
        inHal.setText(model.getValueAt(i,2).toString());
        inPenerbit.setText(model.getValueAt(i,3).toString());
        inPengarang.setText(model.getValueAt(i,4).toString());
        inGenre.setText(model.getValueAt(i,5).toString());
        inKategori.setText(model.getValueAt(i,6).toString());
        
    }//GEN-LAST:event_ViewBukuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(insertBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertBuku().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ViewBuku;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField inGenre;
    private javax.swing.JTextField inHal;
    private javax.swing.JTextField inIdBuku;
    private javax.swing.JTextField inKategori;
    private javax.swing.JTextField inNamaBuku;
    private javax.swing.JTextField inPenerbit;
    private javax.swing.JTextField inPengarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton simpan;
    // End of variables declaration//GEN-END:variables
}