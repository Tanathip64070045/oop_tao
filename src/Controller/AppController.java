package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import GUI.AdminUI.AdminGUI;
import GUI.AdminUI.AdminStock;
import GUI.MainWindow;
import Model.Card;
import Model.Product;
import Model.Stock;
import Model.ViewModel;
import db.DBModel;
import internal.Login;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;


public class AppController implements ActionListener, WindowListener, MouseListener,Runnable{
    private AdminGUI adminGUI;
    private AdminStock stock;
    private MainWindow mw;
    private internal.Login login;
    private ImageIcon balaIcon = new ImageIcon("../oop_tao/src/GUI/icons/Vecter3.png");
    private ImageIcon tIcon = new ImageIcon("../oop_tao/src/GUI/icons/Vecter3.png");
    
    private DBModel db;
    private Product p = new Product();
    
    @Override
    public void windowOpened(WindowEvent e) {
        db.loadFile();
        System.out.println("Load");
    }
    
    public static void main(String[] args) {
        new AppController();
    }
    public AppController(){
        db = new DBModel();
        mw = new MainWindow();
        
        adminGUI = new AdminGUI();
        adminGUI.setVisible(false);
        
        stock = new AdminStock();
        stock.setVisible(false);
        
        login = new Login();
            login.getBtnLogin().addActionListener(this);


        mw.setVisible(true);
        mw.getPnlLogin().addMouseListener(this);
        mw.addWindowListener(this);
        
        
        adminGUI.getAdminControl().getStock().addMouseListener(this);
        
        int i = db.getProducts().size();
                System.out.println(i);
        
        adminGUI.getAdminControl().getBalance().setData(new Card(null, "  Balance.", "9999.99 ฿", "description"));
        adminGUI.getAdminControl().getTotally().setData(new Card(null, "Totally.", "9999.99 ฿", "description"));
        adminGUI.getAdminControl().getStock().sendData(new Stock(i));

    }
    
    int index;
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource().equals(stock.getAdminProducts().getBtnAdd())){
            try{
                index = db.getIndex();
                index++;
                System.out.println(index);
                p = new Product(index, stock.getAdminProducts().getTfName().getText(), Double.parseDouble(stock.getAdminProducts().getTfPrice().getText()), stock.getAdminProducts().getCategory().getSelectedItem().toString(), fName, 0);

                db.addProduct(p);
                Object[] data = {index,fName,stock.getAdminProducts().getTfName().getText(),Double.parseDouble(stock.getAdminProducts().getTfPrice().getText()),stock.getAdminProducts().getCategory().getSelectedItem().toString(),new JButton("Delete")};

                stock.getAdminProducts().getTable().getTableModel().addRow(data);
                stock.getAdminProducts().getTable().getTableModel().fireTableDataChanged();
                stock.getAdminProducts().getTable().repaint();

                saveFile(sourceFile,destinationFile);

            } catch (NumberFormatException e){
//                JOptionPane.showMessageDialog(null,"Please Fill.", "Error", JOptionPane.PLAIN_MESSAGE);
            }
          } else if(ae.getSource().equals(stock.getAdminProducts().getBtnImage())){
              btnImageActionPerformed(ae);
          } else if(ae.getSource().equals(stock.getAdminProducts().getBtnUpdate())){
                int i = stock.getAdminProducts().getTable().getSelectedRow();
                    stock.getAdminProducts().getTable().setValueAt(stock.getAdminProducts().getTfName().getText(),i,2);
                    stock.getAdminProducts().getTable().setValueAt(stock.getAdminProducts().getTfPrice().getText(), i,3);
                    stock.getAdminProducts().getTable().setValueAt(stock.getAdminProducts().getCategory().getSelectedItem().toString(), i,4);
                    stock.getAdminProducts().getTable().setValueAt(stock.getAdminProducts().getLblFile().getText(), i,1);

//                JOptionPane.showMessageDialog(null,"Update Data.", "Updating", JOptionPane.PLAIN_MESSAGE);
          } else if(ae.getSource().equals(stock.getAdminProducts().getBtnDelete())){
                int i = stock.getAdminProducts().getTable().getSelectedRow();
                if(i>=0){
                    db.removeProducts(stock.getAdminProducts().getTable().getSelectedRow());
                    stock.getAdminProducts().getTable().getTableModel().removeRow(i);
//                    JOptionPane.showMessageDialog(null,"Remove Data.", "Removing", JOptionPane.PLAIN_MESSAGE);
                }
          }
        if(ae.getSource().equals(login.getBtnLogin())){
            adminGUI.setVisible(true);
        }
    }
    
