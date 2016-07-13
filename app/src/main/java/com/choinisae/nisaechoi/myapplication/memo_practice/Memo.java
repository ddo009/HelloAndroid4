package com.choinisae.nisaechoi.myapplication.memo_practice;

/**
 * Created by donghaechoi on 2016. 7. 7..
 */
public class Memo {

    private String title;
    private String content;

    public Memo(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
