package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import GUI.AdminUI.AdminGUI;
import GUI.AdminUI.AdminStock;
import GUI.Components.pnlBorder;
import GUI.EachDrink;
import GUI.MainWindow;
import GUI.Menu;
import GUI.MenuComponent.DrinkGUI;
import GUI.PaymentGUI.PaymentChangeWindow;
import GUI.PaymentGUI.PaymentInsertWindow;
import GUI.PaymentGUI.PaymentMainWindow;
import GUI.PaymentGUI.PaymentQrWindow;
import GUI.PaymentGUI.PaymentSuccess;
import Model.Card;
import Model.Finance;
import Model.Product;
import Model.Stock;
import Model.ViewModel;
import db.DBModel;
import internal.Login;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AppController implements ActionListener, WindowListener, MouseListener, Runnable, ComponentListener, KeyListener {

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
    private ImageIcon balaIcon = new ImageIcon(getClass().getResource("/GUI/icons/coins-solid 3.png"));
    private ImageIcon tIcon = new ImageIcon(getClass().getResource("/GUI/icons/Vector3.png"));
    private Thread tr;
    private DBModel db;
    private Product p;

    private double amountAndChange;

//    private double totally;
//    private double balance;
    @Override
    public void windowOpened(WindowEvent e) {
    }

    public static void main(String[] args) {
        new AppController();
    }

    public AppController() {
        db = new DBModel();
        mw = new MainWindow();
        login = new Login();
        menu = new Menu();
        p = new Product();

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

        db.loadFile();
        System.out.println("load");

        paymentsuccess.getButtonConfirm().addMouseListener(this);
        login.getBtnLogin().addActionListener(this);

        menu.getBackButton().addMouseListener(this);
        menu.getCatagoryGUI().getRecommendButton().addMouseListener(this);
        menu.getCatagoryGUI().getCoffeeButton().addMouseListener(this);
        menu.getCatagoryGUI().getTeaButton().addMouseListener(this);
        menu.getCatagoryGUI().getMilkAndCocoaButton().addMouseListener(this);
        menu.getCatagoryGUI().getJuiceButton().addMouseListener(this);
        menu.getCatagoryGUI().getSodaButton().addMouseListener(this);

        eachdrink.getBackButton().addMouseListener(this);
        eachdrink.getPurchasingButton().addMouseListener(this);
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton().addMouseListener(this);
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton().addMouseListener(this);
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Button().addMouseListener(this);
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Button().addMouseListener(this);
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Button().addMouseListener(this);
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton0().addMouseListener(this);
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton25().addMouseListener(this);
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton50().addMouseListener(this);
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton75().addMouseListener(this);
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton100().addMouseListener(this);
        eachdrink.getToppings().getToppingsButton().getBubbleButton().addMouseListener(this);
        eachdrink.getToppings().getToppingsButton().getWhipCreamButton().addMouseListener(this);
        eachdrink.getToppings().getToppingsButton().getMilkFoamButton().addMouseListener(this);
        eachdrink.getToppings().getToppingsButton().getOreoButton().addMouseListener(this);
        eachdrink.getToppings().getToppingsButton().getJellyButton().addMouseListener(this);
        eachdrink.getToppings().getToppingsButton().getYoghurtButton().addMouseListener(this);
        eachdrink.getToppings().getToppingsButton().getCookieButton().addMouseListener(this);
        eachdrink.getToppings().getToppingsButton().getSnackButton().addMouseListener(this);
        eachdrink.getToppings().getToppingsButton().getChocolateSauceButton().addMouseListener(this);

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
        paymentinsert.getTextInsert().addKeyListener(this);
        paymentinsert.addComponentListener(this);

        paymentchange.getButtonConfirm();
        paymentchange.getButtonConfirm().setEnabled(false);
        paymentchange.addComponentListener(this);

        paymentsuccess.getButtonConfirm();

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
        mw.getPnlContainer().addComponentListener(this);

        adminGUI.getAdminControl().getStock().addMouseListener(this);
        adminGUI.getNavbar().getBackButton().addMouseListener(this);
        adminGUI.getAdminControl().getBalance().setData(new Card(balaIcon, "  Balance.", "      " + db.getFinance().getBalance() + " ฿", "description"));
        adminGUI.getAdminControl().getTotally().setData(new Card(tIcon, "  Totally.", "      " + db.getFinance().getTotally() + " ฿", "description"));
        adminGUI.getAdminControl().getStock().sendData(new Stock(db.getProducts().size()));
    }

    private String fn;

    public void ChooseProduct(String category, pnlBorder btn) {
        mw.getPnlContainer().setVisible(false);
        menu.setVisible(true);
        menu.getPnlMenu().removeAll();
        menu.getPnlMenu().revalidate();
        menu.getPnlMenu().repaint();

        //resetScrollPane
        menu.getjScrollPane().getVerticalScrollBar().setValue(0);

        // Button
        menu.getCatagoryGUI().getRecommendButton().setBackground(Color.decode("#F6E6E6"));
        menu.getCatagoryGUI().getCoffeeButton().setBackground(Color.decode("#F6E6E6"));
        menu.getCatagoryGUI().getJuiceButton().setBackground(Color.decode("#F6E6E6"));
        menu.getCatagoryGUI().getSodaButton().setBackground(Color.decode("#F6E6E6"));
        menu.getCatagoryGUI().getMilkAndCocoaButton().setBackground(Color.decode("#F6E6E6"));
        menu.getCatagoryGUI().getTeaButton().setBackground(Color.decode("#F6E6E6"));
        btn.setBackground(Color.decode("#CC8484"));
//        btn.setLocation(btn.getX(), 500);
//        System.out.println(btn.getLocation());

        menu.invalidate();
        menu.validate();
        menu.repaint();

        tle.removeAll(tle);
        recomCategory.removeAll(recomCategory);
        popHm.clear();
        arr.removeAll(arr);
        count = 0;

//            adding product juice
        if (category.equals("Recommend")) {

            for (int i = 0; i < db.getProducts().size(); i++) {
                if (((Product) db.getProducts().get(i)).getPopulation() >= 1) {
                    popHm.put(((Product) db.getProducts().get(i)).getProductName(), ((Product) db.getProducts().get(i)).getPopulation());

                }

            }
            List<Map.Entry<String, Integer>> list = new LinkedList<>(popHm.entrySet());

            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return (o2.getValue()).compareTo(o1.getValue());
                }
            });

            Map<String, Integer> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<String, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

