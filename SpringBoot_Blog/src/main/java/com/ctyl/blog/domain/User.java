package com.ctyl.blog.domain;

/**
 * User实体
 */
public class User {
        private Long id;
        private String name;
        private String email;

    //无参构造函数
    public User(){}

    //有参构造函数
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
