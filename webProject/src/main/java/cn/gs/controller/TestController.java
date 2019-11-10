package cn.gs.controller;

import cn.gs.base.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/4/11 09:20
 * @Description:
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
    @ResponseBody
    //@RequestBody是作用于参数的，它实现了把客户端传过来的json数据解析为对象，作为参数传进来，
    // 不过客户端传过来的数据类型必须是application/json,不然会出错
    private User ajax(@RequestBody User user) {
        System.out.println("收到ajax请求");
        User u = new User();
        u.setUserId(1L);
        u.setUserName("user");

        return u;
    }

    @RequestMapping(value = "/nothing", method = RequestMethod.POST)
    private String nothing() {
        return "success";
    }


}