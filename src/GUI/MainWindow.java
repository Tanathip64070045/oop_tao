/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import GUI.Components.pnlBorder;
import internal.Login;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainWindow extends javax.swing.JFrame {


    public MainWindow() {
        initComponents();
        
        pnlDesktop.setVisible(true);
        this.setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        pnlBorder1 = new GUI.Components.pnlBorder();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlDesktop = new javax.swing.JDesktopPane();
        pnlLogin = new GUI.Components.pnlBorder();
        jLabel3 = new javax.swing.JLabel();
        pnlJuice = new GUI.Components.pnlBorder();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlMilk = new GUI.Components.pnlBorder();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pnlRecommend = new GUI.Components.pnlBorder();
        JLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlCoffee = new GUI.Components.pnlBorder();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnlSoda = new GUI.Components.pnlBorder();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pnlTea = new GUI.Components.pnlBorder();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlContainer.setBackground(new java.awt.Color(66, 56, 63));
        pnlContainer.setPreferredSize(new java.awt.Dimension(720, 830));

        pnlBorder1.setBackground(new java.awt.Color(137, 105, 112));
        pnlBorder1.setPreferredSize(new java.awt.Dimension(720, 277));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TAO NGOI");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please select a category");

        javax.swing.GroupLayout pnlBorder1Layout = new javax.swing.GroupLayout(pnlBorder1);
        pnlBorder1.setLayout(pnlBorder1Layout);
        pnlBorder1Layout.setHorizontalGroup(
            pnlBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorder1Layout.createSequentialGroup()
                .addGroup(pnlBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBorder1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(pnlBorder1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        pnlBorder1Layout.setVerticalGroup(
            pnlBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlDesktop.setBackground(new java.awt.Color(68, 55, 64));
        pnlDesktop.setPreferredSize(new java.awt.Dimension(720, 619));

        pnlLogin.setBackground(new java.awt.Color(246, 230, 230));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlJuice.setBackground(new java.awt.Color(197, 158, 126));
        pnlJuice.setMinimumSize(new java.awt.Dimension(200, 160));
        pnlJuice.setPreferredSize(new java.awt.Dimension(200, 160));
        pnlJuice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/image 12.png"))); // NOI18N
        pnlJuice.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 20, 200, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Juice");
        pnlJuice.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));

        pnlMilk.setBackground(new java.awt.Color(197, 158, 126));
        pnlMilk.setMinimumSize(new java.awt.Dimension(200, 160));
        pnlMilk.setPreferredSize(new java.awt.Dimension(200, 160));
        pnlMilk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/image 11.png"))); // NOI18N
        pnlMilk.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 20, 200, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Milk & Chocolate");
        pnlMilk.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));

        pnlRecommend.setBackground(new java.awt.Color(197, 158, 126));
        pnlRecommend.setMinimumSize(new java.awt.Dimension(200, 160));
        pnlRecommend.setPreferredSize(new java.awt.Dimension(200, 160));
        pnlRecommend.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/image 5.png"))); // NOI18N
        pnlRecommend.add(JLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 6, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Recommend");
        pnlRecommend.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));

        pnlCoffee.setBackground(new java.awt.Color(197, 158, 126));
        pnlCoffee.setMinimumSize(new java.awt.Dimension(200, 160));
        pnlCoffee.setPreferredSize(new java.awt.Dimension(200, 160));
        pnlCoffee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/image 6.png"))); // NOI18N
        pnlCoffee.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 14, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Coffee");
        pnlCoffee.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));

        pnlSoda.setBackground(new java.awt.Color(197, 158, 126));
        pnlSoda.setMinimumSize(new java.awt.Dimension(200, 160));
        pnlSoda.setPreferredSize(new java.awt.Dimension(200, 160));
        pnlSoda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/image 10.png"))); // NOI18N
        pnlSoda.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 12, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Soda");
        pnlSoda.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));

        pnlTea.setBackground(new java.awt.Color(197, 158, 126));
        pnlTea.setMinimumSize(new java.awt.Dimension(200, 160));
        pnlTea.setPreferredSize(new java.awt.Dimension(200, 160));
        pnlTea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons/image 7.png"))); // NOI18N
        pnlTea.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tea");
        pnlTea.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 200, -1));

        pnlDesktop.setLayer(pnlLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlDesktop.setLayer(pnlJuice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlDesktop.setLayer(pnlMilk, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlDesktop.setLayer(pnlRecommend, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlDesktop.setLayer(pnlCoffee, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlDesktop.setLayer(pnlSoda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlDesktop.setLayer(pnlTea, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlDesktopLayout = new javax.swing.GroupLayout(pnlDesktop);
        pnlDesktop.setLayout(pnlDesktopLayout);
        pnlDesktopLayout.setHorizontalGroup(
            pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDesktopLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlSoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJuice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRecommend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDesktopLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(pnlDesktopLayout.createSequentialGroup()
                        .addGroup(pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlMilk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlDesktopLayout.setVerticalGroup(
            pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDesktopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlRecommend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlCoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMilk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlJuice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlSoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDesktopLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout pnlContainerLayout = new javax.swing.GroupLayout(pnlContainer);
        pnlContainer.setLayout(pnlContainerLayout);
        pnlContainerLayout.setHorizontalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlContainerLayout.setVerticalGroup(
            pnlContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContainerLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private GUI.Components.pnlBorder pnlBorder1;
    private GUI.Components.pnlBorder pnlCoffee;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JDesktopPane pnlDesktop;
    private GUI.Components.pnlBorder pnlJuice;
    private GUI.Components.pnlBorder pnlLogin;
    private GUI.Components.pnlBorder pnlMilk;
    private GUI.Components.pnlBorder pnlRecommend;
    private GUI.Components.pnlBorder pnlSoda;
    private GUI.Components.pnlBorder pnlTea;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getPnlDesktop() {
        return pnlDesktop;
    }

    public pnlBorder getPnlJuice() {
        return pnlJuice;
    }

    public pnlBorder getPnlLogin() {
        return pnlLogin;
    }

    public pnlBorder getPnlMilk() {
        return pnlMilk;
    }

    public pnlBorder getPnlRecommend() {
        return pnlRecommend;
    }

    public pnlBorder getPnlSoda() {
        return pnlSoda;
    }

    public pnlBorder getPnlTea() {
        return pnlTea;
    }

    public pnlBorder getPnlCoffee() {
        return pnlCoffee;
    }

    public JPanel getPnlContainer() {
        return pnlContainer;
    }
    
}
