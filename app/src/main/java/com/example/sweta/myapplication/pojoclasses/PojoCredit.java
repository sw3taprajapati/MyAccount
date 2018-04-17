package com.example.sweta.myapplication.pojoclasses;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by sweta on 4/16/18.
 */

public class PojoCredit extends RealmObject {

    @PrimaryKey
    private Integer id;
    private Integer creditAmount;
    private String creditSource;
    private String creditDate;

    public PojoCredit(){
    }

    public PojoCredit(Integer id,Integer creditAmount,
                      String creditSource, String creditDate) {
        this.id = id;
        this.creditAmount = creditAmount;
        this.creditSource = creditSource;
        this.creditDate = creditDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCreditDate() {
        return creditDate;
    }

    public void setCreditDate(String creditDate) {
        this.creditDate = creditDate;
    }
}
