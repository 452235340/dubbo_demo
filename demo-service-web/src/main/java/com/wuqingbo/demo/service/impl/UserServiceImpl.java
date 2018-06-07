package com.wuqingbo.demo.service.impl;

import com.wuqingbo.demo.dto.UserDTO;
import com.wuqingbo.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by qingbowu on 2018/5/7.
 */
@Service
public class UserServiceImpl implements UserService {


    @Override
    public UserDTO queryUserById(int id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1001);
        userDTO.setUserName("zhangsan");
        userDTO.setUserCode("123456");
        userDTO.setSex("男");
        userDTO.setBirthDay(new Date());
        return userDTO;
    }
}
