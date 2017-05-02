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
    public String noKtp;
    public String noHp;
    public String alamat;

    public People(String name, String noKtp, String noHp, String alamat) {
        this.name = name;
        this.noKtp = noKtp;
        this.noHp = noHp;
        this.alamat = alamat;
    }
    
    public abstract void setName(String name);
    public abstract String getName();
    public abstract void setAlamat(String Alamat);
    public abstract String getAlamat();
    public abstract void setHp(String noHp);
    public abstract String getHp();
    public abstract void setKtp(String noKtp);
    public abstract String getKtp();
}
