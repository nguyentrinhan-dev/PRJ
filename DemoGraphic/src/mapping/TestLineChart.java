/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping;

/**
 *
 * @author nguyentrinhan2000
 */
public class TestLineChart extends javax.swing.JFrame {

    /**
     * Creates new form TestLineChart
     */
    LineChartPanel pChart;
    RealPointList rList;// list of real point

    public TestLineChart() {
        initComponents();
        this.setSize(750, 600);
        pChart = new LineChartPanel();
        this.getContentPane().add(pChart);
        this.btnDraw.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtData = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbMin = new javax.swing.JLabel();
        lbMax = new javax.swing.JLabel();
        btnGet = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtXLab = new javax.swing.JTextField();
        txtYLab = new javax.swing.JTextField();
        btnDraw = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtData.setColumns(20);
        txtData.setRows(5);
        jScrollPane1.setViewportView(txtData);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 162, 180);

        jLabel1.setBackground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("MinMaxValues:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 10, 73, 15);

        jLabel2.setText("MinValue:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 50, 47, 15);

        jLabel3.setText("MaxValue:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 90, 51, 15);

        lbMin.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.add(lbMin);
        lbMin.setBounds(300, 50, 100, 20);

        lbMax.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.add(lbMax);
        lbMax.setBounds(300, 90, 120, 20);

        btnGet.setText("Get Extreme Values");
        btnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetActionPerformed(evt);
            }
        });
        jPanel1.add(btnGet);
        btnGet.setBounds(230, 140, 130, 25);

        jLabel4.setText("Setup Properties of the chart:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(540, 10, 142, 15);

        jLabel5.setText("minVal");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 50, 32, 15);

        txtMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinActionPerformed(evt);
            }
        });
        jPanel1.add(txtMin);
        txtMin.setBounds(530, 40, 70, 30);

        jLabel6.setText("maxVal");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 100, 36, 15);
        jPanel1.add(txtMax);
        txtMax.setBounds(530, 90, 70, 30);

        jLabel7.setText("x-Lab");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(620, 40, 28, 15);

        jLabel8.setText("y-Lab");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(620, 90, 28, 15);

        txtXLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXLabActionPerformed(evt);
            }
        });
        jPanel1.add(txtXLab);
        txtXLab.setBounds(670, 40, 70, 30);

        txtYLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYLabActionPerformed(evt);
            }
        });
        jPanel1.add(txtYLab);
        txtYLab.setBounds(670, 90, 70, 30);

        btnDraw.setText("Draw Line Chart");
        btnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawActionPerformed(evt);
            }
        });
        jPanel1.add(btnDraw);
        btnDraw.setBounds(580, 150, 113, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 313, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinActionPerformed

    private void txtXLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXLabActionPerformed

    private void btnDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrawActionPerformed
        // TODO add your handling code here:
        //set up values
        double minY = Double.parseDouble(txtMin.getText());
        double maxY = Double.parseDouble(txtMax.getText());
        String x_Label = txtXLab.getText();
        String y_Label = txtYLab.getText();
        if (rList != null) {
            rList.minY = minY;
            rList.maxY = maxY;
            rList.minX = 0; // x = 0, 1, 2
            rList.maxX = rList.size();
            //compute chart area
            this.pChart.setupChartArea();
            this.pChart.drawAxes();
            this.pChart.drawLabels(x_Label, y_Label);
            this.pChart.drawScale(rList);
            double minX = 0, maxX = rList.size();
            pChart.drawChart(rList, minX, minY, maxX, maxY);
        }
    }//GEN-LAST:event_btnDrawActionPerformed

    private void btnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetActionPerformed
        // TODO add your handling code here:
        String contents = this.txtData.getText();
        String[] valueStrs = contents.split("\n");
        double[] values = new double[valueStrs.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Double.parseDouble(valueStrs[i]);
        }
        rList = new RealPointList(values);
        rList.getBoundaries();
        double minValue = rList.minY;
        double maxValue = rList.maxY;
        this.lbMin.setText("" + minValue);
        this.lbMax.setText("" + maxValue);
        this.btnDraw.setEnabled(true);
    }//GEN-LAST:event_btnGetActionPerformed

    private void txtYLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYLabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYLabActionPerformed

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
            java.util.logging.Logger.getLogger(TestLineChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestLineChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestLineChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestLineChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestLineChart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDraw;
    private javax.swing.JButton btnGet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMax;
    private javax.swing.JLabel lbMin;
    private javax.swing.JTextArea txtData;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtXLab;
    private javax.swing.JTextField txtYLab;
    // End of variables declaration//GEN-END:variables
}