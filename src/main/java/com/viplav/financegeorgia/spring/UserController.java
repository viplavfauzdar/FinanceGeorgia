/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viplav.financegeorgia.spring;

import com.viplav.financegeorgia.db.GenericDAO;
import com.viplav.financegeorgia.db.User;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

/**
 *
 * @author Viplav
 */
@Controller
public class UserController {

    private static final Log log = LogFactory.getLog(UserController.class);
    private GenericDAO<User> gdao = new GenericDAO<User>();

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView User() {
        return new ModelAndView("user", "command", new User());
    }

    /**
     * usage: /listUser?username=<...>...
     */
    @RequestMapping(value = "/listUser", method = {RequestMethod.GET, RequestMethod.POST})
    public String listUser(@ModelAttribute("FinanceGeorgia") User user,
            ModelMap model) {
        log.info("User: " + user);
        //user = gdao.findById(user.getId());//.attachDirty(user);
        gdao.set(user); //throws nullpointer without this
        List<User> luser = gdao.findByExample(user);
        if (luser.size() > 0) {
            user = luser.get(0);
        }

        model.addAttribute("fname", user.getFirstName());
        model.addAttribute("lname", user.getLastName());
        model.addAttribute("username", user.getUsername());

        return "result";
    }

    /**
     * usage: /addUser?username=<...>&firstName=<...>.....
     */
    @RequestMapping(value = "/addUser", method = {RequestMethod.GET, RequestMethod.POST})
    public String addUser(@ModelAttribute("FinanceGeorgia") User user,
            ModelMap model) {

        gdao.persist(user);//.attachDirty(user);

        model.addAttribute("fname", user.getFirstName());
        model.addAttribute("lname", user.getLastName());
        model.addAttribute("username", user.getUsername());

        return "result";
    }

    /**
     * usage: /updateUser?username=<...>&firstName=<...>.......
     */
    @RequestMapping(value = "/updateUser", method = {RequestMethod.GET, RequestMethod.POST})
    public String updateUser(@ModelAttribute("FinanceGeorgia") User user,
            ModelMap model) {

        gdao.set(user);
        User user1 = new User();
        user1.setUsername(user.getUsername());
        List<User> luser = gdao.findByExample(user1);
        if (luser.size() > 0) {
            user1 = luser.get(0);
            user.setId(user1.getId());
            gdao.attachDirty(user);
        } else {
            log.error("No user found to update!!");
        }

        model.addAttribute("fname", user.getFirstName());
        model.addAttribute("lname", user.getLastName());
        model.addAttribute("username", user.getUsername());

        return "result";
    }

    /**
     * usage: /listUser?username=<...>...or firstName=<...> or .....
     */
    @RequestMapping(value = "/listUsers", method = {RequestMethod.GET, RequestMethod.POST})
    public String listUsers(@ModelAttribute("FinanceGeorgia") User user,
            ModelMap model) {
        log.info("User: " + user);

        gdao.set(user); //throws nullpointer without this
        List<User> luser = gdao.findByExample(user);

        model.addAttribute("luser", luser);

        return "list";
    }
}