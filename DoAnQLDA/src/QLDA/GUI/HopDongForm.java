package QLDA.GUI;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class HopDongForm extends javax.swing.JFrame {


    public HopDongForm() {
        initComponents();
        HienThiHopDong();
    }
    
    public void HienThiHopDong() {
        txtHopDong.setContentType("text/html");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
        String hd = "<h1 style='text-align:center;'>HỢP ĐỒNG LÀM VIỆC</h1>";
        
        hd += "<h2>BÊN THUÊ LAO ĐỘNG</h2>";
        hd += "Tên quán cafe: HarryKane<br/>Địa chỉ: 150 Nguyễn Huệ, Quận 1, TP. Hồ Chí Minh<br/>"
                + "Đại diện: Lê Thuận Hiếu&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Chức vụ: Quản lý" + "<br/>";
        
        hd += "<h2>BÊN NGƯỜI LAO ĐỘNG</h2>";
        hd += "Ông/Bà: Lê Minh Khôi<br/>CCCD: 0123456789<br/>Điện thoại: 0123456789<br/>"
                + "Số tài khoản: 0123456789&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "Ngân hàng: VietinBank<br/>Hai bên cùng thỏa thuận ký hợp đồng với những nội dung sau:";
        
        hd += "<h2>CHẾ ĐỘ LÀM VIỆC</h2>";
        
        hd += "<h3>2.1. Điều kiện nhân viên</h3>";
        hd += "– Phải có sức khoẻ tốt phù hợp với tính chất của công việc, không có tiền án, tiền sự, đạo đức nghề nghiệp tốt.<br/>"
                + "– Hồ sơ ứng tuyển của bên B phải có Giấy khám sức khoẻ trong vòng 03 tháng gần nhất.<br/>"
                + "– Yêu cầu kinh nghiệm ở vị trí tương đương tối thiểu là 03 tháng, chưa có kinh nghiệm sẽ được đào tạo.<br/>";
        
        hd += "<h3>2.2. Thời gian làm việc</h3>";
        hd += "– Bên người lao động sẽ làm việc vào các ngày trong tuần từ thứ 2 đến Chủ nhật.<br/>– Ca làm việc:<br/>"
                + "+ Ca 1:  từ 7h30 sáng đến 11h trưa cùng ngày.<br/>"
                + "+ Ca 2: từ 18h30 chiều tới 22h tối cùng ngày.<br/>";
        
        hd += "<h3>2.3. Tiêu chuẩn công việc</h3>";
        
        hd += "– Bên thuê lao đọng phải đảm bảo phổ biến nội quy của quán, danh sách các công việc bên lao động phải làm, thái độ làm "
                + "việc và hiệu quả cần đạt cho bên lao động nắm bắt được.<br/>– Bên lao động phải đảm bảo thực hiện hiệu quả công "
                + "việc của mình, đem lại sự hài lòng cho khách hàng.<br/>– Trong quá trình làm việc, bên lao động tuân "
                + "thủ nghiêm các quy định của quán.<br/>– Bên lao động không được tự ý vắng mặt khi chưa được sự cho phép của bên thuê lao động "
                + "trong ca làm. Trừ trường hợp bất khả kháng, bên lao động phải ngay lập tức báo cáo với bên thuê lao động để xử trí.<br/><br/>";
        
        
        hd += "<div style='text-align:right;'>TP. Hồ Chí Minh, ngày 16 tháng 06 năm 2023&nbsp;&nbsp;&nbsp;</div><br/>";
        hd += "<div style='text-align:center;'>==========================================</div><br/>";
        
        txtHopDong.setText(hd);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHopDong = new javax.swing.JTextPane();
        btXuatHopDong = new QLDA.SWING.RoundJButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 55, 77));

        txtHopDong.setEditable(false);
        txtHopDong.setBorder(null);
        jScrollPane1.setViewportView(txtHopDong);

        btXuatHopDong.setText("Xuất hợp đồng");
        btXuatHopDong.setRadius(30);
        btXuatHopDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXuatHopDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btXuatHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXuatHopDong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
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

    private void btXuatHopDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXuatHopDongActionPerformed
        try {
            // Tạo một đối tượng Document
            Document document = new Document();

            // Xác định vị trí lưu file PDF hóa đơn
            String filePath = "src/HopDong/HopDong.pdf";

            // Tạo một đối tượng PdfWriter để ghi dữ liệu vào file PDF
            PdfWriter.getInstance(document, new FileOutputStream(filePath));

            // Mở tài liệu để bắt đầu ghi
            document.open();
            // Đường dẫn đến tệp tin font chữ Unicode
            String fontPath = "lib/ArialUnicodeMS.ttf";

            // Tạo đối tượng BaseFont từ tệp tin font chữ Unicode
            BaseFont baseFont = BaseFont.createFont(fontPath, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            // Tạo đối tượng Font từ BaseFont
            com.itextpdf.text.Font h1 = new com.itextpdf.text.Font(baseFont, 18, com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.Font h2 = new com.itextpdf.text.Font(baseFont, 15, com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.Font h3 = new com.itextpdf.text.Font(baseFont, 13, com.itextpdf.text.Font.BOLD);
            com.itextpdf.text.Font font = new com.itextpdf.text.Font(baseFont, 13, com.itextpdf.text.Font.NORMAL);

            // Thêm nội dung vào tài liệu PDF
            Paragraph paragraph = new Paragraph("HỢP ĐỒNG LÀM VIỆC", h1);
            paragraph.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(paragraph);
            
            document.add(new Paragraph("\nBÊN THUÊ LAO ĐỘNG" , h2));
            document.add(new Paragraph("Tên quán cafe: HarryKane\nĐịa chỉ: 150 Nguyễn Huệ, Quận 1, TP. Hồ Chí Minh\nĐại diện: Lê Thuận Hiếu                               Chức vụ: Quản lý", font));
            document.add(new Paragraph("\nBÊN NGƯỜI LAO ĐỘNG", h2));
            document.add(new Paragraph("Ông/Bà: Lê Minh Khôi\nCCCD: 0123456789\nĐiện thoại: 0123456789\nSố tài khoản: 0123456789                     Ngân hàng: VietinBank", font));
            document.add(new Paragraph("Hai bên cùng thỏa thuận ký hợp đồng với những nội dung sau:", font));
            
            document.add(new Paragraph("\nCHẾ ĐỘ LÀM VIỆC", h2));
            document.add(new Paragraph("2.1. Điều kiện nhân viên", h3));
            document.add(new Paragraph("– Phải có sức khoẻ tốt phù hợp với tính chất của công việc, không có tiền án, tiền sự, đạo đức nghề nghiệp tốt.", font));
            document.add(new Paragraph("– Hồ sơ ứng tuyển của bên B phải có Giấy khám sức khoẻ trong vòng 03 tháng gần nhất.", font));
            document.add(new Paragraph("– Yêu cầu kinh nghiệm ở vị trí tương đương tối thiểu là 03 tháng, chưa có kinh nghiệm sẽ được đào tạo.", font));
            
            document.add(new Paragraph("2.2. Thời gian làm việc", h3));
            document.add(new Paragraph("– Bên người lao động sẽ làm việc vào các ngày trong tuần từ thứ 2 đến Chủ nhật.\n– Ca làm việc:", font));
            document.add(new Paragraph("+ Ca 1:  từ 7h30 sáng đến 11h trưa cùng ngày.\n+ Ca 2: từ 18h30 chiều tới 22h tối cùng ngày.", font));
            
            document.add(new Paragraph("2.3. Tiêu chuẩn công việc", h3));
            document.add(new Paragraph("– Bên thuê lao đọng phải đảm bảo phổ biến nội quy của quán, danh sách công việc bên lao động làm, thái độ làm việc và hiệu quả cần đạt cho bên lao động nắm bắt được.", font));
            document.add(new Paragraph("– Bên lao động phải đảm bảo thực hiện hiệu quả công việc của mình, đem lại sự hài lòng cho khách hàng.", font));
            document.add(new Paragraph("– Bên lao động không được tự ý vắng mặt khi chưa được sự cho phép của bên thuê lao động trong ca làm. Trừ trường hợp bất khả kháng, bên lao động phải ngay lập tức báo cáo với bên thuê lao động để xử trí.", font));
            
            
            Paragraph paragraph1 = new Paragraph("\nTP. Hồ Chí Minh, ngày 16 tháng 06 năm 2023", font);
            paragraph1.setAlignment(Paragraph.ALIGN_RIGHT);
            document.add(paragraph1);
            
            Paragraph paragraph2 = new Paragraph("\n==========================================", font);
            paragraph2.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(paragraph2);
            
            document.close();
            
            File file = new File(filePath);
            Desktop.getDesktop().open(file);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi xuất hóa đơn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btXuatHopDongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private QLDA.SWING.RoundJButton btXuatHopDong;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtHopDong;
    // End of variables declaration//GEN-END:variables
}
