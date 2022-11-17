import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
        public MainWindow() {
                // create JSwing
                JPanel panelHeader = new JPanel();
                JPanel panelBody = new JPanel();
                JPanel panelInBody = new JPanel();
                JPanel panelBottom = new JPanel();
                JPanel panelTop = new JPanel();
                JPanel panelInTop = new JPanel();
                JButton btnLogin = new JButton("LOGIN");
                JButton btnRec = new JButton("Recommend");
                JButton btnCoffee = new JButton("Coffee");
                JButton btnTea = new JButton("Tea");
                JButton btnMilk = new JButton("Milk and Chocolate");
                JButton btnJuice = new JButton("Juice");
                JButton btnSoda = new JButton("Soda");
                JLabel logo = new JLabel("", SwingConstants.CENTER);
                JLabel txt = new JLabel("", SwingConstants.CENTER);

                Image img = ImageIO.read(getClass().getResource("resources/water.bmp"));
                btnRec.setIcon(new ImageIcon(img));

                // layoutBody setting
                GridLayout layoutBody = new GridLayout(3, 2);
                layoutBody.setHgap(30);
                layoutBody.setVgap(20);

                // Set default font
                this.setFont(new Font("Arial", Font.PLAIN, 24));

                // Label
                logo.setText("Tao Ngoi");
                logo.setFont(new Font("Arial", Font.PLAIN, 50));

                // txt
                txt.setText("Please select a category");
                txt.setFont(new Font("Arial", Font.PLAIN, 20));

                // panelBottom setting
                panelBottom.setBackground(Color.decode("#443740"));
                panelBottom.setLayout(new BorderLayout());
                panelBottom.add(btnLogin, BorderLayout.EAST);
                panelBottom.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 10));

                // panelHeader setting
                panelHeader.setBackground(Color.decode("#896970"));
                panelHeader.setLayout(new BorderLayout());
                panelHeader.add(logo, BorderLayout.CENTER);
                panelHeader.add(txt, BorderLayout.SOUTH);

                // panelTop setting
                panelTop.setLayout(new BorderLayout());
                panelTop.add(panelInTop, BorderLayout.NORTH);
                panelTop.add(panelHeader);

                // panelInTop setting
                panelInTop.setBackground(Color.decode("#443740"));

                // panelBody setting
                panelBody.setBackground(Color.decode("#443740"));
                panelBody.setLayout(new BorderLayout());
                panelBody.add(panelInBody, BorderLayout.CENTER);
                panelBody.setBorder(BorderFactory.createEmptyBorder(40, 70, 40, 70));

                // panelInBody setting =
                panelInBody.setBackground(Color.decode("#443740"));
                panelInBody.setLayout(layoutBody);
                panelInBody.add(btnRec);
                panelInBody.add(btnCoffee);
                panelInBody.add(btnTea);
                panelInBody.add(btnMilk);
                panelInBody.add(btnJuice);
                panelInBody.add(btnSoda);
                // btnRec.setMargin(new Insets(10, 10, 10, 10));

                // Button setting
                btnRec.setBackground(Color.decode("#C59E7E"));
                btnCoffee.setBackground(Color.decode("#C59E7E"));
                btnTea.setBackground(Color.decode("#C59E7E"));
                btnMilk.setBackground(Color.decode("#C59E7E"));
                btnJuice.setBackground(Color.decode("#C59E7E"));
                btnSoda.setBackground(Color.decode("#C59E7E"));
                btnLogin.setBackground(Color.decode("#F6E6E6"));

                // เซ็ตค่าต่างๆ ขนาดของโปรแกรม width= 400, height= 500
                this.setTitle("Tao Ngai");
                this.setSize(600, 800);
                this.setLayout(new BorderLayout());
                this.add(panelTop, BorderLayout.NORTH);
                this.add(panelBody, BorderLayout.CENTER);
                this.add(panelBottom, BorderLayout.SOUTH);
                this.setVisible(true);
                this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        }
}
