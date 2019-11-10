package cn.gs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: gaoshuai
 * @date: 2019/11/10 20:02
 */
@Controller
@RequestMapping("/view")
public class ViewController {
    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }
}
