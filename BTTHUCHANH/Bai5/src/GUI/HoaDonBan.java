/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.XuLy;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author buihu
 */
public class HoaDonBan extends javax.swing.JFrame {

    /**
     * Creates new form HoaDonBan
     */
    public HoaDonBan() {
        initComponents();
        TbleMatHang.setModel(model);
        ThemItemCBBOX();
    }
    
    DefaultTableModel model = XuLy.HDBanModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        txtMaHoaDon = new javax.swing.JTextField();
        txtNgayBan = new javax.swing.JTextField();
        cbMaNhanVien = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbMaKhachHang = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDiaChiKhach = new javax.swing.JTextField();
        txtDienThoaiKhach = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        cbMaHang = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtTenHang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtGiamGia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbleMatHang = new javax.swing.JTable();
        btnThemHoaDon = new javax.swing.JButton();
        btnSuaHoaDon = new javax.swing.JButton();
        btnXoaHoaDon = new javax.swing.JButton();
        btnHuyHoaDon = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnThemHang = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbMaHoaDon = new javax.swing.JComboBox<>();
        btnTimKiemMaHD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HÓA ĐƠN BÁN");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chung"));

        jLabel1.setText("Mã hóa đơn");

        jLabel2.setText("Ngày bán");

        jLabel3.setText("Mã nhân viên");

        jLabel4.setText("Tên nhân viên");

        txtTenNhanVien.setEditable(false);

        cbMaNhanVien.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMaNhanVienItemStateChanged(evt);
            }
        });

        jLabel5.setText("Mã khách hàng");

        cbMaKhachHang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMaKhachHangItemStateChanged(evt);
            }
        });

        jLabel6.setText("Tên khách hàng");

        txtTenKhachHang.setEditable(false);

        jLabel7.setText("Địa chỉ");

        jLabel8.setText("Điện thoại");

        txtDiaChiKhach.setEditable(false);

        txtDienThoaiKhach.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNgayBan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenNhanVien)
                            .addComponent(cbMaNhanVien, 0, 138, Short.MAX_VALUE))))
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cbMaKhachHang, 0, 138, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDienThoaiKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDiaChiKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNgayBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiaChiKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtDienThoaiKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin các mặt hàng"));

        jLabel9.setText("Mã hàng");

        jLabel10.setText("Số lượng");

        cbMaHang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMaHangItemStateChanged(evt);
            }
        });

        jLabel11.setText("Tên hàng");

        txtTenHang.setEditable(false);

        jLabel12.setText("Giảm giá %");

        jLabel13.setText("Đơn giá");

        txtDonGia.setEditable(false);

        jLabel14.setText("Thành tiền");

        txtThanhTien.setEditable(false);

        TbleMatHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TbleMatHang.setCellSelectionEnabled(true);
        TbleMatHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TbleMatHangMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TbleMatHang);

        btnThemHoaDon.setText("LƯU HÓA ĐƠN");
        btnThemHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHoaDonActionPerformed(evt);
            }
        });

        btnSuaHoaDon.setText("SỬA HÓA ĐƠN");
        btnSuaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaHoaDonActionPerformed(evt);
            }
        });

        btnXoaHoaDon.setText("XÓA HÓA ĐƠN");
        btnXoaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHoaDonActionPerformed(evt);
            }
        });

        btnHuyHoaDon.setText("ĐÓNG");
        btnHuyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyHoaDonActionPerformed(evt);
            }
        });

        jLabel16.setText("Tổng tiền");

        txtTongTien.setEditable(false);

        jLabel17.setForeground(new java.awt.Color(255, 0, 51));
        jLabel17.setText("Nháy đúp một dòng để xóa");

        btnThemHang.setText("THÊM HÀNG");
        btnThemHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThemHoaDon)
                .addGap(14, 14, 14)
                .addComponent(btnSuaHoaDon)
                .addGap(17, 17, 17)
                .addComponent(btnThemHang)
                .addGap(18, 18, 18)
                .addComponent(btnXoaHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHuyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(cbMaHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuyHoaDon)
                    .addComponent(btnXoaHoaDon)
                    .addComponent(btnSuaHoaDon)
                    .addComponent(btnThemHoaDon)
                    .addComponent(btnThemHang))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel15.setText("Mã hóa đơn");

        btnTimKiemMaHD.setText("TÌM KIẾM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(cbMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiemMaHD)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cbMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemMaHD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void ThemItemCBBOX(){
        //THÊM ITEM CHO COMBOBOX
        for(int i = 0; i < XuLy.NhanVienArray().size();i++){
            cbMaNhanVien.addItem(XuLy.NhanVienArray().get(i).getMaNhanVien());
        }
        for(int j = 0; j < XuLy.HangArray().size(); j++){
            cbMaHang.addItem(XuLy.HangArray().get(j).getMaHang());
        }
        for(int k = 0; k < XuLy.KhachArray().size(); k++){
            cbMaKhachHang.addItem(XuLy.KhachArray().get(k).getMaKhach());
        }
        for(int f = 0; f < XuLy.HDBanArray().size(); f++){
            cbMaHoaDon.addItem(XuLy.HDBanArray().get(f).getMaHDBan());
        }
    }
    
