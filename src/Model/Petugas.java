/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;

/**
 *
 * @author pejuangTubes
 */
public class Petugas extends People{
    
    private String idPetugas;
    private ArrayList Peminjaman = new ArrayList<>();
    
    
    public Petugas(String name, int noKtp, int noHp, String Alamat, String idPetugas) {
        super(name, noKtp, noHp, Alamat);
        this.idPetugas = idPetugas;
    }

    public String getIdPetugas() {
        return idPetugas;
    }
    
    public void tambahPeminjaman(int bulanPinjam, int tanggalPinjam, int tahunpinjam, int batasTanggal, int batasBulan, int batasTahun, Member Member, ArrayList<Buku> Buku) {
        Peminjaman p = new Peminjaman(bulanPinjam, tanggalPinjam, tahunpinjam, batasTanggal, batasBulan, batasTahun, Member, Buku);
        Peminjaman.add(p);
    }
}
