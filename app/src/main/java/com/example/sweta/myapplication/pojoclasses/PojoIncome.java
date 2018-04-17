package com.example.sweta.myapplication.pojoclasses;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by sweta on 4/16/18.
 */

public class PojoIncome extends RealmObject {

    @PrimaryKey
    private Integer incomeAmount;
    private String incomeSource;
    private String incomeDate;

    public PojoIncome() {
    }

    public PojoIncome(Integer incomeAmount, String incomeSource, String incomeDate) {
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

    public String getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(String incomeDate) {
        this.incomeDate = incomeDate;
    }
}
