package com.example.android.projectfanta;

import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserInfo extends User {

    private String name;
    private String gender; // "f" for female, "m" for male
    private int weight;
    private int height;
    private int age;
    private int pa;
    private double recCalories;
    private double recCarbs;
    private double recProtein;
    private double recSugars;
    private double recSodium;
    private double recFiber;
    private double recPotassium;
    private double recCholesterol;
    private double recFat;


    public UserInfo(){
        super();
    }

    public UserInfo(String id, String uname, String g, int w, int h, int a) {
        super(id, uname);
        weight = w;
        height = h;
        age = a;
        gender = g;
        // we should add the logic for set nutrional values to defulats resetNutrionalValues

    }


    /**
     *
     * @return
     */
    public void resetNutrionalValues(){
        // perform the reset here
    }


    public int getAge() { return age; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public void setHeight(int height) { this.height = height; }

    public void setWeight(int weight) { this.weight = weight; }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public int getPa() { return pa; }

    public void setPa(int pa) { this.pa = pa; }

    public double getRecCalories() { return recCalories; }

    public void setRecCalories(double recCalories) { this.recCalories = recCalories; }

    public double getRecCarbs() { return recCarbs; }

    public void setRecCarbs(double recCarbs) { this.recCarbs = recCarbs; }

    public double getRecProtein() { return recProtein; }

    public void setRecProtein(double recProtein) { this.recProtein = recProtein; }

    public double getRecSugars() { return recSugars; }

    public void setRecSugars(double recSugars) { this.recSugars = recSugars; }

    public double getRecSodium() { return recSodium; }

    public void setRecSodium(double recSodium) { this.recSodium = recSodium; }

    public double getRecFiber() { return recFiber; }

    public void setRecFiber(double recFiber) { this.recFiber = recFiber; }

    public double getRecPotassium() { return recPotassium; }

    public void setRecPotassium(double recPotassium) { this.recPotassium = recPotassium; }

    public double getRecCholesterol() { return recCholesterol; }

    public void setRecCholesterol(double recCholesterol) { this.recCholesterol = recCholesterol; }

    public double getRecFat() { return recFat; }

    public void setRecFat(double recFat) { this.recFat = recFat; }

    public int getWeight() { return weight; }

    public int getHeight() { return height; }

}
