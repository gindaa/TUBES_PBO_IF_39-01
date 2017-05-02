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
    private Buku buku;
    private int jumlahBuku;
    private ListBuku lb = new ListBuku();
    
    public Petugas(String name, String noKtp, String noHp, String Alamat, String idPetugas) {
        super(name, noKtp, noHp, Alamat);
        this.idPetugas = idPetugas;
    }

    public String getIdPetugas() {
        return idPetugas;
    }
    
    public void tambahBuku(String idBuku , String namaBuku , int jumlahHalaman , String penerbit , String pengarang, String kategori, String genre, int stock) {
        ArrayList<Buku> temp = lb.getDaftarBuku();
        if (temp != null) {
            for (Iterator<Buku> it = temp.iterator(); it.hasNext();) {
                Buku buku = it.next();
                if (idBuku == buku.getIdBuku() && namaBuku == buku.getNamaBuku() && jumlahHalaman == buku.getJumlahHalaman() && penerbit == buku.getPenerbit() && pengarang == buku.getPengarang() && kategori == buku.getKategori() && genre == buku.getGenre() && stock == buku.getStock()) {
                    buku.setStock(stock+1);
                } else {
                    Buku buku1 = new Buku(idBuku, namaBuku, jumlahHalaman, penerbit, pengarang, kategori, genre, stock);
                    lb.setDaftarBuku(buku1);
                }
            }
        } else {
            Buku buku = new Buku(idBuku, namaBuku, jumlahHalaman, penerbit, pengarang, kategori, genre, stock);
            lb.setDaftarBuku(buku);
        }
    }
    
    public void lihatBuku() {
        lb.lihatDaftarBuku();
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
    public void setHp(String noHp) {
        this.noHp = noHp;
    }

    @Override
    public String getHp() {
        return noHp;
    }

    @Override
    public void setKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    @Override
    public String getKtp() {
        return noKtp;
    }
}
