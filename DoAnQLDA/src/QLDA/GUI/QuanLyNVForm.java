package QLDA.GUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class QuanLyNVForm extends javax.swing.JFrame {
    
    private ThemNVForm tnv;

    public QuanLyNVForm() {
        initComponents();
        AddRowTable(new Object[]{
            "NV1", "Lê Thuận Hiếu", "03/06/2003", "133 Đường Trần Hưng đạo, TP. Long Xuyen",
            "abc@gmail.com", "2000$", "Quản lý"
        });
        AddRowTable(new Object[]{
            "NV2", "Chế Viết Khôi", "02/02/2003", "133 Đường Nguyễn Huệ, TP. Đà Nẵng",
            "def@gmail.com", "800$", "Nhân viên pha chế"
        });
        AddRowTable(new Object[]{
            "NV3", "Lê Minh Khôi", "12/06/2003", "133 Đường Nguyễn Huệ, TP. Hồ Chí Minh",
            "ghi@gmail.com", "700$", "Nhân viên phục vụ"
        });
        AddRowTable(new Object[]{
            "NV3", "Lê Anh Tuấn Dũng", "10/12/2003", "133 Đường Nguyễn Huệ, TP. Hải Phòng",
            "mno@gmail.com", "700$", "Nhân viên phục vụ"
        });
        for (int i = 0; i < 10; i++) {
            AddRowTable(new Object[]{
            "NV1", "Lê Thuận Hiếu", "03/06/2003", "133 Đường Trần Hưng đạo, TP. Long Xuyen",
            "abc@gmail.com", "2000$", "Quản lý"
        });
        }
            
    }
    
    public static void AddRowTable(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) tbQuanLyNV.getModel();
        model.addRow(row);
    }
    
    public void RemoveRow(int index) {
        DefaultTableModel model = (DefaultTableModel) tbQuanLyNV.getModel();
        model.removeRow(index);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuanLyNV = new QLDA.SWING.CustomTable();
        roundJPanel1 = new QLDA.SWING.RoundJPanel();
        txtTimKiem = new QLDA.SWING.PlaceholderText();
        roundJButton21 = new QLDA.SWING.RoundJButton2();
        roundJButton22 = new QLDA.SWING.RoundJButton2();
        roundJButton23 = new QLDA.SWING.RoundJButton2();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 55, 77));

        tbQuanLyNV.fixTable(jScrollPane1);
        tbQuanLyNV.setBackground(new java.awt.Color(39, 55, 77));
        tbQuanLyNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ và tên", "Ngày sinh", "Địa chỉ", "Email", "Lương", "Vị trí"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbQuanLyNV);

        txtTimKiem.setPlaceholder("Tìm kiếm");

        javax.swing.GroupLayout roundJPanel1Layout = new javax.swing.GroupLayout(roundJPanel1);
        roundJPanel1.setLayout(roundJPanel1Layout);
        roundJPanel1Layout.setHorizontalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundJPanel1Layout.setVerticalGroup(
            roundJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        roundJButton21.setText("Sửa thông tin");
        roundJButton21.setRadius(30);

        roundJButton22.setText("Thêm nhân viên");
        roundJButton22.setRadius(30);
        roundJButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundJButton22ActionPerformed(evt);
            }
        });

        roundJButton23.setText("Xóa nhân viên");
        roundJButton23.setRadius(30);
        roundJButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundJButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1057, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundJButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundJButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundJButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(roundJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roundJButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundJButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundJButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
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
    }// </editor-fold>//GEN-END:initComponents

    private void roundJButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundJButton22ActionPerformed
        tnv = new ThemNVForm();
        tnv.setVisible(true);
    }//GEN-LAST:event_roundJButton22ActionPerformed

    private void roundJButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundJButton23ActionPerformed
        int index = tbQuanLyNV.getSelectedRow();
        if (index >= 0) {
            int rel = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa nhân viên này",
                "Xóa nhân viên", JOptionPane.YES_NO_OPTION);
            if (rel == JOptionPane.YES_OPTION) {
                RemoveRow(index);
            }
        }
        
    }//GEN-LAST:event_roundJButton23ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private QLDA.SWING.RoundJButton2 roundJButton21;
    private QLDA.SWING.RoundJButton2 roundJButton22;
    private QLDA.SWING.RoundJButton2 roundJButton23;
    private QLDA.SWING.RoundJPanel roundJPanel1;
    private static QLDA.SWING.CustomTable tbQuanLyNV;
    private QLDA.SWING.PlaceholderText txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
