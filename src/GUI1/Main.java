/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    int hitung,soto,bakso,rawon,gudeg;
    public Main() {
        initComponents();
        tfSoto.setEditable(false);
        tfBakso.setEditable(false);
        tfRawon.setEditable(false);
        tfGudeg.setEditable(false);
        tfTotal.setEditable(false);
        JOptionPane.showMessageDialog(rootPane,"Selamat Datang");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbSoto = new javax.swing.JCheckBox();
        cbRawon = new javax.swing.JCheckBox();
        cbBakso = new javax.swing.JCheckBox();
        cbGudeg = new javax.swing.JCheckBox();
        lblJudul = new javax.swing.JLabel();
        tfSoto = new javax.swing.JTextField();
        tfRawon = new javax.swing.JTextField();
        tfBakso = new javax.swing.JTextField();
        tfGudeg = new javax.swing.JTextField();
        lblHitung = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        btHitung = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfBayar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfKembalian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbSoto.setText("Soto : 5000");
        cbSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSotoActionPerformed(evt);
            }
        });

        cbRawon.setText("Rawon : 6000");
        cbRawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRawonActionPerformed(evt);
            }
        });

        cbBakso.setText("Bakso : 4000");
        cbBakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBaksoActionPerformed(evt);
            }
        });

        cbGudeg.setText("Gudeg : 8000");
        cbGudeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGudegActionPerformed(evt);
            }
        });

        lblJudul.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblJudul.setForeground(new java.awt.Color(255, 102, 153));
        lblJudul.setText("MENU MAKANAN");

        tfSoto.setText("0");

        tfRawon.setText("0");

        tfBakso.setText("0");

        tfGudeg.setText("0");

        lblHitung.setText("Hitung :");

        tfTotal.setText("0");

        btHitung.setText("Hitung");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Bayar :");

        tfBayar.setText("0");

        jLabel2.setText("Kembalian :");

        tfKembalian.setText("0");

        jButton1.setText("Bayar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSoto)
                            .addComponent(cbRawon)
                            .addComponent(cbBakso)
                            .addComponent(cbGudeg)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lblHitung)
                            .addComponent(jLabel2))))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfBakso)
                    .addComponent(tfGudeg)
                    .addComponent(tfRawon)
                    .addComponent(tfSoto, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(tfTotal)
                    .addComponent(tfBayar)
                    .addComponent(tfKembalian))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btHitung)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSoto)
                    .addComponent(tfSoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRawon)
                    .addComponent(tfRawon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBakso)
                    .addComponent(tfBakso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbGudeg)
                    .addComponent(tfGudeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHitung))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHitung)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSotoActionPerformed
        // TODO add your handling code here
        if (cbSoto.isSelected()== true){
            tfSoto.setEditable(true);
        }else{
            tfSoto.setEditable(false);
            tfSoto.setText("");
        }
       
    }//GEN-LAST:event_cbSotoActionPerformed

    private void cbRawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRawonActionPerformed
        // TODO add your handling code here:
        if (cbRawon.isSelected()== true){
            tfRawon.setEditable(true);
        }else{
            tfRawon.setEditable(false);
            tfRawon.setText("");
        }
    }//GEN-LAST:event_cbRawonActionPerformed

    private void cbBaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBaksoActionPerformed
        // TODO add your handling code here:
        if (cbBakso.isSelected()== true){
            tfBakso.setEditable(true);
        }else{
            tfBakso.setEditable(false);
            tfBakso.setText("");
        }
    }//GEN-LAST:event_cbBaksoActionPerformed

    private void cbGudegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGudegActionPerformed
        // TODO add your handling code here:
        if (cbGudeg.isSelected()== true){
            tfGudeg.setEditable(true);
        }else{
            tfGudeg.setEditable(false);
            tfGudeg.setText("");
        }
    }//GEN-LAST:event_cbGudegActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cbSoto.setSelected(false);
        cbBakso.setSelected(false);
        cbRawon.setSelected(false);
        cbGudeg.setSelected(false);
        tfSoto.setText("0");
        tfBakso.setText("0");
        tfRawon.setText("0");
        tfGudeg.setText("0");
        tfTotal.setText("0");
        tfBayar.setText("0");
        tfKembalian.setText("0");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
        // TODO add your handling code here:
        
        soto = 5000;
        rawon = 6000;
        bakso = 4000;
        gudeg = 8000;
        hitung = Integer.parseInt(tfBakso.getText())*bakso +
                 Integer.parseInt(tfSoto.getText())*soto+
                 Integer.parseInt(tfGudeg.getText())*gudeg+
                 Integer.parseInt(tfRawon.getText())*rawon;
        tfTotal.setText(String.valueOf(hitung));
                         
    }//GEN-LAST:event_btHitungActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int jml;
        jml = Integer.parseInt(tfBayar.getText())-hitung;
        if (jml < 0){
            JOptionPane.showMessageDialog(rootPane, "Uang Anda Kurang!!!");
        } else{
            tfKembalian.setText(String.valueOf(jml));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHitung;
    private javax.swing.JCheckBox cbBakso;
    private javax.swing.JCheckBox cbGudeg;
    private javax.swing.JCheckBox cbRawon;
    private javax.swing.JCheckBox cbSoto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblHitung;
    private javax.swing.JLabel lblJudul;
    private javax.swing.JTextField tfBakso;
    private javax.swing.JTextField tfBayar;
    private javax.swing.JTextField tfGudeg;
    private javax.swing.JTextField tfKembalian;
    private javax.swing.JTextField tfRawon;
    private javax.swing.JTextField tfSoto;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
