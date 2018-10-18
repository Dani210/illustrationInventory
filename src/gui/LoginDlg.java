package gui;

public class LoginDlg extends javax.swing.JDialog {

    private boolean isOk;
    public boolean isOk(){ return isOk; }
    
    public LoginDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        isOk = false;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        onLogin = new javax.swing.JButton();
        onCancel = new javax.swing.JButton();
        lbUsername = new javax.swing.JLabel();
        lbPassphrase = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        tfUsername.setColumns(20);
        tfUsername.setText("username");
        tfUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUsernameFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(tfUsername, gridBagConstraints);

        tfPassword.setColumns(20);
        tfPassword.setText("password");
        tfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPasswordFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(tfPassword, gridBagConstraints);

        onLogin.setText("Anmelden");
        onLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(onLogin, gridBagConstraints);

        onCancel.setText("Abbrechen");
        onCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(onCancel, gridBagConstraints);

        lbUsername.setText("Username:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(lbUsername, gridBagConstraints);

        lbPassphrase.setText("Passphrase:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        getContentPane().add(lbPassphrase, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusGained
        tfPassword.setSelectionStart(0);
        tfPassword.setSelectionEnd(tfPassword.getPassword().length);
    }//GEN-LAST:event_tfPasswordFocusGained

    private void onCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCancelActionPerformed
        isOk = true;
        this.setVisible(false);
    }//GEN-LAST:event_onCancelActionPerformed

    private void tfUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsernameFocusGained
        /*
        *Wenn User ins TF clickt wird der Placeholder »username« markiert, 
        *um ihn leichter zu löschen
        *-> bei tfPassword das selbe
        */
        tfUsername.setSelectionStart(0);
        tfUsername.setSelectionEnd(tfPassword.getPassword().length);
    }//GEN-LAST:event_tfUsernameFocusGained

    private void onLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLoginActionPerformed
        isOk = true;
        this.setVisible(false);
    }//GEN-LAST:event_onLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginDlg dialog = new LoginDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbPassphrase;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JButton onCancel;
    private javax.swing.JButton onLogin;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
