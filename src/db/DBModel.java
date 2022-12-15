package db;

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
    
    public DBModel(){
    }
    public  void removeProducts(int id) {
        products.remove(id);
        System.out.println("remove index : "+ id);
    }
    public void setProducts(ArrayList products) { 
        this.products = products;
        System.out.println("set array");
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
       return index;
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
                System.out.println("Loading. . .");
            }catch(Exception e){
                System.out.print(e);
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public boolean saveFile() {
        try ( FileOutputStream fOut = new FileOutputStream("database.dat");  ObjectOutputStream oout = new ObjectOutputStream(fOut);) {

            oout.writeObject(this.products);
            System.out.println(products);

            return true;
        } catch (Exception i) {
            return false;
        }
    }
}
