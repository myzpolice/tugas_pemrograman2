/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author cube
 */
public class Tampilan extends javax.swing.JFrame {

    /**
     * Creates new form Tampilan
     */
    public Tampilan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPilihan = new javax.swing.ButtonGroup();
        btnGroupData = new javax.swing.ButtonGroup();
        rdPil1 = new javax.swing.JRadioButton();
        rdPil2 = new javax.swing.JRadioButton();
        rdPil3 = new javax.swing.JRadioButton();
        tfRadioButton = new javax.swing.JTextField();
        rdData3 = new javax.swing.JRadioButton();
        rdData1 = new javax.swing.JRadioButton();
        rdData2 = new javax.swing.JRadioButton();
        btnProses = new javax.swing.JButton();
        cbPil1 = new javax.swing.JCheckBox();
        cbPil2 = new javax.swing.JCheckBox();
        cbPil3 = new javax.swing.JCheckBox();
        tfPil1 = new javax.swing.JTextField();
        tfPil2 = new javax.swing.JTextField();
        tfPil3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taHasil = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        btnTampil = new javax.swing.JButton();
        cbPaket = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfResult = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfAreaResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGroupPilihan.add(rdPil1);
        rdPil1.setText("Pilihan 1");
        rdPil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPil1ActionPerformed(evt);
            }
        });

        btnGroupPilihan.add(rdPil2);
        rdPil2.setText("Pilihan 2");
        rdPil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPil2ActionPerformed(evt);
            }
        });

        btnGroupPilihan.add(rdPil3);
        rdPil3.setText("Pilihan 3");
        rdPil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdPil3ActionPerformed(evt);
            }
        });

        btnGroupData.add(rdData3);
        rdData3.setText("Data 3");
        rdData3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdData3ActionPerformed(evt);
            }
        });

        btnGroupData.add(rdData1);
        rdData1.setText("Data 1");
        rdData1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdData1ActionPerformed(evt);
            }
        });

        btnGroupData.add(rdData2);
        rdData2.setText("Data 2");
        rdData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdData2ActionPerformed(evt);
            }
        });

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        cbPil1.setText("Pil 1");
        cbPil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPil1ActionPerformed(evt);
            }
        });

        cbPil2.setText("Pil 2");
        cbPil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPil2ActionPerformed(evt);
            }
        });

        cbPil3.setText("Pil 3");
        cbPil3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPil3ActionPerformed(evt);
            }
        });

        tfPil1.setText("0");

        tfPil2.setText("0");

        tfPil3.setText("0");

        taHasil.setColumns(20);
        taHasil.setRows(5);
        jScrollPane1.setViewportView(taHasil);

        btnTampil.setText("Tampil");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });

        cbPaket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "== Pilih ==", "Pilihan 1", "Pilihan 2", "Pilihan 3" }));
        cbPaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaketActionPerformed(evt);
            }
        });

        jLabel1.setText("Paket");

        jLabel2.setText("Nama");

        jLabel3.setText("Harga");

        tfAreaResult.setColumns(20);
        tfAreaResult.setRows(5);
        jScrollPane2.setViewportView(tfAreaResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rdPil3)
                                .addComponent(rdPil2)
                                .addComponent(rdPil1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(cbPil1)
                            .addComponent(cbPil3)
                            .addComponent(cbPil2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfPil1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(tfPil2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPil3, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTampil)
                    .addComponent(rdData3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdData1)
                        .addGap(26, 26, 26)
                        .addComponent(btnProses))
                    .addComponent(rdData2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfResult)
                        .addComponent(cbPaket, 0, 163, Short.MAX_VALUE)
                        .addComponent(tfNama)
                        .addComponent(jTextField2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdPil1)
                    .addComponent(rdData1)
                    .addComponent(btnProses))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdPil2)
                            .addComponent(rdData2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdPil3)
                            .addComponent(tfRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdData3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPil1)
                            .addComponent(tfPil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPil2)
                            .addComponent(tfPil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPil3)
                            .addComponent(tfPil3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPaket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(btnTampil))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdPil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPil2ActionPerformed
        // TODO add your handling code here:
        if(rdPil2.isSelected()){
            tfRadioButton.setText(rdPil2.getText());
        }
    }//GEN-LAST:event_rdPil2ActionPerformed

    private void rdData3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdData3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdData3ActionPerformed

    private void rdData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdData1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdData1ActionPerformed

    private void rdData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdData2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdData2ActionPerformed

    private void rdPil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPil1ActionPerformed
        // TODO add your handling code here:
        if(rdPil1.isSelected()){
            tfRadioButton.setText(rdPil1.getText());
        }
    }//GEN-LAST:event_rdPil1ActionPerformed

    private void rdPil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdPil3ActionPerformed
        // TODO add your handling code here:
        if(rdPil3.isSelected()){
            tfRadioButton.setText(rdPil3.getText());
        }
    }//GEN-LAST:event_rdPil3ActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        if(rdData1.isSelected()){
            tfRadioButton.setText(rdData1.getText());
        } else if(rdData2.isSelected()){
            tfRadioButton.setText(rdData2.getText());
        } else if(rdData3.isSelected()) {
            tfRadioButton.setText(rdData3.getText());
        } else {
            tfRadioButton.setText("");
        }
    }//GEN-LAST:event_btnProsesActionPerformed

    private void cbPil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPil1ActionPerformed
        // TODO add your handling code here:
        if(cbPil1.isSelected()){
            tfPil1.setText(100+"");
        } else {
            tfPil1.setText(0+"");
        }
    }//GEN-LAST:event_cbPil1ActionPerformed

    private void cbPil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPil2ActionPerformed
        // TODO add your handling code here:
        
        if(cbPil2.isSelected()){
            tfPil2.setText(200+"");
        } else {
            tfPil2.setText(0+"");
        }
    }//GEN-LAST:event_cbPil2ActionPerformed

    private void cbPil3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPil3ActionPerformed
        // TODO add your handling code here:
        
        if(cbPil3.isSelected()){
            tfPil3.setText(300+"");
        } else {
            tfPil3.setText(0+"");
        }
    }//GEN-LAST:event_cbPil3ActionPerformed

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
        // TODO add your handling code here:
        int n1, n2, n3, hasil;
        n1 = Integer.parseInt(tfPil1.getText());
        n2 = Integer.parseInt(tfPil2.getText());
        n3 = Integer.parseInt(tfPil3.getText());
        hasil = n1+n2+n3;
        taHasil.setText("Total " + "\t" + ": " + hasil+ "");
    }//GEN-LAST:event_btnTampilActionPerformed

    private void cbPaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaketActionPerformed
        // TODO add your handling code here:
        if(cbPaket.getSelectedIndex() == 0){
            tfResult.setText("");
        } else {
            String test = "";
            if(cbPaket.getSelectedIndex() == 1){
            test = "harga: \n"
                    + cbPaket.getSelectedItem().toString() + ": " + "2000";
            } else if(cbPaket.getSelectedIndex() == 2){
                test = "harga: \n"
                    + cbPaket.getSelectedItem().toString() + ": " + "5000";
            } else {
                test = "harga: \n"
                    + cbPaket.getSelectedItem().toString() + ": " + "10000";
            }
            tfAreaResult.setText(test);
            tfResult.setText(cbPaket.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cbPaketActionPerformed

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
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupData;
    private javax.swing.ButtonGroup btnGroupPilihan;
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnTampil;
    private javax.swing.JComboBox<String> cbPaket;
    private javax.swing.JCheckBox cbPil1;
    private javax.swing.JCheckBox cbPil2;
    private javax.swing.JCheckBox cbPil3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton rdData1;
    private javax.swing.JRadioButton rdData2;
    private javax.swing.JRadioButton rdData3;
    private javax.swing.JRadioButton rdPil1;
    private javax.swing.JRadioButton rdPil2;
    private javax.swing.JRadioButton rdPil3;
    private javax.swing.JTextArea taHasil;
    private javax.swing.JTextArea tfAreaResult;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfPil1;
    private javax.swing.JTextField tfPil2;
    private javax.swing.JTextField tfPil3;
    private javax.swing.JTextField tfRadioButton;
    private javax.swing.JTextField tfResult;
    // End of variables declaration//GEN-END:variables
}
