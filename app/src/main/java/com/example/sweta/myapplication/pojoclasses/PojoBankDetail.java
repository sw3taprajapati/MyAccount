package com.example.sweta.myapplication.pojoclasses;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by sweta on 4/16/18.
 */

public class PojoBankDetail extends RealmObject {

    private Integer depositAmount;
    private Integer withdrawlAmount;
    private Date creditDate;
}
