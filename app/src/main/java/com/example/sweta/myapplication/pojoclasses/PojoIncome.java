package com.example.sweta.myapplication.pojoclasses;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by sweta on 4/16/18.
 */

public class PojoIncome extends RealmObject {

    private Integer incomeAmount;
    private String incomeSource;
    private Date incomeDate;

    public PojoIncome() {
    }

    public PojoIncome(Integer incomeAmount, String incomeSource, Date incomeDate) {
        this.incomeAmount = incomeAmount;
        this.incomeSource = incomeSource;
        this.incomeDate = incomeDate;
    }

    public Integer getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(Integer incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public Date getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }
}
