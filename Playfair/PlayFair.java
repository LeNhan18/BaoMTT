/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Playfair;

import RailFence.RailFenceCipher;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Admin
 */
public class PlayFair extends javax.swing.JFrame {

    /**
     * Creates new form PlayFair
     */
    public PlayFair() {
        initComponents();
    }

   public void saveTo(String content){
         JFileChooser file = new JFileChooser();
        FileNameExtensionFilter f = new FileNameExtensionFilter("Text files", "txt");
        file.setFileFilter(f);
        int user = file.showSaveDialog(this);  // Changed to showSaveDialog
        if (user == JFileChooser.APPROVE_OPTION) {
            try (FileWriter fw = new FileWriter(file.getSelectedFile() + ".txt") {
            }) {  // Fixed missing quotation mark
                fw.write(content);
                JOptionPane.showMessageDialog(this, "File saved successfully!");  // Changed to showMessageDialog
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);  // Error dialog
            }
        }

   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_cipher = new javax.swing.JTextField();
        txt_plan = new javax.swing.JTextField();
        txt_key = new javax.swing.JTextField();
        btn_de = new javax.swing.JButton();
        btn_open = new javax.swing.JButton();
        btn_en = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_km = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_cipher1 = new javax.swing.JTextField();
        txt_plan1 = new javax.swing.JTextField();
        txt_key1 = new javax.swing.JTextField();
        btn_de1 = new javax.swing.JButton();
        btn_open1 = new javax.swing.JButton();
        btn_en1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_km1 = new javax.swing.JTextField();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setBackground(new java.awt.Color(0, 153, 153));

