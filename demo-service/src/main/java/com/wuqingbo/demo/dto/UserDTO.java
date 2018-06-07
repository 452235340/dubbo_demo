package com.wuqingbo.demo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by qingbowu on 2018/5/7.
 */
public class UserDTO implements Serializable {

    private int id;
    private String userName;
    private String userCode;
    private String sex;
    private Date birthDay;

    public UserDTO() {
    }

    public UserDTO(int id, String userName, String userCode, String sex, Date birthDay) {
        this.id = id;
        this.userName = userName;
        this.userCode = userCode;
        this.sex = sex;
        this.birthDay = birthDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
