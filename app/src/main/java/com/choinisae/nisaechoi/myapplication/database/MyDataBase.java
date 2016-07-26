package com.choinisae.nisaechoi.myapplication.database;

import android.provider.BaseColumns;

/**
 * Created by donghaechoi on 2016. 7. 25..
 */
public class MyDataBase {
    public static abstract class MyEntry implements BaseColumns {

        public static final String TABLE_NAME = "MyData";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_CONTENT = "content";

        // CREATE TABLE MyData
        // (title TEXT '제목없음' , content TEXT);
        public static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + MyEntry.TABLE_NAME + " ( "
                + MyEntry.COLUMN_NAME_TITLE + " TEXT DEFAULT '제목없음'," +
                MyEntry.COLUMN_NAME_CONTENT + " TEXT" + ");";
    }
}
