
package GUI.MenuComponent;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author Adam
 */
public class DrinkGUI extends javax.swing.JPanel {

    /**
     * Creates new form DrinkGUI
     */
    public DrinkGUI(String product, String price, Icon icon) {
        initComponents();
        this.setOpaque(false);
        
        this.product.setText(product);
        this.price.setText(price);
        this.img.setIcon(icon);
    }
//    public void setData(String product, String price, Icon icon){
//        this.product.setText(product);
//        this.price.setText(price);
//        this.img.setIcon(icon);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namePanel = new javax.swing.JPanel();
        product = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setBackground(new java.awt.Color(197, 158, 126));
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(200, 270));
        setPreferredSize(new java.awt.Dimension(200, 270));

        namePanel.setBackground(new java.awt.Color(86, 71, 71));

        product.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        product.setForeground(new java.awt.Color(255, 255, 255));
        product.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        product.setText("Title");

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        price.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        price.setText("999 ฿");

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/products/sd_straw.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(price)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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
    private javax.swing.JLabel img;
    private javax.swing.JPanel namePanel;
    private javax.swing.JLabel price;
    private javax.swing.JLabel product;
    // End of variables declaration//GEN-END:variables

    public JLabel getImg() {
        return img;
    }

    public JLabel getPrice() {
        return price;
    }

    public JLabel getProduct() {
        return product;
    }

}

