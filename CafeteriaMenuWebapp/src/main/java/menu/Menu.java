/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.ConnectionUtils;

/**
 *
 * @author Behn
 */
public class Menu {
    
    private ArrayList<MenuDay> weeklyMenu = new ArrayList();
    private String sql = null;
    
    public ArrayList<MenuDay> getWeeklyMenu() {
        return weeklyMenu;
    }

    public void setWeeklyMenu(ArrayList<MenuDay> weeklyMenu) {
        this.weeklyMenu = weeklyMenu;
    }
    
    public void setSQL(String sql){
        
        this.sql = sql;
    }
    
    public String getSQL(){
        
        return sql;
    }
    
    public void add() {
        weeklyMenu.add(new MenuDay());
    }
    
    public void add(MenuDay menu) {
        weeklyMenu.add(menu);
    }
    
    public void writeMenuToDatabase() throws Exception {
    
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        //Only 7 entries in the DB. Counter starts at 0, repeats 7 times, and stops once it hits 7.
        final int COUNTER_LIMIT = 7;
        
        try {
            conn = ConnectionUtils.getConnection();
        } catch (Exception ex) {
            System.err.println("Error connecting to database");
        }
        
        try { 
            for(int counter = 0; counter < COUNTER_LIMIT; counter++) {
                
                String itemName = weeklyMenu.get(counter).getMealName();
                String price = weeklyMenu.get(counter).getMealPrice();
                String description = weeklyMenu.get(counter).getMealDescription();
                String allergens = weeklyMenu.get(counter).getMealAllergens();
                boolean hasAllergens = weeklyMenu.get(counter).getContainsAllergens();
                int hasAllergensBinary = 0;
                
                if(hasAllergens == true) {
            
                    hasAllergensBinary = 1;
                }
                
                if(sql == null){

                    sql = "UPDATE weekly_menu "
                        + "SET ITEMNAME='" + itemName + "', PRICE= '" + price + "', DESCRIPTION= '" + description + "', ALLERGENS='" + allergens + "', HASALLERGENS='" + hasAllergensBinary + "' "
                        + "WHERE ID='" + counter + "'";
                }

                ps = conn.prepareStatement(sql);        
                ps.executeUpdate();
                sql = null;
            }
        } catch (Exception e) {
            
            String errorMessage = e.getMessage();
            e.printStackTrace();
        } finally {
            
            ps.close();
            rs.close();
            conn.close();
            sql = null;
        }
    } 
    
    public void readMenuFromDatabase() throws SQLException {
        
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            conn = ConnectionUtils.getConnection();
        } catch (Exception ex) {
            System.err.println("Error connecting to database");
        }
        
        try {
            
            if(sql == null) {
                
                sql = "SELECT * FROM weekly_menu";
            }
        
            ps = conn.prepareStatement(sql);        
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                MenuDay menuDay = new MenuDay();
                menuDay.setMealName(rs.getString("ITEMNAME"));
                menuDay.setMealPrice(rs.getString("PRICE"));
                menuDay.setMealDescription(rs.getString("DESCRIPTION"));
                menuDay.setMealAllergens(rs.getString("ALLERGENS"));

                weeklyMenu.add(menuDay);
            }
        
        } catch (Exception e) {
            
            String errorMessage = e.getMessage();
            e.printStackTrace();
            //In the finally close the resources used to make this connection to the database.
        } finally {
            
            ps.close();
            rs.close();
            conn.close();
            sql = null;
        }   
    }
}
