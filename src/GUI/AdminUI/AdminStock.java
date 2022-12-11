package GUI.AdminUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

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
        adminProducts1 = new GUI.Components.AdminProducts();
        navbar11 = new GUI.Components.Navbar1();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_main.setBackground(new java.awt.Color(51, 51, 51));
        panel_main.setLayout(new java.awt.BorderLayout());
        panel_main.add(adminProducts1, java.awt.BorderLayout.CENTER);

        navbar11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navbar11MouseClicked(evt);
            }
        });
        panel_main.add(navbar11, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_main, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navbar11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbar11MouseClicked
        setVisible(false);
        new AdminGUI();
    }//GEN-LAST:event_navbar11MouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.Components.AdminProducts adminProducts1;
    private GUI.Components.Navbar1 navbar11;
    private javax.swing.JPanel panel_main;
    // End of variables declaration//GEN-END:variables
}
