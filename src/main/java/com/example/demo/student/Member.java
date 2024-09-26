package com.example.demo.student;

public class Member {
    private String name;
    private Integer age;
    private Integer ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }

    public Member(String name, Integer age, Integer ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }
}
