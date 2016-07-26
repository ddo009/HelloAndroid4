package com.choinisae.nisaechoi.myapplication.database;

import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by donghaechoi on 2016. 7. 25..
 */
public class Datas {

    private String title;
    private String content;

    public Datas(String title, String content) {
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

    public static List<Datas> fetchCursor(Cursor cursor) {
        List<Datas> list = new ArrayList<>();
        while (cursor.moveToNext()) {
            String title = cursor.getString(cursor.getColumnIndexOrThrow(MyDataBase.MyEntry.COLUMN_NAME_TITLE));
            String content = cursor.getString(cursor.getColumnIndexOrThrow(MyDataBase.MyEntry.COLUMN_NAME_CONTENT));
            list.add(new Datas(title, content));
        }
        return list;
    }

    public static Datas cursorToMove(Cursor cursor) {
        String title = cursor.getString(cursor.getColumnIndexOrThrow(MyDataBase.MyEntry.COLUMN_NAME_TITLE));
        String content = cursor.getString(cursor.getColumnIndexOrThrow(MyDataBase.MyEntry.COLUMN_NAME_CONTENT));
        return new Datas(title, content);
    }
}
