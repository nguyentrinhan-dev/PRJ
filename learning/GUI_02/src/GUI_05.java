
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class GUI_05 extends javax.swing.JFrame {

    /**
     * Creates new form GUI_05
     */
    public GUI_05() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        mnuPopup = new javax.swing.JPopupMenu();
        mnuBackGround = new javax.swing.JMenu();
        mnuRed = new javax.swing.JMenuItem();
        mnuBlue = new javax.swing.JMenuItem();
        mnuForeground = new javax.swing.JMenu();
        mnuYellow = new javax.swing.JMenuItem();
        mnuPink = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuOpen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuClose = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuQuit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCustom1 = new javax.swing.JCheckBoxMenuItem();
        mnuCustom2 = new javax.swing.JMenu();
        mnuCustom21 = new javax.swing.JRadioButtonMenuItem();
        mnuCustom22 = new javax.swing.JRadioButtonMenuItem();

        mnuBackGround.setText("BackGround");

        mnuRed.setBackground(new java.awt.Color(255, 0, 0));
        mnuRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRedActionPerformed(evt);
            }
        });
        mnuBackGround.add(mnuRed);

        mnuBlue.setBackground(new java.awt.Color(0, 255, 255));
        mnuBlue.setText("jMenuItem2");
        mnuBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBlueActionPerformed(evt);
            }
        });
        mnuBackGround.add(mnuBlue);

        mnuPopup.add(mnuBackGround);

        mnuForeground.setText("Forground");

        mnuYellow.setBackground(new java.awt.Color(255, 255, 255));
        mnuYellow.setForeground(new java.awt.Color(255, 255, 51));
        mnuYellow.setText("jMenuItem1");
        mnuYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuYellowActionPerformed(evt);
            }
        });
        mnuForeground.add(mnuYellow);

        mnuPink.setForeground(new java.awt.Color(255, 0, 255));
        mnuPink.setText("jMenuItem2");
        mnuPink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPinkActionPerformed(evt);
            }
        });
        mnuForeground.add(mnuPink);

        mnuPopup.add(mnuForeground);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt1.setColumns(20);
        txt1.setRows(5);
        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txt1);

        jMenu1.setText("File");

        mnuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        mnuOpen.setText("Open");
        mnuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOpenActionPerformed(evt);
            }
        });
        jMenu1.add(mnuOpen);
        jMenu1.add(jSeparator1);

        mnuClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        mnuClose.setText("Close");
        mnuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCloseActionPerformed(evt);
            }
        });
        jMenu1.add(mnuClose);
        jMenu1.add(jSeparator2);

        mnuQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        mnuQuit.setText("Quit");
        mnuQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQuitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuQuit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Custom");

        mnuCustom1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_MASK));
        mnuCustom1.setSelected(true);
        mnuCustom1.setText("Custom1");
        mnuCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCustom1ActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCustom1);

        mnuCustom2.setText("Custom2");

        mnuCustom21.setSelected(true);
        mnuCustom21.setText("Custom21");
        mnuCustom21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCustom21ActionPerformed(evt);
            }
        });
        mnuCustom2.add(mnuCustom21);

        mnuCustom22.setSelected(true);
        mnuCustom22.setText("Custom22");
        mnuCustom22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCustom22ActionPerformed(evt);
            }
        });
        mnuCustom2.add(mnuCustom22);

        jMenu2.add(mnuCustom2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOpenActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Menu Open is clicked.");
    }//GEN-LAST:event_mnuOpenActionPerformed

    private void mnuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCloseActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Menu Close is clicked.");
    }//GEN-LAST:event_mnuCloseActionPerformed

    private void mnuQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuQuitActionPerformed

    private void mnuCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCustom1ActionPerformed
        // TODO add your handling code here:
        if (this.mnuCustom1.isSelected())
            JOptionPane.showMessageDialog(this, "Menu Custom1 is selected.");
        else
            JOptionPane.showMessageDialog(this, "Menu Custom1 is de-selected.");
    }//GEN-LAST:event_mnuCustom1ActionPerformed

    private void mnuCustom21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCustom21ActionPerformed
        // TODO add your handling code here:
        if (this.mnuCustom21.isSelected())
            JOptionPane.showMessageDialog(this, "Menu Custom21 is selected.");
        
    }//GEN-LAST:event_mnuCustom21ActionPerformed

    private void mnuCustom22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCustom22ActionPerformed
        // TODO add your handling code here:
        if (this.mnuCustom22.isSelected())
            JOptionPane.showMessageDialog(this, "Menu Custom22 is selected.");
    }//GEN-LAST:event_mnuCustom22ActionPerformed

    private void mnuRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRedActionPerformed
        // TODO add your handling code here:
        this.txt1.setBackground(mnuRed.getBackground());
    }//GEN-LAST:event_mnuRedActionPerformed

    private void mnuBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBlueActionPerformed
        // TODO add your handling code here:
        this.txt1.setBackground(mnuBlue.getBackground());
    }//GEN-LAST:event_mnuBlueActionPerformed

    private void mnuYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuYellowActionPerformed
        // TODO add your handling code here:
        this.txt1.setBackground(mnuYellow.getBackground());
    }//GEN-LAST:event_mnuYellowActionPerformed

    private void mnuPinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPinkActionPerformed
        // TODO add your handling code here:
        this.txt1.setBackground(mnuPink.getBackground());
    }//GEN-LAST:event_mnuPinkActionPerformed

    private void txt1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger())
            this.mnuPopup.show(this.txt1, evt.getX(), evt.getY());
    }//GEN-LAST:event_txt1MouseReleased

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
            java.util.logging.Logger.getLogger(GUI_05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_05().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JMenu mnuBackGround;
    private javax.swing.JMenuItem mnuBlue;
    private javax.swing.JMenuItem mnuClose;
    private javax.swing.JCheckBoxMenuItem mnuCustom1;
    private javax.swing.JMenu mnuCustom2;
    private javax.swing.JRadioButtonMenuItem mnuCustom21;
    private javax.swing.JRadioButtonMenuItem mnuCustom22;
    private javax.swing.JMenu mnuForeground;
    private javax.swing.JMenuItem mnuOpen;
    private javax.swing.JMenuItem mnuPink;
    private javax.swing.JPopupMenu mnuPopup;
    private javax.swing.JMenuItem mnuQuit;
    private javax.swing.JMenuItem mnuRed;
    private javax.swing.JMenuItem mnuYellow;
    private javax.swing.JTextArea txt1;
    // End of variables declaration//GEN-END:variables
}
