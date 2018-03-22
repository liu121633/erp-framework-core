package com.example.erpframeworkcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * LoginAction
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 　 2018-03-20 21:47
 */
@Controller
@RequestMapping("login")
public class LoginAction {
    @RequestMapping(method = RequestMethod.GET)
    public String to() {
        return "pages/login";
    }
}