//    File Image Saving...
    private String fName = "";
    File sourceFile = null;
    File destinationFile = null;
                                         
    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(evt.getSource().equals(stock.getAdminProducts().getBtnImage())){
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                Path p = Paths.get(f.getAbsolutePath());
                    stock.getAdminProducts().getLblFile().setText(shorten(p.getFileName().toString(), 20));
                    fName = p.getFileName().toString();
//                    view.setfName(fName);
                
                String fileName = p.toString();
                String fileNameOutput = p.getFileName().toString().replaceFirst("[.][^.]+$", "");
                String newPath = "public/products";
                File directory = new File(newPath);
                if(!directory.exists()){
                    directory.mkdirs();
                }
                String  extension = fileName.substring(fileName.lastIndexOf('.') + 1);
                    sourceFile = new File(fileName);
                    destinationFile = new File(newPath+"/"+fileNameOutput+"."+extension);
            }
        }
    }
    public void saveFile(File sourceFile,File destinationFile){
        try{
            Files.copy(sourceFile.toPath(), destinationFile.toPath());
        } catch (IOException e){
        }
    }
    private String shorten(String text,int max){
       if(text == null){
           return "";
       }
       if(text.length() <= max){
           return text;
       }
       if(max <= 5){
           return text.substring(0,max);
       }
       return text.substring(0,max-2) + "...";
    }
    
    
    
    @Override
    public void windowClosing(WindowEvent e) {
        db.saveFile();
        System.out.println("save");
    }
    @Override
    public void windowClosed(WindowEvent e) {
    }
    @Override
    public void windowIconified(WindowEvent e) {
    }
    @Override
    public void windowDeiconified(WindowEvent e) {
    }
    @Override
    public void windowActivated(WindowEvent e) {
    }
    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
    
    private ViewModel view = new ViewModel();
    private BufferedImage img;

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(adminGUI.getAdminControl().getStock())){
//            new tap;
            stock = new AdminStock();
            
            stock.getAdminProducts().getBtnAdd().addActionListener(this);
            stock.getAdminProducts().getBtnUpdate().addActionListener(this);
            stock.getAdminProducts().getBtnDelete().addActionListener(this);
            stock.getAdminProducts().getBtnImage().addActionListener(this);
            
            for(int i = 0; i < db.getProducts().size(); i++){
                int id = ((Product)(db.getProducts().get(i))).getId();
                String img = ((Product)(db.getProducts().get(i))).getImg();
                String productName = ((Product)(db.getProducts().get(i))).getProductName();
                double price = ((Product)(db.getProducts().get(i))).getPrice();
                String category = ((Product)(db.getProducts().get(i))).getCategory();
                JButton action = new JButton("Delete");

                Object[] data = {id,img,productName,price,category,action};
                stock.getAdminProducts().getTable().getTableModel().addRow(data);
            }

            stock.getAdminProducts().getTable().addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent arg0){
                    int i = stock.getAdminProducts().getTable().getSelectedRow();
                    stock.getAdminProducts().getTfName().setText(stock.getAdminProducts().getTable().getValueAt(i, 2).toString());
                    stock.getAdminProducts().getTfPrice().setText(stock.getAdminProducts().getTable().getValueAt(i, 3).toString());
                    stock.getAdminProducts().getCategory().setSelectedItem(stock.getAdminProducts().getTable().getValueAt(i, 4));
                    view.setfName(stock.getAdminProducts().getTable().getValueAt(i, 1).toString());
//                        System.out.println(stock.getAdminProducts().getTable().getValueAt(i, 1).toString());
                    stock.getAdminProducts().getLblFile().setText(shorten(stock.getAdminProducts().getTable().getValueAt(i, 1).toString(), 20));
                    
//                    stock.getAdminProducts().getPnlViewer().repaint();                    stock.getAdminProducts().getPnlViewer().revalidate();


                }
            });
        }

        if(e.getSource().equals(mw.getPnlLogin())){
            mw.getPnlDesktop().add(login);
            login.setVisible(true);
        }
//        check username

                        
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void run() {
    }

}
