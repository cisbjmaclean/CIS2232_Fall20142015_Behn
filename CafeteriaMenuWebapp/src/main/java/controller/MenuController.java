package controller;

import beans.CodeValue;
import forms.Login;
import forms.Menu;
import java.sql.SQLException;
import menu.MenuEntry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for the Welcome
 *
 * @author bjmaclean
 */
@Controller
@RequestMapping("menu")
public class MenuController {

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView onSubmit(@ModelAttribute("menu") Menu menu) throws SQLException {
        //Switched around menu layout. 
        ModelAndView mv;
        if (menu.getAction().equalsIgnoreCase("Logout")) {
            mv = new ModelAndView("welcome");
        } else if (menu.getAction().equalsIgnoreCase("View Menu")) {            
            System.out.println("User wants to view the menu");
            menu.Menu menuCafeteria = new menu.Menu();
            mv = new ModelAndView("viewMenuEntries");
            menuCafeteria.readMenuFromDatabase();
            mv.addObject("menu", menuCafeteria.getWeeklyMenu());
        } else if (menu.getAction().equalsIgnoreCase("Add Menu")) {
            System.out.println("User wants to add a new menu for the week");
            mv = new ModelAndView("addMenu");
            mv.addObject("message", "User selected Add Menu");
            mv.addObject("menuEntry", new MenuEntry());
        } else {
            mv = new ModelAndView("welcome");
        }

        return mv;
    }
}
