package com.choinisae.nisaechoi.myapplication.exam7_4;

/**
 * Created by donghaechoi on 2016. 7. 4..
 */
public class ModelClass {

    private int imageRes;
    private String titleTxt;
    private String contentTxt;

    public ModelClass(int imageRes, String titleTxt, String contentTxt) {
        this.imageRes = imageRes;
        this.titleTxt = titleTxt;
        this.contentTxt = contentTxt;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getTitleTxt() {
        return titleTxt;
    }

    public void setTitleTxt(String titleTxt) {
        this.titleTxt = titleTxt;
    }

    public String getContentTxt() {
        return contentTxt;
    }

    public void setContentTxt(String contentTxt) {
        this.contentTxt = contentTxt;
    }
}
