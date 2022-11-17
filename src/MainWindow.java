import java.awt.*;
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
                Icon iconRec = new ImageIcon("./img/imageRec.png");
                Icon iconCoffee = new ImageIcon("./img/imageCoffee.png");
                Icon iconTea = new ImageIcon("./img/imageTea.png");
                Icon iconMilk = new ImageIcon("./img/imageMilk.png");
                Icon iconJuice = new ImageIcon("./img/imageJuice.png");
                Icon iconSoda = new ImageIcon("./img/imageSoda.png");
                JButton btnLogin = new JButton();
                JButton btnRec = new JButton(iconRec);
                JButton btnCoffee = new JButton(iconCoffee);
                JButton btnTea = new JButton(iconTea);
                JButton btnMilk = new JButton(iconMilk);
                JButton btnJuice = new JButton(iconJuice);
                JButton btnSoda = new JButton(iconSoda);
                JLabel logo = new JLabel("", SwingConstants.CENTER);
                JLabel txt = new JLabel("", SwingConstants.CENTER);

                // layoutBody setting
                GridLayout layoutBody = new GridLayout(3, 2);
                layoutBody.setHgap(30);
                layoutBody.setVgap(20);

                // Set default font
                this.setFont(new Font("Arial", Font.PLAIN, 24));

                // Label
                logo.setText("Tao Ngoi");
                logo.setFont(new Font("Arial", Font.PLAIN, 100));
                logo.setForeground(Color.decode("#F6E6E6"));

                // txt
                txt.setText("Please select a category");
                txt.setFont(new Font("Arial", Font.PLAIN, 50));
                txt.setForeground(Color.decode("#F6E6E6"));

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
                panelHeader.setBorder(BorderFactory.createEmptyBorder(30, 10, 30, 10));

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

                // Button setting
                btnRec.setBackground(Color.decode("#C59E7E"));
                btnCoffee.setBackground(Color.decode("#C59E7E"));
                btnTea.setBackground(Color.decode("#C59E7E"));
                btnMilk.setBackground(Color.decode("#C59E7E"));
                btnJuice.setBackground(Color.decode("#C59E7E"));
                btnSoda.setBackground(Color.decode("#C59E7E"));
                btnLogin.setBackground(Color.decode("#F6E6E6"));
                btnLogin.setMargin(new Insets(10, 20, 10, 20));
                btnRec.setText("Recommend");
                btnCoffee.setText("Coffee");
                btnTea.setText("Tea");
                btnMilk.setText("Milk and Chocolate");
                btnJuice.setText("Juice");
                btnSoda.setText("Soda");
                btnLogin.setText("Login");
                btnRec.setVerticalTextPosition(JButton.SOUTH);

                // เซ็ตค่าต่างๆ ขนาดของโปรแกรม width= 400, height= 500
                this.setTitle("Tao Ngai");
                this.setSize(720, 960);
                this.setLayout(new BorderLayout());
                this.add(panelTop, BorderLayout.NORTH);
                this.add(panelBody, BorderLayout.CENTER);
                this.add(panelBottom, BorderLayout.SOUTH);
                this.setVisible(true);
                this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        }
}