//    private void XoaItemCBBOX(){
//        cbMaNhanVien.removeAllItems();
//        cbMaHang.removeAllItems();
//        cbMaKhachHang.removeAllItems();
//        cbMaHoaDon.removeAllItems();
//    }
    
    private void btnHuyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyHoaDonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new QuanLyBanHang().setVisible(true);
    }//GEN-LAST:event_btnHuyHoaDonActionPerformed

    private void btnThemHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHangActionPerformed
        // TODO add your handling code here:
        String MaHang = cbMaHang.getSelectedItem().toString();
        String TenHang = txtTenHang.getText();
        float DonGia = Float.parseFloat(txtDonGia.getText());
        float SoLuong = Float.parseFloat(txtSoLuong.getText());
        float GiamGia = Float.parseFloat(txtGiamGia.getText());
        float ThanhTien = (DonGia*SoLuong) - (((DonGia * SoLuong)*GiamGia)/100);
        txtThanhTien.setText(String.valueOf(ThanhTien));
        //XuLy.RowHDBan(MaHang, TenHang, txtSoLuong.getText(), txtDonGia.getText(),txtGiamGia.getText(), txtThanhTien.getText());
        Vector <String> h = new Vector<>();
        h.add(MaHang);
        h.add(TenHang);
        h.add(txtSoLuong.getText());
        h.add(txtDonGia.getText());
        h.add(txtGiamGia.getText()+"%");
        h.add(txtThanhTien.getText());
        model.addRow(h);
        TbleMatHang.setModel(model);
        float Tong = 0;
        for(int i = 0 ; i < TbleMatHang.getRowCount();i++){
            Tong += Float.parseFloat(model.getValueAt(i, 5).toString());
        }
        txtTongTien.setText(String.valueOf(Tong));
    }//GEN-LAST:event_btnThemHangActionPerformed

    private void cbMaHangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMaHangItemStateChanged
        // TODO add your handling code here:
        String MaHang = cbMaHang.getSelectedItem().toString();
        txtTenHang.setText(XuLy.TenHangHDBan(MaHang));
        txtDonGia.setText(XuLy.DonGiaHDBan(MaHang));
        txtSoLuong.setText("");
        txtGiamGia.setText("");
        txtThanhTien.setText("");
    }//GEN-LAST:event_cbMaHangItemStateChanged

    private void cbMaKhachHangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMaKhachHangItemStateChanged
        // TODO add your handling code here:
        String MaKhach = cbMaKhachHang.getSelectedItem().toString();
        txtTenKhachHang.setText(XuLy.TenKhachHDBan(MaKhach));
        txtDiaChiKhach.setText(XuLy.DCKhachHDBan(MaKhach));
        txtDienThoaiKhach.setText(XuLy.DTKhachHDBan(MaKhach));
    }//GEN-LAST:event_cbMaKhachHangItemStateChanged

    private void cbMaNhanVienItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMaNhanVienItemStateChanged
        // TODO add your handling code here:
        String MaNhanVien = cbMaNhanVien.getSelectedItem().toString();
        txtTenNhanVien.setText(XuLy.TenNVHDBan(MaNhanVien));
    }//GEN-LAST:event_cbMaNhanVienItemStateChanged

    private void btnThemHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHoaDonActionPerformed
        // TODO add your handling code here:
        String MaHDBan = txtMaHoaDon.getText();
        String MaNhanVien = cbMaNhanVien.getSelectedItem().toString();
        String NgayBan = txtNgayBan.getText();
        String MaKhachHang = cbMaKhachHang.getSelectedItem().toString();
        Float TongTien = Float.parseFloat(txtTongTien.getText());
        int kq = XuLy.InsertHDBan(MaHDBan, MaNhanVien, NgayBan, MaKhachHang,TongTien);
        if(kq == 0){
            JOptionPane.showMessageDialog(rootPane, "Lưu hóa đơn thất bại! \n Trùng mã hóa đơn","ERROR",JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lưu thành công","THÔNG BÁO", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnThemHoaDonActionPerformed

    private void btnSuaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaHoaDonActionPerformed
        // TODO add your handling code here:
        String MaHDBan = txtMaHoaDon.getText();
        String MaNhanVien = cbMaNhanVien.getSelectedItem().toString();
        String NgayBan = txtNgayBan.getText();
        String MaKhachHang = cbMaKhachHang.getSelectedItem().toString();
        Float TongTien = Float.parseFloat(txtTongTien.getText());
        int kq = XuLy.UpdateHDBan(MaHDBan, MaNhanVien, NgayBan, MaKhachHang,TongTien);
        if(kq == 0){
            JOptionPane.showMessageDialog(rootPane, "Sửa hóa đơn thất bại!","ERROR",JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Sửa hóa đơn thành công","THÔNG BÁO", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnSuaHoaDonActionPerformed

    private void btnXoaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHoaDonActionPerformed
        // TODO add your handling code here:
        int kq = XuLy.DeleteHDBan(txtMaHoaDon.getText());
        if(kq == 0){
            JOptionPane.showMessageDialog(rootPane, "Xóa hóa đơn thất bại!","ERROR",JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Xóa hóa đơn thành công","THÔNG BÁO", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnXoaHoaDonActionPerformed

    private void TbleMatHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbleMatHangMousePressed
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            int n = TbleMatHang.getSelectedRow();
            model.removeRow(n);
            TbleMatHang.setModel(model);
            Float Tong = Float.parseFloat(txtTongTien.getText());
            Tong -= Float.parseFloat(model.getValueAt(n, 5).toString());
            txtTongTien.setText(String.valueOf(Tong));
        } 
    }//GEN-LAST:event_TbleMatHangMousePressed

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
            java.util.logging.Logger.getLogger(HoaDonBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbleMatHang;
    private javax.swing.JButton btnHuyHoaDon;
    private javax.swing.JButton btnSuaHoaDon;
    private javax.swing.JButton btnThemHang;
    private javax.swing.JButton btnThemHoaDon;
    private javax.swing.JButton btnTimKiemMaHD;
    private javax.swing.JButton btnXoaHoaDon;
    private javax.swing.JComboBox<String> cbMaHang;
    private javax.swing.JComboBox<String> cbMaHoaDon;
    private javax.swing.JComboBox<String> cbMaKhachHang;
    private javax.swing.JComboBox<String> cbMaNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDiaChiKhach;
    private javax.swing.JTextField txtDienThoaiKhach;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtNgayBan;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenHang;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
