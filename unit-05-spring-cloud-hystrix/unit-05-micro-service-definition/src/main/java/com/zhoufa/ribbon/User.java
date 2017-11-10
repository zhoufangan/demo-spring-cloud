package com.zhoufa.ribbon;

/**
 * @author Created by zhoufangan on 2017/11/6.
 */
public class User {

    private String name;
    private int gender;
    private int age;

    public User() {

    }

    public User(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
