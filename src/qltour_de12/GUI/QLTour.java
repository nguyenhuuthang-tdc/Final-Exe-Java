/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltour_de12.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import qltour_de12.BUL.BUL_PhieuDK;
import qltour_de12.BUL.BUL_KhachHang;
import qltour_de12.BUL.BUL_ChiTiet;
import qltour_de12.BUL.BUL_Tour;
import qltour_de12.DTO.DTO_PhieuDK;
import qltour_de12.DTO.DTO_KhachHang;
import qltour_de12.DTO.DTO_ChiTiet;
import qltour_de12.DTO.DTO_Tour;

/**
 *
 * @author ASUS
 */
public class QLTour extends javax.swing.JFrame {

    //Khai bao BUL khách hàng
    BUL_KhachHang bul_khachHang = new BUL_KhachHang();
    //Khai báo BUL phòng ban
    BUL_ChiTiet bul_chiTiet = new BUL_ChiTiet();
    //Khai báo BUL phiếu đăng ký
    BUL_PhieuDK bul_phieudk = new BUL_PhieuDK();
    //Khai báo BUL tour
    BUL_Tour bul_tour = new BUL_Tour();
    //
    static String maTourOld;

    public QLTour() throws SQLException {
        initComponents();
        tab_main.setBackground(new Color(174, 224, 239));
        //Gọi đến hàm đổ dữ liệu vào combobox
        getComboboxMaKhachHang();
        getComboboxMaKhachHangExtra();
        getComboboxMaPhieu();
        getComboboxMaTour();
        //

        /* =======================  Gọi hàm setup các table =============================== */
        setUpTableKhachHang();
        ShowKhachHang();
        setUpTablePhieuDK();
        ShowPhieuDK();
        setUpTableTour();
        ShowTour();
        setUpTableChiTiet();
        ShowChiTiet();
        setUpTableThongTin();
        setUpTablePhieuDK();

        /* =======================  Gọi hàm Show dữ liệu =============================== */       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTimKiem = new javax.swing.ButtonGroup();
        btnGroupSapXep = new javax.swing.ButtonGroup();
        tab_main = new javax.swing.JTabbedPane();
        tab_nhanvien = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_KhachHang = new javax.swing.JTable();
        btnCapNhatKhachHang = new javax.swing.JButton();
        btnThemKhachHang = new javax.swing.JButton();
        btnXoaKhachHang = new javax.swing.JButton();
        btnThoatKhachHang = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        lbHoTen = new javax.swing.JLabel();
        lbDiachi = new javax.swing.JLabel();
        btnClearKhachHang = new javax.swing.JButton();
        lbMaKH = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        lbKey = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        rdbtnTimMaKH = new javax.swing.JRadioButton();
        rdbtnTimTenKH = new javax.swing.JRadioButton();
        btnTimKiem = new javax.swing.JButton();
        btnSapXepTang = new javax.swing.JButton();
        btnSapXepGiam = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rdbtnSapXepMaKH = new javax.swing.JRadioButton();
        rdbtnSapXepTenKH = new javax.swing.JRadioButton();
        btnRefresh = new javax.swing.JButton();
        tab_phieudangky = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_PhieuDK = new javax.swing.JTable();
        lbTitle1 = new javax.swing.JLabel();
        btnThemPhieuDK = new javax.swing.JButton();
        btnCapNhatPhieuDK = new javax.swing.JButton();
        btnXoaPhieuDK = new javax.swing.JButton();
        btnThoatPhieuDK = new javax.swing.JButton();
        lbMaPhieu = new javax.swing.JLabel();
        txtMaPhieu = new javax.swing.JTextField();
        lbMaKHPhieuDangKy = new javax.swing.JLabel();
        dtpNgDK = new com.toedter.calendar.JDateChooser();
        lbNgDK = new javax.swing.JLabel();
        btnClearPhieuDK = new javax.swing.JButton();
        cbbMaKHPhieuDK = new javax.swing.JComboBox<String>();
        tab_tour = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_Tour = new javax.swing.JTable();
        lbTitle2 = new javax.swing.JLabel();
        lbmaTour = new javax.swing.JLabel();
        txtmaTour = new javax.swing.JTextField();
        lbloTrinh = new javax.swing.JLabel();
        lbhanhTrinh = new javax.swing.JLabel();
        txtgia = new javax.swing.JTextField();
        lbgiaTour = new javax.swing.JLabel();
        btnThemTour = new javax.swing.JButton();
        btnCapNhatTour = new javax.swing.JButton();
        btnXoaTour = new javax.swing.JButton();
        btnThoatTour = new javax.swing.JButton();
        btnClearTour = new javax.swing.JButton();
        txtloTrinh = new javax.swing.JTextField();
        txthanhTrinh = new javax.swing.JTextField();
        tab_chitiet = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_ChiTiet = new javax.swing.JTable();
        btnThemChiTiet = new javax.swing.JButton();
        btnCapNhatChiTiet = new javax.swing.JButton();
        btnXoaChiTiet = new javax.swing.JButton();
        btnThoatChiTiet = new javax.swing.JButton();
        lbTitle3 = new javax.swing.JLabel();
        lbmaTourCT = new javax.swing.JLabel();
        lbmaPhieuCT = new javax.swing.JLabel();
        btnClearChiTiet = new javax.swing.JButton();
        cbbMaPhieuCT = new javax.swing.JComboBox<String>();
        cbbMaTourCT = new javax.swing.JComboBox<String>();
        lbMaPhieu1 = new javax.swing.JLabel();
        txtsoNguoi = new javax.swing.JTextField();
        tab_luongnhanvien = new javax.swing.JPanel();
        lbTitle5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_ThongTin = new javax.swing.JTable();
        lbMaKH1 = new javax.swing.JLabel();
        lbHoTen1 = new javax.swing.JLabel();
        lbDiachi1 = new javax.swing.JLabel();
        lbhoTen = new javax.swing.JLabel();
        lbdiaChi = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_PhieuDangKy = new javax.swing.JTable();
        lbTextPhieuDK = new javax.swing.JLabel();
        lbTongSoPhieu = new javax.swing.JLabel();
        lbResult = new javax.swing.JLabel();
        lbThanhTien = new javax.swing.JLabel();
        lbMoney = new javax.swing.JLabel();
        cbbMaKHThongKe = new javax.swing.JComboBox();
        lbMaKHThongKe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý Tour");
        setBackground(new java.awt.Color(204, 255, 204));
        setFocusable(false);
        setLocation(new java.awt.Point(450, 150));

        tab_main.setBackground(new java.awt.Color(255, 255, 255));
        tab_main.setForeground(new java.awt.Color(51, 51, 51));
        tab_main.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tab_main.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab_main.setFocusable(false);
        tab_main.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tab_main.setInheritsPopupMenu(true);

        tab_nhanvien.setBackground(new java.awt.Color(255, 255, 255));

        table_KhachHang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        table_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
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
        table_KhachHang.setAutoscrolls(false);
        table_KhachHang.setFocusable(false);
        table_KhachHang.setGridColor(new java.awt.Color(102, 102, 102));
        table_KhachHang.setIntercellSpacing(new java.awt.Dimension(2, 2));
        table_KhachHang.setRowHeight(30);
        table_KhachHang.setSelectionBackground(new java.awt.Color(117, 223, 255));
        table_KhachHang.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table_KhachHang.setSurrendersFocusOnKeystroke(true);
        table_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_KhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_KhachHang);

        btnCapNhatKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhatKhachHang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCapNhatKhachHang.setForeground(new java.awt.Color(102, 102, 102));
        btnCapNhatKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_edit_26px.png"))); // NOI18N
        btnCapNhatKhachHang.setText("CẬP NHẬT");
        btnCapNhatKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnCapNhatKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhatKhachHang.setFocusPainted(false);
        btnCapNhatKhachHang.setFocusable(false);
        btnCapNhatKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatKhachHangActionPerformed(evt);
            }
        });

        btnThemKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnThemKhachHang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThemKhachHang.setForeground(new java.awt.Color(102, 102, 102));
        btnThemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_add_26px.png"))); // NOI18N
        btnThemKhachHang.setText("THÊM");
        btnThemKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnThemKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemKhachHang.setFocusPainted(false);
        btnThemKhachHang.setFocusable(false);
        btnThemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhachHangActionPerformed(evt);
            }
        });

        btnXoaKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaKhachHang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoaKhachHang.setForeground(new java.awt.Color(102, 102, 102));
        btnXoaKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_remove_26px_1.png"))); // NOI18N
        btnXoaKhachHang.setText("XÓA");
        btnXoaKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnXoaKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaKhachHang.setFocusPainted(false);
        btnXoaKhachHang.setFocusable(false);
        btnXoaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhachHangActionPerformed(evt);
            }
        });

        btnThoatKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnThoatKhachHang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThoatKhachHang.setForeground(new java.awt.Color(102, 102, 102));
        btnThoatKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_shutdown_26px.png"))); // NOI18N
        btnThoatKhachHang.setText("THOÁT");
        btnThoatKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnThoatKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoatKhachHang.setFocusPainted(false);
        btnThoatKhachHang.setFocusable(false);
        btnThoatKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatKhachHangActionPerformed(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(102, 102, 102));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Quản lý khách hàng");

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtTenKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        lbHoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbHoTen.setText("Họ tên: ");

        lbDiachi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDiachi.setText("Địa chỉ:");

        btnClearKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        btnClearKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClearKhachHang.setForeground(new java.awt.Color(102, 102, 102));
        btnClearKhachHang.setText("Thêm mới");
        btnClearKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnClearKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearKhachHang.setFocusPainted(false);
        btnClearKhachHang.setFocusable(false);
        btnClearKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearKhachHangMouseClicked(evt);
            }
        });
        btnClearKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearKhachHangActionPerformed(evt);
            }
        });

        lbMaKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMaKH.setText("Mã KH: ");

        txtMaKH.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbKey.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbKey.setText("Nhập từ khóa:");

        jPanel8.setBackground(new java.awt.Color(242, 242, 242));

        rdbtnTimMaKH.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupTimKiem.add(rdbtnTimMaKH);
        rdbtnTimMaKH.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rdbtnTimMaKH.setSelected(true);
        rdbtnTimMaKH.setText("Mã khách hàng");
        rdbtnTimMaKH.setFocusable(false);
        rdbtnTimMaKH.setOpaque(false);

        btnGroupTimKiem.add(rdbtnTimTenKH);
        rdbtnTimTenKH.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rdbtnTimTenKH.setText("Tên khách hàng");
        rdbtnTimTenKH.setFocusable(false);
        rdbtnTimTenKH.setOpaque(false);
        rdbtnTimTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTimTenKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rdbtnTimMaKH)
                .addGap(85, 85, 85)
                .addComponent(rdbtnTimTenKH)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnTimMaKH)
                    .addComponent(rdbtnTimTenKH))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnTimKiem.setBackground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(102, 102, 102));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-search-26.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.setFocusable(false);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnSapXepTang.setBackground(new java.awt.Color(255, 255, 255));
        btnSapXepTang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSapXepTang.setForeground(new java.awt.Color(102, 102, 102));
        btnSapXepTang.setText("Sắp xếp tăng");
        btnSapXepTang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnSapXepTang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSapXepTang.setFocusable(false);
        btnSapXepTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepTangActionPerformed(evt);
            }
        });

        btnSapXepGiam.setBackground(new java.awt.Color(255, 255, 255));
        btnSapXepGiam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSapXepGiam.setForeground(new java.awt.Color(102, 102, 102));
        btnSapXepGiam.setText("Sắp xếp giảm");
        btnSapXepGiam.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        btnSapXepGiam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSapXepGiam.setFocusable(false);
        btnSapXepGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepGiamActionPerformed(evt);
            }
        });

        rdbtnSapXepMaKH.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupSapXep.add(rdbtnSapXepMaKH);
        rdbtnSapXepMaKH.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rdbtnSapXepMaKH.setSelected(true);
        rdbtnSapXepMaKH.setText("Mã khách hàng");
        rdbtnSapXepMaKH.setFocusable(false);
        rdbtnSapXepMaKH.setOpaque(false);

        btnGroupSapXep.add(rdbtnSapXepTenKH);
        rdbtnSapXepTenKH.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rdbtnSapXepTenKH.setText("Tên khách hàng");
        rdbtnSapXepTenKH.setFocusable(false);
        rdbtnSapXepTenKH.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbtnSapXepMaKH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbtnSapXepTenKH)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtnSapXepMaKH)
                    .addComponent(rdbtnSapXepTenKH))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnRefresh.setBackground(new java.awt.Color(255, 255, 255));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(0, 153, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-female-user-update-26.png"))); // NOI18N
        btnRefresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.setFocusable(false);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lbKey)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnSapXepTang, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSapXepGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(175, 175, 175))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbKey, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSapXepGiam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSapXepTang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tab_nhanvienLayout = new javax.swing.GroupLayout(tab_nhanvien);
        tab_nhanvien.setLayout(tab_nhanvienLayout);
        tab_nhanvienLayout.setHorizontalGroup(
            tab_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_nhanvienLayout.createSequentialGroup()
                .addGroup(tab_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_nhanvienLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235)
                        .addComponent(btnCapNhatKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_nhanvienLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addGroup(tab_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tab_nhanvienLayout.createSequentialGroup()
                                .addComponent(lbHoTen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tab_nhanvienLayout.createSequentialGroup()
                                .addComponent(lbMaKH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tab_nhanvienLayout.createSequentialGroup()
                                .addComponent(lbDiachi)
                                .addGap(18, 18, 18)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addGroup(tab_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_nhanvienLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnXoaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(btnThoatKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(tab_nhanvienLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnClearKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tab_nhanvienLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        tab_nhanvienLayout.setVerticalGroup(
            tab_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_nhanvienLayout.createSequentialGroup()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tab_nhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhatKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoatKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tab_main.addTab("Khách hàng", tab_nhanvien);

        tab_phieudangky.setBackground(new java.awt.Color(255, 255, 255));

        table_PhieuDK.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        table_PhieuDK.setModel(new javax.swing.table.DefaultTableModel(
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
        table_PhieuDK.setGridColor(new java.awt.Color(102, 102, 102));
        table_PhieuDK.setIntercellSpacing(new java.awt.Dimension(2, 2));
        table_PhieuDK.setRowHeight(30);
        table_PhieuDK.setSelectionBackground(new java.awt.Color(117, 223, 255));
        table_PhieuDK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_PhieuDKMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table_PhieuDK);

        lbTitle1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbTitle1.setForeground(new java.awt.Color(102, 102, 102));
        lbTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle1.setText("Quản lý phiếu đăng ký");

        btnThemPhieuDK.setBackground(new java.awt.Color(255, 255, 255));
        btnThemPhieuDK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThemPhieuDK.setForeground(new java.awt.Color(102, 102, 102));
        btnThemPhieuDK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_add_26px.png"))); // NOI18N
        btnThemPhieuDK.setText("THÊM");
        btnThemPhieuDK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnThemPhieuDK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemPhieuDK.setFocusPainted(false);
        btnThemPhieuDK.setFocusable(false);
        btnThemPhieuDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPhieuDKActionPerformed(evt);
            }
        });

        btnCapNhatPhieuDK.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhatPhieuDK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCapNhatPhieuDK.setForeground(new java.awt.Color(102, 102, 102));
        btnCapNhatPhieuDK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_edit_26px.png"))); // NOI18N
        btnCapNhatPhieuDK.setText("CẬP NHẬT");
        btnCapNhatPhieuDK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnCapNhatPhieuDK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhatPhieuDK.setFocusPainted(false);
        btnCapNhatPhieuDK.setFocusable(false);
        btnCapNhatPhieuDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatPhieuDKActionPerformed(evt);
            }
        });

        btnXoaPhieuDK.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaPhieuDK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoaPhieuDK.setForeground(new java.awt.Color(102, 102, 102));
        btnXoaPhieuDK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_remove_26px_1.png"))); // NOI18N
        btnXoaPhieuDK.setText("XÓA");
        btnXoaPhieuDK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnXoaPhieuDK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaPhieuDK.setFocusPainted(false);
        btnXoaPhieuDK.setFocusable(false);
        btnXoaPhieuDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhieuDKActionPerformed(evt);
            }
        });

        btnThoatPhieuDK.setBackground(new java.awt.Color(255, 255, 255));
        btnThoatPhieuDK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThoatPhieuDK.setForeground(new java.awt.Color(102, 102, 102));
        btnThoatPhieuDK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_shutdown_26px.png"))); // NOI18N
        btnThoatPhieuDK.setText("THOÁT");
        btnThoatPhieuDK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnThoatPhieuDK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoatPhieuDK.setFocusPainted(false);
        btnThoatPhieuDK.setFocusable(false);
        btnThoatPhieuDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatPhieuDKActionPerformed(evt);
            }
        });

        lbMaPhieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMaPhieu.setText("Mã phiếu:");

        txtMaPhieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbMaKHPhieuDangKy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMaKHPhieuDangKy.setText("Mã khách:");

        dtpNgDK.setDateFormatString("dd/MM/yyyy");
        dtpNgDK.setFocusable(false);
        dtpNgDK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbNgDK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNgDK.setText("Ngày đăng ký:");

        btnClearPhieuDK.setBackground(new java.awt.Color(255, 255, 255));
        btnClearPhieuDK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClearPhieuDK.setForeground(new java.awt.Color(102, 102, 102));
        btnClearPhieuDK.setText("Thêm mới");
        btnClearPhieuDK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnClearPhieuDK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearPhieuDK.setFocusPainted(false);
        btnClearPhieuDK.setFocusable(false);
        btnClearPhieuDK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearPhieuDKMouseClicked(evt);
            }
        });
        btnClearPhieuDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearPhieuDKActionPerformed(evt);
            }
        });

        cbbMaKHPhieuDK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbMaKHPhieuDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaKHPhieuDKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tab_phieudangkyLayout = new javax.swing.GroupLayout(tab_phieudangky);
        tab_phieudangky.setLayout(tab_phieudangkyLayout);
        tab_phieudangkyLayout.setHorizontalGroup(
            tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addComponent(lbTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tab_phieudangkyLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_phieudangkyLayout.createSequentialGroup()
                        .addGroup(tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMaPhieu)
                            .addComponent(lbMaKHPhieuDangKy))
                        .addGap(18, 18, 18)
                        .addGroup(tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbMaKHPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_phieudangkyLayout.createSequentialGroup()
                        .addComponent(btnThemPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(btnCapNhatPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_phieudangkyLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tab_phieudangkyLayout.createSequentialGroup()
                                .addComponent(lbNgDK)
                                .addGap(30, 30, 30)
                                .addComponent(dtpNgDK, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnClearPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_phieudangkyLayout.createSequentialGroup()
                        .addComponent(btnXoaPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btnThoatPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(435, Short.MAX_VALUE))
        );
        tab_phieudangkyLayout.setVerticalGroup(
            tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_phieudangkyLayout.createSequentialGroup()
                .addComponent(lbTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNgDK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtpNgDK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaKHPhieuDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMaKHPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addGroup(tab_phieudangkyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoatPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab_main.addTab("Phiếu đăng ký", tab_phieudangky);

        tab_tour.setBackground(new java.awt.Color(255, 255, 255));

        table_Tour.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        table_Tour.setModel(new javax.swing.table.DefaultTableModel(
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
        table_Tour.setFocusable(false);
        table_Tour.setGridColor(new java.awt.Color(102, 102, 102));
        table_Tour.setIntercellSpacing(new java.awt.Dimension(2, 2));
        table_Tour.setRowHeight(30);
        table_Tour.setSelectionBackground(new java.awt.Color(117, 223, 255));
        table_Tour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_TourMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table_Tour);

        lbTitle2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbTitle2.setForeground(new java.awt.Color(102, 102, 102));
        lbTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle2.setText("Quản lý Tour");

        lbmaTour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbmaTour.setText("Mã tour:");

        txtmaTour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbloTrinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbloTrinh.setText("Lộ trình:");

        lbhanhTrinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbhanhTrinh.setText("Hành trình:");

        txtgia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lbgiaTour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbgiaTour.setText("Giá:");

        btnThemTour.setBackground(new java.awt.Color(255, 255, 255));
        btnThemTour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThemTour.setForeground(new java.awt.Color(102, 102, 102));
        btnThemTour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_add_26px.png"))); // NOI18N
        btnThemTour.setText("THÊM");
        btnThemTour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnThemTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemTour.setFocusPainted(false);
        btnThemTour.setFocusable(false);
        btnThemTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTourActionPerformed(evt);
            }
        });

        btnCapNhatTour.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhatTour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCapNhatTour.setForeground(new java.awt.Color(102, 102, 102));
        btnCapNhatTour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_edit_26px.png"))); // NOI18N
        btnCapNhatTour.setText("CẬP NHẬT");
        btnCapNhatTour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnCapNhatTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhatTour.setFocusPainted(false);
        btnCapNhatTour.setFocusable(false);
        btnCapNhatTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatTourActionPerformed(evt);
            }
        });

        btnXoaTour.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaTour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoaTour.setForeground(new java.awt.Color(102, 102, 102));
        btnXoaTour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_remove_26px_1.png"))); // NOI18N
        btnXoaTour.setText("XÓA");
        btnXoaTour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnXoaTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaTour.setFocusPainted(false);
        btnXoaTour.setFocusable(false);
        btnXoaTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTourActionPerformed(evt);
            }
        });

        btnThoatTour.setBackground(new java.awt.Color(255, 255, 255));
        btnThoatTour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThoatTour.setForeground(new java.awt.Color(102, 102, 102));
        btnThoatTour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_shutdown_26px.png"))); // NOI18N
        btnThoatTour.setText("THOÁT");
        btnThoatTour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnThoatTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoatTour.setFocusPainted(false);
        btnThoatTour.setFocusable(false);
        btnThoatTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatTourActionPerformed(evt);
            }
        });

        btnClearTour.setBackground(new java.awt.Color(255, 255, 255));
        btnClearTour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClearTour.setForeground(new java.awt.Color(102, 102, 102));
        btnClearTour.setText("Thêm mới");
        btnClearTour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        btnClearTour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearTour.setFocusPainted(false);
        btnClearTour.setFocusable(false);
        btnClearTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTourActionPerformed(evt);
            }
        });

        txtloTrinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txthanhTrinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout tab_tourLayout = new javax.swing.GroupLayout(tab_tour);
        tab_tour.setLayout(tab_tourLayout);
        tab_tourLayout.setHorizontalGroup(
            tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1461, Short.MAX_VALUE)
            .addGroup(tab_tourLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tab_tourLayout.createSequentialGroup()
                        .addComponent(btnThemTour, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(btnCapNhatTour, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(btnXoaTour, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(btnThoatTour, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab_tourLayout.createSequentialGroup()
                        .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbloTrinh, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbmaTour))
                        .addGap(18, 18, 18)
                        .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmaTour, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtloTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tab_tourLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbhanhTrinh)
                                    .addComponent(lbgiaTour))
                                .addGap(18, 18, 18)
                                .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txthanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(tab_tourLayout.createSequentialGroup()
                                .addGap(444, 444, 444)
                                .addComponent(btnClearTour, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab_tourLayout.setVerticalGroup(
            tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_tourLayout.createSequentialGroup()
                .addComponent(lbTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbmaTour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmaTour, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbhanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbloTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtloTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbgiaTour, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtgia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnClearTour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(tab_tourLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemTour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoatTour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaTour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatTour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab_main.addTab("Tour", tab_tour);

        tab_chitiet.setBackground(new java.awt.Color(255, 255, 255));

        table_ChiTiet.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        table_ChiTiet.setModel(new javax.swing.table.DefaultTableModel(
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
        table_ChiTiet.setFocusable(false);
        table_ChiTiet.setGridColor(new java.awt.Color(102, 102, 102));
        table_ChiTiet.setIntercellSpacing(new java.awt.Dimension(2, 2));
        table_ChiTiet.setRowHeight(30);
        table_ChiTiet.setSelectionBackground(new java.awt.Color(117, 223, 255));
        table_ChiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_ChiTietMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table_ChiTiet);

        btnThemChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        btnThemChiTiet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThemChiTiet.setForeground(new java.awt.Color(102, 102, 102));
        btnThemChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_add_26px.png"))); // NOI18N
        btnThemChiTiet.setText("THÊM");
        btnThemChiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnThemChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemChiTiet.setFocusPainted(false);
        btnThemChiTiet.setFocusable(false);
        btnThemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemChiTietActionPerformed(evt);
            }
        });

        btnCapNhatChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        btnCapNhatChiTiet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCapNhatChiTiet.setForeground(new java.awt.Color(102, 102, 102));
        btnCapNhatChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_edit_26px.png"))); // NOI18N
        btnCapNhatChiTiet.setText("CẬP NHẬT");
        btnCapNhatChiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnCapNhatChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhatChiTiet.setFocusPainted(false);
        btnCapNhatChiTiet.setFocusable(false);
        btnCapNhatChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatChiTietActionPerformed(evt);
            }
        });

        btnXoaChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        btnXoaChiTiet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoaChiTiet.setForeground(new java.awt.Color(102, 102, 102));
        btnXoaChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_remove_26px_1.png"))); // NOI18N
        btnXoaChiTiet.setText("XÓA");
        btnXoaChiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnXoaChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaChiTiet.setFocusPainted(false);
        btnXoaChiTiet.setFocusable(false);
        btnXoaChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaChiTietActionPerformed(evt);
            }
        });

        btnThoatChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        btnThoatChiTiet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThoatChiTiet.setForeground(new java.awt.Color(102, 102, 102));
        btnThoatChiTiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_shutdown_26px.png"))); // NOI18N
        btnThoatChiTiet.setText("THOÁT");
        btnThoatChiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        btnThoatChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoatChiTiet.setFocusPainted(false);
        btnThoatChiTiet.setFocusable(false);
        btnThoatChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatChiTietActionPerformed(evt);
            }
        });

        lbTitle3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbTitle3.setForeground(new java.awt.Color(102, 102, 102));
        lbTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle3.setText("Quản lý phiếu đăng ký");

        lbmaTourCT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbmaTourCT.setText("Mã tour:");

        lbmaPhieuCT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbmaPhieuCT.setText("Mã phiếu:");

        btnClearChiTiet.setBackground(new java.awt.Color(255, 255, 255));
        btnClearChiTiet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClearChiTiet.setForeground(new java.awt.Color(102, 102, 102));
        btnClearChiTiet.setText("Thêm mới");
        btnClearChiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btnClearChiTiet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearChiTiet.setFocusPainted(false);
        btnClearChiTiet.setFocusable(false);
        btnClearChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearChiTietActionPerformed(evt);
            }
        });

        cbbMaPhieuCT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbMaPhieuCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaPhieuCTActionPerformed(evt);
            }
        });

        cbbMaTourCT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbMaTourCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaTourCTActionPerformed(evt);
            }
        });

        lbMaPhieu1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMaPhieu1.setText("Số người:");

        txtsoNguoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout tab_chitietLayout = new javax.swing.GroupLayout(tab_chitiet);
        tab_chitiet.setLayout(tab_chitietLayout);
        tab_chitietLayout.setHorizontalGroup(
            tab_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addComponent(lbTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_chitietLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tab_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_chitietLayout.createSequentialGroup()
                        .addGroup(tab_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_chitietLayout.createSequentialGroup()
                                .addComponent(lbmaPhieuCT)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_chitietLayout.createSequentialGroup()
                                .addComponent(lbmaTourCT)
                                .addGap(20, 20, 20)))
                        .addGroup(tab_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbMaTourCT, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMaPhieuCT, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_chitietLayout.createSequentialGroup()
                        .addComponent(lbMaPhieu1)
                        .addGap(20, 20, 20)
                        .addComponent(txtsoNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClearChiTiet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(517, 517, 517))
            .addGroup(tab_chitietLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnThemChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(btnCapNhatChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(btnXoaChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(btnThoatChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        tab_chitietLayout.setVerticalGroup(
            tab_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_chitietLayout.createSequentialGroup()
                .addComponent(lbTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tab_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbmaPhieuCT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMaPhieuCT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(tab_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbmaTourCT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbMaTourCT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(tab_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsoNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaPhieu1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnClearChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(tab_chitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoatChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhatChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        tab_main.addTab("Chi tiết phiếu đăng ký", tab_chitiet);

        tab_luongnhanvien.setBackground(new java.awt.Color(255, 255, 255));

        lbTitle5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbTitle5.setForeground(new java.awt.Color(102, 102, 102));
        lbTitle5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle5.setText("Thông tin đăng ký tour");

        table_ThongTin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        table_ThongTin.setModel(new javax.swing.table.DefaultTableModel(
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
        table_ThongTin.setFocusable(false);
        table_ThongTin.setGridColor(new java.awt.Color(102, 102, 102));
        table_ThongTin.setIntercellSpacing(new java.awt.Dimension(2, 2));
        table_ThongTin.setRowHeight(30);
        table_ThongTin.setSelectionBackground(new java.awt.Color(117, 223, 255));
        table_ThongTin.setSurrendersFocusOnKeystroke(true);
        jScrollPane6.setViewportView(table_ThongTin);

        lbMaKH1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMaKH1.setText("Mã KH: ");

        lbHoTen1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbHoTen1.setText("Họ tên: ");

        lbDiachi1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDiachi1.setText("Địa chỉ:");

        lbhoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbhoTen.setText("Test");

        lbdiaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbdiaChi.setText("Test");

        table_PhieuDangKy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        table_PhieuDangKy.setModel(new javax.swing.table.DefaultTableModel(
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
        table_PhieuDangKy.setFocusable(false);
        table_PhieuDangKy.setGridColor(new java.awt.Color(102, 102, 102));
        table_PhieuDangKy.setIntercellSpacing(new java.awt.Dimension(2, 2));
        table_PhieuDangKy.setRowHeight(30);
        table_PhieuDangKy.setSelectionBackground(new java.awt.Color(117, 223, 255));
        table_PhieuDangKy.setSurrendersFocusOnKeystroke(true);
        table_PhieuDangKy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_PhieuDangKyMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(table_PhieuDangKy);

        lbTextPhieuDK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTextPhieuDK.setText("Phiếu đăng ký");

        lbTongSoPhieu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTongSoPhieu.setText("Tổng số phiếu : ");

        lbResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbResult.setForeground(new java.awt.Color(255, 0, 0));
        lbResult.setText("Test");

        lbThanhTien.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbThanhTien.setText("Tổng thành tiền : ");

        lbMoney.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lbMoney.setForeground(new java.awt.Color(255, 0, 0));
        lbMoney.setText("0");

        cbbMaKHThongKe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbbMaKHThongKe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbMaKHThongKe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbMaKHThongKeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout tab_luongnhanvienLayout = new javax.swing.GroupLayout(tab_luongnhanvien);
        tab_luongnhanvien.setLayout(tab_luongnhanvienLayout);
        tab_luongnhanvienLayout.setHorizontalGroup(
            tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane6)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_luongnhanvienLayout.createSequentialGroup()
                .addContainerGap(516, Short.MAX_VALUE)
                .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_luongnhanvienLayout.createSequentialGroup()
                        .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tab_luongnhanvienLayout.createSequentialGroup()
                                .addComponent(lbTongSoPhieu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbResult))
                            .addGroup(tab_luongnhanvienLayout.createSequentialGroup()
                                .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tab_luongnhanvienLayout.createSequentialGroup()
                                        .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbHoTen1)
                                            .addComponent(lbDiachi1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbhoTen)
                                            .addComponent(lbdiaChi)))
                                    .addGroup(tab_luongnhanvienLayout.createSequentialGroup()
                                        .addComponent(lbMaKH1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbbMaKHThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(lbMaKHThongKe)))
                                .addGap(147, 147, 147)
                                .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTextPhieuDK))))
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_luongnhanvienLayout.createSequentialGroup()
                        .addComponent(lbThanhTien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMoney)
                        .addGap(195, 195, 195))))
        );
        tab_luongnhanvienLayout.setVerticalGroup(
            tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_luongnhanvienLayout.createSequentialGroup()
                .addComponent(lbTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab_luongnhanvienLayout.createSequentialGroup()
                        .addComponent(lbTextPhieuDK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab_luongnhanvienLayout.createSequentialGroup()
                        .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaKH1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMaKHThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMaKHThongKe))
                        .addGap(23, 23, 23)
                        .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHoTen1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbhoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDiachi1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbdiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongSoPhieu)
                    .addComponent(lbResult))
                .addGap(89, 89, 89)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(tab_luongnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbThanhTien)
                    .addComponent(lbMoney))
                .addGap(27, 27, 27))
        );

        tab_main.addTab("Thông tin đăng ký tour", tab_luongnhanvien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_main)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tab_main, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
     ===============
     ==================================================== CHI TIET ==============================================================================
     ================
     */
    //Thêm mới phòng ban
    private void btnClearChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearChiTietActionPerformed
        ClearChiTiet();
    }//GEN-LAST:event_btnClearChiTietActionPerformed

    //Thoát phòng ban
    private void btnThoatChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatChiTietActionPerformed
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatChiTietActionPerformed

    //Xóa phòng ban
    private void btnXoaChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaChiTietActionPerformed
        String maPhieu = (String) cbbMaPhieuCT.getSelectedItem();
        String maTour = (String) cbbMaTourCT.getSelectedItem();
        String soNguoi = txtsoNguoi.getText();

        int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa chi tiết này?", "Cảnh báo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            try {
                DTO_ChiTiet dto = new DTO_ChiTiet(maPhieu, maTour, Integer.parseInt(soNguoi));
                if (bul_chiTiet.DeleteChiTiet(dto)) {
                    JOptionPane.showMessageDialog(rootPane, "Xóa dữ liệu thành công !!!", "Thông báo", JOptionPane.QUESTION_MESSAGE);
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    //
                    ShowChiTiet();
                    ClearChiTiet();
//                    getComboboxKhachHang();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa dữ liệu thất bại !!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Xóa dữ liệu thất bại !!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaChiTietActionPerformed

    //Cập nhật phòng ban
    private void btnCapNhatChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatChiTietActionPerformed
        String maPhieu = (String) cbbMaPhieuCT.getSelectedItem();
        String maTour = (String) cbbMaTourCT.getSelectedItem();
        String soNguoi = txtsoNguoi.getText();
        if (maPhieu.equals("") || maTour.equals("") || soNguoi.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng không được để trống !", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if (bul_chiTiet.checkExistMaPhieuAndMaTourExtra(maPhieu, maTour, Integer.parseInt(soNguoi))) {
            JOptionPane.showMessageDialog(null, "Chi tiết đã tồn tại !", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int row = table_ChiTiet.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) table_ChiTiet.getModel();
                String oldMatour = model.getValueAt(row, 1).toString();
                DTO_ChiTiet dto = new DTO_ChiTiet(maPhieu, maTour, Integer.parseInt(soNguoi), oldMatour);
                if (bul_chiTiet.UpdateChiTiet(dto)) {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    //
                    ShowChiTiet();
                    ClearChiTiet();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnCapNhatChiTietActionPerformed

    //Thêm phòng ban
    private void btnThemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemChiTietActionPerformed
        String maPhieu = (String) cbbMaPhieuCT.getSelectedItem();
        String maTour = (String) cbbMaTourCT.getSelectedItem();
        String soNguoi = txtsoNguoi.getText();
        if (maPhieu.equals("") || maTour.equals("") || soNguoi.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng không được để trống !", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if (bul_chiTiet.checkExistMaPhieuAndMaTourChiTiet(maPhieu, maTour)) {
            JOptionPane.showMessageDialog(null, "Chi tiết đã tồn tại !", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                DTO_ChiTiet dto = new DTO_ChiTiet(maPhieu, maTour, Integer.parseInt(soNguoi));
                if (bul_chiTiet.InsertChiTiet(dto)) {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    //
                    ShowChiTiet();
                    ClearChiTiet();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thất bại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnThemChiTietActionPerformed

    // sự kiện mouse click phòng ban
    private void table_ChiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_ChiTietMouseClicked
        int row = table_ChiTiet.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table_ChiTiet.getModel();
        cbbMaPhieuCT.setSelectedItem(model.getValueAt(row, 0).toString());
        cbbMaTourCT.setSelectedItem(model.getValueAt(row, 1).toString());
        txtsoNguoi.setText(model.getValueAt(row, 2).toString());
        //
        cbbMaPhieuCT.setEnabled(false);
        btnThemChiTiet.setEnabled(false);
        btnCapNhatChiTiet.setEnabled(true);
        btnXoaChiTiet.setEnabled(true);
    }//GEN-LAST:event_table_ChiTietMouseClicked

    /*
     ===============
     ==================================================== TOUR ==============================================================================
     ================
     */
    // Thêm mới tour
    private void btnClearTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTourActionPerformed
        try {
            ClearTour();
        } catch (SQLException ex) {
            Logger.getLogger(QLTour.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClearTourActionPerformed

    // Thoát Tab tour
    private void btnThoatTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatTourActionPerformed
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatTourActionPerformed

    // Xóa dữ liệu tour
    private void btnXoaTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTourActionPerformed
        String maTour = txtmaTour.getText();
        int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa tour này", "Cảnh báo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            try {
                DTO_Tour dto = new DTO_Tour(maTour);
                if (bul_tour.DeleteTour(dto)) {
                    JOptionPane.showMessageDialog(rootPane, "Xóa dữ liệu thành công !!!", "Thông báo", JOptionPane.QUESTION_MESSAGE);
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    //
                    ShowTour();
                    ClearTour();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa dữ liệu thất bại !!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Xóa dữ liệu thất bại !!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaTourActionPerformed

    //Cập nhật dữ liệu tour
    private void btnCapNhatTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatTourActionPerformed
        String maTour = txtmaTour.getText();
        String loTrinh = txtloTrinh.getText();
        String hanhTrinh = txthanhTrinh.getText();
        //Xử lý chuyển đổi số tiền từ format trở lại bình thường
        String tempTien = txtgia.getText();
        String[] splitTien = tempTien.split("[,]");
        String gia = "";
        for (int i = 0; i < splitTien.length; i++) {
            gia += splitTien[i];
        }
        if (maTour.equals("") || loTrinh == null || hanhTrinh.equals("") || gia.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng không được để trống !", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if (gia.length() < 7) {
            JOptionPane.showMessageDialog(null, "Giá tour phải nhập tối thiểu '1.000.000' !!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                DTO_Tour dto = new DTO_Tour(maTour, loTrinh, hanhTrinh, Integer.parseInt(gia));
                if (bul_tour.UpdateTour(dto)) {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    //
                    ShowTour();
                    ClearTour();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCapNhatTourActionPerformed

    // Thêm dữ liệu tour
    private void btnThemTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTourActionPerformed
        String maTour = txtmaTour.getText();
        String loTrinh = txtloTrinh.getText();
        String hanhTrinh = txthanhTrinh.getText();
        String gia = txtgia.getText();

        if (maTour.equals("") || loTrinh.equals("") || hanhTrinh.equals("") || gia.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng không được để trống !", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if (bul_tour.checkIDTour(maTour)) {
            JOptionPane.showMessageDialog(null, "Mã đã tồn tại!!!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if (maTour.length() < 1 || checkIDOneCharacter(maTour, "T") == false) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng mã tour !!!" + "\nSố Phiếu: 'T' + ....", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                DTO_Tour dto = new DTO_Tour(maTour, loTrinh, hanhTrinh, Integer.parseInt(gia));
                if (bul_tour.InsertTour(dto)) {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    //
                    ShowTour();
                    ClearTour();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thất bại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnThemTourActionPerformed

    // Mouse Click bảng tour
    private void table_TourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_TourMouseClicked
        int row = table_Tour.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table_Tour.getModel();
        txtmaTour.setText(model.getValueAt(row, 0).toString());
        txtloTrinh.setText(model.getValueAt(row, 1).toString());
        txthanhTrinh.setText(model.getValueAt(row, 2).toString());
        //fomat lương
        int temp = (int) model.getValueAt(row, 3);
        NumberFormat formatter = NumberFormat.getInstance();
        String gia = formatter.format(temp);
        txtgia.setText(gia.toString());
        //Hiển thị nút xóa and sửa và ẩn nút thêm
        btnCapNhatTour.setEnabled(true);
        btnXoaTour.setEnabled(true);
        btnThemTour.setEnabled(false);

        txtmaTour.setEnabled(false);
    }//GEN-LAST:event_table_TourMouseClicked

    // Refresh lại table khách hàng
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        try {
            ShowKhachHang();
        } catch (SQLException ex) {
            Logger.getLogger(QLTour.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

    //Sắp xếp khách hàng giảm dần 
    private void btnSapXepGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepGiamActionPerformed
        setUpTableKhachHang();
        if (rdbtnSapXepMaKH.isSelected()) {
            ShowDataSapXep(bul_khachHang.SapXepMaKHGiam());
        } else {
            ShowDataSapXep(bul_khachHang.SapXepTenKHGiam());
        }
    }//GEN-LAST:event_btnSapXepGiamActionPerformed

    // Sắp xếp khách hàng tăng dần
    private void btnSapXepTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepTangActionPerformed
        setUpTableKhachHang();
        if (rdbtnSapXepMaKH.isSelected()) {
            ShowDataSapXep(bul_khachHang.SapXepMaKHTang());
        } else {
            ShowDataSapXep(bul_khachHang.SapXepMaKHTang());
        }
    }//GEN-LAST:event_btnSapXepTangActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String key = txtTimKiem.getText();
        System.out.println(table_KhachHang.getRowCount());
        if (key.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập từ khóa !", "Thông báo", JOptionPane.WARNING_MESSAGE);
            try {
                ShowKhachHang();
            } catch (SQLException ex) {
                Logger.getLogger(QLTour.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            setUpTableKhachHang();
            //Nếu chọn mã khách hàng
            if (rdbtnTimMaKH.isSelected()) {
                ShowThongTinTimKiemKhachHang(bul_khachHang.TimKiemTheoMaKH(key));
                if (table_KhachHang.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Không tìm thấy dữ liệu phù hợp!", "Thông báo", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (rdbtnTimTenKH.isSelected()) { //Nếu chọn tên khách hàng
                ShowThongTinTimKiemKhachHang(bul_khachHang.TimKiemTheoTenKH(key));
                if (table_KhachHang.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Không tìm thấy dữ liệu phù hợp!", "Thông báo", JOptionPane.QUESTION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void rdbtnTimTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTimTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnTimTenKHActionPerformed

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    /*
     ===============
     ==================================================== KHACH HANG ==============================================================================
     ================
     */
    // Action Thêm mới khách hàng
    private void btnClearKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearKhachHangActionPerformed
        try {
            clearKhachHang();
            ShowKhachHang();
        } catch (SQLException ex) {
            Logger.getLogger(QLTour.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClearKhachHangActionPerformed

    private void btnClearKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearKhachHangMouseClicked
        txtMaKH.setEnabled(true);
    }//GEN-LAST:event_btnClearKhachHangMouseClicked

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    //Action btn thoat tab khách hàng
    private void btnThoatKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatKhachHangActionPerformed
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatKhachHangActionPerformed

    //Action xóa khách hàng theo mã khách hàng
    private void btnXoaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhachHangActionPerformed
        String maKH = txtMaKH.getText();
        int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa khách hàng này", "Cảnh báo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            try {
                DTO_KhachHang dto = new DTO_KhachHang(maKH);
                if (bul_khachHang.DeleteKhachHang(dto)) {
                    JOptionPane.showMessageDialog(rootPane, "Xóa khách hàng thành công !!!", "Thông báo", JOptionPane.QUESTION_MESSAGE);
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    //
                    ShowKhachHang();
                    clearKhachHang();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa khách hàng thất bại !!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
                //                        }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Xóa khách hàng thất bại !!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaKhachHangActionPerformed

    //Action Thêm khách hàng
    private void btnThemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhachHangActionPerformed
        String maKH = txtMaKH.getText();
        String tenKH = txtTenKH.getText();
        String diaChi = txtDiaChi.getText();

        if (maKH.equals("") || tenKH.equals("") || diaChi.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng không được để trống !", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if (maKH.length() < 2 || checkID(maKH, "KH") == false) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng mã khách hàng!!!" + "\nMã khách hàng: 'KH' + ....", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if (bul_khachHang.checkIDKhachHang(maKH)) {
            JOptionPane.showMessageDialog(null, "Mã khách hàng đã tồn tại!!!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                DTO_KhachHang dto_khachHang = new DTO_KhachHang(maKH, tenKH, diaChi);
                if (bul_khachHang.InsertKhachHang(dto_khachHang)) {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                    ShowKhachHang();
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    //
                    clearKhachHang();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thất bại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_btnThemKhachHangActionPerformed

    //Action Cập nhật Khách hàng
    private void btnCapNhatKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatKhachHangActionPerformed
        String maKH = txtMaKH.getText();
        String tenKH = txtTenKH.getText();
        String diaChi = txtDiaChi.getText();
        if (maKH.equals("") || tenKH.equals("") || diaChi.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng không được để trống !", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                DTO_KhachHang dto_khachHang = new DTO_KhachHang(maKH, tenKH, diaChi);
                if (bul_khachHang.UpdateKhachHang(dto_khachHang)) {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    //
                    ShowKhachHang();
                    clearKhachHang();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCapNhatKhachHangActionPerformed

    /*
     ========================================= KHACH HANG ========================================================
     */
    //Mouse Click table nhan vien
    private void table_KhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_KhachHangMouseClicked
        int row = table_KhachHang.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table_KhachHang.getModel();
        txtMaKH.setText(model.getValueAt(row, 0).toString());
        txtTenKH.setText(model.getValueAt(row, 1).toString());
        txtDiaChi.setText(model.getValueAt(row, 2).toString());

        //Hiển thị nút xóa and sửa và ẩn nút thêm
        btnCapNhatKhachHang.setEnabled(true);
        btnXoaKhachHang.setEnabled(true);
        btnThemKhachHang.setEnabled(false);

        // Ẩn mã khách hàng
        txtMaKH.setEnabled(false);
    }//GEN-LAST:event_table_KhachHangMouseClicked

    /*
     ===============
     ==================================================== PHIEU DANG KY ==============================================================================
     ================
     */
    // Clear Chấm công
    private void btnClearPhieuDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearPhieuDKActionPerformed
        try {
            ClearPhieuDK();
        } catch (SQLException ex) {
            Logger.getLogger(QLTour.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClearPhieuDKActionPerformed

    // Thoát tab phiếu đăng ký
    private void btnThoatPhieuDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatPhieuDKActionPerformed
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatPhieuDKActionPerformed

    // Xóa dữ liệu bảng phiếu đăng ký
    private void btnXoaPhieuDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhieuDKActionPerformed
        String maPhieu = txtMaPhieu.getText();

        int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa phiếu này", "Cảnh báo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            try {
                DTO_PhieuDK dto = new DTO_PhieuDK(maPhieu);
                if (bul_phieudk.DeletePhieuDK(dto)) {
                    JOptionPane.showMessageDialog(rootPane, "Xóa dữ liệu thành công !!!", "Thông báo", JOptionPane.QUESTION_MESSAGE);
                    ShowPhieuDK();
                    ClearPhieuDK();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    //
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Xóa dữ liệu thất bại !!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Xóa dữ liệu thất bại !!!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaPhieuDKActionPerformed

    // Cập nhật dữ liệu bảng Chấm công
    private void btnCapNhatPhieuDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatPhieuDKActionPerformed
        String maPhieu = txtMaPhieu.getText();
        String getMaKH = (String) cbbMaKHPhieuDK.getSelectedItem();
        Date ngDK = dtpNgDK.getDate();

        if (ngDK == null || maPhieu.equals("") || getMaKH.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng không được để trống !", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                DTO_PhieuDK dto = new DTO_PhieuDK(maPhieu, ngDK, getMaKH);
                if (bul_phieudk.UpdatePhieuDK(dto)) {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công");
                    ShowPhieuDK();
                    ClearPhieuDK();
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    //    
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Cập nhật thất bại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCapNhatPhieuDKActionPerformed

    //Thêm dữ liệu phiếu đăng ký
    private void btnThemPhieuDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPhieuDKActionPerformed
        String maPhieu = txtMaPhieu.getText();
        Date ngDK = dtpNgDK.getDate();
        String getMaKH = (String) cbbMaKHPhieuDK.getSelectedItem();
        if (ngDK == null || maPhieu.equals("") || getMaKH.equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng không được để trống !", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else if (maPhieu.length() < 1 || checkIDOneCharacter(maPhieu, "P") == false) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng mã phiếu!!!" + "\nMã phiếu: 'P' + ....", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                DTO_PhieuDK dto = new DTO_PhieuDK(maPhieu, ngDK, getMaKH);
                if (bul_phieudk.InsertPhieuDK(dto)) {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                    ShowPhieuDK();
                    ClearPhieuDK();    
                    getComboboxMaPhieu();
                    getComboboxMaTour();
                    getComboboxMaKhachHang();
                    getComboboxMaKhachHangExtra();
                    //        
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thất bại");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnThemPhieuDKActionPerformed

    //Sự kiện click table Chấm công
    private void table_PhieuDKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_PhieuDKMouseClicked
        int row = table_PhieuDK.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table_PhieuDK.getModel();
        cbbMaKHPhieuDK.setSelectedItem(model.getValueAt(row, 2).toString());
        txtMaPhieu.setText(model.getValueAt(row, 0).toString());
        dtpNgDK.setDate((Date) model.getValueAt(row, 1));
        //Hiển thị nút xóa and sửa và ẩn nút thêm
        btnCapNhatPhieuDK.setEnabled(true);
        btnXoaPhieuDK.setEnabled(true);
        btnThemPhieuDK.setEnabled(false);
        txtMaPhieu.setEnabled(false);
    }//GEN-LAST:event_table_PhieuDKMouseClicked

    private void cbbMaKHPhieuDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaKHPhieuDKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMaKHPhieuDKActionPerformed

    private void btnClearPhieuDKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearPhieuDKMouseClicked

    }//GEN-LAST:event_btnClearPhieuDKMouseClicked

    private void cbbMaPhieuCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaPhieuCTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMaPhieuCTActionPerformed

    private void cbbMaTourCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaTourCTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMaTourCTActionPerformed

    private void table_PhieuDangKyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_PhieuDangKyMouseClicked
        // TODO add your handling code here:
        // Lấy mã khách hàng từ combobox 
        int row = table_PhieuDangKy.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table_PhieuDangKy.getModel();
        String maPhieu = model.getValueAt(row, 0).toString();
        try {
            // show thong tin all
            ShowThongTinBangThongKe(maPhieu);
            // dem so luong hang cua bang phieu dang ky
        } catch (SQLException ex) {
            Logger.getLogger(QLTour.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table_PhieuDangKyMouseClicked

    private void cbbMaKHThongKeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbMaKHThongKeItemStateChanged
        // TODO add your handling code here:
        try {
            // Lấy mã khách hàng từ combobox
            String maKH = (String) cbbMaKHThongKe.getSelectedItem();
            setUpTablePhieuDangKyThongTin();
            // hien thi ten dia chi khach hang
            ResultSet rs = bul_khachHang.getKhachHangByMa(maKH);
            rs.next();
            lbhoTen.setText(rs.getObject("tenKH").toString());
            lbdiaChi.setText(rs.getObject("diaChi").toString());
            // show thong tin phieu dang ky
            ShowThongTinPhieuDK(maKH);
        } catch (SQLException ex) {
            Logger.getLogger(QLTour.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbbMaKHThongKeItemStateChanged

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
            java.util.logging.Logger.getLogger(QLTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLTour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QLTour().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(QLTour.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    /* 
     *
     ============================================ TAB KHACH HANG ===========================================================
     *
     */
    // Setup Table Nhan Vien
    public void setUpTableKhachHang() {
        DefaultTableModel model = (DefaultTableModel) table_KhachHang.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã khách hàng");
        model.addColumn("Họ và tên");
        model.addColumn("Địa Chỉ");
        table_KhachHang.setModel(model);

        //Custom table
        table_KhachHang.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        table_KhachHang.getTableHeader().setBackground(new Color(117, 223, 255));
    }

    // hiển thi khách hàng lên table
    public void ShowKhachHang() throws SQLException {
        ResultSet rs = bul_khachHang.getAllKhachHang();
        DefaultTableModel model = (DefaultTableModel) table_KhachHang.getModel();
        model.setRowCount(0);
        while (rs.next()) {
            Object[] col = new Object[3];
            for (int i = 1; i <= col.length; i++) {
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
        table_KhachHang.setModel(model);

        btnCapNhatKhachHang.setEnabled(false);
        btnXoaKhachHang.setEnabled(false);
    }

    //Clear fiels khách hàng
    public void clearKhachHang() throws SQLException {
        txtMaKH.setText("");
        txtTenKH.setText("");
        txtTenKH.setEnabled(true);
        txtDiaChi.setText("");
//        txtLuongKhachHang.setText("");
//        cbbMaPBKhachHang.setSelectedIndex(0);
//        dtpNgSinhNVKhachHang.setDate(new Date());

        btnThemKhachHang.setEnabled(true);
        btnCapNhatKhachHang.setEnabled(false);
        btnXoaKhachHang.setEnabled(false);

    }

    // hiển thi dữ liệu Tìm kiếm Khách hàng
    public void ShowThongTinTimKiemKhachHang(ResultSet nameData) {
        ResultSet rs = nameData;
        DefaultTableModel model = (DefaultTableModel) table_KhachHang.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                Object[] col = new Object[3];
                for (int i = 1; i <= col.length; i++) {
                    col[i - 1] = rs.getObject(i);
                }
                model.addRow(col);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLTour.class.getName()).log(Level.SEVERE, null, ex);
        }
        table_KhachHang.setModel(model);
    }

    // hiển thi dữ liệu Sắp xếp
    public void ShowDataSapXep(ResultSet nameData) {
        ResultSet rs = nameData;
        DefaultTableModel model = (DefaultTableModel) table_KhachHang.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                Object[] col = new Object[3];
                for (int i = 1; i <= col.length; i++) {
                    col[i - 1] = rs.getObject(i);
                }
                model.addRow(col);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLTour.class.getName()).log(Level.SEVERE, null, ex);
        }
        table_KhachHang.setModel(model);
    }

    //Kiểm tra nhập vào lương phải là số
    public boolean checkNumber(String so) {
        if (so.length() == 0) {
            return false;
        }
        char[] c = so.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (!Character.isDigit(c[i])) {
                return false;
            }
        }
        return true;
    }

    // Kiểm tra định dạng nhập ID 2 kí tự
    public Boolean checkID(String hanhTrinh, String key) {
        boolean flag;
        String temp = hanhTrinh.substring(0, 2);
        if (key.equals(temp)) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    // Kiểm tra định dạng nhập ID 1 kí tự
    public Boolean checkIDOneCharacter(String id, String key) {
        boolean flag;
        String temp = id.substring(0, 1);
        if (key.equals(temp)) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    /* 
     *
     ============================================ TAB PHIEU DANG KY ===========================================================
     *
     */
    // Setup Table Cham công
    public void setUpTablePhieuDK() {
        DefaultTableModel model = (DefaultTableModel) table_PhieuDK.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã phiếu");
        model.addColumn("Ngày đăng ký ");
        model.addColumn("Mã khách hàng");
        table_PhieuDK.setModel(model);

        //Custom table
        table_PhieuDK.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        table_PhieuDK.getTableHeader().setBackground(new Color(117, 223, 255));

//        cbbMaNVPhieuDK.setBackground(Color.WHITE);
    }

    // hiển thi dữ liệu phiếu đăng ký lên table
    public void ShowPhieuDK() throws SQLException {
        ResultSet rs = bul_phieudk.getAllPhieuDK();
        DefaultTableModel model = (DefaultTableModel) table_PhieuDK.getModel();
        model.setRowCount(0);
        while (rs.next()) {
            Object[] col = new Object[3];
            for (int i = 1; i <= col.length; i++) {
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
        table_PhieuDK.setModel(model);

        btnCapNhatPhieuDK.setEnabled(false);
        btnXoaPhieuDK.setEnabled(false);
    }

    // hiển thi dữ liệu phiếu đăng ký lên table
    public void ShowThongTinPhieuDK(String maKH) throws SQLException {
        ResultSet rs = bul_phieudk.getPhieuDKByMaKH(maKH);
        DefaultTableModel model = (DefaultTableModel) table_PhieuDangKy.getModel();
        model.setRowCount(0);
        while (rs.next()) {
            Object[] col = new Object[2];
            for (int i = 1; i <= col.length; i++) {
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
        table_PhieuDangKy.setModel(model);
        String tongSo = Integer.toString(table_PhieuDangKy.getRowCount());
        lbResult.setText(tongSo);
    }

    //
    // hiển thi dữ liệu phiếu đăng ký lên table
    public void ShowThongTinBangThongKe(String maPhieu) throws SQLException {
        ResultSet rs = bul_chiTiet.getThongKeChiTiet(maPhieu);
        DefaultTableModel model = (DefaultTableModel) table_ThongTin.getModel();
        model.setRowCount(0);
        int sum = 0;
        while (rs.next()) {
            Object[] col = new Object[6];
            for (int i = 1; i <= col.length; i++) {
                if (i == 6) {
                    String temp = rs.getObject(i).toString();
                    sum += Integer.parseInt(temp);
                }
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
        table_ThongTin.setModel(model);
        NumberFormat formatter = NumberFormat.getInstance();
        String gia = formatter.format(sum);
        lbMoney.setText(gia.toString());
    }

    //Hiển thị dữ liệu vào combobox mã khách hàng phiếu đăng ký
    private void getComboboxMaKhachHang() throws SQLException {
        ResultSet rs = bul_khachHang.getAllKhachHang();
        cbbMaKHPhieuDK.removeAllItems();
        while (rs.next()) {
            cbbMaKHPhieuDK.addItem(rs.getString("maKH"));
        }
    }
    //
    private void getComboboxMaKhachHangExtra() throws SQLException {
        ResultSet rs = bul_khachHang.getAllKhachHang();
        cbbMaKHThongKe.removeAllItems();
        while (rs.next()) {
            cbbMaKHThongKe.addItem(rs.getString("maKH"));
        }
    }

    //Clear phiếu đăng ký
    public void ClearPhieuDK() throws SQLException {
        cbbMaKHPhieuDK.setSelectedIndex(0);
        dtpNgDK.setDate(new Date());
        txtMaPhieu.setEnabled(true);
        txtMaPhieu.setText("");
        btnThemPhieuDK.setEnabled(true);
        btnCapNhatPhieuDK.setEnabled(false);
        btnXoaPhieuDK.setEnabled(false);
        table_PhieuDK.setSelectionBackground(Color.WHITE);
    }


    /*
     ============================================ TAB TOUR ===========================================================
     *
     */
    // Setup Table tour
    public void setUpTableTour() {
        DefaultTableModel model = (DefaultTableModel) table_Tour.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã tour");
        model.addColumn("Lộ trình");
        model.addColumn("Hành trình");
        model.addColumn("Giá tour");
        table_Tour.setModel(model);
        //Custom table
        table_Tour.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        table_Tour.getTableHeader().setBackground(new Color(117, 223, 255));
    }

    // hiển thi dữ liệu phiếu đăng ký lên table
    public void ShowTour() throws SQLException {
        ResultSet rs = bul_tour.getAllTour();
        DefaultTableModel model = (DefaultTableModel) table_Tour.getModel();
        model.setRowCount(0);
        while (rs.next()) {
            Object[] col = new Object[4];
            for (int i = 1; i <= col.length; i++) {
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
        table_Tour.setModel(model);

        btnCapNhatTour.setEnabled(false);
        btnXoaTour.setEnabled(false);
    }
    //Clear tour
    public void ClearTour() throws SQLException {
        txtmaTour.setText("");
        txtmaTour.setEnabled(true);
        txtloTrinh.setText("");
        txthanhTrinh.setText("");
        txtgia.setText("");

        btnThemTour.setEnabled(true);
        btnCapNhatTour.setEnabled(false);
        btnXoaTour.setEnabled(false);
    }

    /* 
     *
     ============================================ TAB CHI TIET ===========================================================
     *
     */
    // Setup Table Chi tiêt
    public void setUpTableChiTiet() {
        DefaultTableModel model = (DefaultTableModel) table_ChiTiet.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã phiếu");
        model.addColumn("Mã tour");
        model.addColumn("Số người");
        table_ChiTiet.setModel(model);

        //Custom table
        table_ChiTiet.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        table_ChiTiet.getTableHeader().setBackground(new Color(117, 223, 255));

    }
    // hiển thi dữ liệu chi tiet lên table
    public void ShowChiTiet() throws SQLException {
        ResultSet rs = bul_chiTiet.getAllChiTiet();
        DefaultTableModel model = (DefaultTableModel) table_ChiTiet.getModel();
        model.setRowCount(0);
        while (rs.next()) {
            Object[] col = new Object[3];
            for (int i = 1; i <= col.length; i++) {
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
        table_ChiTiet.setModel(model);

        btnCapNhatChiTiet.setEnabled(false);
        btnXoaChiTiet.setEnabled(false);
    }

    public void ClearChiTiet() {
        btnThemChiTiet.setEnabled(true);
        btnCapNhatChiTiet.setEnabled(false);
        btnXoaChiTiet.setEnabled(false);
        cbbMaPhieuCT.setSelectedIndex(0);
        cbbMaPhieuCT.setEnabled(true);
        cbbMaTourCT.setSelectedIndex(0);
        cbbMaTourCT.setEnabled(true);
        txtsoNguoi.setText("");
    }

    //Hiển thị dữ liệu vào combobox mã phiếu chi tiết
    private void getComboboxMaPhieu() throws SQLException {
        ResultSet rs = bul_phieudk.getAllPhieuDK();
        cbbMaPhieuCT.removeAllItems();
        while (rs.next()) {
            cbbMaPhieuCT.addItem(rs.getString("maPhieu"));
        }
    }

    //Hiển thị dữ liệu vào combobox mã tour chi tiết
    private void getComboboxMaTour() throws SQLException {
        ResultSet rs = bul_tour.getAllTour();
        cbbMaTourCT.removeAllItems();
        while (rs.next()) {
            cbbMaTourCT.addItem(rs.getString("maTour"));
        }
    }

    /* 
     *
     ============================================ TAB LUONG ===========================================================
     *
     */
    // Setup Table Cham công
    public void setUpTableThongTin() {
        DefaultTableModel model = (DefaultTableModel) table_ThongTin.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã tour");
        model.addColumn("Lộ trình");
        model.addColumn("Hành trình");
        model.addColumn("Giá tour");
        model.addColumn("Số người");
        model.addColumn("Thành tiền");
        table_ThongTin.setModel(model);

        //Custom table
        table_ThongTin.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        table_ThongTin.getTableHeader().setBackground(new Color(117, 223, 255));
    }

    // Setup Table Cham công
    public void setUpTablePhieuDangKy() {
        DefaultTableModel model = (DefaultTableModel) table_PhieuDangKy.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã Phiếu");
        model.addColumn("Ngày DK");
        table_PhieuDangKy.setModel(model);

        //Custom table
        table_ThongTin.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        table_ThongTin.getTableHeader().setBackground(new Color(117, 223, 255));
    }
    // Setup Table Nhan Vien
    public void setUpTablePhieuDangKyThongTin() {
        DefaultTableModel model = (DefaultTableModel) table_PhieuDangKy.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã Phiếu");
        model.addColumn("Ngày DK");
        table_PhieuDangKy.setModel(model);

        //Custom table
        table_PhieuDangKy.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 16));
        table_PhieuDangKy.getTableHeader().setBackground(new Color(117, 223, 255));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatChiTiet;
    private javax.swing.JButton btnCapNhatKhachHang;
    private javax.swing.JButton btnCapNhatPhieuDK;
    private javax.swing.JButton btnCapNhatTour;
    private javax.swing.JButton btnClearChiTiet;
    private javax.swing.JButton btnClearKhachHang;
    private javax.swing.JButton btnClearPhieuDK;
    private javax.swing.JButton btnClearTour;
    private javax.swing.ButtonGroup btnGroupSapXep;
    private javax.swing.ButtonGroup btnGroupTimKiem;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSapXepGiam;
    private javax.swing.JButton btnSapXepTang;
    private javax.swing.JButton btnThemChiTiet;
    private javax.swing.JButton btnThemKhachHang;
    private javax.swing.JButton btnThemPhieuDK;
    private javax.swing.JButton btnThemTour;
    private javax.swing.JButton btnThoatChiTiet;
    private javax.swing.JButton btnThoatKhachHang;
    private javax.swing.JButton btnThoatPhieuDK;
    private javax.swing.JButton btnThoatTour;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaChiTiet;
    private javax.swing.JButton btnXoaKhachHang;
    private javax.swing.JButton btnXoaPhieuDK;
    private javax.swing.JButton btnXoaTour;
    private javax.swing.JComboBox<String> cbbMaKHPhieuDK;
    private javax.swing.JComboBox cbbMaKHThongKe;
    private javax.swing.JComboBox<String> cbbMaPhieuCT;
    private javax.swing.JComboBox<String> cbbMaTourCT;
    private com.toedter.calendar.JDateChooser dtpNgDK;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbDiachi;
    private javax.swing.JLabel lbDiachi1;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbHoTen1;
    private javax.swing.JLabel lbKey;
    private javax.swing.JLabel lbMaKH;
    private javax.swing.JLabel lbMaKH1;
    private javax.swing.JLabel lbMaKHPhieuDangKy;
    private javax.swing.JLabel lbMaKHThongKe;
    private javax.swing.JLabel lbMaPhieu;
    private javax.swing.JLabel lbMaPhieu1;
    private javax.swing.JLabel lbMoney;
    private javax.swing.JLabel lbNgDK;
    private javax.swing.JLabel lbResult;
    private javax.swing.JLabel lbTextPhieuDK;
    private javax.swing.JLabel lbThanhTien;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitle1;
    private javax.swing.JLabel lbTitle2;
    private javax.swing.JLabel lbTitle3;
    private javax.swing.JLabel lbTitle5;
    private javax.swing.JLabel lbTongSoPhieu;
    private javax.swing.JLabel lbdiaChi;
    private javax.swing.JLabel lbgiaTour;
    private javax.swing.JLabel lbhanhTrinh;
    private javax.swing.JLabel lbhoTen;
    private javax.swing.JLabel lbloTrinh;
    private javax.swing.JLabel lbmaPhieuCT;
    private javax.swing.JLabel lbmaTour;
    private javax.swing.JLabel lbmaTourCT;
    private javax.swing.JRadioButton rdbtnSapXepMaKH;
    private javax.swing.JRadioButton rdbtnSapXepTenKH;
    private javax.swing.JRadioButton rdbtnTimMaKH;
    private javax.swing.JRadioButton rdbtnTimTenKH;
    private javax.swing.JPanel tab_chitiet;
    private javax.swing.JPanel tab_luongnhanvien;
    private javax.swing.JTabbedPane tab_main;
    private javax.swing.JPanel tab_nhanvien;
    private javax.swing.JPanel tab_phieudangky;
    private javax.swing.JPanel tab_tour;
    private javax.swing.JTable table_ChiTiet;
    private javax.swing.JTable table_KhachHang;
    private javax.swing.JTable table_PhieuDK;
    private javax.swing.JTable table_PhieuDangKy;
    private javax.swing.JTable table_ThongTin;
    private javax.swing.JTable table_Tour;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaPhieu;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtgia;
    private javax.swing.JTextField txthanhTrinh;
    private javax.swing.JTextField txtloTrinh;
    private javax.swing.JTextField txtmaTour;
    private javax.swing.JTextField txtsoNguoi;
    // End of variables declaration//GEN-END:variables
}
