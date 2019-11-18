package com.lph.spring.dev.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity
{
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "phone")
    private String phone;
    @Column(name = "idcard")
    private Integer idcard;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private Integer age;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String  phone) {
        this.phone = phone;
    }

    public Integer getIdcard() {
        return idcard;
    }

    public void setIdcard(Integer idcard) {
        this.idcard = idcard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
