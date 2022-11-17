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
                
                // IMG and scale
                ImageIcon image1 = new ImageIcon("imageCoffee.png");
                image1.setImage(image1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
                ImageIcon image2 = new ImageIcon("imageJuice.png");
                image2.setImage(image2.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
                ImageIcon image3 = new ImageIcon("imageMilk.png");
                image3.setImage(image3.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
                ImageIcon image4 = new ImageIcon("imageRec.png");
                image4.setImage(image4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
                ImageIcon image5 = new ImageIcon("imageSoda.png");
                image5.setImage(image5.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
                ImageIcon image6 = new ImageIcon("imageTea.png");
                image6.setImage(image6.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT));
                
                //button Menu
                JButton btnLogin = new JButton("LOGIN");
                JButton btnRec = new JButton(image4);
                btnRec.setLayout(new BorderLayout());
                JButton btnCoffee = new JButton(image1);
                btnCoffee.setLayout(new BorderLayout());
                JButton btnTea = new JButton(image6);
                btnTea.setLayout(new BorderLayout());
                JButton btnMilk = new JButton(image3);
                btnMilk.setLayout(new BorderLayout());
                JButton btnJuice = new JButton(image2);
                btnJuice.setLayout(new BorderLayout());
                JButton btnSoda = new JButton(image5);
                btnSoda.setLayout(new BorderLayout());
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
                
                
                // txt in Menu Coffee
                JPanel pCoffee = new JPanel();
                JLabel tCoffee = new JLabel("Coffee");
                pCoffee.add(tCoffee);
                pCoffee.setBackground(Color.decode("#C59E7E"));
                btnCoffee.add(pCoffee, BorderLayout.SOUTH);
                
                // txt in Menu Juice
                JPanel pJuice = new JPanel();
                JLabel tJuice = new JLabel("Juice");
                pJuice.add(tJuice);
                pJuice.setBackground(Color.decode("#C59E7E"));
                btnJuice.add(pJuice, BorderLayout.SOUTH);

                // txt in Menu Milk
                JPanel pMilk = new JPanel();
                JLabel tMilk = new JLabel("Milk & Chocolate");
                pMilk.add(tMilk);
                pMilk.setBackground(Color.decode("#C59E7E"));
                btnMilk.add(pMilk, BorderLayout.SOUTH);

                 // txt in Menu Rec
                 JPanel pRec = new JPanel();
                 JLabel tRec = new JLabel("Recommend");
                 pRec.add(tRec);
                 pRec.setBackground(Color.decode("#C59E7E"));
                 btnRec.add(pRec, BorderLayout.SOUTH);

                 // txt in Menu Soda
                 JPanel pSoda = new JPanel();
                 JLabel tSoda = new JLabel("Soda");
                 pSoda.add(tSoda);
                 pSoda.setBackground(Color.decode("#C59E7E"));
                 btnSoda.add(pSoda, BorderLayout.SOUTH);

                 // txt in Menu Tea
                 JPanel pTea = new JPanel();
                 JLabel tTea = new JLabel("Tea");
                 pTea.add(tTea);
                 pTea.setBackground(Color.decode("#C59E7E"));
                 btnTea.add(pTea, BorderLayout.SOUTH);


                

                // เซ็ตค่าต่างๆ ขนาดของโปรแกรม width= 400, height= 500
                this.setTitle("Tao Ngai");
                this.setSize(720, 830);
                this.setLayout(new BorderLayout());
                this.add(panelTop, BorderLayout.NORTH);
                this.add(panelBody, BorderLayout.CENTER);
                this.add(panelBottom, BorderLayout.SOUTH);
                this.setVisible(true);
                this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        }
}
