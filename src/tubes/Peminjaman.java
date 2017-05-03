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
        private String namaMember;
        private double denda;
        private int jumlahPinjam;
        private String namaBuku;
        private String idMember;
        private int bayarDenda;
        String tglAwal;
        String tglAkhir;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    public Peminjaman(String idMember, String namaMember, String namaBuku, String tglAwal, String tglAkhir, int jumlahPinjam) {
        this.namaBuku = namaBuku;
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.tglAkhir = tglAkhir;
        this.tglAwal = tglAwal;
        this.jumlahPinjam = jumlahPinjam;
    }
    
    public String getNamaBuku() {
        return namaBuku;
    }
    
    public String getIdMember() {
        return idMember;
    }
    
    public long getSelisih() {
        return selisih;
    }

    public String getNamaMember() {
        return namaMember;
    }
    
    public String getTglAwal() {
        return tglAwal;
    }
    
    public String getTglAkhir() {
        return tglAkhir;
    }
    
    public int getJumlahPinjam() {
        return jumlahPinjam;
    }
    
    public void setSelisih() throws ParseException {
        Date tglA = sdf.parse(tglAwal);
        Date tglB = sdf.parse(tglAkhir);
        selisih = TimeUnit.MILLISECONDS.toDays(tglB.getTime() - tglA.getTime());
    }
    
    public void setTanggalAwal(String tglAwal) {
        this.tglAwal = tglAwal;
    }
    
    public void setTanggalAkhir(String tglAkhir) {
        this.tglAkhir = tglAkhir;
    }
    
    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
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