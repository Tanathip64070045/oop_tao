/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.PaymentGUI;

import GUI.PaymentGUI.Components.ButtonConfirm;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class PaymentInsertWindow extends javax.swing.JPanel {

    /**
     * Creates new form PaymentInsertWindow
     */
    public PaymentInsertWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JLabel();
        panelBorder1 = new GUI.PaymentGUI.Components.PanelBorder();
        ButtonCancel = new GUI.PaymentGUI.Components.ButtonConfirm();
        jLabel3 = new javax.swing.JLabel();
        ButtonConfirm = new GUI.PaymentGUI.Components.ButtonConfirm();
        jLabel2 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        Total = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        TextInsert = new javax.swing.JTextField();

        setBackground(new java.awt.Color(66, 56, 63));
        setPreferredSize(new java.awt.Dimension(720, 830));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/Vector (3).png"))); // NOI18N
        BackButton.setText("BACK");
        add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        ButtonCancel.setBackground(new java.awt.Color(163, 43, 43));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cancel");

        javax.swing.GroupLayout ButtonCancelLayout = new javax.swing.GroupLayout(ButtonCancel);
        ButtonCancel.setLayout(ButtonCancelLayout);
        ButtonCancelLayout.setHorizontalGroup(
            ButtonCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(ButtonCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ButtonCancelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        ButtonCancelLayout.setVerticalGroup(
            ButtonCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(ButtonCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ButtonCancelLayout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        ButtonConfirm.setBackground(new java.awt.Color(197, 158, 126));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pay");

        javax.swing.GroupLayout ButtonConfirmLayout = new javax.swing.GroupLayout(ButtonConfirm);
        ButtonConfirm.setLayout(ButtonConfirmLayout);
        ButtonConfirmLayout.setHorizontalGroup(
            ButtonConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonConfirmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        ButtonConfirmLayout.setVerticalGroup(
            ButtonConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label3.setForeground(new java.awt.Color(161, 65, 65));
        label3.setText("Please insert money");

        Total.setAlignment(java.awt.Label.CENTER);
        Total.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Total.setText("Total : 35 ฿");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/cash-pay-hand.png"))); // NOI18N

        TextInsert.setBackground(new java.awt.Color(217, 217, 217));
        TextInsert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TextInsert.setForeground(new java.awt.Color(0, 0, 0));
        TextInsert.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(TextInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(TextInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(ButtonConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(ButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private GUI.PaymentGUI.Components.ButtonConfirm ButtonCancel;
    private GUI.PaymentGUI.Components.ButtonConfirm ButtonConfirm;
    private javax.swing.JTextField TextInsert;
    private java.awt.Label Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label3;
    private GUI.PaymentGUI.Components.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables

    public JLabel getBackButton() {
        return BackButton;
    }

    public ButtonConfirm getButtonCancel() {
        return ButtonCancel;
    }

    public ButtonConfirm getButtonConfirm() {
        return ButtonConfirm;
    }

    public JTextField getTextInsert() {
        return TextInsert;
    }

    public Label getTotal() {
        return Total;
    }
    
    
    
    
}
