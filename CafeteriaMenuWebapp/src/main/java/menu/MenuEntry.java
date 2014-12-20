/** 
 *   Document   : Menu.java
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
public class MenuEntry {

    //All of the variables for each of the days. All fields need info entered, except 
    //for the Allergens field. All variables also have a min and max size (except for
    //Allergens, which is just a max amount). 
    
    @NotNull
    @Size(min=1, max=50, message="The description must be between {min} and {max} characters.")
    private String mealNameSunday;
    
    @NotNull
    @Size(min=1, max=10, message="The description must be between {min} and {max} characters.")
    private String mealPriceSunday;
    
    @NotNull
    @Size(min=1, max=100, message="The description must be between {min} and {max} characters.")
    private String mealDescriptionSunday;
    
    @Size(max=50, message="The description must be, at most, {max} characters.")
    private String mealAllergensSunday;
   
    @NotNull
    @Size(min=1, max=50, message="The description must be between {min} and {max} characters.")
    private String mealNameMonday;
    
    @NotNull
    @Size(min=1, max=10, message="The description must be between {min} and {max} characters.")
    private String mealPriceMonday;
    
    @NotNull
    @Size(min=1, max=100, message="The description must be between {min} and {max} characters.")
    private String mealDescriptionMonday;
    
    @Size(max=50, message="The description must be, at most, {max} characters.")
    private String mealAllergensMonday;
    
    @NotNull
    @Size(min=1, max=50, message="The description must be between {min} and {max} characters.")
    private String mealNameTuesday;
    
    @NotNull
    @Size(min=1, max=10, message="The description must be between {min} and {max} characters.")
    private String mealPriceTuesday;
    
    @NotNull
    @Size(min=1, max=100, message="The description must be between {min} and {max} characters.")
    private String mealDescriptionTuesday;
    
    @Size(max=50, message="The description must be, at most, {max} characters.")
    private String mealAllergensTuesday;

    @NotNull
    @Size(min=1, max=50, message="The description must be between {min} and {max} characters.")
    private String mealNameWednesday;
    
    @NotNull
    @Size(min=1, max=10, message="The description must be between {min} and {max} characters.")
    private String mealPriceWednesday;
    
    @NotNull
    @Size(min=1, max=100, message="The description must be between {min} and {max} characters.")
    private String mealDescriptionWednesday;
    
    @Size(max=50, message="The description must be, at most, {max} characters.")
    private String mealAllergensWednesday;
    
    @NotNull
    @Size(min=1, max=50, message="The description must be between {min} and {max} characters.")
    private String mealNameThursday;
    
    @NotNull
    @Size(min=1, max=10, message="The description must be between {min} and {max} characters.")
    private String mealPriceThursday;
    
    @NotNull
    @Size(min=1, max=100, message="The description must be between {min} and {max} characters.")
    private String mealDescriptionThursday;
    
    @Size(max=50, message="The description must be, at most, {max} characters.")
    private String mealAllergensThursday;
    
    @NotNull
    @Size(min=1, max=50, message="The description must be between {min} and {max} characters.")
    private String mealNameFriday;
    
    @NotNull
    @Size(min=1, max=10, message="The description must be between {min} and {max} characters.")
    private String mealPriceFriday;
    
    @NotNull
    @Size(min=1, max=100, message="The description must be between {min} and {max} characters.")
    private String mealDescriptionFriday;
    
    @Size(max=50, message="The description must be, at most, {max} characters.")
    private String mealAllergensFriday;
    
    @NotNull
    @Size(min=1, max=50, message="The description must be between {min} and {max} characters.")
    private String mealNameSaturday;
    
    @NotNull
    @Size(min=1, max=10, message="The description must be between {min} and {max} characters.")
    private String mealPriceSaturday;
    
    @NotNull
    @Size(min=1, max=100, message="The description must be between {min} and {max} characters.")
    private String mealDescriptionSaturday;
    
    @Size(max=50, message="The description must be, at most, {max} characters.")
    private String mealAllergensSaturday;
    
    //ArrayList for storing 7 MenuDay items (creating a full week of daily menus).
    private ArrayList<MenuDay> weeklyMenu = new ArrayList();
    
    public MenuEntry() {
        
    }
    
    //Builds the ArrayList of all 7 days using 7 MenuDay objects.
    public void setWeeklyMenu() {
        
        MenuDay sunday = new MenuDay();
        MenuDay monday = new MenuDay();
        MenuDay tuesday = new MenuDay();
        MenuDay wednesday = new MenuDay();
        MenuDay thursday = new MenuDay();
        MenuDay friday = new MenuDay();
        MenuDay saturday = new MenuDay();
        
        sunday.setMealName(mealNameSunday);
        sunday.setMealPrice(mealPriceSunday);
        sunday.setMealDescription(mealDescriptionSunday);
        sunday.setMealAllergens(mealAllergensSunday);
        
        monday.setMealName(mealNameMonday);
        monday.setMealPrice(mealPriceMonday);
        monday.setMealDescription(mealDescriptionMonday);
        monday.setMealAllergens(mealAllergensMonday);
        
        tuesday.setMealName(mealNameTuesday);
        tuesday.setMealPrice(mealPriceTuesday);
        tuesday.setMealDescription(mealDescriptionTuesday);
        tuesday.setMealAllergens(mealAllergensTuesday);
        
        wednesday.setMealName(mealNameWednesday);
        wednesday.setMealPrice(mealPriceWednesday);
        wednesday.setMealDescription(mealDescriptionWednesday);
        wednesday.setMealAllergens(mealAllergensWednesday);
        
        thursday.setMealName(mealNameThursday);
        thursday.setMealPrice(mealPriceThursday);
        thursday.setMealDescription(mealDescriptionThursday);
        thursday.setMealAllergens(mealAllergensThursday);
        
        friday.setMealName(mealNameFriday);
        friday.setMealPrice(mealPriceFriday);
        friday.setMealDescription(mealDescriptionFriday);
        friday.setMealAllergens(mealAllergensFriday);
        
        saturday.setMealName(mealNameSaturday);
        saturday.setMealPrice(mealPriceSaturday);
        saturday.setMealDescription(mealDescriptionSaturday);
        saturday.setMealAllergens(mealAllergensSaturday);
        
        weeklyMenu.add(sunday);
        weeklyMenu.add(monday);
        weeklyMenu.add(tuesday);
        weeklyMenu.add(wednesday);
        weeklyMenu.add(thursday);
        weeklyMenu.add(friday);
        weeklyMenu.add(saturday);
    }
    
    public ArrayList getWeeklyMenu() {
        
        setWeeklyMenu();
        return weeklyMenu;
    }
    
    public String getMealNameSunday() {
        return mealNameSunday;
    }

    public void setMealNameSunday(String mealNameSunday) {
        this.mealNameSunday = mealNameSunday;
    }

    public String getMealPriceSunday() {
        return mealPriceSunday;
    }

    public void setMealPriceSunday(String mealPriceSunday) {
        this.mealPriceSunday = mealPriceSunday;
    }

    public String getMealDescriptionSunday() {
        return mealDescriptionSunday;
    }

    public void setMealDescriptionSunday(String mealDescriptionSunday) {
        this.mealDescriptionSunday = mealDescriptionSunday;
    }

    public String getMealAllergensSunday() {
        return mealAllergensSunday;
    }

    public void setMealAllergensSunday(String mealAllergensSunday) {
        this.mealAllergensSunday = mealAllergensSunday;
    }

    public String getMealNameMonday() {
        return mealNameMonday;
    }

    public void setMealNameMonday(String mealNameMonday) {
        this.mealNameMonday = mealNameMonday;
    }

    public String getMealPriceMonday() {
        return mealPriceMonday;
    }

    public void setMealPriceMonday(String mealPriceMonday) {
        this.mealPriceMonday = mealPriceMonday;
    }

    public String getMealDescriptionMonday() {
        return mealDescriptionMonday;
    }

    public void setMealDescriptionMonday(String mealDescriptionMonday) {
        this.mealDescriptionMonday = mealDescriptionMonday;
    }

    public String getMealAllergensMonday() {
        return mealAllergensMonday;
    }

    public void setMealAllergensMonday(String mealAllergensMonday) {
        this.mealAllergensMonday = mealAllergensMonday;
    }

    public String getMealNameTuesday() {
        return mealNameTuesday;
    }

    public void setMealNameTuesday(String mealNameTuesday) {
        this.mealNameTuesday = mealNameTuesday;
    }

    public String getMealPriceTuesday() {
        return mealPriceTuesday;
    }

    public void setMealPriceTuesday(String mealPriceTuesday) {
        this.mealPriceTuesday = mealPriceTuesday;
    }

    public String getMealDescriptionTuesday() {
        return mealDescriptionTuesday;
    }

    public void setMealDescriptionTuesday(String mealDescriptionTuesday) {
        this.mealDescriptionTuesday = mealDescriptionTuesday;
    }

    public String getMealAllergensTuesday() {
        return mealAllergensTuesday;
    }

    public void setMealAllergensTuesday(String mealAllergensTuesday) {
        this.mealAllergensTuesday = mealAllergensTuesday;
    }

    public String getMealNameWednesday() {
        return mealNameWednesday;
    }

    public void setMealNameWednesday(String mealNameWednesday) {
        this.mealNameWednesday = mealNameWednesday;
    }

    public String getMealPriceWednesday() {
        return mealPriceWednesday;
    }

    public void setMealPriceWednesday(String mealPriceWednesday) {
        this.mealPriceWednesday = mealPriceWednesday;
    }

    public String getMealDescriptionWednesday() {
        return mealDescriptionWednesday;
    }

    public void setMealDescriptionWednesday(String mealDescriptionWednesday) {
        this.mealDescriptionWednesday = mealDescriptionWednesday;
    }

    public String getMealAllergensWednesday() {
        return mealAllergensWednesday;
    }

    public void setMealAllergensWednesday(String mealAllergensWednesday) {
        this.mealAllergensWednesday = mealAllergensWednesday;
    }

    public String getMealNameThursday() {
        return mealNameThursday;
    }

    public void setMealNameThursday(String mealNameThursday) {
        this.mealNameThursday = mealNameThursday;
    }

    public String getMealPriceThursday() {
        return mealPriceThursday;
    }

    public void setMealPriceThursday(String mealPriceThursday) {
        this.mealPriceThursday = mealPriceThursday;
    }

    public String getMealDescriptionThursday() {
        return mealDescriptionThursday;
    }

    public void setMealDescriptionThursday(String mealDescriptionThursday) {
        this.mealDescriptionThursday = mealDescriptionThursday;
    }

    public String getMealAllergensThursday() {
        return mealAllergensThursday;
    }

    public void setMealAllergensThursday(String mealAllergensThursday) {
        this.mealAllergensThursday = mealAllergensThursday;
    }

    public String getMealNameFriday() {
        return mealNameFriday;
    }

    public void setMealNameFriday(String mealNameFriday) {
        this.mealNameFriday = mealNameFriday;
    }

    public String getMealPriceFriday() {
        return mealPriceFriday;
    }

    public void setMealPriceFriday(String mealPriceFriday) {
        this.mealPriceFriday = mealPriceFriday;
    }

    public String getMealDescriptionFriday() {
        return mealDescriptionFriday;
    }

    public void setMealDescriptionFriday(String mealDescriptionFriday) {
        this.mealDescriptionFriday = mealDescriptionFriday;
    }

    public String getMealAllergensFriday() {
        return mealAllergensFriday;
    }

    public void setMealAllergensFriday(String mealAllergensFriday) {
        this.mealAllergensFriday = mealAllergensFriday;
    }

    public String getMealNameSaturday() {
        return mealNameSaturday;
    }

    public void setMealNameSaturday(String mealNameSaturday) {
        this.mealNameSaturday = mealNameSaturday;
    }

    public String getMealPriceSaturday() {
        return mealPriceSaturday;
    }

    public void setMealPriceSaturday(String mealPriceSaturday) {
        this.mealPriceSaturday = mealPriceSaturday;
    }

    public String getMealDescriptionSaturday() {
        return mealDescriptionSaturday;
    }

    public void setMealDescriptionSaturday(String mealDescriptionSaturday) {
        this.mealDescriptionSaturday = mealDescriptionSaturday;
    }

    public String getMealAllergensSaturday() {
        return mealAllergensSaturday;
    }

    public void setMealAllergensSaturday(String mealAllergensSaturday) {
        this.mealAllergensSaturday = mealAllergensSaturday;
    }
}
