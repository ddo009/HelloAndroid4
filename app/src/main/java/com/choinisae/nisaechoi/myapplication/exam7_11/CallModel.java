package com.choinisae.nisaechoi.myapplication.exam7_11;

/**
 * Created by donghaechoi on 2016. 7. 11..
 */
public class CallModel {

    private String name;
    private String number;

    public CallModel(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
