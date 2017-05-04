/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aplikasi;
import View.GLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CLogin implements ActionListener {

    GLogin gl = new GLogin();
    Aplikasi ap = new Aplikasi();

    public CLogin() {
        gl.setVisible(true);
        gl.addListener(this);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    
        Object source = ae.getSource();
        if (source.equals(gl.getBtnlogin())) 
        {
            gl.getTxtuser();
            gl.getTxtpass();
            Model.Petugas me = ap.getIdPetugas(gl.getTxtuser(),gl.getTxtpass());
            if ( me != null ) 
            {
                gl.dispose();
                JOptionPane.showMessageDialog(null, "Welcome");
                new CHome();
            }
        }
        else if (source.equals(gl.getBtnexit())) {
            gl.dispose();
            JOptionPane.showMessageDialog(null, "Terima Kasih");
        }
    }
    
}
