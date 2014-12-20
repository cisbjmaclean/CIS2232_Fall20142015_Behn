/** 
 *   Document   : MenuDay.java
 *   Created on : 9-Dec-2014
 *   Final copy : 20-Dec-2014, 1:02 AM 
 *   Author     : Behn
 *   CIS-2232   : Advanced Object Oriented Programming
 *   Final Project
 */

package menu;

import java.util.ArrayList;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Behn
 */
public class MenuDay {
    
    private String mealDay;
    private String mealName;
    private String mealPrice;
    private String mealDescription;
    private String mealAllergens;
    private boolean containsAllergens;

    
    public MenuDay() {
        
    }
    
    public MenuDay(String mealName, String mealPrice, String mealDescription, String mealAllergens) {
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.mealDescription = mealDescription;
        this.mealAllergens = mealAllergens;
        setContainsAllergens();
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealPrice() {
        return mealPrice;
    }

    public void setMealPrice(String mealPrice) {
        this.mealPrice = mealPrice;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealAllergens() {
        return mealAllergens;
    }

    public void setMealAllergens(String mealAllergens) {
        this.mealAllergens = mealAllergens;
    }

    public boolean getContainsAllergens() {
        return containsAllergens;
    }
    
    public void setContainsAllergens() {
        
        if(mealAllergens.length() > 0) {
            
            containsAllergens = true;
        }
    }
    
    public String getMealDay() {
        
        determineDay();
        return mealDay;
    }

    public void setMealDay(String mealDay) {
        this.mealDay = mealDay;
    }

    public boolean isContainsAllergens() {
        return containsAllergens;
    }

    public void setContainsAllergens(boolean containsAllergens) {
        this.containsAllergens = containsAllergens;
    }
    
    //Determines the day, depending on the ID associated with that line in the DB.
    //When reading from the DB, the ID (a number from 0-6) is seen, and this method
    //turns it into a readable string. 0 is Sunday, 1 is Monday, and so on.
    public void determineDay() {
        
        switch(Integer.parseInt(mealDay)) {
            
            case 0: 
                mealDay = "Sunday";
                break;
            case 1: 
                mealDay = "Monday";
                break;
            case 2: 
                mealDay = "Tuesday";
                break;
            case 3: 
                mealDay = "Wednesday";
                break;
            case 4: 
                mealDay = "Thursday";
                break;
            case 5: 
                mealDay = "Friday";
                break;
            case 6: 
                mealDay = "Saturday";
                break;
        }
    }
}