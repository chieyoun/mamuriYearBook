package com.chieyoun.board.domain;

import com.chieyoun.board.domain.entity.UserEntity;

import java.util.Date;

public class User {

    private Long userIdx;

    private String email;

    private String password;

    private String name;

    private int grade;

    private Date registerTime;

    private Date lastLoginTime;

    private boolean withrawed;

    private Date withdrawTime;

    public Long getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Long userIdx) {
        this.userIdx = userIdx;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public boolean isWithrawed() {
        return withrawed;
    }

    public void setWithrawed(boolean withrawed) {
        this.withrawed = withrawed;
    }

    public Date getWithdrawTime() {
        return withdrawTime;
    }

    public void setWithdrawTime(Date withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    public static User build(String email, String password, String name, int grade) {
        User user = new User();

        user.setEmail(email);
        user.setPassword(password);
        user.setName(name);
        user.setGrade(grade);

        return user;
    }

    public static User build(UserEntity entity) {
        User user = new User();

        user.setUserIdx(entity.getUserIdx());
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        user.setName(entity.getName());
        user.setGrade(entity.getGrade());
        user.setRegisterTime(entity.getRegisterTime());
        user.setLastLoginTime(entity.getLastLoginTime());
        user.setWithrawed(entity.isWithrawed());
        user.setWithdrawTime(entity.getWithdrawTime());

        return user;
    }
}

