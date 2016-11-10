/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkkcorp;

import java.awt.Frame;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kapanga_david_wa_kap
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
         SplashView f = new SplashView();
        int i=f.getjProgressBar1().getValue();
        f.setVisible(true);
       while(f.getjProgressBar1().getValue()<100){
            i=i+50;
            f.getjProgressBar1().setValue(i);
            sleep(500);
        }
       if(f.getjProgressBar1().getValue()==100)
       {
           f.setVisible(false);
                   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFrame().setVisible(true);
            }
        });
       }
    }
    
}
