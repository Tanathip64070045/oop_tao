package GUI.Components;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;

import db.DBModel;
import GUI.AdminUI.AdminAddProduct;
import Model.Product;

import db.Connection;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PublicKey;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;


public class AdminForm extends javax.swing.JPanel implements ActionListener {
    
    public AdminForm() {
        initComponents();
        setOpaque(false);
        btnAdd.addActionListener(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        btnImage = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Product");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Price");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Pictures");

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coffee,", "Milk & Coco,", "Tea,", "Soda,", "Juice" }));

        btnImage.setText("Browse File.");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Category");

        btnAdd.setText("Add");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(tfPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addComponent(category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnImage)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnAdd)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImage)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents
    private String fileName;
    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        if(evt.getSource().equals(btnImage)){
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                
                Path p = Paths.get(f.getAbsolutePath());
                fileName = p.getFileName().toString();
                
//                System.out.println(fileName);
                
//                image = new JLabel("", new ImageIcon(sname), JLabel.CENTER);
//                jpanel.add(image, BorderLayout.CENTER);
//                jpanel.revalidate(); //ADD THIS AS WELL
//                jpanel.repaint();  //ADD THIS AS WELL
            }
        }
    }//GEN-LAST:event_btnImageActionPerformed
    private DBModel db = new DBModel();
    private GUI.Components.Table ddd = new GUI.Components.Table();
    
//    public String getFileName(JFileChooser fc){
//        File f = fc.getSelectedFile();
//                
//        Path p = Paths.get(f.getAbsolutePath());
//        String fileName = p.getFileName().toString();
//        
//        return fileName;
//        System.out.println(fileName);
//    }
    private GUI.Components.Table table;
    int index = db.getIndex();

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(btnAdd)){
            try{
                index++;
                System.out.println(index);
                Product p = new Product(index, tfName.getText(), Double.parseDouble(tfPrice.getText()), category.getSelectedItem().toString(), fileName, 0);

                Object[] data = {db.getNewId(),fileName,tfName.getText(),Double.parseDouble(tfPrice.getText()),category.getSelectedItem().toString(),"action"};
                
                table.getTableModel().addRow(data);
                
                
                JOptionPane.showMessageDialog(null,"Done.", "Insert", JOptionPane.PLAIN_MESSAGE);
                
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Please Fill.", "Error", JOptionPane.PLAIN_MESSAGE);
            }

//           String sql = "INSERT INTO products(product,price,category,image) values(?,?,?,?);";
//            try {
//                PreparedStatement pstmt = Connection.connection().prepareStatement(sql);
//                pstmt.setString(1, tfName.getName());
//                pstmt.setString(2, Double.parseDouble(tfPrice.getText()));
//                pstmt.setString(3, category.getSelectedItem().toString());
//                pstmt.setString(4, img);
//                pstmt.executeUpdate();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//                System.out.println("Added");
//                add.dispose();
        }
    }

    
    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        g2.fillRect(0, getWidth()-20, getHeight(), getHeight());
        super.paintChildren(g);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnImage;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPrice;
    // End of variables declaration//GEN-END:variables
}
