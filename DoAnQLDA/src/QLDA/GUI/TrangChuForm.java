package QLDA.GUI;

import java.awt.Color;
import javax.swing.*;


public class TrangChuForm extends javax.swing.JFrame {
    
    private LoginForm lg;
    private HoSoForm hs;
    private QuanLyNVForm ql = new QuanLyNVForm();
    private NhapBaoCaoForm nbc = new NhapBaoCaoForm();
    private HienThongBaoForm htb = new HienThongBaoForm();
    private ChamCongForm cc = new ChamCongForm();
    private HopDongForm hd = new HopDongForm();

    public TrangChuForm() {
        initComponents();
        hs = new HoSoForm();
        showWindow(hs);
    }
    
    private void showWindow(JFrame v) {
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate(); 
        jPanel3.add(v.getContentPane());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btHoSo = new QLDA.SWING.RoundJButton();
        btHopDong = new QLDA.SWING.RoundJButton();
        btQuanLyNV = new QLDA.SWING.RoundJButton();
        lbDangXuat = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbThongBao = new javax.swing.JLabel();
        tbThongBaoSN = new javax.swing.JLabel();
        customAvatar1 = new QLDA.SWING.CustomAvatar();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(82, 109, 130));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/logo2.png")));

        btHoSo.setOpaque(false);
        btHoSo.setText("Hồ sơ");
        btHoSo.setRadius(20);
        btHoSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoSoActionPerformed(evt);
            }
        });

        btHopDong.setText("Hợp đồng");
        btHopDong.setRadius(20);
        btHopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHopDongActionPerformed(evt);
            }
        });

        btQuanLyNV.setText("Quản lý NV");
        btQuanLyNV.setRadius(20);
        btQuanLyNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuanLyNVActionPerformed(evt);
            }
        });

        lbDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lbDangXuat.setText("Đăng xuất");
        lbDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbDangXuatMousePressed(evt);
            }
        });

        lbLogout.setIcon(new ImageIcon(getClass().getResource("/images/logout.png")));
        lbLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbLogoutMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btHoSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btHopDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btQuanLyNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDangXuat))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btHoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btQuanLyNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(45, 63, 87));

        lbThongBao.setIcon(new ImageIcon(getClass().getResource("/images/thông_báo.png")));
        lbThongBao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbThongBao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbThongBaoMousePressed(evt);
            }
        });

        tbThongBaoSN.setIcon(new ImageIcon(getClass().getResource("/images/chúc_sn.png")));
        tbThongBaoSN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbThongBaoSN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbThongBaoSNMousePressed(evt);
            }
        });

        customAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QLDA/GUI/avatar-1.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html>Lê Thuận<br/>Hiếu</html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tbThongBaoSN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(customAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbThongBaoSN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(39, 55, 77));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btHoSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoSoActionPerformed
        btHoSo.setBackground(new Color(221, 230, 237));
        hs = new HoSoForm();
        showWindow(hs);
    }//GEN-LAST:event_btHoSoActionPerformed

    private void lbLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMousePressed
        lg = new LoginForm();
        this.dispose();
    }//GEN-LAST:event_lbLogoutMousePressed

    private void lbDangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDangXuatMousePressed
        lg = new LoginForm();
        this.dispose();
    }//GEN-LAST:event_lbDangXuatMousePressed

    private void btQuanLyNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuanLyNVActionPerformed
        btQuanLyNV.setBackground(new Color(221, 230, 237));
        showWindow(ql);
    }//GEN-LAST:event_btQuanLyNVActionPerformed

    private void lbThongBaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThongBaoMousePressed
        nbc.setVisible(true);
    }//GEN-LAST:event_lbThongBaoMousePressed

    private void tbThongBaoSNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThongBaoSNMousePressed
        htb.setVisible(true);
    }//GEN-LAST:event_tbThongBaoSNMousePressed

    private void btHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHopDongActionPerformed
        showWindow(hd);
    }//GEN-LAST:event_btHopDongActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QLDA.SWING.RoundJButton btHoSo;
    private QLDA.SWING.RoundJButton btHopDong;
    private QLDA.SWING.RoundJButton btQuanLyNV;
    private QLDA.SWING.CustomAvatar customAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbDangXuat;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JLabel tbThongBaoSN;
    // End of variables declaration//GEN-END:variables
}
