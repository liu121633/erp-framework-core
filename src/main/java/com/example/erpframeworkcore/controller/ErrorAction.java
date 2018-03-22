package com.example.erpframeworkcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ErrorAction
 *
 * @author liy贺兰沁焱-刘洪君
 * @version 1.0
 * 　 2018-03-22 22:41
 *
 */
@Controller
public class ErrorAction {

    @ResponseBody
    @RequestMapping("403")
    public String to403(){
        return  "没有权限的操作";
    }

}
