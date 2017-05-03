/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author pejuangTubes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buku b1 = new Buku("001", "Bahasa Indonesia", 20, "Rumah", "Saya", "TextBook", "Formal");
        Petugas p1 = new Petugas("Dio", 192, 857, "Vandani", "P001");
        
        
        System.out.println("Nama Buku : "+b1.getNamaBuku());
        System.out.println("Jumlah halaman : "+b1.getJumlahHalaman());
        System.out.println("Penerbit : "+b1.getPenerbit());
        
        
    }
    
}
