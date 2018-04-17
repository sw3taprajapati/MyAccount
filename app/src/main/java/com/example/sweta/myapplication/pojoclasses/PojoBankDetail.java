package com.example.sweta.myapplication.pojoclasses;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by sweta on 4/16/18.
 */

public class PojoBankDetail extends RealmObject {

    @PrimaryKey
    private Integer id;
    private Integer depositAmount;
    private Integer withdrawlAmount;
    private String creditDate;

    public PojoBankDetail(){

    }
    public PojoBankDetail(Integer id, Integer depositAmount,
                          Integer withdrawlAmount, String creditDate) {
        this.id = id;
        this.depositAmount = depositAmount;
        this.withdrawlAmount = withdrawlAmount;
        this.creditDate = creditDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Integer depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Integer getWithdrawlAmount() {
        return withdrawlAmount;
    }

    public void setWithdrawlAmount(Integer withdrawlAmount) {
        this.withdrawlAmount = withdrawlAmount;
    }

    public String getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(String creditDate) {
        this.creditDate = creditDate;
    }
}
