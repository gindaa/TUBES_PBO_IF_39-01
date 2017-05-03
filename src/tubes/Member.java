/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author pejuangTubes
 */
public class Member extends People {
    private String idMember;
    private String namaBuku;
    private String mStatus;
    private int jumlahPinjam;
    private Buku buku;
    private String bk;
    private ListBuku listBuku = new ListBuku();
    private Peminjaman peminjaman;
    private ListPeminjaman lp = new ListPeminjaman();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Member(String name, String noKtp, String noHp, String Alamat, String idMember, String mStatus) {
        super(name, noKtp, noHp, Alamat);
        this.idMember = idMember;
        this.mStatus = mStatus;
    }

    public void pinjamBuku(String namaBuku, int n) throws ParseException {
        String tempJudul = null;
        String tglAwal = null;
        String tglAkhir = null;
        ArrayList<Buku> temp = listBuku.getDaftarBuku();
        if (temp != null) {
            for (Iterator<Buku> it = temp.iterator(); it.hasNext();) {
                Buku buku1 = it.next();
                if (buku1.getNamaBuku().equals(namaBuku)) {
                    buku1.setStock(buku1.getStock()-1);
                    tempJudul = buku1.getNamaBuku();
                } else {
                    System.out.println("Buku tidak ditemukan");
                }
            }
            if (tempJudul != null) {
                Scanner sc = new Scanner(System.in);
                tglAwal = sc.next();
                Date tempTgl = sdf.parse(tglAwal);
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, 7);
                Date temp7HariLagi = cal.getTime();
                tglAkhir = sdf.format(temp7HariLagi);
                Peminjaman peminjaman1 = new Peminjaman(this.idMember, this.name, tempJudul, tglAwal, tglAkhir, jumlahPinjam);
                lp.setDaftarPeminjaman(peminjaman1);
            }
        } else {
            Peminjaman peminjaman = new Peminjaman(this.idMember, this.name, namaBuku, tglAwal, tglAkhir, jumlahPinjam);
            lp.setDaftarPeminjaman(peminjaman);
        }
    }

    public void lihatPeminjaman() {
        lp.lihatDaftarPeminjaman();
    }
    
    public void setIdMember(String idMember){
        this.idMember = idMember;
    }

    public void setmStatus (String mStatus){
        this.mStatus = mStatus;
    }
    
    public String getIdMember(){
        return idMember;
    }
    
    public String getmStatus() {
        return mStatus;
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
