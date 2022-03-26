/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class Attendant implements Serializable
{ 
    private String name;
    private int age;
    private int SeatLocation;
    private int PricePaid;
    public Attendant(String name, int age,int SeatLocation,int PricePaid){
    this.name=name;
    this.age=age;
    this.PricePaid=PricePaid;
    this.SeatLocation=SeatLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSeatLocation() {
        return SeatLocation;
    }

    public void setSeatLocation(int SeatLocation) {
        this.SeatLocation = SeatLocation;
    }

    public int getPricePaid() {
        return PricePaid;
    }

    public void setPricePaid(int PricePaid) {
        this.PricePaid = PricePaid;
    }
    
    
}
