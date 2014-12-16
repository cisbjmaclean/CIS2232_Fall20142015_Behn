package controller;

import menu.Menu;
import menu.MenuEntry;
import menu.MenuDay;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for adding the journal entries.
 *
 * @author bjmaclean
 * @since 20141030
 */
@Controller
@RequestMapping("addMenuEntry")
public class AddMenuEntryController {

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView onSubmit(@ModelAttribute("menuEntry") @Valid MenuEntry menuEntry, BindingResult result, HttpServletRequest request) throws Exception {

        ModelAndView mv;
        if (result.hasErrors()) {
            System.out.println("There were errors");
            mv = new ModelAndView("addMenu");
            mv.addObject("message","The menu entry is invalid");
            mv.addObject("menuEntry",menuEntry);
            return mv;
        }

        //Setup the next model and view
        mv = new ModelAndView("viewMenuEntries");

        //Starts off by creating a Menu object. In the try block, the setWeeklyMenu()
        //method from the MenuEntry object is called. This bundles all of the raw data into 
        //an ArrayList of 7 MenuDay items, locatedin the MenuEntry class. The weeklyMenu
        //ArrayList (located in the Menu object) is then set to be the ArrayList in MenuEntry.
        //(using MenuEntry's getWeeklyMenu() method). After setting the ArrayList in the Menu
        //object, the Menu object's writeMenuToDatabase() method is called (not needing an
        //argument, as the ArrayList is already in Menu) which writes the ArrayList to the
        //database, one object at a time.
        Menu menu = new Menu();
        System.out.println("About to reload the entries");
                
        try {
            
            menuEntry.setWeeklyMenu();
            menu.setWeeklyMenu(menuEntry.getWeeklyMenu());
            
            if (menuEntry.getWeeklyMenu().isEmpty()) {
                System.out.println("There were errors");
                mv = new ModelAndView("addMenu");
                mv.addObject("message","The menu entry is invalid");
                mv.addObject("menuEntry",menuEntry);
                return mv;
            } else {
                menu.writeMenuToDatabase();
            }
            
        } catch (Exception e) {
            String errorMessage = e.getMessage();
            e.printStackTrace();
        
        }
        System.out.println("Added the menu to the database.");
        //Add a message and the latest journal entries back to the mv before returning it.
        //This will ensure that they are available on the jsp.
        mv.addObject("message", "Menu was added");
        mv.addObject("menu", menu.getWeeklyMenu());

        return mv;
    }
}
