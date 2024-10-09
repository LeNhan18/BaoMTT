package week_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class frm_Twofish extends javax.swing.JFrame {
    
    TwofishCipher twofish = new TwofishCipher();
    
    public frm_Twofish() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_plaintext = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_ciphertext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_key = new javax.swing.JTextField();
        txt_IV = new javax.swing.JTextField();
        btn_encrypt = new javax.swing.JButton();
        btn_decrypt = new javax.swing.JButton();
        btn_saveFile = new javax.swing.JButton();
        btn_openFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Twofish Cipher Demo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Plaintext:");

        txt_plaintext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_plaintextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("IV:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Ciphertext:");

        txt_ciphertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ciphertextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Key:");

        txt_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_keyActionPerformed(evt);
            }
        });

        txt_IV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IVActionPerformed(evt);
            }
        });

        btn_encrypt.setText("Encrypt");
        btn_encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encryptActionPerformed(evt);
            }
        });

        btn_decrypt.setText("Decrypt");
        btn_decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decryptActionPerformed(evt);
            }
        });

        btn_saveFile.setText("Save to File");
        btn_saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveFileActionPerformed(evt);
            }
        });

        btn_openFile.setText("Open File");
        btn_openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_encrypt)
                                .addGap(18, 18, 18)
                                .addComponent(btn_decrypt)
                                .addGap(18, 18, 18)
                                .addComponent(btn_saveFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_openFile, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                            .addComponent(txt_IV)
                            .addComponent(txt_key)
                            .addComponent(txt_plaintext)
                            .addComponent(txt_ciphertext, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_plaintext, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_IV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txt_ciphertext, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_encrypt)
                    .addComponent(btn_decrypt)
                    .addComponent(btn_saveFile)
                    .addComponent(btn_openFile))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_plaintextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_plaintextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_plaintextActionPerformed

    private void txt_ciphertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ciphertextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ciphertextActionPerformed

    private void txt_keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_keyActionPerformed

    private void txt_IVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IVActionPerformed

    private void btn_encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encryptActionPerformed
        try{
            String plaintext = txt_plaintext.getText();
            byte[] key = txt_key.getText().getBytes(StandardCharsets.UTF_8);
            byte[] iv = txt_IV.getText().getBytes(StandardCharsets.UTF_8);
            
            byte[] ciphertext = twofish.encrypt(plaintext, key, iv);
            String encryptedText = Base64.getEncoder().encodeToString(ciphertext);
            
            txt_ciphertext.setText(encryptedText);
        }catch (UnsupportedEncodingException e){
            JOptionPane.showMessageDialog(this, "Unsupported encoding: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }catch (Exception ex){
            Logger.getLogger(frm_Twofish.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error encrypting: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_encryptActionPerformed

    private void btn_decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decryptActionPerformed
        try{
            String ciphertext = txt_ciphertext.getText();
            byte[] key = txt_key.getText().getBytes(StandardCharsets.UTF_8);
            byte[] iv = txt_IV.getText().getBytes(StandardCharsets.UTF_8);
            
            byte[] decodedCiphertext = Base64.getDecoder().decode(ciphertext);
            String decryptedText = twofish.decrypt(decodedCiphertext, key, iv);
            
            txt_plaintext.setText(decryptedText);
        }catch (Exception ex){
            Logger.getLogger(frm_Twofish.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error decrypting: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_decryptActionPerformed

    private void btn_saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveFileActionPerformed
        String ciphertext = txt_ciphertext.getText();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Ciphertext to File");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try (FileWriter writer = new FileWriter(fileToSave.getAbsolutePath() + ".txt")) {
                writer.write(ciphertext);
                JOptionPane.showMessageDialog(this, "Ciphertext saved to file successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_saveFileActionPerformed

    private void btn_openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Open File containing Ciphertext");
        int userSelection = fileChooser.showOpenDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileToOpen))) {
                StringBuilder ciphertextBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    ciphertextBuilder.append(line);
                }
                String ciphertext = ciphertextBuilder.toString().trim();
                txt_ciphertext.setText(ciphertext);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error opening file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_openFileActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Twofish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Twofish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Twofish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Twofish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Twofish().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_decrypt;
    private javax.swing.JButton btn_encrypt;
    private javax.swing.JButton btn_openFile;
    private javax.swing.JButton btn_saveFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_IV;
    private javax.swing.JTextField txt_ciphertext;
    private javax.swing.JTextField txt_key;
    private javax.swing.JTextField txt_plaintext;
    // End of variables declaration//GEN-END:variables
}
