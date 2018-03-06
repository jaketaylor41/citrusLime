package com.jake.mljLemonade.controller;

import com.jake.mljLemonade.data.UserRepository;
import com.jake.mljLemonade.models.UserEntry;
import com.jake.mljLemonade.models.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class introController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/math/{regQty}/{strQty}")
    public String doMath(
        @PathVariable String regQty,
        @PathVariable String strQty,
        ModelMap modelMap

        ){

        UserEntry newEntry = new UserEntry(regQty, strQty);
        userRepository.addEntry(newEntry);
        modelMap.put("entry", newEntry);
        return "customer";
}
    @RequestMapping("/history")
    public String getMath(ModelMap modelMap){
        modelMap.put("mathrepo", userRepository.getAllEntries());
        return "history";
    }

    @RequestMapping("/summary/{regQty}/{strQty}/{firstName}/{lastName}/{address}/{city}/{state}/{zip}/{creditCard}/{expiration}/{csv}")
    public String gotoSummary(
        @PathVariable String regQty,
        @PathVariable String strQty,
        @PathVariable String firstName,
        @PathVariable String lastName,
        @PathVariable String address,
        @PathVariable String city,
        @PathVariable String state,
        @PathVariable String zip,
        @PathVariable String creditCard,
        @PathVariable String expiration,
        @PathVariable String csv,
        ModelMap modelMap
    ){
        UserInfo newUser = new UserInfo(regQty, strQty, firstName, lastName, address, city, state, zip, creditCard, expiration, csv);
        userRepository.addUser(newUser);
        modelMap.put("meow", newUser);
        return "summary";
    }

    @RequestMapping("/confirm")
    public String gotoConfirm(ModelMap modelMap) {
        modelMap.put("meow", userRepository.getLastEntry());
        return "confirm";
    }

    @RequestMapping("/")
    public String baseRoute(){
        return "index";
    }
}
