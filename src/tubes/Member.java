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
public class Member extends People {
    private String idMember;
    private String mStatus;
    private String namaBuku;
    private Buku buku;
    private String bk;
    private ListBuku listBuku;
    private Peminjaman peminjaman;
    private ListPeminjaman lp = new ListPeminjaman();

    public Member(String name, String noKtp, String noHp, String Alamat, String idMember, String mStatus) {
        super(name, noKtp, noHp, Alamat);
        this.idMember = idMember;
        this.mStatus = mStatus;
    }

    public void pinjamBuku(Buku buku, int n) {
        ArrayList<Buku> temp = listBuku.getDaftarBuku();
        if (temp != null) {
            for (Iterator<Buku> it = temp.iterator(); it.hasNext();) {
                Buku buku1 = it.next();
                if (buku1.getIdBuku().equals(buku.getIdBuku()) && buku1.getNamaBuku().equals(buku.getNamaBuku()) && buku1.getJumlahHalaman() == buku.getJumlahHalaman() && buku1.getPenerbit().equals(buku.getPenerbit()) && buku1.getPengarang().equals(buku.getPengarang()) && buku1.getKategori().equals(buku.getKategori()) && buku1.getGenre().equals(buku.getGenre()) && buku1.getStock() == buku.getStock()) {
                    
                    buku1.setStock(buku1.getStock()-1);
                } else {
                    
                }
            }
        } else {
            
        }
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