//            for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
//                System.out.print(entry.getKey() + " " + entry.getValue() + ", ");
//            }
            int check = 0;
            for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                if (check < 6) {
                    System.out.print(entry.getKey() + " " + entry.getValue() + ", ");
                    arr.add(entry.getKey());
                }
                check++;
            }

            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < db.getProducts().size(); j++) {
                    if (((Product) db.getProducts().get(j)).getProductName().equals(arr.get(i))) {
                        productss = new DrinkGUI(((Product) db.getProducts().get(j)).getProductName(), String.format("%.0f ฿", (((Product) db.getProducts().get(j)).getPrice())), new ImageIcon(getClass().getResource(String.format("/products/%s", ((Product) db.getProducts().get(j)).getImg()))));
                        recomCategory.add(((Product) db.getProducts().get(j)).getCategory());
                        tle.add(productss);
                        tle.get(count).addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                for (int n = 0; n < count; n++) {
                                    if (e.getSource().equals(tle.get(n))) {

                                        String[] substrings = tle.get(n).getImg().toString().split(",");
                                        System.out.println(tle.get(n).getImg().toString());
                                        //                                String fn;
                                        for (String substring : substrings) {
                                            if (substring.startsWith("defaultIcon=file:")) {
                                                String[] sub = substring.split("/");
                                                fn = sub[sub.length - 1];
                                                break;
                                            }
                                        }

                                        //                                    Choosing Product
                                        choose = new Product(0, tle.get(n).getProduct().getText(), Double.parseDouble(tle.get(n).getPrice().getText().replace(" ฿", "")), recomCategory.get(n), fn, 0);

                                        menu.setVisible(false);
                                        eachdrink.set(choose.getImg(), choose.getProductName(), choose.getCategory(), choose.getPrice());
                                        eachdrink.setVisible(true);
                                        eachdrink.invalidate();
                                        eachdrink.validate();
                                        eachdrink.repaint();

                                        //                                Insert Type of Product
                                        //                                ใช้ String category ที่รับมาคิดประเภทนะ ฝากด้วยคนที่ทำต่อจากฉัน
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().removeAll();
                                        eachdrink.getToppings().getToppingsButton().removeAll();
                                        ChooseSweetnessLevel(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton50(), eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText50());
                                        setChooseToppings();
                                        typeOfDrinkPrice = 0;
                                        if (choose.getCategory().equals("Coffee")) {
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton());
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Button());
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Button());

                                            ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotText());

                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getWhipCreamButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getMilkFoamButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getChocolateSauceButton());
                                        } else if (choose.getCategory().equals("Tea")) {
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton());
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Button());

                                            ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedText());

                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getBubbleButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getWhipCreamButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getJellyButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getYoghurtButton());
                                        } else if (choose.getCategory().equals("Milk & Coco")) {
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton());
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Button());
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Button());

                                            ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotText());

                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getBubbleButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getWhipCreamButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getOreoButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getCookieButton());
                                        } else if (choose.getCategory().equals("Juice")) {
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton());
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Button());

                                            ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedText());

                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getBubbleButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getWhipCreamButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getSnackButton());
                                        } else if (choose.getCategory().equals("Soda")) {
                                            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton());

                                            ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedText());

                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getBubbleButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getWhipCreamButton());
                                            eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getJellyButton());
                                        }
                                    }
                                }
                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                for (int n = 0; n < count; n++) {
                                    if (e.getSource().equals(tle.get(n))) {
                                        tle.get(n).setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
                                        tle.get(n).setBackground(Color.decode("#B09393"));
                                    }
                                }
                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                                for (int n = 0; n < count; n++) {
                                    if (e.getSource().equals(tle.get(n))) {
                                        tle.get(n).setBackground(Color.decode("#C59E7E"));
                                    }
                                }
                            }
                        });
                        menu.getPnlMenu().add(productss);
                        count++;
                    }
                }
            }

        } else {
            for (int index = 0; index < db.getProducts().size(); index++) {
                if (((Product) db.getProducts().get(index)).getCategory().equals(category)) {
                    productss = new DrinkGUI(((Product) db.getProducts().get(index)).getProductName(), String.format("%.0f ฿", (((Product) db.getProducts().get(index)).getPrice())), new ImageIcon(getClass().getResource(String.format("/products/%s", ((Product) db.getProducts().get(index)).getImg()))));

                    tle.add(productss);
                    tle.get(count).addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            for (int n = 0; n < count; n++) {
                                if (e.getSource().equals(tle.get(n))) {
                                    //                                System.err.println(tle.get(n).getProduct().getText());

                                    String[] substrings = tle.get(n).getImg().toString().split(",");
                                    System.out.println(tle.get(n).getImg().toString());
                                    //                                String fn;
                                    for (String substring : substrings) {
                                        if (substring.startsWith("defaultIcon=file:")) {
                                            String[] sub = substring.split("/");
                                            fn = sub[sub.length - 1];
                                            break;
                                        }
                                    }
                                    //                                    Choosing Product
                                    System.out.println(fn);
                                    choose = new Product(0, tle.get(n).getProduct().getText(), Double.parseDouble(tle.get(n).getPrice().getText().replace(" ฿", "")), category, fn, 0);

                                    //                                System.out.println(choose.getProductName()+" "+choose.getPrice()+" "+choose.getCategory()+" "+choose.getImg());
                                    menu.setVisible(false);
                                    eachdrink.set(choose.getImg(), choose.getProductName(), choose.getCategory(), choose.getPrice());
                                    eachdrink.setVisible(true);
                                    eachdrink.invalidate();
                                    eachdrink.validate();
                                    eachdrink.repaint();

                                    //                                Insert Type of Product
                                    //                                ใช้ String category ที่รับมาคิดประเภทนะ ฝากด้วยคนที่ทำต่อจากฉัน
                                    eachdrink.getTypeOfDrink().getTypeOfDrinkButton().removeAll();
                                    eachdrink.getToppings().getToppingsButton().removeAll();
                                    ChooseSweetnessLevel(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton50(), eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText50());
                                    setChooseToppings();
                                    typeOfDrinkPrice = 0;

                                    //                                System.out.println(choose.getCategory());
                                    if (choose.getCategory().equals("Coffee")) {
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton());
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Button());
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Button());

                                        ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotText());

                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getWhipCreamButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getMilkFoamButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getChocolateSauceButton());
                                    } else if (choose.getCategory().equals("Tea")) {
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton());
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Button());

                                        ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedText());

                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getBubbleButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getWhipCreamButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getJellyButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getYoghurtButton());
                                    } else if (choose.getCategory().equals("Milk & Coco")) {
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton());
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Button());
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Button());

                                        ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotText());

                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getBubbleButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getWhipCreamButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getOreoButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getCookieButton());
                                    } else if (choose.getCategory().equals("Juice")) {
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton());
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Button());

                                        ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedText());

                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getBubbleButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getWhipCreamButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getSnackButton());
                                    } else if (choose.getCategory().equals("Soda")) {
                                        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().add(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton());

                                        ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedText());

                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getBubbleButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getWhipCreamButton());
                                        eachdrink.getToppings().getToppingsButton().add(eachdrink.getToppings().getToppingsButton().getJellyButton());
                                    }
                                }
                            }
                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {
                            for (int n = 0; n < count; n++) {
                                if (e.getSource().equals(tle.get(n))) {
                                    tle.get(n).setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
                                    tle.get(n).setBackground(Color.decode("#B09393"));
                                }
                            }
                        }

                        @Override
                        public void mouseExited(MouseEvent e) {
                            for (int n = 0; n < count; n++) {
                                if (e.getSource().equals(tle.get(n))) {
                                    tle.get(n).setBackground(Color.decode("#C59E7E"));
                                }
                            }
                        }
                    });
                    menu.getPnlMenu().add(productss);
                    count++;
                }
            }
        }
        menu.getPnlMenu().setPreferredSize(new Dimension(720, (int) (Math.ceil(((double) count) / 3.0) * 280)));
