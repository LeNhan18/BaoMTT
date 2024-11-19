
package Caeser1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Admin
 */
public class Caeser extends javax.swing.JFrame {
    public Caeser() {
        initComponents();
    }
         public void saveTo(String content){
       JFileChooser file =new JFileChooser();
        FileNameExtensionFilter f = new FileNameExtensionFilter("textfile","txt");
       file.setFileFilter(f);
        int user = file.showOpenDialog(this);
        if(user == JFileChooser.APPROVE_OPTION){
        try(FileWriter fw = new FileWriter(file.getSelectedFile()+".txt")){
            JOptionPane.showConfirmDialog(this, "File Thanh cong");
            fw.write(content);
           }catch(IOException e)
{
            JOptionPane.showConfirmDialog(this,"Error " +e.getMessage());
}

}
       
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nhanle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_plaintext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_key = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_cipher = new javax.swing.JTextField();
        btn_encrypt = new javax.swing.JButton();
        btn_de = new javax.swing.JButton();
        btn_open = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nhanle.setFont(new java.awt.Font("Snap ITC", 2, 48)); // NOI18N
        nhanle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nhanle.setLabelFor(this);
        nhanle.setText("Caeser Cipher Demo");
        nhanle.setAutoscrolls(true);
        nhanle.setMaximumSize(new java.awt.Dimension(108, 1000));

        jLabel1.setText("Plaintext");

        txt_plaintext.setText("jTextField1");
        txt_plaintext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_plaintextActionPerformed(evt);
            }
        });

        jLabel2.setText("Key");

        txt_key.setText("jTextField2");

        jLabel3.setText("CipherText");

        txt_cipher.setText("jTextField3");

        btn_encrypt.setText("Encrypt");
        btn_encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encryptActionPerformed(evt);
            }
        });

        btn_de.setText("Decrypt");
        btn_de.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deActionPerformed(evt);
            }
        });

        btn_open.setText("Openfile");
        btn_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_plaintext, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt_key)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(nhanle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cipher, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_encrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(btn_de, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(btn_open, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(nhanle, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_plaintext, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cipher, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_encrypt, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(btn_de, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_open, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_plaintextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_plaintextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_plaintextActionPerformed

    private void btn_encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encryptActionPerformed
         try{
             String p = txt_plaintext.getText();
             int key = Integer.parseInt(txt_key.getText());
             String ciphertext = CaeserCipher.encrypt(p, key);
             JOptionPane.showConfirmDialog(this,"Encrypt Thanh Cong");
             txt_cipher.setText(p);
             saveTo(ciphertext);
             
             
         }catch(NumberFormatException e)
         {
             JOptionPane.showConfirmDialog(this,"Nooo");
         }
    }//GEN-LAST:event_btn_encryptActionPerformed

    private void btn_deActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deActionPerformed
       try{
             String p = txt_cipher.getText();
             int key = Integer.parseInt(txt_key.getText());
             String ciphertext = CaeserCipher.encrypt(p, key);
             JOptionPane.showConfirmDialog(this,"Decrypt Thanh Cong");
             txt_plaintext.setText(p);
             
             
         }catch(NumberFormatException e)
         {
             JOptionPane.showConfirmDialog(this,"Nooo");
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caeser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_de;
    private javax.swing.JButton btn_encrypt;
    private javax.swing.JButton btn_open;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nhanle;
    private javax.swing.JTextField txt_cipher;
    private javax.swing.JTextField txt_key;
    private javax.swing.JTextField txt_plaintext;
    // End of variables declaration//GEN-END:variables
}
