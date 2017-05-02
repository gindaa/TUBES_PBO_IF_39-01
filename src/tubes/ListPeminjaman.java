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
public class ListPeminjaman {
    private ArrayList<Peminjaman> daftarPeminjaman;
    
    public void setDaftarPeminjaman(Peminjaman peminjaman) {
        if (daftarPeminjaman != null) {
            daftarPeminjaman.add(peminjaman);
        } else {
            daftarPeminjaman = new ArrayList();
            daftarPeminjaman.add(peminjaman);
        }
    }
    
    public void lihatDaftarBuku() {
        for (Iterator it = daftarPeminjaman.iterator(); it.hasNext();) {
            Peminjaman p = (Peminjaman) it.next();
            System.out.println("Nama Peminjam      : "+p.getNamaMember());
            System.out.println("Buku yang dipinjam : "+p.getNamaBuku());
            System.out.println("Tanggal Pinjam     : "+p.getTglAwal());
            System.out.println("Tanggal Kembali    : "+p.getTglAkhir());
            System.out.println("Jumlah Pinjam      : "+p.getJumlahPinjam());
            System.out.println();
        }
    }
    
    public ArrayList<Peminjaman> getDaftarPeminjaman() {
        return daftarPeminjaman;
    }
}
