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
public class Member {
    String idMember;
    String identitas;
    int noIdentitas;
    int mStatus;
    ArrayList Peminjaman = new ArrayList<Peminjaman>();

    public Member(String idMember, String identitas, int noIdentitas, int mStatus) {
        this.idMember = idMember;
        this.identitas = identitas;
        this.noIdentitas = noIdentitas;
        this.mStatus = mStatus;
    }
    
    public void setIdMember (String idMember){
        this.idMember = idMember;
    }
    
    public void setIdentitas (String identitas){
        this.identitas = identitas;
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
    
    public String getIdentitas(){
        return identitas;
    }
    
    public int getNoIdentitas(){
        return noIdentitas;
    }
    
    public int getmStatus() {
        return mStatus;
    }

    public void setPeminjaman(ArrayList Peminjaman) {
        this.Peminjaman = Peminjaman;
    }
    
}
