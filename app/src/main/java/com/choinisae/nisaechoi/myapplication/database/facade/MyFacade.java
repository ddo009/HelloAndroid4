package com.choinisae.nisaechoi.myapplication.database.facade;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.choinisae.nisaechoi.myapplication.database.MyDataBase;
import com.choinisae.nisaechoi.myapplication.database.MyDbHelper;

/**
 * Created by donghaechoi on 2016. 7. 25..
 */
public class MyFacade {

    private MyDbHelper mHelper;

    public MyFacade(Context context) {
        mHelper = new MyDbHelper(context);
    }

    public long insertDb(String title, String content) {
        // 쓰기 모드로 db 저장소를 얻기
        // 쓰기 권한을 얻지 않으면 데이터 베이스에 쓸 수가 없습니다.
        SQLiteDatabase db = mHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        if (!title.isEmpty() && !content.isEmpty()) {
            values.put(MyDataBase.MyEntry.COLUMN_NAME_TITLE, title);
            values.put(MyDataBase.MyEntry.COLUMN_NAME_CONTENT, content);
            return db.insert(MyDataBase.MyEntry.TABLE_NAME, null, values);
        }
        return -1;
    }

    // 모든 데이터를 가지고 옵니다.
    public Cursor queryAllData() {
        return queryDatas(null, null, null, null, null, null);
    }

    // SQL 문 작성하듯 사용하시면 됩니다. 컬럼 , 그룹바이 해빙 오더 등등. 셀렉션과 셀렉션 아그스는 일반적으로 많이 사용하지 않으므로 null을 넣어도 무방합니다.
    public Cursor queryDatas(String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy) {
        SQLiteDatabase db = mHelper.getReadableDatabase();
        // SQL 문에서 아래와 같이 작성하던걸 Android 에서 여러번 활용하기 위해 이렇게 작성합니다.
        // select * from mydata;
        // SELECT * TABLE_NAME
        return db.query(MyDataBase.MyEntry.TABLE_NAME,
                columns,
                selection,
                selectionArgs,
                groupBy,
                having,
                orderBy);
    }
}
