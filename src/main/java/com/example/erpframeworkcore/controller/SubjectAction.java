package com.example.erpframeworkcore.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * LoginAction
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 　 2018-03-20 21:47
 */
@Controller
public class SubjectAction {
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String tologin() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()){
            return "redirect:/";
        }else {
            return "pages/login";
        }
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String username, String password, boolean rememberMe) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        subject.login(token);
        return "redirect:/";
    }

    @RequestMapping(value = "logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login";
    }

}
