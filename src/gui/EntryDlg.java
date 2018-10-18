package gui;

public class EntryDlg extends javax.swing.JDialog {

    private boolean isOk;
    public boolean isOk(){ return isOk; }
    
    public EntryDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        isOk = false;
    }

    public void setDefaults(String id, String title, String date){
        tfID.setText(id);
        tfTitle.setText(title);
        tfDate.setText(date);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        lbDate = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        onOk = new javax.swing.JButton();
        onCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(4, 2));

        lbID.setText("Identifikationsnummer (ID):");
        getContentPane().add(lbID);

        tfID.setColumns(20);
        getContentPane().add(tfID);

        lbTitle.setText("Title");
        getContentPane().add(lbTitle);

        tfTitle.setColumns(20);
        getContentPane().add(tfTitle);

        lbDate.setText("Hinzugefügt am:");
        getContentPane().add(lbDate);

        tfDate.setColumns(20);
        getContentPane().add(tfDate);

        onOk.setText("OK");
        onOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOkActionPerformed(evt);
            }
        });
        getContentPane().add(onOk);

        onCancel.setText("Abbrechen");
        onCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCancelActionPerformed(evt);
            }
        });
        getContentPane().add(onCancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOkActionPerformed
        isOk = true;
        this.setVisible(false);
    }//GEN-LAST:event_onOkActionPerformed

    private void onCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCancelActionPerformed
        isOk = false;
        this.setVisible(false);
    }//GEN-LAST:event_onCancelActionPerformed

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
            java.util.logging.Logger.getLogger(EntryDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EntryDlg dialog = new EntryDlg(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JButton onCancel;
    private javax.swing.JButton onOk;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfTitle;
    // End of variables declaration//GEN-END:variables
}
