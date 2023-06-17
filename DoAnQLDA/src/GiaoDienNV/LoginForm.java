package GiaoDienNV;

import java.awt.Font;
import javax.swing.*;


public class LoginForm extends javax.swing.JFrame {


    public LoginForm() {
        initComponents();
        setVisible(true);
    }

    public void addPlaceholder(JTextField txt) {
        Font font = txt.getFont();
        txt.setFont(font);
    }
    
    public void removePlaceholder(JTextField txt) {
        Font font = txt.getFont();
        txt.setFont(font);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbQuenMK = new javax.swing.JLabel();
        lbLogo = new javax.swing.JLabel();
        roundJPanel1 = new Customs.RoundJPanel();
        txtTenDN = new javax.swing.JTextField();
        roundJPanel2 = new Customs.RoundJPanel();
        txtMatKhau = new javax.swing.JPasswordField();
        btDangNhap = new Customs.RoundJButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(39, 55, 77));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 230, 237));
        jLabel1.setText("ĐĂNG NHẬP");

        lbQuenMK.setForeground(new java.awt.Color(221, 230, 237));
        lbQuenMK.setText("Quên mật khẩu ?");
        lbQuenMK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbQuenMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbQuenMKMousePressed(evt);
            }
        });

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")));
        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtTenDN.setOpaque(false);
        txtTenDN.setBackground(new java.awt.Color(157, 178, 191));
        txtTenDN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTenDN.setForeground(new java.awt.Color(82, 109, 130, 150));
        txtTenDN.setText("Tên đăng nhập");
        txtTenDN.setBorder(null);
        txtTenDN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenDNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenDNFocusLost(evt);
            }
        });
        txtTenDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTenDN, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtMatKhau.setOpaque(false);
        txtMatKhau.setBackground(new java.awt.Color(157, 178, 191));
        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(82, 109, 130, 150));
        txtMatKhau.setText("Mật khẩu");
        txtMatKhau.setBorder(null);
        txtMatKhau.setEchoChar('\u0000');
        txtMatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhauFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatKhauFocusLost(evt);
            }
        });

        javax.swing.GroupLayout roundJPanel2Layout = new javax.swing.GroupLayout(roundJPanel2);
        roundJPanel2.setLayout(roundJPanel2Layout);
        roundJPanel2Layout.setHorizontalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtMatKhau)
                .addContainerGap())
        );
        roundJPanel2Layout.setVerticalGroup(
            roundJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btDangNhap.setText("Đăng nhập");
        btDangNhap.setRadius(20);
        btDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(298, 298, 298))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbQuenMK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(roundJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roundJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(btDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQuenMK)
                .addGap(38, 38, 38)
                .addComponent(btDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbQuenMKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuenMKMousePressed
        JOptionPane.showMessageDialog(null, "Xin vui lòng liên hệ với quản trị viên.",
                "Quên mật khẩu", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lbQuenMKMousePressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangNhapActionPerformed
        if(txtTenDN.getText().equals("NV1") && 
                txtMatKhau.getText().equals("123456")) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!", "Thông báo", JOptionPane.PLAIN_MESSAGE);
                        TrangChuNVForm addframe  = new TrangChuNVForm();
                        addframe.main(null);  
                        this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Thông tin đăng nhập không đúng. Xin hãy nhập lại!",
                "Đăng nhập", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btDangNhapActionPerformed

    private void txtTenDNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenDNFocusGained
        if (txtTenDN.getText().equals("Tên đăng nhập")) {
            txtTenDN.setText(null);
            txtTenDN.requestFocus();
            removePlaceholder(txtTenDN);
        }
    }//GEN-LAST:event_txtTenDNFocusGained

    private void txtTenDNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenDNFocusLost
        if (txtTenDN.getText().length() == 0) {
            addPlaceholder(txtTenDN);
            txtTenDN.setText("Tên đăng nhập");
        }
    }//GEN-LAST:event_txtTenDNFocusLost

    private void txtMatKhauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauFocusGained
        if (txtMatKhau.getText().equals("Mật khẩu")) {
            txtMatKhau.setText(null);
            txtMatKhau.requestFocus();
            txtMatKhau.setEchoChar('*');
            removePlaceholder(txtMatKhau);
        }
    }//GEN-LAST:event_txtMatKhauFocusGained

    private void txtMatKhauFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauFocusLost
        if (txtMatKhau.getText().length() == 0) {
            addPlaceholder(txtMatKhau);
            txtMatKhau.setText("Mật khẩu");
            txtMatKhau.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtMatKhauFocusLost

    private void txtTenDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDNActionPerformed
    
    public static void main(String[] args) {
        new LoginForm().setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Customs.RoundJButton btDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbQuenMK;
    private Customs.RoundJPanel roundJPanel1;
    private Customs.RoundJPanel roundJPanel2;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDN;
    // End of variables declaration//GEN-END:variables
}
