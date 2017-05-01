/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.text.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
/**
*
* @author pejuangTubes
*/
public class Peminjaman implements Denda {
        private long selisih;
        private double denda;
        private int jumlahPinjam;
        private String namaBuku;
        private int bayarDenda;
        String tglAwal = "01-01-2001";
        String tglAkhir = "20-01-2001";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    /* public Peminjaman(Member mb, Buku bk, int jumlahPinjam) {
        this.namaBuku = bk.getNamaBuku();
        this.jumlahPinjam = jumlahPinjam;
    } **/

    public long getSelisih() {
        return selisih;
    }

    public void setSelisih() throws ParseException {
        Date tglA = sdf.parse(tglAwal);
        Date tglB = sdf.parse(tglAkhir);
        selisih = TimeUnit.MILLISECONDS.toDays(tglB.getTime() - tglA.getTime());
        //System.out.println(Long.valueOf(selisih) +" hari");
    }
    
    public void setTanggal(String tglAwal) throws ParseException {
        this.tglAwal = tglAwal;
        //Peminjaman p2 = new Peminjaman();
        //p2.setSelisih();
    }
    
    @Override
        public void hitungDenda() {
            if (selisih - 7 == 0) {
                System.out.println("Tidak ada denda");
            } else {
                denda = selisih * 500;
                System.out.println(denda);
            }
        }
    
}