package GUI.AdminUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminStock extends javax.swing.JFrame{

    public AdminStock() {
        initComponents();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new javax.swing.JPanel();
        navbar1 = new GUI.Components.Navbar();
        adminProducts1 = new GUI.Components.AdminProducts();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_main.setBackground(new java.awt.Color(51, 51, 51));
        panel_main.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout navbar1Layout = new javax.swing.GroupLayout(navbar1);
        navbar1.setLayout(navbar1Layout);
        navbar1Layout.setHorizontalGroup(
            navbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        navbar1Layout.setVerticalGroup(
            navbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panel_main.add(navbar1, java.awt.BorderLayout.PAGE_START);
        panel_main.add(adminProducts1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.Components.AdminProducts adminProducts1;
    private GUI.Components.Navbar navbar1;
    private javax.swing.JPanel panel_main;
    // End of variables declaration//GEN-END:variables
}
