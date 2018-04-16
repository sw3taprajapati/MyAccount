package com.example.sweta.myapplication.pojoclasses;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by sweta on 4/16/18.
 */

public class PojoExpenses extends RealmObject {

    private Integer expenseAmount;
    private String expenseSource;
    private Date expenseDate;

    public PojoExpenses(){

    }

    public PojoExpenses(Integer expenseAmount, String expenseSource, Date expenseDate) {
        this.expenseAmount = expenseAmount;
        this.expenseSource = expenseSource;
        this.expenseDate = expenseDate;
    }

    public Integer getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Integer expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getExpenseSource() {
        return expenseSource;
    }

    public void setExpenseSource(String expenseSource) {
        this.expenseSource = expenseSource;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }
}
