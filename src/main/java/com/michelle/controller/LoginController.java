package com.michelle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Freja on 5/10/16.
 */
@Controller
public class LoginController {

    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    public void homePage(ModelMap model) {

    }

}
