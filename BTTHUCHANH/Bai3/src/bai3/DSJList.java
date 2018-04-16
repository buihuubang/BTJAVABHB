/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author bang
 */
public class DSJList extends javax.swing.JFrame {

    /**
     * Creates new form DSJList
     */
    public DSJList() {
        initComponents();
        RightList.setModel(Phai);
        LeftList.setModel(Trai);
        Trai.addElement("Bóng chuyền");
        Trai.addElement("Bóng đá");
        Trai.addElement("Bóng bay");
        Phai.addElement("Bóng chúa");
    }
    DefaultListModel Phai = new DefaultListModel();
    DefaultListModel Trai = new DefaultListModel();
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LeftList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        RightList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnmvR = new javax.swing.JButton();
        btnmvAR = new javax.swing.JButton();
        btnmvL = new javax.swing.JButton();
        btnmvAL = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh sách");
        setResizable(false);

        LeftList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bóng đá", "Bóng chuyền", "Cầu lông" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(LeftList);

        RightList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Thể thao điện tử" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(RightList);

        jLabel1.setText("Danh sách các môn thể thao");

        jLabel2.setText("Danh sách các môn yêu thích");

        btnmvR.setText(">");
        btnmvR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmvRActionPerformed(evt);
            }
        });

        btnmvAR.setText(">>");
        btnmvAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmvARActionPerformed(evt);
            }
        });

        btnmvL.setText("<");
        btnmvL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmvLActionPerformed(evt);
            }
        });

        btnmvAL.setText("<<");
        btnmvAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmvALActionPerformed(evt);
            }
        });

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmvAL, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(btnmvL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmvAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmvR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmvR)
                        .addGap(18, 18, 18)
                        .addComponent(btnmvAR)
                        .addGap(18, 18, 18)
                        .addComponent(btnmvL)
                        .addGap(18, 18, 18)
                        .addComponent(btnmvAL))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Hãy thêm một môn thể thao");
//        ListModel dsMon = LeftList.getModel();
//        ArrayList<String> ArrMon = new ArrayList<String>();
//        int i = 0;
//        for(i = 0; i < dsMon.getSize();i++){
//            String Mon = dsMon.getElementAt(i).toString();
//            ArrMon.add(Mon);
//        }
//        ArrMon.add(input);
//        String[] mMon = ArrMon.toArray(new String[0]);
//        LeftList.setListData(mMon);
        Trai.addElement(input);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnmvRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmvRActionPerformed
        // TODO add your handling code here:
//        ListModel dsMon = LeftList.getModel();
//        ListModel dsMonThich = RightList.getModel();
        int index[] = LeftList.getSelectedIndices();
        for(int i = index.length - 1; i >= 0;i--){
            Phai.addElement(Trai.get(index[i]));
            Trai.remove(index[i]);
        }
    }//GEN-LAST:event_btnmvRActionPerformed

    private void btnmvARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmvARActionPerformed
        // TODO add your handling code here:
        int size = Trai.getSize();
        for(int i = 0; i < size; i++){
            Phai.addElement(Trai.get(i));
        }
        Trai.clear();
    }//GEN-LAST:event_btnmvARActionPerformed

    private void btnmvLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmvLActionPerformed
        // TODO add your handling code here:
        int index[] = RightList.getSelectedIndices();
        for(int i = index.length - 1; i >= 0;i--){
            Trai.addElement(Phai.get(index[i]));
            Phai.remove(index[i]);
        }
    }//GEN-LAST:event_btnmvLActionPerformed

    private void btnmvALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmvALActionPerformed
        // TODO add your handling code here:
        int size = Phai.getSize();
        for(int i = 0; i < size; i++){
            Trai.addElement(Phai.get(i));
        }
        Phai.clear();
    }//GEN-LAST:event_btnmvALActionPerformed

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
            java.util.logging.Logger.getLogger(DSJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSJList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSJList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> LeftList;
    private javax.swing.JList<String> RightList;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnmvAL;
    private javax.swing.JButton btnmvAR;
    private javax.swing.JButton btnmvL;
    private javax.swing.JButton btnmvR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
