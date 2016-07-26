package com.choinisae.nisaechoi.myapplication.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by donghaechoi on 2016. 7. 25..
 */
public class MyDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "mydatas.db";
    private static final int DATABASE_VERSION = 1;

    public MyDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // 최초에 db가 열리는 타이밍에 table 생성
        db.execSQL(MyDataBase.MyEntry.SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // DATABASE_VERSION이 업그레이드 될때 호출됩니다.
        // 일반적인 개발자들은 사용 할 일이 극히 드뭅니다.
        // 그러므로 아무런 로직을 작성하지 않으셔도 됩니다.
    }

}
