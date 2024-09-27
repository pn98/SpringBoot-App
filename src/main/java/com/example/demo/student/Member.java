package com.example.demo.student;

import java.time.LocalDate;

public class Member {
    private String name;
    private Integer age;
    private Integer ID;
    private String gender;
    private String address;
    private String phoneNumber;
    private String postcode;
    private boolean hasPaidMembership;
    private LocalDate paymentDate;

    public Member(String name, Integer age, Integer ID, String gender, String address, String phoneNumber, String postcode, boolean hasPaidMembership, LocalDate paymentDate) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.postcode = postcode;
        this.hasPaidMembership = hasPaidMembership;
        this.paymentDate = paymentDate;
    }

    // Getters and setters
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public boolean isHasPaidMembership() {
        return hasPaidMembership;
    }

    public void setHasPaidMembership(boolean hasPaidMembership) {
        this.hasPaidMembership = hasPaidMembership;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", postcode='" + postcode + '\'' +
                ", hasPaidMembership=" + hasPaidMembership +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
