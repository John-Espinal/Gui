/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.minigui;

import java.io.Serializable;

/**
 *
 * @author JohnE
 */
public class MiniGui implements Serializable {
   int CurSc;
   int HighSc;
    
   
   public MiniGui(int CurSc, int HighSc) {
        this.CurSc = CurSc;
        this.HighSc = HighSc;
    }

    public int getCurSc() {
        return CurSc;
    }
    
    public void setCurSc(int CurSc) {
        this.CurSc = CurSc;
    }
    
   public int getHighSc() {
        return HighSc;
    }

    

    public void setHighSc(int HighSc) {
        this.HighSc = HighSc;
    }
    
    
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
