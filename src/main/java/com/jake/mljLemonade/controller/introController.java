package com.jake.mljLemonade.controller;

import com.jake.mljLemonade.data.UserRepository;
import com.jake.mljLemonade.models.UserEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class introController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String baseRoute(){
        return "index";
    }

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

    @RequestMapping("/summary")
    public String gotoSummary(ModelMap modelMap){
        modelMap.put("mathrepo", userRepository.getAllEntries());
        return "summary";
    }

    @RequestMapping("/confirm")
    public String gotoConfirm(ModelMap modelMap){
        modelMap.put("mathrepo", userRepository.getAllEntries());
        return "confirm";
    }
}
