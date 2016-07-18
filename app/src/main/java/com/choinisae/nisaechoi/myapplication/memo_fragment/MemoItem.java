package com.choinisae.nisaechoi.myapplication.memo_fragment;

/**
 * Created by donghaechoi on 2016. 7. 18..
 */
public class MemoItem {

    private String title;
    private String content;

    public MemoItem(String title, String content) {
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
