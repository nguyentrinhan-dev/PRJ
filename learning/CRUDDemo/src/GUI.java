
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nguyentrinhan2000
 */
public class GUI extends javax.swing.JFrame {

    String filename = "employees1.txt";
    Vector<String> header = new Vector<String>();
    Vector data = new Vector();
    boolean addNew = false;
    boolean changed = false;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setSize(500,270);
        header.add("Code");
        header.add("Name");
        header.add("Salary");
        loadData();
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel)this.tblEmp.getModel();
        tblModel.setDataVector(data, header);
    }
    private void loadData(){
        try {
            File f = new File(filename);
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String aDeatails;
            while ((aDeatails = bf.readLine()) != null) {                
                StringTokenizer stk = new StringTokenizer(aDeatails , ",");
                String code = stk.nextToken();
                String name = stk.nextToken();
                String salaryStr = stk.nextToken();
                Vector<String> v = new Vector<>();
                v.add(code);
                v.add(name);
                v.add(salaryStr);
                data.add(v);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "the file "+filename+" not found");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jCode = new javax.swing.JTextField();
        jName = new javax.swing.JTextField();
        jSalary = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNew = new javax.swing.JButton();
        jRemove = new javax.swing.JButton();
        jSavetoFile = new javax.swing.JButton();
        jSave = new javax.swing.JButton();
        jExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EMPLOYEE LIST");

        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEmpMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmp);

        jCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodeActionPerformed(evt);
            }
        });

        jSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalaryActionPerformed(evt);
            }
        });

        jLabel3.setText("Code");

        jLabel4.setText("Name");

        jLabel5.setText("Salary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSalary)
                    .addComponent(jName)
                    .addComponent(jCode))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jName, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        jLabel2.setText("Details");

        jNew.setText("New");
        jNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewActionPerformed(evt);
            }
        });

        jRemove.setText("Remove");
        jRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRemoveActionPerformed(evt);
            }
        });

        jSavetoFile.setText("Save to file");
        jSavetoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSavetoFileActionPerformed(evt);
            }
        });

        jSave.setText("Save");
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jNew)
                .addGap(30, 30, 30)
                .addComponent(jRemove)
                .addGap(30, 30, 30)
                .addComponent(jSavetoFile)
                .addGap(30, 30, 30)
                .addComponent(jSave)
                .addGap(30, 30, 30)
                .addComponent(jExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNew)
                    .addComponent(jRemove)
                    .addComponent(jSavetoFile)
                    .addComponent(jSave)
                    .addComponent(jExit))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodeActionPerformed

    private void jSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalaryActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        // TODO add your handling code here:
        if (changed == true){
            if((JOptionPane.showConfirmDialog(this, "Data changed. Save Y/N?") == JOptionPane.OK_OPTION)){
                jSavetoFileActionPerformed(null);
            }
        }
        System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    private void jSavetoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSavetoFileActionPerformed
        // TODO add your handling code here:
        try {
            File f = new File(filename);
            PrintWriter pf = new PrintWriter(f);
            int n = this.tblEmp.getRowCount();
            for (int i = 0; i < n; i++){
                Vector<String> v = (Vector<String>) (data.get(i));
                String S = v.get(0) + "," + v.get(1) + "," + v.get(2);
                pf.println(S);
            }
            pf.close();
            changed = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jSavetoFileActionPerformed

    private void jNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewActionPerformed
        // TODO add your handling code here:
        this.addNew = true;
        this.jCode.setText("");
        this.jCode.setEditable(true);
        this.jName.setText("");
        this.jSalary.setText("");
        this.jCode.requestFocus();
    }//GEN-LAST:event_jNewActionPerformed

    private void jRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRemoveActionPerformed
        // TODO add your handling code here:
        int pos = this.tblEmp.getSelectedRow();
        if (pos >= 0){
            String code = (String) tblEmp.getValueAt(pos, 0);
            if (JOptionPane.showConfirmDialog(this, "delete " + code + " emp?") == JOptionPane.OK_OPTION){
                data.remove(pos);
                tblEmp.updateUI();
                changed = true;
            }
        }
    }//GEN-LAST:event_jRemoveActionPerformed

    private void tblEmpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseReleased
        // TODO add your handling code here:
        if (this.tblEmp.isEditing()){
            int row = tblEmp.getSelectedRow();
            int column = tblEmp.getSelectedColumn();
            tblEmp.getCellEditor(row,column).cancelCellEditing();
        }
    }//GEN-LAST:event_tblEmpMouseReleased

    boolean valid(){
        String s = "";
        if (addNew == true){
            s = this.jCode.getText().trim().toUpperCase();
            this.jCode.setText(s);
            if (!s.matches("^E\\d{3}$")){
                JOptionPane.showMessageDialog(this, "code format E000");
                return false;
            }
            for (int i = 0; i < data.size(); i++){
                Vector v = (Vector) data.get(i);
                if (s.equals((String) (v.get(0)))){
                    JOptionPane.showMessageDialog(this, "Code duplicated");
                    jCode.requestFocus();
                    return false;
                }
            }
        }
        s = this.jName.getText().trim();
        if (s.length() == 0){
            JOptionPane.showMessageDialog(this, "Name required");
            return false;
        }
        s = this.jSalary.getText().trim();
        if (!s.matches("^\\d+$")){
            JOptionPane.showMessageDialog(this, "Salary must be an integer!");
            return false;
        }
        return true;
    }
    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        // TODO add your handling code here:
        int row = tblEmp.getSelectedRow();
        this.jCode.setText((String) (tblEmp.getValueAt(row, 0)));
        this.jCode.setEditable(false);
        this.jName.setText((String) (tblEmp.getValueAt(row, 1)));
        this.jSalary.setText((String) (tblEmp.getValueAt(row, 2)));
        addNew = false;
    }//GEN-LAST:event_tblEmpMouseClicked

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
        // TODO add your handling code here:
        if (!valid()) return;
        String code = jCode.getText();
        String name = jName.getText();
        String salaryStr = jSalary.getText();
        if (addNew){
            Vector v = new Vector();
            v.add(code);
            v.add(name);
            v.add(salaryStr);
            data.add(v);
            addNew = false;
        }
        else{
            int pos = tblEmp.getSelectedRow();
            Vector v = new Vector();
            v.set(1, name);
            v.set(2, salaryStr);
        }
        tblEmp.updateUI();
        changed = true;
    }//GEN-LAST:event_jSaveActionPerformed

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
    private javax.swing.JTextField jCode;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jName;
    private javax.swing.JButton jNew;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRemove;
    private javax.swing.JTextField jSalary;
    private javax.swing.JButton jSave;
    private javax.swing.JButton jSavetoFile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmp;
    // End of variables declaration//GEN-END:variables
}
