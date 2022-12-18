package GUI.Components;

import Model.Card;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class pnlCard extends javax.swing.JPanel {
    public pnlCard() {
        initComponents();
        setOpaque(false);
    }
    public void setData(Card data){
        lbl_title.setIcon(data.getIcon());
        lbl_title.setText(data.getTitle());
        lbl_values.setText(data.getValues());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_title = new javax.swing.JLabel();
        lbl_values = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setPreferredSize(new java.awt.Dimension(320, 155));

        lbl_title.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(124, 124, 124));
        lbl_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/coins-solid 3.png"))); // NOI18N
        lbl_title.setText("Title");

        lbl_values.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_values.setForeground(new java.awt.Color(102, 102, 102));
        lbl_values.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl_values.setText("Values");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_values, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_title)
                .addGap(31, 31, 31)
                .addComponent(lbl_values))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paintChildren(g);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_values;
    // End of variables declaration//GEN-END:variables

    public JLabel getLblTsitle() {
        return lbl_title;
    }

    public JLabel getLblValue() {
        return lbl_values;
    }

    
}
