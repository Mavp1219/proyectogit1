/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio2;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmdcalcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtvalor1 = new javax.swing.JTextField();
        txtvalor2 = new javax.swing.JTextField();
        txtresultado1 = new javax.swing.JTextField();
        txtresultado2 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 0, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("SUELDO Y COMISIONES ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 190, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("SUELDO BASE :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NUMERO DE HIJOS :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 124, 130, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("COMISION :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("SUELDO TOTAL: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, 20));

        cmdcalcular.setText("CALCULAR");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        jPanel3.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jButton2.setText("BORRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        txtvalor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalor1KeyTyped(evt);
            }
        });
        jPanel3.add(txtvalor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 130, 30));

        txtvalor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtvalor2KeyTyped(evt);
            }
        });
        jPanel3.add(txtvalor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, 30));

        txtresultado1.setEditable(false);
        txtresultado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultado1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtresultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, 30));

        txtresultado2.setEditable(false);
        jPanel3.add(txtresultado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 130, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtresultado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresultado1ActionPerformed

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
        double valor1, valor2, comision, sueldot;
        String res;

        txtresultado1.setText("");
        txtresultado2.setText("");
        if (txtvalor1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, " Digite por favor el valor 1", "Error", JOptionPane.ERROR_MESSAGE);
            txtvalor1.requestFocusInWindow();
        } else if (txtvalor2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor el valor 2", "Error", JOptionPane.ERROR_MESSAGE);
            txtvalor2.requestFocusInWindow();
        } else {

            valor1 = Double.parseDouble(txtvalor1.getText());
            valor2 = Double.parseDouble(txtvalor2.getText());

            if (valor1 == 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un sueldo diferente de 0", "Error", JOptionPane.ERROR_MESSAGE);
                txtvalor1.requestFocusInWindow();
                txtvalor1.selectAll();
            } else if (valor2 == 0) {
                JOptionPane.showMessageDialog(this, "Debe tener hijos para tener comision", "Error", JOptionPane.ERROR_MESSAGE);
                txtvalor2.requestFocusInWindow();
                txtvalor2.selectAll();
            } else {
                comision = valor2 * 80000;

                sueldot = valor1 + comision;

                txtresultado1.setText(String.valueOf(comision));
                txtresultado2.setText(String.valueOf(sueldot));

            }

        }


    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtvalor1.setText("");
        txtvalor2.setText("");
        txtresultado1.setText("");
        txtresultado2.setText("");

        txtvalor1.requestFocusInWindow();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtvalor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalor1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtvalor1KeyTyped

    private void txtvalor2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalor2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();;
            evt.consume();
        }
    }//GEN-LAST:event_txtvalor2KeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtresultado1;
    private javax.swing.JTextField txtresultado2;
    private javax.swing.JTextField txtvalor1;
    private javax.swing.JTextField txtvalor2;
    // End of variables declaration//GEN-END:variables
}
