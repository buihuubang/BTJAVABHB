/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author buihu
 */
public class QuanLyBanHang extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyBanHang
     */
    public QuanLyBanHang() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuTapTin = new javax.swing.JMenu();
        mnuExit = new javax.swing.JMenuItem();
        mnuDanhMuc = new javax.swing.JMenu();
        mnuChatLieu = new javax.swing.JMenuItem();
        mnuNhanVien = new javax.swing.JMenuItem();
        mnuKhachHang = new javax.swing.JMenuItem();
        mnuHangHoa = new javax.swing.JMenuItem();
        mnuHoaDon = new javax.swing.JMenu();
        mnuHoaDonBan = new javax.swing.JMenuItem();
        mnuTimKiem = new javax.swing.JMenu();
        mnuTimHoaDon = new javax.swing.JMenuItem();
        mnuTimHang = new javax.swing.JMenuItem();
        mnuTimKhachHang = new javax.swing.JMenuItem();
        mnuBaoCao = new javax.swing.JMenu();
        mnuBCHangTon = new javax.swing.JMenuItem();
        mnuBCDoanhThu = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mnuHienTroGiup = new javax.swing.JMenuItem();
        mnuVaiNet = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuTapTin.setText("Tập tin");

        mnuExit.setText("Thoát");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuTapTin.add(mnuExit);

        jMenuBar1.add(mnuTapTin);

        mnuDanhMuc.setText("Danh mục");

        mnuChatLieu.setText("Chất liệu");
        mnuChatLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuChatLieuActionPerformed(evt);
            }
        });
        mnuDanhMuc.add(mnuChatLieu);

        mnuNhanVien.setText("Nhân viên");
        mnuNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNhanVienActionPerformed(evt);
            }
        });
        mnuDanhMuc.add(mnuNhanVien);

        mnuKhachHang.setText("Khách hàng");
        mnuKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKhachHangActionPerformed(evt);
            }
        });
        mnuDanhMuc.add(mnuKhachHang);

        mnuHangHoa.setText("Hàng hóa");
        mnuHangHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHangHoaActionPerformed(evt);
            }
        });
        mnuDanhMuc.add(mnuHangHoa);

        jMenuBar1.add(mnuDanhMuc);

        mnuHoaDon.setText("Hóa đơn");

        mnuHoaDonBan.setText("Hóa Đơn Bán");
        mnuHoaDonBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHoaDonBanActionPerformed(evt);
            }
        });
        mnuHoaDon.add(mnuHoaDonBan);

        jMenuBar1.add(mnuHoaDon);

        mnuTimKiem.setText("Tìm kiếm");

        mnuTimHoaDon.setText("Tìm hóa đơn");
        mnuTimHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTimHoaDonActionPerformed(evt);
            }
        });
        mnuTimKiem.add(mnuTimHoaDon);

        mnuTimHang.setText("Tìm hàng");
        mnuTimKiem.add(mnuTimHang);

        mnuTimKhachHang.setText("Tìm khách hàng");
        mnuTimKiem.add(mnuTimKhachHang);

        jMenuBar1.add(mnuTimKiem);

        mnuBaoCao.setText("Báo cáo");

        mnuBCHangTon.setText("Hàng tồn");
        mnuBaoCao.add(mnuBCHangTon);

        mnuBCDoanhThu.setText("Doanh thu");
        mnuBaoCao.add(mnuBCDoanhThu);

        jMenuBar1.add(mnuBaoCao);

        mnuTroGiup.setText("Trợ giúp");

        mnuHienTroGiup.setText("Hiện trợ giúp");
        mnuTroGiup.add(mnuHienTroGiup);

        mnuVaiNet.setText("Vài nét");
        mnuTroGiup.add(mnuVaiNet);

        jMenuBar1.add(mnuTroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuChatLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuChatLieuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new DanhMucChatLieu().setVisible(true);
    }//GEN-LAST:event_mnuChatLieuActionPerformed

    private void mnuNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNhanVienActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new DanhMucNhanVien().setVisible(true);
    }//GEN-LAST:event_mnuNhanVienActionPerformed

    private void mnuHangHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHangHoaActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new DanhMucHangHoa().setVisible(true);
    }//GEN-LAST:event_mnuHangHoaActionPerformed

    private void mnuKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKhachHangActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new DanhMucKhachHang().setVisible(true);
    }//GEN-LAST:event_mnuKhachHangActionPerformed

    private void mnuHoaDonBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHoaDonBanActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new HoaDonBan().setVisible(true);
    }//GEN-LAST:event_mnuHoaDonBanActionPerformed

    private void mnuTimHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTimHoaDonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new TimKiemHoaDon().setVisible(true);
    }//GEN-LAST:event_mnuTimHoaDonActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyBanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem mnuBCDoanhThu;
    private javax.swing.JMenuItem mnuBCHangTon;
    private javax.swing.JMenu mnuBaoCao;
    private javax.swing.JMenuItem mnuChatLieu;
    private javax.swing.JMenu mnuDanhMuc;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuHangHoa;
    private javax.swing.JMenuItem mnuHienTroGiup;
    private javax.swing.JMenu mnuHoaDon;
    private javax.swing.JMenuItem mnuHoaDonBan;
    private javax.swing.JMenuItem mnuKhachHang;
    private javax.swing.JMenuItem mnuNhanVien;
    private javax.swing.JMenu mnuTapTin;
    private javax.swing.JMenuItem mnuTimHang;
    private javax.swing.JMenuItem mnuTimHoaDon;
    private javax.swing.JMenuItem mnuTimKhachHang;
    private javax.swing.JMenu mnuTimKiem;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JMenuItem mnuVaiNet;
    // End of variables declaration//GEN-END:variables
}
