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
public class Petugas extends People{
    
    public String idPetugas;
    public Buku Buku[];
    public Peminjaman Peminjaman[];
    
    
    public Petugas(String name, int noKtp, int noHp, String Alamat) {
        name = name;
        noKtp = noKtp;
        noHp = noHp;
        Alamat = Alamat;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public Buku[] getBuku() {
        return Buku;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public void setBuku(Buku[] Buku) {
        this.Buku = Buku;
    }

    public Peminjaman[] getPeminjaman() {
        return Peminjaman;
    }

    public void setPeminjaman(Peminjaman[] Peminjaman) {
        this.Peminjaman = Peminjaman;
    }
}
