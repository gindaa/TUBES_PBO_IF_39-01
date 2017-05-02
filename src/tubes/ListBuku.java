/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.util.*;

/**
 *
 * @author Seagal Putra
 */
public class ListBuku {
    private ArrayList<Buku> daftarBuku;
    
    public void setDaftarBuku(Buku buku) {
        if (daftarBuku != null) {
            daftarBuku.add(buku);
        } else {
            daftarBuku = new ArrayList();
            daftarBuku.add(buku);
        }
    }
    
    public void lihatDaftarBuku() {
        for (Iterator it = daftarBuku.iterator(); it.hasNext();) {
            Buku b = (Buku) it.next();
            System.out.println("Nama Buku       : "+b.getNamaBuku());
            System.out.println("Jumlah Halaman  : "+b.getJumlahHalaman());
            System.out.println("Penerbit        : "+b.getPenerbit());
            System.out.println("Pengarang       : "+b.getPengarang());
            System.out.println("Kategori        : "+b.getKategori());
            System.out.println("Genre           : "+b.getGenre());
            System.out.println("Stock Buku      : "+b.getStock());
            System.out.println();
        }
    }
    
    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}
