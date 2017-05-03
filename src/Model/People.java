/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pejuangTubes
 */
public abstract class People {
    
    private String name;
    private int noKtp;
    private int noHp;
    private String Alamat;

    public People(String name, int noKtp, int noHp, String Alamat) {
        this.name = name;
        this.noKtp = noKtp;
        this.noHp = noHp;
        this.Alamat = Alamat;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    public String getAlamat() {
        return Alamat;
    }
    
    public void setHp(int noHp) {
        this.noHp = noHp;
    }
    
    public int getHp() {
        return noHp;
    }
    
    public void setKtp(int noKtp) {
        this.noKtp = noKtp;
    }
    
    public int getKtp() {
        return noHp;
    }
    
}
