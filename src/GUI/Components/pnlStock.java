package GUI.Components;

import GUI.AdminUI.AdminStock;
import Model.Stock;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class pnlStock extends javax.swing.JPanel{
    private AdminStock stock;

    public pnlStock() {
        initComponents();
        setOpaque(false);
        
        
    }
    public void sendData(Stock data){
        lbl_Values.setText(String.valueOf(data.getItems()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Values = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lbl_Values.setFont(new java.awt.Font("Tahoma", 0, 130)); // NOI18N
        lbl_Values.setForeground(new java.awt.Color(102, 102, 102));
        lbl_Values.setText("0");

        lblIcon.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        lblIcon.setForeground(new java.awt.Color(124, 124, 124));
        lblIcon.setText("-->");

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        lbl2.setForeground(new java.awt.Color(124, 124, 124));
        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/database-solid 3.png"))); // NOI18N
        lbl2.setText("  Stock");

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        lbl3.setForeground(new java.awt.Color(124, 124, 124));
        lbl3.setText("Items");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(lbl_Values)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lblIcon)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(lbl_Values, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblIcon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbl2)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintChildren(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lbl_Values;
    // End of variables declaration//GEN-END:variables

}