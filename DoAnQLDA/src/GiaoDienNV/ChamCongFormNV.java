package GiaoDienNV;

import QLDA.GUI.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ChamCongFormNV extends javax.swing.JFrame {

    
    public ChamCongFormNV() {
        initComponents();
        
        DefaultTableModel m = (DefaultTableModel) tbChamCong.getModel();
        Date now = new Date();
        dcChamCong.setDate(now);
        dcChamCong.setDateFormatString("dd-MM-yyyy    HH:mm:ss");
        
        m.addRow(new Object[]{ 1,"2023-06-05    07:30:10" , "3.0:40.0"});
        m.addRow(new Object[]{ 2,"2023-06-06    07:20:30" , "2.0:45.0"});
        m.addRow(new Object[]{ 3,"2023-06-07    07:42:15" , "3.0:30.0"});
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChamCong = new QLDA.SWING.CustomTable();
        btChamCong = new QLDA.SWING.RoundJButton();
        dcChamCong = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 55, 77));

        tbChamCong.fixTable(jScrollPane1);
        tbChamCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ngày chấm công", "Số giờ làm (giờ:phút)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbChamCong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(tbChamCong);

        btChamCong.setText("Chấm công");
        btChamCong.setRadius(30);
        btChamCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChamCongActionPerformed(evt);
            }
        });

        jLabel1.setOpaque(false);
        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ngày giờ chấm công");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nhập thời gian check in:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nhập thời gian check out:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dcChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
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

    private void btChamCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChamCongActionPerformed
        if(this.jTextField1.getText().length()<5 ){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng thời gian!", "Thông báo", JOptionPane.ERROR_MESSAGE);

        }
        else if(this.jTextField2.getText().length()<5){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng thời gian!", "Thông báo", JOptionPane.ERROR_MESSAGE);

        } else{
        double gio_check_in = Double.parseDouble(this.jTextField1.getText().substring(0, 2));
        double phut_check_in = Double.parseDouble(this.jTextField1.getText().substring(3));
        double gio_check_out = Double.parseDouble(this.jTextField2.getText().substring(0, 2));
        double phut_check_out = Double.parseDouble(this.jTextField2.getText().substring(3));
        double kq_gio = gio_check_out - gio_check_in; System.out.println(kq_gio);
        double kq_phut = phut_check_out - phut_check_in; System.out.println(kq_phut);
        if((kq_gio == 0 && kq_phut <= 0) || kq_gio < 0){
            JOptionPane.showMessageDialog(this, "Thời gian check in phải trước thời gian check out!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if(gio_check_in < 0 || gio_check_in > 24 || gio_check_out < 0 || gio_check_out > 24){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng giờ!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if(phut_check_in < 0 || phut_check_in > 59 || gio_check_out < 0 || gio_check_out > 59){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng phút!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
        else{
        if(kq_phut > 0){
            String result = kq_gio + ":" + kq_phut;
            if(dcChamCong.getDate() != null) {
            SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd    HH:mm:ss");
            String date = dFormat.format(dcChamCong.getDate());
            DefaultTableModel model = (DefaultTableModel) tbChamCong.getModel();
            int index = model.getRowCount() + 1;
            model.addRow(new Object[] {index, date,result});
        }
        }
        else if(kq_phut < 0){                   
            kq_gio -=1 ;
            kq_phut = 60 + kq_phut;
            String result = kq_gio + ":" + kq_phut;
            if(dcChamCong.getDate() != null) {
            SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd    HH:mm:ss");
            String date = dFormat.format(dcChamCong.getDate());
            DefaultTableModel model = (DefaultTableModel) tbChamCong.getModel();
            int index = model.getRowCount() + 1;
            model.addRow(new Object[] {index, date, result});
        }
        }
        else{
            String result = kq_gio + "h";
            if(dcChamCong.getDate() != null) {
            SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd    HH:mm:ss");
            String date = dFormat.format(dcChamCong.getDate());
            DefaultTableModel model = (DefaultTableModel) tbChamCong.getModel();
            int index = model.getRowCount() + 1;
            model.addRow(new Object[] {index, date, result});
        }
        }
        }
        }        
    }//GEN-LAST:event_btChamCongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QLDA.SWING.RoundJButton btChamCong;
    private com.toedter.calendar.JDateChooser dcChamCong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private QLDA.SWING.CustomTable tbChamCong;
    // End of variables declaration//GEN-END:variables
}
