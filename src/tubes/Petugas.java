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
public class Petugas extends People{
    
    private String idPetugas;
    private ArrayList daftarPeminjaman = new ArrayList<Peminjaman>();
    private ArrayList daftarBuku = new ArrayList<Buku>();
    
    
    public Petugas(String name, int noKtp, int noHp, String Alamat, String idPetugas) {
        super(name, noKtp, noHp, Alamat);
        this.idPetugas = idPetugas;
    }

    public String getIdPetugas() {
        return idPetugas;
    }
    
    public void tambahBuku(String idBuku , String namaBuku , int jumlahHalaman , String penerbit , String pengarang, String kategori, String genre, int stock) {
        Buku b = new Buku(idBuku, namaBuku, jumlahHalaman, penerbit, pengarang, kategori, genre, stock);
        daftarBuku.add(b);
    }
    
    public ArrayList lihatBuku() {
        return daftarBuku;
    }
    
    public void tambahPeminjaman(Member mb, Buku bk, int jumlahPinjam) {
        //Peminjaman p = new Peminjaman(mb, bk, jumlahPinjam);
        //daftarPeminjaman.add(p);
    }
    
    public ArrayList lihatPeminjaman() {
        return daftarPeminjaman;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setHp(int noHp) {
        this.noHp = noHp;
    }

    @Override
    public int getHp() {
        return noHp;
    }

    @Override
    public void setKtp(int noKtp) {
        this.noKtp = noKtp;
    }

    @Override
    public int getKtp() {
        return noKtp;
    }
}
