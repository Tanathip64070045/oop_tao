/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.MenuComponent;

import GUI.Components.pnlBorder;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Adam
 */
public class SweetnessLevelButton extends javax.swing.JPanel {

    /**
     * Creates new form FlowLayoutButton2
     */
    public SweetnessLevelButton() {
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

        button0 = new GUI.Components.pnlBorder();
        text0 = new javax.swing.JLabel();
        button25 = new GUI.Components.pnlBorder();
        text25 = new javax.swing.JLabel();
        button50 = new GUI.Components.pnlBorder();
        text50 = new javax.swing.JLabel();
        button75 = new GUI.Components.pnlBorder();
        text75 = new javax.swing.JLabel();
        button100 = new GUI.Components.pnlBorder();
        text100 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(574, 45));

        button0.setBackground(new java.awt.Color(144, 111, 118));
        button0.setPreferredSize(new java.awt.Dimension(105, 35));
        button0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text0.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        text0.setForeground(new java.awt.Color(255, 255, 255));
        text0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text0.setText("0%");
        button0.add(text0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 90, -1));

        add(button0);

        button25.setBackground(new java.awt.Color(144, 111, 118));
        button25.setPreferredSize(new java.awt.Dimension(105, 35));
        button25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text25.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        text25.setForeground(new java.awt.Color(255, 255, 255));
        text25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text25.setText("25%");
        button25.add(text25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 90, -1));

        add(button25);

        button50.setBackground(new java.awt.Color(144, 111, 118));
        button50.setPreferredSize(new java.awt.Dimension(105, 35));
        button50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text50.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        text50.setForeground(new java.awt.Color(255, 255, 255));
        text50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text50.setText("50%");
        button50.add(text50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 90, -1));

        add(button50);

        button75.setBackground(new java.awt.Color(144, 111, 118));
        button75.setPreferredSize(new java.awt.Dimension(105, 35));
        button75.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text75.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        text75.setForeground(new java.awt.Color(255, 255, 255));
        text75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text75.setText("75%");
        button75.add(text75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 90, -1));

        add(button75);

        button100.setBackground(new java.awt.Color(144, 111, 118));
        button100.setPreferredSize(new java.awt.Dimension(105, 35));
        button100.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text100.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        text100.setForeground(new java.awt.Color(255, 255, 255));
        text100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text100.setText("100%");
        button100.add(text100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 90, -1));

        add(button100);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.Components.pnlBorder button0;
    private GUI.Components.pnlBorder button100;
    private GUI.Components.pnlBorder button25;
    private GUI.Components.pnlBorder button50;
    private GUI.Components.pnlBorder button75;
    private javax.swing.JLabel text0;
    private javax.swing.JLabel text100;
    private javax.swing.JLabel text25;
    private javax.swing.JLabel text50;
    private javax.swing.JLabel text75;
    // End of variables declaration//GEN-END:variables

    public pnlBorder getButton0() {
        return button0;
    }

    public pnlBorder getButton100() {
        return button100;
    }

    public pnlBorder getButton25() {
        return button25;
    }

    public pnlBorder getButton50() {
        return button50;
    }

    public pnlBorder getButton75() {
        return button75;
    }

    public JLabel getText0() {
        return text0;
    }

    public JLabel getText100() {
        return text100;
    }

    public JLabel getText25() {
        return text25;
    }

    public JLabel getText50() {
        return text50;
    }

    public JLabel getText75() {
        return text75;
    }
}
