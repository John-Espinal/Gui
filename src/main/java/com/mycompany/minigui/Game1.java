/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.minigui;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JohnE
 */
public class Game1 extends javax.swing.JFrame {

    int second = 25;
    public static int CurSc = 0;
    public static int HighSc = 0;
    int i = 0;
    String DecSec;

    MiniGui scores = new MiniGui(CurSc, HighSc);

    DecimalFormat dFormat = new DecimalFormat("00");

    KeyHandler khandler = new KeyHandler();

    public Game1() {
      
        initComponents();
        this.addKeyListener(khandler);
        Timer time = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                if (second > 0) {
                    second--;
                    DecSec = dFormat.format(second);
                    CountLabel.setText("0:" + DecSec);
                } else {
                    for (; i < 1; i++) {
                        randomLabel.setText("Times up");
                        EnterLabel.setText("Hit Enter for your results");
                        QuitLabel.setText("Hit F5 to quit");
                    }

                }

            }
        };
        time.scheduleAtFixedRate(task, 0, 1000);

    }

    public class KeyHandler implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            String In = Character.toString(e.getKeyChar()).toUpperCase();
            if (In.equals(randomLabel.getText())) {
                Random r = new Random();
                char c = (char) (r.nextInt(26) + 'a');
                String b = Character.toString(c).toUpperCase();
                randomLabel.setText(b);

                CurSc++;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

        /**
         *
         * @param e
         */
        @Override
        public void keyPressed(KeyEvent e) {

            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (CurSc > HighSc) {
                    HighSc = CurSc;
                    randomLabel.setText(Integer.toString(CurSc));
                   
                }
                
                EnterLabel.setText("Hit the spacebar to play again");
                CurSc = 0;
            } 
            if(e.getKeyCode() == KeyEvent.VK_F5){
               new MainMenu(). setVisible(true);
           
           }
       
           if (e.getKeyCode() == KeyEvent.VK_SPACE){
               
               new Game1().setVisible(true);
                   setVisible(false);
           }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        TimerLabel = new javax.swing.JLabel();
        CountLabel = new javax.swing.JLabel();
        randomLabel = new javax.swing.JLabel();
        EnterLabel = new javax.swing.JLabel();
        QuitLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("this");
        setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        setForeground(java.awt.Color.blue);
        setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(null);

        TimerLabel.setFont(new java.awt.Font("HP Simplified Light", 2, 24)); // NOI18N
        TimerLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimerLabel.setText("TIME");
        getContentPane().add(TimerLabel);
        TimerLabel.setBounds(330, 10, 45, 29);

        CountLabel.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        CountLabel.setForeground(new java.awt.Color(255, 255, 255));
        CountLabel.setText("0:25");
        getContentPane().add(CountLabel);
        CountLabel.setBounds(330, 40, 64, 38);

        randomLabel.setFont(new java.awt.Font("Segoe Print", 1, 75)); // NOI18N
        randomLabel.setForeground(new java.awt.Color(0, 255, 0));
        randomLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        randomLabel.setText("A");
        randomLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                randomLabelKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                randomLabelKeyReleased(evt);
            }
        });
        getContentPane().add(randomLabel);
        randomLabel.setBounds(30, 40, 400, 110);

        EnterLabel.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        EnterLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(EnterLabel);
        EnterLabel.setBounds(110, 140, 250, 40);

        QuitLabel.setBackground(new java.awt.Color(0, 0, 0));
        QuitLabel.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        QuitLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(QuitLabel);
        QuitLabel.setBounds(110, 180, 230, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JohnE\\Downloads\\360_F_215948377_kgIhNUy4X0iYsyUfYd9KKIViSPOxclbC.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, 0, 500, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void randomLabelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_randomLabelKeyReleased

    }//GEN-LAST:event_randomLabelKeyReleased

    private void randomLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_randomLabelKeyPressed
             if(evt.getKeyCode() == KeyEvent.VK_F5){
               new MainMenu(). setVisible(true);
               this.dispose();
           }
    }//GEN-LAST:event_randomLabelKeyPressed

    @Override
    public String toString() {
        return "Game1{" + '}';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Game1().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CountLabel;
    private javax.swing.JLabel EnterLabel;
    private javax.swing.JLabel QuitLabel;
    private javax.swing.JLabel TimerLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel randomLabel;
    // End of variables declaration//GEN-END:variables
}
