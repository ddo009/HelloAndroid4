package com.choinisae.nisaechoi.myapplication.listexam;

/**
 * Created by donghaechoi on 2016. 7. 4..
 */
public class Item {

    private String name;
    private String pay;

    public Item(String name, String pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

}
