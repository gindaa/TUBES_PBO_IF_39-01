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

    public String getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
