package com.chieyoun.board.domain.entity;


import com.chieyoun.board.domain.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public static UserEntity build(User user) {
        UserEntity entity = new UserEntity();

        entity.setUserIdx(user.getUserIdx());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        entity.setName(user.getName());
        entity.setGrade(user.getGrade());
        entity.setRegisterTime(user.getRegisterTime());
        entity.setLastLoginTime(user.getLastLoginTime());
        entity.setWithrawed(user.isWithrawed());
        entity.setWithdrawTime(user.getWithdrawTime());

        return entity;
    }
}
