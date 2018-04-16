package com.example.sweta.myapplication.pojoclasses;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by sweta on 4/16/18.
 */

public class PojoCredit extends RealmObject {

    private Integer creditAmount;
    private String creditSource;
    private Date creditDate;

    public PojoCredit(){

    }
    public PojoCredit(Integer creditAmount, String creditSource, Date creditDate) {
        this.creditAmount = creditAmount;
        this.creditSource = creditSource;
        this.creditDate = creditDate;
    }

    public Integer getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCreditSource() {
        return creditSource;
    }

    public void setCreditSource(String creditSource) {
        this.creditSource = creditSource;
    }

    public Date getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(Date creditDate) {
        this.creditDate = creditDate;
    }
}
