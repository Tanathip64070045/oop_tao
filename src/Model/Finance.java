/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Finance implements Serializable{
    private double balance;
    private double totally;
    
    public Finance() {
        balance = 0;
        totally = 0;
    }
    
    public Finance(double balance, double totally) {
        this.balance = balance;
        this.totally = totally;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTotally() {
        return totally;
    }

    public void setTotally(double totally) {
        this.totally = totally;
    }
    
    
}
