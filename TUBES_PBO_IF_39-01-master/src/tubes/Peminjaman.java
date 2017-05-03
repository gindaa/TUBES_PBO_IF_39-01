/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.util.*;
/**
*
* @author pejuangTubes
*/
public class Peminjaman {
        public int bulanPinjam;
        public int tanggalPinjam;
        public int tahunpinjam;
        public int bulanKembali;
        public int tanggalKembali;
        public int tahunKembali;
        public int batasTanggal;
        public int batasBulan;
        public int batasTahun;
        public int selisih;
        public Denda Denda;
        public ArrayList Buku = new ArrayList<Buku>();
        public Member Member;

    public Peminjaman(int bulanPinjam, int tanggalPinjam, int tahunpinjam, int batasTanggal, int batasBulan, int batasTahun, Member Member, ArrayList Buku) {
        this.bulanPinjam = bulanPinjam;
        this.tanggalPinjam = tanggalPinjam;
        this.tahunpinjam = tahunpinjam;
        this.batasTanggal = batasTanggal;
        this.batasBulan = batasBulan;
        this.batasTahun = batasTahun;
        this.Member = Member;
        this.Buku = Buku;
    }
    
    public void setBulanPinjam(int bulanPinjam) {
        this.bulanPinjam = bulanPinjam;
    }

    public void setTanggalPinjam(int tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public void setTahunpinjam(int tahunpinjam) {
        this.tahunpinjam = tahunpinjam;
    }

    public void setBulanKembali(int bulanKembali) {
        this.bulanKembali = bulanKembali;
    }

    public void setTanggalKembali(int tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public void setTahunKembali(int tahunKembali) {
        this.tahunKembali = tahunKembali;
    }

    public void setDenda(Denda Denda) {
        this.Denda = Denda;
    }

    public int getBulanPinjam() {
        return bulanPinjam;
    }

    public int getTanggalPinjam() {
        return tanggalPinjam;
    }

    public int getTahunpinjam() {
        return tahunpinjam;
    }

    public int getBulanKembali() {
        return bulanKembali;
    }

    public int getTanggalKembali() {
        return tanggalKembali;
    }

    public int getTahunKembali() {
        return tahunKembali;
    }

    public Denda getDenda() {
        return Denda;
    }

    public int getBatasTanggal() {
        return batasTanggal;
    }

    public int getBatasBulan() {
        return batasBulan;
    }

    public int getBatasTahun() {
        return batasTahun;
    }

    public int getSelisih() {
        return selisih;
    }

    public void setBatasTanggal(int batasTanggal) {
        this.batasTanggal = batasTanggal;
    }

    public void setBatasBulan(int batasBulan) {
        this.batasBulan = batasBulan;
    }

    public void setBatasTahun(int batasTahun) {
        this.batasTahun = batasTahun;
    }

    public void setSelisih(int selisih) {
        this.selisih = selisih;
    }
    
    class Telat implements Denda {
        int bayarDenda;
        
        @Override
        public void hitungDenda() {
            if (tanggalKembali > 14) {
                selisih = (tanggalKembali + (30*tanggalKembali) + (365*tanggalKembali)) - (batasTanggal + (30*batasBulan) + (365*batasTahun));
                bayarDenda = selisih*2000;
            }
        }
        
    }
    
}