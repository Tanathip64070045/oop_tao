package GUI.Components;

import GUI.Components.pnlCard;
import GUI.Components.pnlBorder;
import GUI.Components.pnlStock;
import GUI.Components.Table;
import Model.Card;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;

public class AdminControl extends javax.swing.JPanel{
    public AdminControl() {
        initComponents();
        setOpaque(false);
        setForeground(new Color(68,55,64));
        
//        balance.setData(new Card(null, "Balance.", "9999.99 ฿", "description"));
//        totally.setData(new Card(null, "Totally.", "9999.99 ฿", "description"));
//        
        spTable.getViewport().setBackground(Color.WHITE);
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.LEFT);
        
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
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
        totally = new GUI.Components.pnlCard();
        balance = new GUI.Components.pnlCard();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(68, 55, 64));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 670, -1));

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Amount", "Image", "Products", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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

        add(pnlBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 371, -1, -1));
        add(totally, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));
        add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
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
 

    public pnlStock getStock() {
        return stock;
    }

    public pnlCard getTotally() {
        return totally;
    }

    public pnlCard getBalance() {
        return balance;
    }

    public Table getTable() {
        return table;
    }
    
    
    
}
