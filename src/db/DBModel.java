package db;

import Model.Finance;
import Model.Product;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;

public class DBModel {
    Product product = new Product();
    public int index;
    private ArrayList products = new ArrayList ();
    Finance finance = new Finance();
    
    
    public DBModel(){
            
    }
    public  void removeProducts(int id) {
        products.remove(id);
        System.out.println("remove index : "+ id);
    }
    public void setProducts(ArrayList products) { 
        this.products = products;
    }
    public void addProduct(Product p){
        if(!products.contains(p)){
            index++;
            products.add(p);
            System.out.println("Adding Product. index : " + index);
            System.err.println(getProducts());
        }
    }
    public int getIndex(){
        if(products != null){
            return products.size();
        } else {
            return index;
        }
    }
    
    public ArrayList getProducts(){
        return products;
    }
    public String getCategory(){
        return product.getCategory();
    }
    public int getNewId(){
        return products.size()+1;
    }
    public void loadFile(){
        try(FileInputStream fin = new FileInputStream("database.dat");
            ObjectInputStream in = new ObjectInputStream(fin);){
            
            try{
                setProducts((ArrayList <Product>) in.readObject());
                finance = ((Finance) in.readObject());
                System.out.println("(LOAD) Balance : " + finance.getBalance() + ", Totally : " + finance.getTotally());
            }catch(Exception e){
                System.out.print(e);
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public boolean saveFile() {
        try ( FileOutputStream fOut = new FileOutputStream("database.dat");  
                ObjectOutputStream oout = new ObjectOutputStream(fOut);) {

            oout.writeObject(products);
            oout.writeObject(finance);
            System.out.println("(SAVE) Balance : " + finance.getBalance() + ", Totally : " + finance.getTotally());

            return true;
        } catch (Exception i) {
            return false;
        }
    }

    public Finance getFinance() {
        return finance;
    }

    public void setFinance(Finance finance) {
        this.finance = finance;
    }
    
}
