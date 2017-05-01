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
public abstract class People {
    
    public String name;
    public int noKtp;
    public int noHp;
    public String alamat;

    public People(String name, int noKtp, int noHp, String alamat) {
        this.name = name;
        this.noKtp = noKtp;
        this.noHp = noHp;
        this.alamat = alamat;
    }
    
    public abstract void setName(String name);
    public abstract String getName();
    public abstract void setAlamat(String Alamat);
    public abstract String getAlamat();
    public abstract void setHp(int noHp);
    public abstract int getHp();
    public abstract void setKtp(int noKtp);
    public abstract int getKtp();
}
