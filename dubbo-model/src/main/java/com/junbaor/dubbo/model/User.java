package com.junbaor.dubbo.model;

import java.util.Date;

/**
 * Created by junbaor on 2017/7/3.
 */
public class User implements java.io.Serializable {
    private int id;
    private String name;
    private String pass;
    private Date birthday;

    public User() {
    }

    public User(int id, String name, String pass, Date birthday) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", pass='").append(pass).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append('}');
        return sb.toString();
    }
}
