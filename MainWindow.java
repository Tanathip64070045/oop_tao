import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainWindow extends JFrame{
    public MainWindow(){
        //create JSwing
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JButton btn1 = new JButton("LOGIN");
        JLabel logo = new JLabel("", SwingConstants.CENTER);
        JLabel txt = new JLabel("", SwingConstants.CENTER);

        //Label
        logo.setText("Tao Ngoi");
        logo.setFont(new Font("Arial", Font.PLAIN, 50));

        //txt
        txt.setText("Please Choose");
        txt.setFont(new Font("Arial", Font.PLAIN, 20));


        //panel3 setting
//        panel3.setSize(400, 10);
        panel3.setBackground(Color.GREEN);
        panel3.setLayout(new BorderLayout());
        panel3.add(btn1, BorderLayout.EAST);


        // panel1 setting
//        panel1.setSize(400,100);
        panel1.setBackground(Color.red);
        panel1.setLayout(new BorderLayout());
        panel1.add(logo, BorderLayout.CENTER);
        panel1.add(txt, BorderLayout.SOUTH);

        //panel2 setting
        panel2.setBackground(Color.blue);
//        panel2.setSize(400, 350);


        // เซ็ตค่าต่างๆ ขนาดของโปรแกรม width= 400, height= 500
        this.setTitle("Tao Ngai");
        this.setSize(400,500);
        this.setLayout(new BorderLayout());
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }
}
