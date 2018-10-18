package gui;

import bl.Illustration;
import bl.Inventory;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

public class GUI extends javax.swing.JFrame {

    private LoginDlg login;
    private EntryDlg makeSomeEntry;
    
    private Inventory inv;
    
    public GUI() {
        initComponents();
        inv = new Inventory();
        tableOutput.setModel(inv);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kontextMenu = new javax.swing.JPopupMenu();
        onAdd = new javax.swing.JMenuItem();
        onRemove = new javax.swing.JMenuItem();
        onChange = new javax.swing.JMenuItem();
        scrollPane = new javax.swing.JScrollPane();
        tableOutput = new javax.swing.JTable();
        mainMenuBar = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        onLogin = new javax.swing.JMenuItem();
        menuData = new javax.swing.JMenu();
        onSave = new javax.swing.JMenuItem();
        onLoad = new javax.swing.JMenuItem();

        onAdd.setText("Hinzufügen");
        onAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onAddActionPerformed(evt);
            }
        });
        kontextMenu.add(onAdd);

        onRemove.setText("Entfernen");
        kontextMenu.add(onRemove);

        onChange.setText("Ändern");
        kontextMenu.add(onChange);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scrollPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrollPaneMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(tableOutput);

        getContentPane().add(scrollPane, java.awt.BorderLayout.CENTER);

        menuUser.setText("Benutzer");

        onLogin.setText("Anmelden");
        onLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLoginActionPerformed(evt);
            }
        });
        menuUser.add(onLogin);

        mainMenuBar.add(menuUser);

        menuData.setText("Daten");

        onSave.setText("Speichern");
        menuData.add(onSave);

        onLoad.setText("Laden");
        menuData.add(onLoad);

        mainMenuBar.add(menuData);

        setJMenuBar(mainMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLoginActionPerformed
        login = new LoginDlg(this, true);
        
        login.setVisible(true);
    }//GEN-LAST:event_onLoginActionPerformed

    private void scrollPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollPaneMouseClicked
        //PopupMenu zum adden, removen, ...
        if(evt.getButton() == MouseEvent.BUTTON3){
            kontextMenu.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
            kontextMenu.setVisible(true);
        }
        if(evt.getButton() == MouseEvent.BUTTON1){
            kontextMenu.setVisible(false);
        }
    }//GEN-LAST:event_scrollPaneMouseClicked

    private void onAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onAddActionPerformed
        //kontextMenu muss wieder verschwinden
        kontextMenu.setVisible(false);
        
        //um den Speicher zu schonen machen wir nur einen Dialog, wenn wir ihn brauchen
        makeSomeEntry = new EntryDlg(this, true);
        makeSomeEntry.setDefaults("1", "CT\'", LocalDate.now().format(Illustration.DATEFORMATTER));
        
        makeSomeEntry.setVisible(true);
        //add or not
    }//GEN-LAST:event_onAddActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu kontextMenu;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JMenu menuData;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenuItem onAdd;
    private javax.swing.JMenuItem onChange;
    private javax.swing.JMenuItem onLoad;
    private javax.swing.JMenuItem onLogin;
    private javax.swing.JMenuItem onRemove;
    private javax.swing.JMenuItem onSave;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tableOutput;
    // End of variables declaration//GEN-END:variables
}
