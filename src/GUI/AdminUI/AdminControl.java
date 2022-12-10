package GUI.AdminUI;

import GUI.Components.pnlCard;
import GUI.Components.pnlBorder;
import GUI.Components.pnlStock;
import GUI.Components.Table;
import Model.CardModel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class AdminControl extends javax.swing.JPanel{
    public AdminControl() {
        initComponents();
        setOpaque(false);
        setForeground(new Color(68,55,64));
        
        balance.setData(new CardModel(null, "Balance.", "9999.99 ฿", "description"));
        totally.setData(new CardModel(null, "Totally.", "9999.99 ฿", "description"));

        spTable.getViewport().setBackground(Color.WHITE);
    }

    public AdminControl(pnlCard balance, JLabel lblTable, pnlBorder pnlBorder1, JScrollPane spTable, pnlStock stock, Table table, pnlCard totally) {
        this.balance = balance;
        this.label = lblTable;
        this.pnlBorder1 = pnlBorder1;
        this.spTable = spTable;
        this.stock = stock;
        this.table = table;
        this.label = label;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stock = new GUI.Components.pnlStock();
        pnlBorder1 = new GUI.Components.pnlBorder();
        spTable = new javax.swing.JScrollPane();
        table = new GUI.Components.Table();
        label = new javax.swing.JLabel();
        balance = new GUI.Components.pnlCard();
        totally = new GUI.Components.pnlCard();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(68, 55, 64));

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        spTable.setViewportView(table);

        label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label.setForeground(new java.awt.Color(153, 153, 153));
        label.setText("Selling Table.");

        javax.swing.GroupLayout pnlBorder1Layout = new javax.swing.GroupLayout(pnlBorder1);
        pnlBorder1.setLayout(pnlBorder1Layout);
        pnlBorder1Layout.setHorizontalGroup(
            pnlBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorder1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label)
                    .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlBorder1Layout.setVerticalGroup(
            pnlBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorder1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totally, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totally, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    private GUI.Components.pnlCard balance;
    private javax.swing.JLabel label;
    private GUI.Components.pnlBorder pnlBorder1;
    private javax.swing.JScrollPane spTable;
    private GUI.Components.pnlStock stock;
    private GUI.Components.Table table;
    private GUI.Components.pnlCard totally;
    // End of variables declaration//GEN-END:variables
}
