package com.example.android.projectfanta;

import android.content.Context;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Food implements Serializable{

    public static final String CALORIES = "calories";
    public static final String CARBS = "carbs";
    public static final String FAT = "fat";
    public static final String PROTEIN = "protein";
    public static final String SODIUM = "sodium";
    public static final String SUGAR = "sugar";
    public static final String CHOLESTEROL = "cholesterol";
    public static final String POTASSIUM = "potassium";
    public static final String FIBER = "fiber";


    private String name;
    private long count;
    private HashMap<String, Double> nutrients;


    /**
     * Creates a food, ready for nutrients to be added.
     * @param name The name of the food, used as an identifier
     */
    public Food(String name) {
        this.name = name;
        count = 0;
        nutrients = new HashMap<String, Double> ();
    }

    public Food() {
        nutrients = new HashMap<String, Double>();
    };

    /**
     * Method to rename foods with already taken name.
     * @param name The name the user wanted
     * @return
     */
    public static String getValidName(String name) {
        while(Information.information.hasFood(name)) {
            name = name.concat("I");
        }
        return name;
        // TODO : char lastChar = name.charAt(name.length()); if(Character.isDigit(lastChar))
    }

    /**
     * Adds the nutrient and its amount to the food.
     * @param key The name of the nutrient
     * @param val The amount of the nutrient in grams per serving
     * @return Whether or not the nutrient was sucessfully added. If false, this means the key was not recognized.
     */
    public void add(String key, double val) {
        nutrients.put(key, val);
    }

    public Double getNutrient(String key) {return new Double(nutrients.get(key));  }

    public Map<String, Double> getNutrients() { return nutrients;  }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public void incrementCount(Context context) {
        count++;
        Information.information.updateFood(context, this);
    }

}