//        System.out.println(menu.getPnlMenu().getPreferredSize());
    }

    public static ImageIcon FileImgtoImageIcon(String file_name) {
//        set image size
        int width = 81;
        int height = 62;
        try {
            BufferedImage image = ImageIO.read(new File(file_name));
            ImageIcon imageIcon = new ImageIcon(image);
            Image newimg = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(newimg);
            return imageIcon;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    int index;

    public void ChooseTypeOfDrink(pnlBorder btn, JLabel text) {
        eachdrink.getPurchasingButton().getPriceText().setText(String.format("Purchasing | %.2f ฿", choose.getPrice() + typeOfDrinkPrice + toppingsPrice));

        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton().setBackground(Color.decode("#906F76"));
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotText().setForeground(Color.decode("#FFFFFF"));
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton().setBackground(Color.decode("#906F76"));
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedText().setForeground(Color.decode("#FFFFFF"));
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Button().setBackground(Color.decode("#906F76"));
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Text().setForeground(Color.decode("#FFFFFF"));
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Button().setBackground(Color.decode("#906F76"));
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Text().setForeground(Color.decode("#FFFFFF"));
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Button().setBackground(Color.decode("#906F76"));
        eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Text().setForeground(Color.decode("#FFFFFF"));

        btn.setBackground(Color.decode("#F6E6E6"));
        text.setForeground(Color.decode("#000000"));

        eachdrink.invalidate();
        eachdrink.validate();
        eachdrink.repaint();

    }

    public void ChooseSweetnessLevel(pnlBorder btn, JLabel text) {
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton0().setBackground(Color.decode("#906F76"));
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText0().setForeground(Color.decode("#FFFFFF"));
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton25().setBackground(Color.decode("#906F76"));
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText25().setForeground(Color.decode("#FFFFFF"));
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton50().setBackground(Color.decode("#906F76"));
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText50().setForeground(Color.decode("#FFFFFF"));
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton75().setBackground(Color.decode("#906F76"));
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText75().setForeground(Color.decode("#FFFFFF"));
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton100().setBackground(Color.decode("#906F76"));
        eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText100().setForeground(Color.decode("#FFFFFF"));

        btn.setBackground(Color.decode("#F6E6E6"));
        text.setForeground(Color.decode("#000000"));

        eachdrink.invalidate();
        eachdrink.validate();
        eachdrink.repaint();

    }

    public boolean ChooseToppings(boolean isTopping, pnlBorder btn, JLabel text) {
        if (isTopping) {
            btn.setBackground(Color.decode("#906F76"));
            text.setForeground(Color.decode("#FFFFFF"));
            toppingsPrice -= 5;
            isTopping = false;
        } else {
            btn.setBackground(Color.decode("#F6E6E6"));
            text.setForeground(Color.decode("#000000"));
            toppingsPrice += 5;
            isTopping = true;
        }

        eachdrink.getPurchasingButton().getPriceText().setText(String.format("Purchasing | %.2f ฿", choose.getPrice() + typeOfDrinkPrice + toppingsPrice));

        eachdrink.invalidate();
        eachdrink.validate();
        eachdrink.repaint();
        return isTopping;
    }

    public boolean ChooseToppings(pnlBorder btn, JLabel text) {
        btn.setBackground(Color.decode("#906F76"));
        text.setForeground(Color.decode("#FFFFFF"));
        return false;
    }

    public void setChooseToppings() {
        isBubble = ChooseToppings(eachdrink.getToppings().getToppingsButton().getBubbleButton(), eachdrink.getToppings().getToppingsButton().getBubbleText());
        isWhipCream = ChooseToppings(eachdrink.getToppings().getToppingsButton().getWhipCreamButton(), eachdrink.getToppings().getToppingsButton().getWhipCreamText());
        isMilkFoam = ChooseToppings(eachdrink.getToppings().getToppingsButton().getMilkFoamButton(), eachdrink.getToppings().getToppingsButton().getMilkFoamText());
        isOreo = ChooseToppings(eachdrink.getToppings().getToppingsButton().getOreoButton(), eachdrink.getToppings().getToppingsButton().getOreoText());
        isJelly = ChooseToppings(eachdrink.getToppings().getToppingsButton().getJellyButton(), eachdrink.getToppings().getToppingsButton().getJellyText());
        isYoghurt = ChooseToppings(eachdrink.getToppings().getToppingsButton().getYoghurtButton(), eachdrink.getToppings().getToppingsButton().getYoghurtText());
        isCookie = ChooseToppings(eachdrink.getToppings().getToppingsButton().getCookieButton(), eachdrink.getToppings().getToppingsButton().getCookieText());
        isSnack = ChooseToppings(eachdrink.getToppings().getToppingsButton().getSnackButton(), eachdrink.getToppings().getToppingsButton().getSnackText());
        isChocolateSauce = ChooseToppings(eachdrink.getToppings().getToppingsButton().getChocolateSauceButton(), eachdrink.getToppings().getToppingsButton().getChocolateSauceText());
        toppingsPrice = 0;
    }

    @Override

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(stock.getAdminProducts().getBtnAdd())) {
            try {
                stock.getAdminProducts().getTable().removeAll();
                index = db.getIndex();
                index++;
//                System.out.println(index);
                p = new Product(index, stock.getAdminProducts().getTfName().getText(), Double.parseDouble(stock.getAdminProducts().getTfPrice().getText()), stock.getAdminProducts().getCategory().getSelectedItem().toString(), fName, 0);

                db.addProduct(p);
                Object[] data = {index, fName, stock.getAdminProducts().getTfName().getText(), Double.parseDouble(stock.getAdminProducts().getTfPrice().getText()), stock.getAdminProducts().getCategory().getSelectedItem().toString(), new JButton("Delete")};

                stock.getAdminProducts().getTable().getTableModel().addRow(data);
                stock.getAdminProducts().getTable().getTableModel().fireTableDataChanged();
                stock.getAdminProducts().getTable().repaint();

                saveFile(sourceFile, destinationFile);

                db.saveFile();
                adminGUI.getAdminControl().getStock().sendData(new Stock(db.getProducts().size()));

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

//            ((Product) db.getProducts().get(i)).setProductName(stock.getAdminProducts().getTfName().getText());
            db.saveFile();
            adminGUI.getAdminControl().getStock().sendData(new Stock(db.getProducts().size()));

//                JOptionPane.showMessageDialog(null,"Update Data.", "Updating", JOptionPane.PLAIN_MESSAGE);
        } else if (ae.getSource().equals(stock.getAdminProducts().getBtnDelete())) {
            int i = stock.getAdminProducts().getTable().getSelectedRow();
            if (i >= 0) {
                db.removeProducts(stock.getAdminProducts().getTable().getSelectedRow());
                stock.getAdminProducts().getTable().getTableModel().removeRow(i);

                db.saveFile();
                adminGUI.getAdminControl().getStock().sendData(new Stock(db.getProducts().size()));

//                    JOptionPane.showMessageDialog(null,"Remove Data.", "Removing", JOptionPane.PLAIN_MESSAGE);
            }
        }
        if (ae.getSource().equals(login.getBtnLogin())) {

            // login
            if (login.getTfUsername().getText().equals("madara") && login.getjPasswordField1().getText().equals("55555")) {
                mw.getPnlContainer().setVisible(false);
                login.setVisible(false);
                adminGUI.setVisible(true);

            } else if (login.getTfUsername().getText().equals("madara")) {
                JOptionPane jp = new JOptionPane();
                jp.showMessageDialog(null, "Wrong Password", "Worng Password", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane jp = new JOptionPane();
                jp.showMessageDialog(null, "Wrong Username", "Worng Username", JOptionPane.ERROR_MESSAGE);
            }

            adminGUI.getAdminControl().getTable().getTableModel().setRowCount(0);
            for (int i = 0; i < db.getProducts().size(); i++) {
//                    fecth data
                int population = ((Product) (db.getProducts().get(i))).getPopulation();
                String img = ((Product) (db.getProducts().get(i))).getImg();
                String productName = ((Product) (db.getProducts().get(i))).getProductName();
                String category = ((Product) (db.getProducts().get(i))).getCategory();

                Object[] data = {population, img, productName, category};
                adminGUI.getAdminControl().getTable().getTableModel().addRow(data);
            }

            adminGUI.getAdminControl().getStock().sendData(new Stock(db.getProducts().size()));
//            }
//            

        }
    }

//    File Image Saving...
    private String fName = "";
    File sourceFile = null;
    File destinationFile = null;

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource().equals(stock.getAdminProducts().getBtnImage())) {
            JFileChooser fc = new JFileChooser();
            FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
            fc.addChoosableFileFilter(imageFilter);
            fc.setAcceptAllFileFilterUsed(false);
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                Path p = Paths.get(f.getAbsolutePath());
                stock.getAdminProducts().getLblFile().setText(shorten(p.getFileName().toString(), 20));
                fName = p.getFileName().toString();
//                    view.setfName(fName);

                String fileName = p.toString();
                String fileNameOutput = p.getFileName().toString().replaceFirst("[.][^.]+$", "");
                String newPath = "src/products";
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
        db.getFinance().setBalance(0);
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

    public void updatelog() {
        choose.setPrice(choose.getPrice() + typeOfDrinkPrice + toppingsPrice);

//        balance += choose.getPrice();
//        totally = balance + totally;
        db.getFinance().setBalance(db.getFinance().getBalance() + choose.getPrice());
        db.getFinance().setTotally(db.getFinance().getTotally() + db.getFinance().getBalance());

        System.out.println("today " + db.getFinance().getBalance() + ", totally " + db.getFinance().getTotally());

        adminGUI.getAdminControl().getBalance().getLblValue().setText("      " + db.getFinance().getBalance() + " ฿");
        adminGUI.getAdminControl().getTotally().getLblValue().setText("      " + db.getFinance().getTotally() + " ฿");
        adminGUI.getAdminControl().getStock().sendData(new Stock(db.getProducts().size()));

        for (int i = 0; i < db.getProducts().size(); i++) {
            if (((Product) db.getProducts().get(i)).getProductName().equals(choose.getProductName())) {
                System.out.println(String.format("[Purchased!] ID : %s Product : %s Price : %.2f Category : %s Population : %d", ((Product) db.getProducts().get(i)).getId(), ((Product) db.getProducts().get(i)).getProductName(),
                        choose.getPrice(), ((Product) db.getProducts().get(i)).getCategory(), ((Product) db.getProducts().get(i)).getPopulation()));

                ((Product) db.getProducts().get(i)).setPopulation(1);
            }
        }
    }

    private ViewModel view = new ViewModel();
    private BufferedImage img;
    DrinkGUI productss;
    ArrayList<DrinkGUI> tle = new ArrayList<DrinkGUI>();
    ArrayList<String> recomCategory = new ArrayList<String>();
    HashMap popHm = new HashMap();
    ArrayList<String> arr = new <String> ArrayList();

    int count = 0;

    Product choose;

    int typeOfDrinkPrice, toppingsPrice = 0;
    boolean isBubble, isWhipCream, isMilkFoam, isOreo, isJelly, isYoghurt, isCookie, isSnack, isChocolateSauce = false;

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

        if (e.getSource().equals(mw.getPnlRecommend()) || e.getSource().equals(menu.getCatagoryGUI().getRecommendButton())) {
            ChooseProduct("Recommend", menu.getCatagoryGUI().getRecommendButton());

        } else if (e.getSource().equals(mw.getPnlCoffee()) || e.getSource().equals(menu.getCatagoryGUI().getCoffeeButton())) {
            ChooseProduct("Coffee", menu.getCatagoryGUI().getCoffeeButton());

//            menu.getCatagoryGUI().getCoffeeButton().setBackground(Color.decode("#CC8484"));
        } else if (e.getSource().equals(mw.getPnlTea()) || e.getSource().equals(menu.getCatagoryGUI().getTeaButton())) {
            ChooseProduct("Tea", menu.getCatagoryGUI().getTeaButton());
        } else if (e.getSource().equals(mw.getPnlMilk()) || e.getSource().equals(menu.getCatagoryGUI().getMilkAndCocoaButton())) {
            ChooseProduct("Milk & Coco", menu.getCatagoryGUI().getMilkAndCocoaButton());
        } else if (e.getSource().equals(mw.getPnlJuice()) || e.getSource().equals(menu.getCatagoryGUI().getJuiceButton())) {
            ChooseProduct("Juice", menu.getCatagoryGUI().getJuiceButton());

        } else if (e.getSource().equals(mw.getPnlSoda()) || e.getSource().equals(menu.getCatagoryGUI().getSodaButton())) {
            ChooseProduct("Soda", menu.getCatagoryGUI().getSodaButton());
        }

        if (e.getSource().equals(menu.getBackButton())) {
            menu.setVisible(false);
            mw.getPnlContainer().setVisible(true);
        }

        //Catagory GUI
        if (e.getSource().equals(eachdrink.getBackButton())) {
            eachdrink.setVisible(false);
            menu.setVisible(true);
        } else if (e.getSource().equals(eachdrink.getPurchasingButton())) {
//            Buying after EachDrink
            eachdrink.setVisible(false);
            paymentmain.setVisible(true);

            paymentmain.getProductImg().setIcon(new ImageIcon(getClass().getResource(String.format("/products/%s", choose.getImg()))));
            paymentmain.getProductName().setText(choose.getProductName());
            paymentmain.getProductValue().setText(String.format("%.2f ฿", choose.getPrice() + typeOfDrinkPrice + toppingsPrice));
        } else if (e.getSource().equals(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton())) {
            typeOfDrinkPrice = 0;
            ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotText());
            System.out.println("Hot");
        } else if (e.getSource().equals(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton())) {
            typeOfDrinkPrice = 0;
            ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedText());
            System.out.println("Iced");
        } else if (e.getSource().equals(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Button())) {
            typeOfDrinkPrice = 5;
            ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Button(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Text());
            System.out.println("Iced");
        } else if (e.getSource().equals(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Button())) {
            typeOfDrinkPrice = 5;
            ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Button(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Text());
            System.out.println("Smoothie");
        } else if (e.getSource().equals(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Button())) {
            typeOfDrinkPrice = 10;
            ChooseTypeOfDrink(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Button(), eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Text());
            System.out.println("Smoothie");
        } else if (e.getSource().equals(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton0())) {
            ChooseSweetnessLevel(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton0(), eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText0());
            System.out.println("SweetnessLevel 0%");
        } else if (e.getSource().equals(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton25())) {
            ChooseSweetnessLevel(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton25(), eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText25());
            System.out.println("SweetnessLevel 25%");
        } else if (e.getSource().equals(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton50())) {
            ChooseSweetnessLevel(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton50(), eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText50());
            System.out.println("SweetnessLevel 50%");
        } else if (e.getSource().equals(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton75())) {
            ChooseSweetnessLevel(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton75(), eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText75());
            System.out.println("SweetnessLevel 75%");
        } else if (e.getSource().equals(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton100())) {
            ChooseSweetnessLevel(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton100(), eachdrink.getSweetnessLevel().getSweetnessLevelButton().getText100());
            System.out.println("SweetnessLevel 100%");
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getBubbleButton())) {
            isBubble = ChooseToppings(isBubble, eachdrink.getToppings().getToppingsButton().getBubbleButton(), eachdrink.getToppings().getToppingsButton().getBubbleText());
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getWhipCreamButton())) {
            isWhipCream = ChooseToppings(isWhipCream, eachdrink.getToppings().getToppingsButton().getWhipCreamButton(), eachdrink.getToppings().getToppingsButton().getWhipCreamText());
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getMilkFoamButton())) {
            isMilkFoam = ChooseToppings(isMilkFoam, eachdrink.getToppings().getToppingsButton().getMilkFoamButton(), eachdrink.getToppings().getToppingsButton().getMilkFoamText());
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getOreoButton())) {
            isOreo = ChooseToppings(isOreo, eachdrink.getToppings().getToppingsButton().getOreoButton(), eachdrink.getToppings().getToppingsButton().getOreoText());
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getJellyButton())) {
            isJelly = ChooseToppings(isJelly, eachdrink.getToppings().getToppingsButton().getJellyButton(), eachdrink.getToppings().getToppingsButton().getJellyText());
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getYoghurtButton())) {
            isYoghurt = ChooseToppings(isYoghurt, eachdrink.getToppings().getToppingsButton().getYoghurtButton(), eachdrink.getToppings().getToppingsButton().getYoghurtText());
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getCookieButton())) {
            isCookie = ChooseToppings(isCookie, eachdrink.getToppings().getToppingsButton().getCookieButton(), eachdrink.getToppings().getToppingsButton().getCookieText());
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getSnackButton())) {
            isSnack = ChooseToppings(isSnack, eachdrink.getToppings().getToppingsButton().getSnackButton(), eachdrink.getToppings().getToppingsButton().getSnackText());
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getChocolateSauceButton())) {
            isChocolateSauce = ChooseToppings(isChocolateSauce, eachdrink.getToppings().getToppingsButton().getChocolateSauceButton(), eachdrink.getToppings().getToppingsButton().getChocolateSauceText());
        }

        if (e.getSource().equals(paymentmain.getBackButton()) || e.getSource().equals(paymentmain.getButtonCancel())) {
            paymentmain.setVisible(false);
            eachdrink.setVisible(true);
        } else if (e.getSource().equals(paymentmain.getButtonCash())) {
            paymentmain.setVisible(false);
            paymentinsert.setVisible(true);

            paymentinsert.getTotal().setText(String.format("Tolal : %.2f Baht", choose.getPrice() + typeOfDrinkPrice + toppingsPrice));

            if ((Integer.parseInt(paymentinsert.getTextInsert().getText()) < (choose.getPrice() + typeOfDrinkPrice + toppingsPrice))) {
                JOptionPane.showMessageDialog(null, "Not Enough.", "Error", JOptionPane.PLAIN_MESSAGE);
            }

        } else if (e.getSource().equals(paymentmain.getButtonQrCode()) || e.getSource().equals(paymentmain.getButtonTrue())) {
            paymentmain.setVisible(false);
            paymentqr.setVisible(true);
        }

        if (e.getSource().equals(paymentqr.getBackButton()) || e.getSource().equals(paymentqr.getButtonCancel())) {
            paymentqr.setVisible(false);
            paymentmain.setVisible(true);
        } else if (e.getSource().equals(paymentqr.getButtonConfirm())) {
//            Sucess Payment
            updatelog();

            paymentqr.setVisible(false);
            paymentsuccess.setVisible(true);
        }

        if (e.getSource().equals(paymentinsert.getBackButton()) || e.getSource().equals(paymentinsert.getButtonCancel())) {
            paymentinsert.setVisible(false);
            paymentmain.setVisible(true);

            //paymentChange
        }
        if (e.getSource().equals(paymentinsert.getButtonConfirm())) {
            try {
                if ((Integer.parseInt(paymentinsert.getTextInsert().getText()) < (choose.getPrice() + typeOfDrinkPrice + toppingsPrice))) {
                    JOptionPane.showMessageDialog(null, "Not Enough.", "Error", JOptionPane.PLAIN_MESSAGE);
                } else {
                    paymentinsert.setVisible(false);
                    paymentchange.getButtonConfirm().setVisible(false);
                    paymentchange.setVisible(true);

                    paymentchange.getReceived().setText("Received amount : " + (Double.toString(choose.getPrice() + typeOfDrinkPrice + toppingsPrice)) + " Baht");
                    amountAndChange = (Double.parseDouble(paymentinsert.getTextInsert().getText())) - (choose.getPrice() + typeOfDrinkPrice + toppingsPrice);
                    paymentchange.getChange().setText(("Change : " + amountAndChange + " Baht"));
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please Fill.", "Error", JOptionPane.PLAIN_MESSAGE);
            }

        }

        if (e.getSource().equals(paymentchange.getButtonConfirm())) {
//            Sucess Payment
            updatelog();

            paymentchange.setVisible(false);
            paymentsuccess.setVisible(true);

            paymentchange.getButtonConfirm().setBackground(new Color(246, 230, 230));

            paymentchange.getButtonConfirm().setEnabled(false);

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

    public void hoverButton(pnlBorder btn, String crHover, String crOrigin) {
        btn.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        btn.setBackground(Color.decode(crHover));
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                notHoverButton(btn, crOrigin);
            }
        });
    }

    public void notHoverButton(pnlBorder btn, String color) {
        btn.setBackground(Color.decode(color));
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if (e.getSource().equals(adminGUI.getAdminControl().getStock())) {
            adminGUI.getAdminControl().getStock().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        }

        if (e.getSource().equals(mw.getPnlLogin())) {
            hoverButton(mw.getPnlLogin(), "#FFFFFF", "#F6E6E6");
        }

        if (e.getSource().equals(mw.getPnlRecommend())) {
            hoverButton(mw.getPnlRecommend(), "#F6E6E6", "#C59E7E");

        } else if (e.getSource().equals(mw.getPnlCoffee())) {
            hoverButton(mw.getPnlCoffee(), "#F6E6E6", "#C59E7E");
        } else if (e.getSource().equals(mw.getPnlTea())) {
            hoverButton(mw.getPnlTea(), "#F6E6E6", "#C59E7E");
        } else if (e.getSource().equals(mw.getPnlMilk())) {
            hoverButton(mw.getPnlMilk(), "#F6E6E6", "#C59E7E");
        } else if (e.getSource().equals(mw.getPnlJuice())) {
            hoverButton(mw.getPnlJuice(), "#F6E6E6", "#C59E7E");
        } else if (e.getSource().equals(mw.getPnlSoda())) {
            hoverButton(mw.getPnlSoda(), "#F6E6E6", "#C59E7E");
        }

        if (e.getSource().equals(menu.getCatagoryGUI().getRecommendButton())) {
            menu.getCatagoryGUI().getRecommendButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(menu.getCatagoryGUI().getCoffeeButton())) {
            menu.getCatagoryGUI().getCoffeeButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(menu.getCatagoryGUI().getTeaButton())) {
            menu.getCatagoryGUI().getTeaButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(menu.getCatagoryGUI().getMilkAndCocoaButton())) {
            menu.getCatagoryGUI().getMilkAndCocoaButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(menu.getCatagoryGUI().getJuiceButton())) {
            menu.getCatagoryGUI().getJuiceButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));

        } else if (e.getSource().equals(menu.getCatagoryGUI().getSodaButton())) {
            menu.getCatagoryGUI().getSodaButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        }

        if (e.getSource().equals(menu.getBackButton())) {
            menu.getBackButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        }

        //Catagory GUI
        if (e.getSource().equals(eachdrink.getBackButton())) {
            eachdrink.getBackButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));

        } else if (e.getSource().equals(eachdrink.getPurchasingButton())) {
            eachdrink.getPurchasingButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));

        } else if (e.getSource().equals(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton())) {
            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getHotButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton())) {
            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIcedButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Button())) {
            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getIced5Button().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Button())) {
            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie5Button().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Button())) {
            eachdrink.getTypeOfDrink().getTypeOfDrinkButton().getSmoothie10Button().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton0())) {
            eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton0().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton25())) {
            eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton25().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton50())) {
            eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton50().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton75())) {
            eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton75().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton100())) {
            eachdrink.getSweetnessLevel().getSweetnessLevelButton().getButton100().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getBubbleButton())) {
            eachdrink.getToppings().getToppingsButton().getBubbleButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getWhipCreamButton())) {
            eachdrink.getToppings().getToppingsButton().getWhipCreamButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getMilkFoamButton())) {
            eachdrink.getToppings().getToppingsButton().getMilkFoamButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getOreoButton())) {
            eachdrink.getToppings().getToppingsButton().getOreoButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getJellyButton())) {
            eachdrink.getToppings().getToppingsButton().getJellyButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getYoghurtButton())) {
            eachdrink.getToppings().getToppingsButton().getYoghurtButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getCookieButton())) {
            eachdrink.getToppings().getToppingsButton().getCookieButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getSnackButton())) {
            eachdrink.getToppings().getToppingsButton().getSnackButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(eachdrink.getToppings().getToppingsButton().getChocolateSauceButton())) {
            eachdrink.getToppings().getToppingsButton().getChocolateSauceButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        }

        if (e.getSource().equals(paymentmain.getBackButton())) {
            paymentmain.getBackButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        } else if (e.getSource().equals(paymentmain.getButtonCash())) {
            paymentmain.getButtonCash().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
            paymentmain.getButtonCash().setBackground(Color.decode("#7B6565"));

            paymentmain.getButtonCash().addMouseListener(new MouseAdapter() {

                @Override
                public void mouseExited(MouseEvent e) {
                    paymentmain.getButtonCash().setBackground(Color.decode("#564747"));
                    paymentmain.getButtonCash().getjLabel1().setForeground(Color.decode("#564747"));
                }
            });

        } else if (e.getSource().equals(paymentmain.getButtonQrCode())) {
            paymentmain.getButtonQrCode().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
            paymentmain.getButtonQrCode().setBackground(Color.decode("#7B6565"));

            paymentmain.getButtonQrCode().addMouseListener(new MouseAdapter() {

                @Override
                public void mouseExited(MouseEvent e) {
                    paymentmain.getButtonQrCode().setBackground(Color.decode("#564747"));

                }
            });
        } else if (e.getSource().equals(paymentmain.getButtonCancel())) {
            paymentmain.getButtonCancel().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
            paymentmain.getButtonCancel().setBackground(Color.decode("#9F5151"));

            paymentmain.getButtonCancel().addMouseListener(new MouseAdapter() {

                @Override
                public void mouseExited(MouseEvent e) {
                    paymentmain.getButtonCancel().setBackground(Color.decode("#A32B2B"));

                }
            });
        } else if (e.getSource().equals(paymentmain.getButtonTrue())) {
            paymentmain.getButtonTrue().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
            paymentmain.getButtonTrue().setBackground(Color.decode("#7B6565"));

            paymentmain.getButtonTrue().addMouseListener(new MouseAdapter() {

                @Override
                public void mouseExited(MouseEvent e) {
                    paymentmain.getButtonTrue().setBackground(Color.decode("#564747"));

                }
            });
        }

        if (e.getSource().equals(paymentqr.getBackButton())) {
            paymentqr.getBackButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));

        }
        if (e.getSource().equals(paymentqr.getButtonCancel())) {
            paymentqr.getButtonCancel().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
            paymentqr.getButtonCancel().setBackground(Color.decode("#9F5151"));

            paymentqr.getButtonCancel().addMouseListener(new MouseAdapter() {

                @Override
                public void mouseExited(MouseEvent e) {
                    paymentqr.getButtonCancel().setBackground(Color.decode("#A32B2B"));

                }
            });

        }
        if (e.getSource().equals(paymentqr.getButtonConfirm())) {
            paymentqr.getButtonConfirm().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
            paymentqr.getButtonConfirm().setBackground(Color.decode("#DAC1AC"));

            paymentqr.getButtonConfirm().addMouseListener(new MouseAdapter() {

                @Override
                public void mouseExited(MouseEvent e) {
                    paymentqr.getButtonConfirm().setBackground(Color.decode("#C59E7E"));

                }
            });
        }

        if (e.getSource().equals(paymentinsert.getBackButton())) {
            paymentinsert.getBackButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        }
        if (e.getSource().equals(paymentinsert.getButtonCancel())) {
            paymentinsert.getButtonCancel().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
            paymentinsert.getButtonCancel().setBackground(Color.decode("#9F5151"));

            paymentinsert.getButtonCancel().addMouseListener(new MouseAdapter() {

                @Override
                public void mouseExited(MouseEvent e) {
                    paymentinsert.getButtonCancel().setBackground(Color.decode("#A32B2B"));

                }
            });
        }
        if (e.getSource().equals(paymentinsert.getButtonConfirm())) {
            paymentinsert.getButtonConfirm().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
            paymentinsert.getButtonConfirm().setBackground(Color.decode("#DAC1AC"));

            paymentinsert.getButtonConfirm().addMouseListener(new MouseAdapter() {

                @Override
                public void mouseExited(MouseEvent e) {
                    paymentinsert.getButtonConfirm().setBackground(Color.decode("#C59E7E"));

                }
            });
        }

        if (e.getSource().equals(paymentchange.getButtonConfirm())) {
            paymentchange.getButtonConfirm().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
            paymentchange.getButtonConfirm().setBackground(Color.decode("#DAC1AC"));

            paymentchange.getButtonConfirm().addMouseListener(new MouseAdapter() {

                @Override
                public void mouseExited(MouseEvent e) {
                    paymentchange.getButtonConfirm().setBackground(Color.decode("#C59E7E"));

                }
            });
        }

        if (e.getSource().equals(paymentsuccess.getButtonConfirm())) {
            paymentsuccess.getButtonConfirm().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
            paymentsuccess.getButtonConfirm().setBackground(Color.decode("#DAC1AC"));

            paymentsuccess.getButtonConfirm().addMouseListener(new MouseAdapter() {

                @Override
                public void mouseExited(MouseEvent e) {
                    paymentsuccess.getButtonConfirm().setBackground(Color.decode("#C59E7E"));

                }
            });
        }

        if (e.getSource().equals(adminGUI.getNavbar().getBackButton())) {
            adminGUI.getNavbar().getBackButton().setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {
    }

    @Override
    public void componentResized(ComponentEvent e) {

    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

        if (e.getSource().equals(paymentchange)) {
            try {
                for (int i = 5; i >= 0; i--) {
                    paymentchange.getLabel3().setText("The machine is about to change money in " + i);
                    tr.sleep(1000);
                }
                paymentchange.getLabel3().setText("please click countinue...");
                paymentchange.getButtonConfirm().setBackground(new Color(197, 158, 126));
                paymentchange.getButtonConfirm().addMouseListener(this);
                paymentchange.getButtonConfirm().setEnabled(true);
                paymentchange.getButtonConfirm().setVisible(true);

            } catch (Exception ea) {
                System.out.println(ea);
            }
        }
        if (e.getSource().equals(paymentinsert)) {
            paymentinsert.getTextInsert().setText("");
        }

        if (e.getSource().equals(mw.getPnlContainer())) {
            login.setVisible(false);
        }
    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource().equals(paymentinsert.getTextInsert())) {
            char c = e.getKeyChar();
            if (!((c >= '0') && (c <= '9')
                    || (c == KeyEvent.VK_BACK_SPACE)
                    || (c == KeyEvent.VK_DELETE))) {
                paymentinsert.getToolkit().beep();
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
