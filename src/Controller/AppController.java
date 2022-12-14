package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import GUI.AdminUI.AdminGUI;
import GUI.AdminUI.AdminStock;
import GUI.EachDrink;
import GUI.MainWindow;
import GUI.Menu;
import GUI.PaymentGUI.PaymentChangeWindow;
import GUI.PaymentGUI.PaymentInsertWindow;
import GUI.PaymentGUI.PaymentMainWindow;
import GUI.PaymentGUI.PaymentQrWindow;
import GUI.PaymentGUI.PaymentSuccess;
import Model.Card;
import Model.Product;
import Model.Stock;
import Model.ViewModel;
import db.DBModel;
import internal.Login;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class AppController implements ActionListener, WindowListener, MouseListener, Runnable {

    private AdminGUI adminGUI;
    private AdminStock stock;
    private MainWindow mw;
    private internal.Login login;
    private EachDrink eachdrink;
    private Menu menu;
    private PaymentMainWindow paymentmain;
    private PaymentChangeWindow paymentchange;
    private PaymentInsertWindow paymentinsert;
    private PaymentQrWindow paymentqr;
    private PaymentSuccess paymentsuccess;
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

    public AppController() {
        db = new DBModel();
        mw = new MainWindow();
        login = new Login();
        menu = new Menu();
        eachdrink = new EachDrink();
        paymentmain = new PaymentMainWindow();
        paymentchange = new PaymentChangeWindow();
        paymentinsert = new PaymentInsertWindow();
        paymentqr = new PaymentQrWindow();
        paymentsuccess = new PaymentSuccess();
        adminGUI = new AdminGUI();
        stock = new AdminStock();

        menu.setVisible(false);
        eachdrink.setVisible(false);
        paymentmain.setVisible(false);
        paymentchange.setVisible(false);
        paymentinsert.setVisible(false);
        paymentqr.setVisible(false);
        paymentsuccess.setVisible(false);
        adminGUI.setVisible(false);
        stock.setVisible(false);

        login.getBtnLogin().addActionListener(this);

        menu.getBackButton().addMouseListener(this);
        menu.getCatagoryGUI().getRecommendButton().addMouseListener(this);
        menu.getCatagoryGUI().getCoffeeButton().addMouseListener(this);
        menu.getCatagoryGUI().getTeaButton().addMouseListener(this);
        menu.getCatagoryGUI().getMilkAndCocoaButton().addMouseListener(this);
        menu.getCatagoryGUI().getJuiceButton().addMouseListener(this);
        menu.getCatagoryGUI().getSodaButton().addMouseListener(this);

        eachdrink.getBackButton().addMouseListener(this);

        paymentmain.getBackButton().addMouseListener(this);
        paymentmain.getButtonCancel().addMouseListener(this);
        paymentmain.getButtonCash().addMouseListener(this);
        paymentmain.getButtonQrCode().addMouseListener(this);
        paymentmain.getButtonTrue().addMouseListener(this);

        paymentqr.getBackButton().addMouseListener(this);
        paymentqr.getButtonConfirm().addMouseListener(this);
        paymentqr.getButtonCancel().addMouseListener(this);

        paymentinsert.getBackButton().addMouseListener(this);
        paymentinsert.getButtonConfirm().addMouseListener(this);
        paymentinsert.getButtonCancel().addMouseListener(this);

        paymentchange.getButtonConfirm().addMouseListener(this);

        paymentsuccess.getButtonConfirm().addMouseListener(this);

        mw.setLayout(new CardLayout());
        mw.add(adminGUI);
        mw.getPnlDesktop().add(login);
        mw.add(menu);
        mw.add(eachdrink);
        mw.add(paymentmain);
        mw.add(paymentchange);
        mw.add(paymentinsert);
        mw.add(paymentqr);
        mw.add(paymentsuccess);
        mw.setVisible(true);
        mw.getPnlLogin().addMouseListener(this);
        mw.getPnlRecommend().addMouseListener(this);
        mw.getPnlCoffee().addMouseListener(this);
        mw.getPnlJuice().addMouseListener(this);
        mw.getPnlMilk().addMouseListener(this);
        mw.getPnlSoda().addMouseListener(this);
        mw.getPnlTea().addMouseListener(this);
        mw.addWindowListener(this);

        int i = db.getProducts().size();
        System.out.println(i);

        adminGUI.getAdminControl().getStock().addMouseListener(this);
        adminGUI.getNavbar().getBackButton().addMouseListener(this);
        adminGUI.getAdminControl().getBalance().setData(new Card(null, "  Balance.", "9999.99 ฿", "description"));
        adminGUI.getAdminControl().getTotally().setData(new Card(null, "Totally.", "9999.99 ฿", "description"));
        adminGUI.getAdminControl().getStock().sendData(new Stock(i));

    }

    int index;

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(stock.getAdminProducts().getBtnAdd())) {
            try {
                index = db.getIndex();
                index++;
                System.out.println(index);
                p = new Product(index, stock.getAdminProducts().getTfName().getText(), Double.parseDouble(stock.getAdminProducts().getTfPrice().getText()), stock.getAdminProducts().getCategory().getSelectedItem().toString(), fName, 0);

                db.addProduct(p);
                Object[] data = {index, fName, stock.getAdminProducts().getTfName().getText(), Double.parseDouble(stock.getAdminProducts().getTfPrice().getText()), stock.getAdminProducts().getCategory().getSelectedItem().toString(), new JButton("Delete")};

                stock.getAdminProducts().getTable().getTableModel().addRow(data);
                stock.getAdminProducts().getTable().getTableModel().fireTableDataChanged();
                stock.getAdminProducts().getTable().repaint();

                saveFile(sourceFile, destinationFile);

            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null,"Please Fill.", "Error", JOptionPane.PLAIN_MESSAGE);
            }
        } else if (ae.getSource().equals(stock.getAdminProducts().getBtnImage())) {
            btnImageActionPerformed(ae);
        } else if (ae.getSource().equals(stock.getAdminProducts().getBtnUpdate())) {
            int i = stock.getAdminProducts().getTable().getSelectedRow();
            stock.getAdminProducts().getTable().setValueAt(stock.getAdminProducts().getTfName().getText(), i, 2);
            stock.getAdminProducts().getTable().setValueAt(stock.getAdminProducts().getTfPrice().getText(), i, 3);
            stock.getAdminProducts().getTable().setValueAt(stock.getAdminProducts().getCategory().getSelectedItem().toString(), i, 4);
            stock.getAdminProducts().getTable().setValueAt(stock.getAdminProducts().getLblFile().getText(), i, 1);

//                JOptionPane.showMessageDialog(null,"Update Data.", "Updating", JOptionPane.PLAIN_MESSAGE);
        } else if (ae.getSource().equals(stock.getAdminProducts().getBtnDelete())) {
            int i = stock.getAdminProducts().getTable().getSelectedRow();
            if (i >= 0) {
                db.removeProducts(stock.getAdminProducts().getTable().getSelectedRow());
                stock.getAdminProducts().getTable().getTableModel().removeRow(i);
//                    JOptionPane.showMessageDialog(null,"Remove Data.", "Removing", JOptionPane.PLAIN_MESSAGE);
            }
        }
        if (ae.getSource().equals(login.getBtnLogin())) {
            mw.getPnlContainer().setVisible(false);
            adminGUI.setVisible(true);
            login.setVisible(false);
        }
    }

