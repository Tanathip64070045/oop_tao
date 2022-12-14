/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.MenuComponent;

import java.awt.Color;

/**
 *
 * @author Adam
 */
public class TypeOfDrinkButton extends javax.swing.JPanel {

    /**
     * Creates new form FlowLayoutButton
     */
    public TypeOfDrinkButton() {
        initComponents();
        setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hotButton = new GUI.Components.pnlBorder();
        hotText = new javax.swing.JLabel();
        icedButton = new GUI.Components.pnlBorder();
        icedText = new javax.swing.JLabel();
        smoothieButton = new GUI.Components.pnlBorder();
        smoothieText = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(574, 45));

        hotButton.setBackground(new java.awt.Color(144, 111, 118));
        hotButton.setPreferredSize(new java.awt.Dimension(175, 35));

        hotText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        hotText.setForeground(new java.awt.Color(255, 255, 255));
        hotText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hotText.setText("Hot");

        javax.swing.GroupLayout hotButtonLayout = new javax.swing.GroupLayout(hotButton);
        hotButton.setLayout(hotButtonLayout);
        hotButtonLayout.setHorizontalGroup(
            hotButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hotButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hotText, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        hotButtonLayout.setVerticalGroup(
            hotButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hotButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hotText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(hotButton);

        icedButton.setBackground(new java.awt.Color(144, 111, 118));
        icedButton.setPreferredSize(new java.awt.Dimension(175, 35));

        icedText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        icedText.setForeground(new java.awt.Color(255, 255, 255));
        icedText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icedText.setText("Iced(+฿5)");

        javax.swing.GroupLayout icedButtonLayout = new javax.swing.GroupLayout(icedButton);
        icedButton.setLayout(icedButtonLayout);
        icedButtonLayout.setHorizontalGroup(
            icedButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(icedButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icedText, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        icedButtonLayout.setVerticalGroup(
            icedButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(icedButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icedText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(icedButton);

        smoothieButton.setBackground(new java.awt.Color(144, 111, 118));
        smoothieButton.setPreferredSize(new java.awt.Dimension(175, 35));

        smoothieText.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        smoothieText.setForeground(new java.awt.Color(255, 255, 255));
        smoothieText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        smoothieText.setText("Smoothie(+฿10)");

        javax.swing.GroupLayout smoothieButtonLayout = new javax.swing.GroupLayout(smoothieButton);
        smoothieButton.setLayout(smoothieButtonLayout);
        smoothieButtonLayout.setHorizontalGroup(
            smoothieButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(smoothieButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(smoothieText, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        smoothieButtonLayout.setVerticalGroup(
            smoothieButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(smoothieButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(smoothieText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(smoothieButton);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.Components.pnlBorder hotButton;
    private javax.swing.JLabel hotText;
    private GUI.Components.pnlBorder icedButton;
    private javax.swing.JLabel icedText;
    private GUI.Components.pnlBorder smoothieButton;
    private javax.swing.JLabel smoothieText;
    // End of variables declaration//GEN-END:variables
}
