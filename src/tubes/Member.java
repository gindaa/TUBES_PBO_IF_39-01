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
    private int noIdentitas;
    private int mStatus;
    //ArrayList Peminjaman = new ArrayList<Peminjaman>();

    public Member(String name, int noKtp, int noHp, String Alamat, String idMember, int noIdentitas, int mStatus) {
        super(name, noKtp, noHp, Alamat);
        this.idMember = idMember;
        this.noIdentitas = noIdentitas;
        this.mStatus = mStatus;
    }
    
    public void setIdMember (String idMember){
        this.idMember = idMember;
    }
    
    public void setNoIdentitas(int noIdentitas){
        this.noIdentitas = noIdentitas;
    }
    
    public void setmStatus (int mStatus){
        this.mStatus = mStatus;
    }
    
    public String getIdMember(){
        return idMember;
    }
   
    public int getNoIdentitas(){
        return noIdentitas;
    }
    
    public int getmStatus() {
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