        label1.setFont(new java.awt.Font("Ebrima", 1, 44)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 102, 102));
        label1.setText("Playfair Cipher Demo");

        jLabel1.setText("PlainText");

        jLabel2.setText("Key");

        jLabel3.setText("CipherText");

        txt_cipher.setText("jTextField1");

        txt_plan.setText("jTextField1");
        txt_plan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_planActionPerformed(evt);
            }
        });

        txt_key.setText("jTextField1");

        btn_de.setText("DeCrypt");
        btn_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deActionPerformed(evt);
            }
        });

        btn_open.setText("OpenFile");
        btn_open.setToolTipText("");
        btn_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openActionPerformed(evt);
            }
        });

        btn_en.setText("EnCrypt");
        btn_en.setToolTipText("");
        btn_en.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enActionPerformed(evt);
            }
        });

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Key Matrix");

        txt_km.setText("jTextField1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_km, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_plan, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cipher, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btn_en, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btn_de, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btn_open, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_plan, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_km, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cipher, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_open, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_de, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_en, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                formInputMethodTextChanged(evt);
            }
        });

        label2.setFont(new java.awt.Font("Ebrima", 1, 44)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 102, 102));
        label2.setText("Playfair Cipher Demo");

        jLabel5.setText("PlainText");

        jLabel6.setText("Key");

        jLabel7.setText("CipherText");

        txt_cipher1.setText("jTextField1");

        txt_plan1.setText("jTextField1");
        txt_plan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_plan1ActionPerformed(evt);
            }
        });

        txt_key1.setText("jTextField1");

        btn_de1.setText("DeCrypt");
        btn_de1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_de1ActionPerformed(evt);
            }
        });

        btn_open1.setText("OpenFile");
        btn_open1.setToolTipText("");
        btn_open1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_open1ActionPerformed(evt);
            }
        });

        btn_en1.setText("EnCrypt");
        btn_en1.setToolTipText("");
        btn_en1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_en1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Key Matrix");

        txt_km1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_key1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_plan1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cipher1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_km1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_en1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_de1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btn_open1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_plan1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_key1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_km1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cipher1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_en1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_de1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_open1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_planActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_planActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_planActionPerformed

    private void btn_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deActionPerformed
       String c =txt_cipher.getText();
        String key = txt_key.getText();
          if(!c.isEmpty()&&!key.isEmpty())
          {
            PlayFairCipher playfair = new PlayFairCipher(key);
            String p = playfair.encrypt(c);
            JOptionPane.showConfirmDialog(this,"Encrypt Thanh Cong");
            txt_plan.setText(p);
    
          }else{
              JOptionPane.showConfirmDialog(this,"No");
          }
    }//GEN-LAST:event_btn_deActionPerformed

    private void btn_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openActionPerformed
        JFileChooser file =new JFileChooser();
        file.setFileFilter(new FileNameExtensionFilter("textfile","txt"));
        int user = file.showOpenDialog(this);
        if(user == JFileChooser.APPROVE_OPTION){
            try(BufferedReader b = new BufferedReader(new FileReader(file.getSelectedFile()))){
                JOptionPane.showConfirmDialog(this, "File Thanh cong");
                txt_cipher.read(b, null);
            }catch(IOException e)
            {
                JOptionPane.showConfirmDialog(this,"Error " +e.getMessage());
            }

        }
    }//GEN-LAST:event_btn_openActionPerformed

    private void btn_enActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enActionPerformed
        String plaintext =txt_plan.getText();
        String key = txt_key.getText();
          if(!plaintext.isEmpty()&&!key.isEmpty())
          {
            PlayFairCipher playfair = new PlayFairCipher(key);
            String ciphertext = playfair.encrypt(plaintext);
            JOptionPane.showConfirmDialog(this,"Encrypt Thanh Cong");
            txt_cipher.setText(ciphertext);
            saveTo(ciphertext);
          }else{
              JOptionPane.showConfirmDialog(this,"No");
          }
       
    }//GEN-LAST:event_btn_enActionPerformed

    private void formInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_formInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formInputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String k = txt_key.getText();
       if(!k.isEmpty())
       {
           PlayFairCipher p = new PlayFairCipher(k);
           String km = p.getMatrixAsString();
           txt_km.setText(km);
       }else{
           JOptionPane.showConfirmDialog(this, "Please enter plaintext and key");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_plan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_plan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_plan1ActionPerformed

    private void btn_de1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_de1ActionPerformed
          String c =txt_cipher1.getText();
        String key = txt_key1.getText();
          if(!c.isEmpty()&&!key.isEmpty())
          {
            PlayFairCipher playfair = new PlayFairCipher(key);
            String p = playfair.encrypt(c);
            JOptionPane.showConfirmDialog(this,"Encrypt Thanh Cong");
            txt_cipher1.setText(c);
    
          }else{
              JOptionPane.showConfirmDialog(this,"No");
          }
    }//GEN-LAST:event_btn_de1ActionPerformed

    private void btn_open1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_open1ActionPerformed
        JFileChooser file =new JFileChooser();
        file.setFileFilter(new FileNameExtensionFilter("textfile","txt"));
        int user = file.showOpenDialog(this);
        if(user == JFileChooser.APPROVE_OPTION){
            try(BufferedReader b = new BufferedReader(new FileReader(file.getSelectedFile()))){
                JOptionPane.showConfirmDialog(this, "File Thanh cong");
                txt_cipher1.read(b, null);
            }catch(IOException e)
            {
                JOptionPane.showConfirmDialog(this,"Error " +e.getMessage());
            }

        }
    }//GEN-LAST:event_btn_open1ActionPerformed

    private void btn_en1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_en1ActionPerformed
        String plaintext =txt_plan1.getText();
        String key = txt_key1.getText();
          if(!plaintext.isEmpty()&&!key.isEmpty())
          {
            PlayFairCipher playfair = new PlayFairCipher(key);
            String ciphertext = playfair.encrypt(plaintext);
            JOptionPane.showConfirmDialog(this,"Encrypt Thanh Cong");
            txt_cipher1.setText(ciphertext);
            saveTo(ciphertext);
          }else{
              JOptionPane.showConfirmDialog(this,"No");
          }
    }//GEN-LAST:event_btn_en1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String k = txt_key1.getText();
       if(!k.isEmpty())
       {
           PlayFairCipher p = new PlayFairCipher(k);
           String km = p.getMatrixAsString();
           txt_km1.setText(km);
       }else{
           JOptionPane.showConfirmDialog(this, "Please enter plaintext and key");
       }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PlayFair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayFair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayFair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayFair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayFair().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_de;
    private javax.swing.JButton btn_de1;
    private javax.swing.JButton btn_en;
    private javax.swing.JButton btn_en1;
    private javax.swing.JButton btn_open;
    private javax.swing.JButton btn_open1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTextField txt_cipher;
    private javax.swing.JTextField txt_cipher1;
    private javax.swing.JTextField txt_key;
    private javax.swing.JTextField txt_key1;
    private javax.swing.JTextField txt_km;
    private javax.swing.JTextField txt_km1;
    private javax.swing.JTextField txt_plan;
    private javax.swing.JTextField txt_plan1;
    // End of variables declaration//GEN-END:variables
}
