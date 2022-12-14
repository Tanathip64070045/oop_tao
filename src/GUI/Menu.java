/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import GUI.MenuComponent.CategoryGUI;
import GUI.MenuComponent.MenuPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Adam
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form MenuGUI
     */
    public Menu() {
        initComponents();
        jScrollPane.getVerticalScrollBar().setUnitIncrement(16);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BackButton = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlBorder1 = new GUI.Components.pnlBorder();
        jScrollPane = new javax.swing.JScrollPane();
        pnlMenu = new GUI.MenuComponent.MenuPanel();
        headerText = new javax.swing.JLabel();
        catagoryGUI = new GUI.MenuComponent.CategoryGUI();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 56, 63));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 830));

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/Vector (3).png"))); // NOI18N
        BackButton.setText("BACK");

        jPanel2.setBackground(new java.awt.Color(66, 56, 63));
        jPanel2.setMinimumSize(new java.awt.Dimension(720, 830));
        jPanel2.setPreferredSize(new java.awt.Dimension(720, 830));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBorder1.setBackground(new java.awt.Color(137, 105, 112));

        jScrollPane.setBorder(null);
        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setHorizontalScrollBar(null);

        pnlMenu.setPreferredSize(new java.awt.Dimension(720, 900));
        jScrollPane.setViewportView(pnlMenu);

        javax.swing.GroupLayout pnlBorder1Layout = new javax.swing.GroupLayout(pnlBorder1);
        pnlBorder1.setLayout(pnlBorder1Layout);
        pnlBorder1Layout.setHorizontalGroup(
            pnlBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlBorder1Layout.setVerticalGroup(
            pnlBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorder1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        jPanel2.add(pnlBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 720, -1));

        headerText.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        headerText.setForeground(new java.awt.Color(246, 230, 230));
        headerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerText.setText("Choose your drink");
        jPanel2.add(headerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 720, 83));
        jPanel2.add(catagoryGUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(BackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private GUI.MenuComponent.CategoryGUI catagoryGUI;
    private javax.swing.JLabel headerText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane;
    private GUI.Components.pnlBorder pnlBorder1;
    private GUI.MenuComponent.MenuPanel pnlMenu;
    // End of variables declaration//GEN-END:variables

    
    public JLabel getBackButton() {
        return BackButton;
    }

    public CategoryGUI getCatagoryGUI() {
        return catagoryGUI;
    }

    public MenuPanel getPnlMenu() {
        return pnlMenu;
    }

    public JScrollPane getjScrollPane() {
        return jScrollPane;
    }
    
}
