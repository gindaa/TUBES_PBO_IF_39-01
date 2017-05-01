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
public class Buku {
    private String idBuku;
    private String namaBuku;
    private int jumlahHalaman;
    private String penerbit;
    private String pengarang;
    private String kategori;
    private String genre;
    private int stock;
    private ArrayList daftarPeminjaman = new ArrayList<Peminjaman>();
    
    public Buku(String idBuku , String namaBuku , int jumlahHalaman , String penerbit , String pengarang, String kategori, String genre, int stock) {
        this.idBuku = idBuku;
        this.namaBuku = namaBuku;
        this.jumlahHalaman = jumlahHalaman;
        this.penerbit = penerbit;
        this.pengarang = pengarang;
        this.kategori = kategori;
        this.genre = genre;
        this.stock = stock;
    }
    
    public void pinjamBuku(int n, String idMember) {
        
    }
    
    public String getKategori() {
        return kategori;
    }

    public String getGenre() {
        return genre;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setIdBuku(String idBuku){
        this.idBuku = idBuku;
    }
    
    public String getIdBuku(){
        return idBuku;
    }
    
    public void setNamaBuku(String namaBuku){
        this.namaBuku = namaBuku;
    }
    
    public String getNamaBuku(){
        return namaBuku;
    }
    
    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }
    
    public int getJumlahHalaman(){
        return jumlahHalaman;
    }
    
    public void setPenerbit(String penerbit){
        this.penerbit = penerbit;
    }
    
    public String getPenerbit(){
        return penerbit;
    }
    
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    
    public String getPengarang(){
        return pengarang;
    }
}
