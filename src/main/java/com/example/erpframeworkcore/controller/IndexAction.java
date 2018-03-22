package com.example.erpframeworkcore.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * IndexAction
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 　 2018-03-22 22:34
 */
@Controller
@RequestMapping("/")
public class IndexAction {
    @RequestMapping(method = RequestMethod.GET)
    public String to() {
        return "pages/index";
    }
}
