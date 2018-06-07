package com.wuqingbo.demo.Controller;

import com.alibaba.fastjson.JSONObject;
import com.wuqingbo.demo.dto.UserDTO;
import com.wuqingbo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by qingbowu on 2018/5/7.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/queryUserById")
    @ResponseBody
    public String queryUserById(HttpServletRequest request,Integer id){
        UserDTO userDTO = userService.queryUserById(id);
        return JSONObject.toJSONString(userDTO);
    }

}
