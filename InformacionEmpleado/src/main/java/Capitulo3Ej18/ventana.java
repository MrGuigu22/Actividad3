
package Capitulo3Ej18;

public class ventana extends javax.swing.JFrame {

    public ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtHorasTr = new javax.swing.JTextField();
        txtValorH = new javax.swing.JTextField();
        txtPorRetencionF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreR = new javax.swing.JTextField();
        txtCodigoR = new javax.swing.JTextField();
        txtSalarioB = new javax.swing.JTextField();
        txtSalarioN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 186, -1, -1));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 186, -1, -1));

        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 53, 57, -1));

        jLabel2.setText("Porcentaje de retencio en la fuente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 137, -1, -1));

        jLabel3.setText("Horas trabajadas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 81, -1, -1));

        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 25, -1, -1));

        jLabel5.setText("Valor de la hora trabajada: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 109, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 24, 232, 20));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 50, 232, -1));
        getContentPane().add(txtHorasTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 78, 232, -1));
        getContentPane().add(txtValorH, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 106, 232, -1));
        getContentPane().add(txtPorRetencionF, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 134, 232, -1));

        jLabel6.setText("Salario neto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 241, -1, -1));

        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 241, -1, -1));

        jLabel8.setText("Codigo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 241, -1, -1));

        jLabel9.setText("Salario bruto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 241, -1, -1));
        getContentPane().add(txtNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 263, 138, -1));
        getContentPane().add(txtCodigoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 263, 138, -1));
        getContentPane().add(txtSalarioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 263, 138, -1));
        getContentPane().add(txtSalarioN, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 263, 138, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        String C, N;
        double H,V,P,SB,SN;
        C = txtCodigo.getText( );
        N = txtNombre.getText( );     
        H = Double.parseDouble(txtHorasTr.getText( ));
        V = Double.parseDouble(txtValorH.getText( ));
        P = Double.parseDouble(txtPorRetencionF.getText( ));
        
        double SBR = Empleado.CalcularSB(H,V);
        double RFR = Empleado.CalcularRF(SBR,P);
        double SNR = Empleado.CalcularSN(SBR,RFR);
        
        txtNombreR.setText(String.valueOf(N));
        txtCodigoR.setText(String.valueOf(C));
        txtSalarioB.setText(String.valueOf(SBR));
        txtSalarioN.setText(String.valueOf(SNR));

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        String A = "";
        txtNombreR.setText(String.valueOf(A));
        txtCodigoR.setText(String.valueOf(A));
        txtSalarioB.setText(String.valueOf(A));
        txtSalarioN.setText(String.valueOf(A));
        txtCodigo.setText(String.valueOf(A));
        txtNombre.setText(String.valueOf(A));
        txtPorRetencionF.setText(String.valueOf(A));
        txtHorasTr.setText(String.valueOf(A));
        txtValorH.setText(String.valueOf(A));
    }//GEN-LAST:event_btnBorrarActionPerformed

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
                if ("FlatLaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoR;
    private javax.swing.JTextField txtHorasTr;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreR;
    private javax.swing.JTextField txtPorRetencionF;
    private javax.swing.JTextField txtSalarioB;
    private javax.swing.JTextField txtSalarioN;
    private javax.swing.JTextField txtValorH;
    // End of variables declaration//GEN-END:variables
}
