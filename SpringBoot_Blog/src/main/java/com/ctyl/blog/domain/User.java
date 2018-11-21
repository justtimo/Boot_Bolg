package com.ctyl.blog.domain;

/**
 * User实体
 */
public class User {
    private Long id;
    private String name;
    private String age;

    //无参构造函数
    public User() {
    }

    //有参构造函数
    public User(Long id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