//    File Image Saving...
    private String fName = "";
    File sourceFile = null;
    File destinationFile = null;

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource().equals(stock.getAdminProducts().getBtnImage())) {
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
                if (!directory.exists()) {
                    directory.mkdirs();
                }
                String extension = fileName.substring(fileName.lastIndexOf('.') + 1);
                sourceFile = new File(fileName);
                destinationFile = new File(newPath + "/" + fileNameOutput + "." + extension);
            }
        }
    }

    public void saveFile(File sourceFile, File destinationFile) {
        try {
            Files.copy(sourceFile.toPath(), destinationFile.toPath());
        } catch (IOException e) {
        }
    }

    private String shorten(String text, int max) {
        if (text == null) {
            return "";
        }
        if (text.length() <= max) {
            return text;
        }
        if (max <= 5) {
            return text.substring(0, max);
        }
        return text.substring(0, max - 2) + "...";
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
        if (e.getSource().equals(adminGUI.getAdminControl().getStock())) {
//            new tap;
            stock = new AdminStock();

            stock.getAdminProducts().getBtnAdd().addActionListener(this);
            stock.getAdminProducts().getBtnUpdate().addActionListener(this);
            stock.getAdminProducts().getBtnDelete().addActionListener(this);
            stock.getAdminProducts().getBtnImage().addActionListener(this);

            for (int i = 0; i < db.getProducts().size(); i++) {
                int id = ((Product) (db.getProducts().get(i))).getId();
                String img = ((Product) (db.getProducts().get(i))).getImg();
                String productName = ((Product) (db.getProducts().get(i))).getProductName();
                double price = ((Product) (db.getProducts().get(i))).getPrice();
                String category = ((Product) (db.getProducts().get(i))).getCategory();
                JButton action = new JButton("Delete");

                Object[] data = {id, img, productName, price, category, action};
                stock.getAdminProducts().getTable().getTableModel().addRow(data);
            }

            stock.getAdminProducts().getTable().addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent arg0) {
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

        if (e.getSource().equals(mw.getPnlLogin())) {
            login.setVisible(true);
        }
//        check username

        if (e.getSource().equals(mw.getPnlRecommend())) {
            mw.getPnlContainer().setVisible(false);
            eachdrink.setVisible(true);
        } else if (e.getSource().equals(mw.getPnlCoffee())) {
            mw.getPnlContainer().setVisible(false);
            menu.setVisible(true);
        } else if (e.getSource().equals(mw.getPnlJuice())) {
            mw.getPnlContainer().setVisible(false);
            paymentmain.setVisible(true);
        } else if (e.getSource().equals(mw.getPnlMilk())) {
            mw.getPnlContainer().setVisible(false);
            menu.setVisible(true);
        } else if (e.getSource().equals(mw.getPnlSoda())) {
            mw.getPnlContainer().setVisible(false);
            menu.setVisible(true);
        } else if (e.getSource().equals(mw.getPnlTea())) {
            mw.getPnlContainer().setVisible(false);
            menu.setVisible(true);
        }

        if (e.getSource().equals(menu.getBackButton())) {
            menu.setVisible(false);
            mw.getPnlContainer().setVisible(true);
        } else if (e.getSource().equals(menu.getCatagoryGUI().getRecommendButton())) {
            System.out.println("Insert Recommend Code");
        } else if (e.getSource().equals(menu.getCatagoryGUI().getCoffeeButton())) {
            System.out.println("Insert Coffee Code");
        } else if (e.getSource().equals(menu.getCatagoryGUI().getTeaButton())) {
            System.out.println("Insert Tea Code");
        } else if (e.getSource().equals(menu.getCatagoryGUI().getMilkAndCocoaButton())) {
            System.out.println("Insert Milk and Cocoa Code");
        } else if (e.getSource().equals(menu.getCatagoryGUI().getJuiceButton())) {
            System.out.println("Insert Juice Code");
        } else if (e.getSource().equals(menu.getCatagoryGUI().getSodaButton())) {
            System.out.println("Insert Soda Code");
        }

        if (e.getSource().equals(eachdrink.getBackButton())) {
            eachdrink.setVisible(false);
            menu.setVisible(true);
        }

        if (e.getSource().equals(paymentmain.getBackButton()) || e.getSource().equals(paymentmain.getButtonCancel())) {
            paymentmain.setVisible(false);
            eachdrink.setVisible(true);
        } else if (e.getSource().equals(paymentmain.getButtonCash())) {
            paymentmain.setVisible(false);
            paymentinsert.setVisible(true);
        } else if (e.getSource().equals(paymentmain.getButtonQrCode()) || e.getSource().equals(paymentmain.getButtonTrue())) {
            paymentmain.setVisible(false);
            paymentqr.setVisible(true);
        }

        if (e.getSource().equals(paymentqr.getBackButton()) || e.getSource().equals(paymentqr.getButtonCancel())) {
            paymentqr.setVisible(false);
            paymentmain.setVisible(true);
        } else if (e.getSource().equals(paymentqr.getButtonConfirm())) {
            paymentqr.setVisible(false);
            paymentsuccess.setVisible(true);
        }

        if (e.getSource().equals(paymentinsert.getBackButton()) || e.getSource().equals(paymentinsert.getButtonCancel())) {
            paymentinsert.setVisible(false);
            paymentmain.setVisible(true);
        }
        else if (e.getSource().equals(paymentinsert.getButtonConfirm())) {
            paymentinsert.setVisible(false);
            paymentchange.setVisible(true);
        }
        
        if (e.getSource().equals(paymentchange.getButtonConfirm())) {
            paymentchange.setVisible(false);
            paymentsuccess.setVisible(true);
        }
        
        if (e.getSource().equals(paymentsuccess.getButtonConfirm())) {
            paymentsuccess.setVisible(false);
            mw.getPnlContainer().setVisible(true);
        }
        
        if (e.getSource().equals(adminGUI.getNavbar().getBackButton())) {
            adminGUI.setVisible(false);
            mw.getPnlContainer().setVisible(true);
        }

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
