/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
}