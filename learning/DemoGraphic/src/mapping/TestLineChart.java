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

        jPanel2 = new javax.swing.JPanel();
        pData = new javax.swing.JPanel();
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

        pData.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));
        pData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtData.setColumns(20);
        txtData.setRows(5);
        jScrollPane1.setViewportView(txtData);

        pData.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 170));

        jLabel1.setBackground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("MinMaxValues:");
        pData.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel2.setText("MinValue:");
        pData.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jLabel3.setText("MaxValue:");
        pData.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        lbMin.setBackground(new java.awt.Color(153, 255, 255));
        pData.add(lbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 100, 20));

        lbMax.setBackground(new java.awt.Color(0, 153, 255));
        pData.add(lbMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, 20));

        btnGet.setText("Get Extreme Values");
        btnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetActionPerformed(evt);
            }
        });
        pData.add(btnGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel4.setText("Setup Properties of the chart:");
        pData.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jLabel5.setText("minVal");
        pData.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        txtMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinActionPerformed(evt);
            }
        });
        pData.add(txtMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 70, 30));

        jLabel6.setText("maxVal");
        pData.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));
        pData.add(txtMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 70, 30));

        jLabel7.setText("x-Lab");
        pData.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        jLabel8.setText("y-Lab");
        pData.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        txtXLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXLabActionPerformed(evt);
            }
        });
        pData.add(txtXLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 70, 30));

        txtYLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYLabActionPerformed(evt);
            }
        });
        pData.add(txtYLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 70, 30));

        btnDraw.setText("Draw Line Chart");
        btnDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrawActionPerformed(evt);
            }
        });
        pData.add(btnDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pData, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pData, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMax;
    private javax.swing.JLabel lbMin;
    private javax.swing.JPanel pData;
    private javax.swing.JTextArea txtData;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtXLab;
    private javax.swing.JTextField txtYLab;
    // End of variables declaration//GEN-END:variables
}
