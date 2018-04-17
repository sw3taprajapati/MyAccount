package com.example.sweta.myapplication.pojoclasses;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by sweta on 4/16/18.
 */

public class PojoExpenses extends RealmObject {

    @PrimaryKey
    private Integer id;
    private Integer expenseAmount;
    private String expenseSource;
    private String expenseDate;

    public PojoExpenses(){
    }

    public PojoExpenses(Integer id, Integer expenseAmount,
                        String expenseSource, String expenseDate) {
        this.id = id;
        this.expenseAmount = expenseAmount;
        this.expenseSource = expenseSource;
        this.expenseDate = expenseDate;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

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

    public String getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(String expenseDate) {
        this.expenseDate = expenseDate;
    }
}
