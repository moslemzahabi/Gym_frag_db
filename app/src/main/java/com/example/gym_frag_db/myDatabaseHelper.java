package com.example.gym_frag_db;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class myDatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME ="gym.db" ;
    public static final String TBL_NAME="test" ;

    public myDatabaseHelper( Context context) {
        super(context, DB_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + TBL_NAME + "(Id INTEGER PRIMARY KEY AutoIncrement " +
                ",day1 INTEGER,day11 INTEGER,day12 INTEGER,day13 INTEGER " +
                ",day2 INTEGER,day21 INTEGER,day22 INTEGER,day23 INTEGER " +
                ",day3 INTEGER,day31 INTEGER,day32 INTEGER,day33 INTEGER " +
                ",day4 INTEGER,day41 INTEGER,day42 INTEGER,day43 INTEGER )");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TBL_NAME);
        onCreate(db);
    }






    //_________________________________________________________________________________________________
    //تابع اضافه کردن
    public boolean insertData( )
   {

//دیتابیس قابل نوشتن می شود
        SQLiteDatabase db=this.getWritableDatabase();

//برای ایجاد جفت مقدار و شناسه ستون
       ContentValues cv=new ContentValues();
       cv.put("day1" ,5);
       cv.put("day2" ,5);
       cv.put("day3" ,5);
       cv.put("day4" ,5);
       cv.put("day11",5);
       cv.put("day21",5);
       cv.put("day31",5);
       cv.put("day41",5);
       cv.put("day12",5);
       cv.put("day22",5);
       cv.put("day32",5);
       cv.put("day42",5);
       cv.put("day13",5);
       cv.put("day23",5);
       cv.put("day33",5);
       cv.put("day43",5);


//وارد کردن اطلاعات به دیتابیس
        long result=db.insert(TBL_NAME,null,cv);

//بررسی وارد شدن اطلاعات به دیتابیس
        if(result==-1)
            return false;
        else
            return true;
    }
//_________________________________________________________________________________

    //تابع حذف کردن
    public boolean deleteData(String id){

//اتصال به دیتابیس قابل نوشتن
        SQLiteDatabase db=this.getWritableDatabase();

//حذف اطلاعات از دیتابیس
        long result=db.delete(TBL_NAME,"Id=?",new String[] {id});

//بررسی حذف اطلاعات
        if(result==0)
            return false;
        else
            return true;
    }

//_________________________________________________________________________________________


    //تابع آپدیت
    public boolean updateData(String txt,String txt1,String txt2,String txt3,String txt4){

//اتصال به دیتابیس قابل نوشتن
        SQLiteDatabase db=this.getWritableDatabase();

//برای ایجاد جفت مقدار و شناسه ستون
        ContentValues cv=new ContentValues();
        cv.put("day1" ,0);
        cv.put("day2" ,0);
        cv.put("day3" ,0);
        cv.put("day4" ,0);
        cv.put("day11",0);
        cv.put("day21",0);
        cv.put("day31",0);
        cv.put("day41",0);
        cv.put("day12",0);
        cv.put("day22",0);
        cv.put("day32",0);
        cv.put("day42",0);
        cv.put("day13",0);
        cv.put("day23",0);
        cv.put("day33",0);
        cv.put("day43",0);

//آپدیت اطلاعات دیتابیس
        long result=db.update(TBL_NAME,cv,"Id=?",new String [] {"1"});

//بررسی آپدیت اطلاعات
        if(result<1)
            return false;
        else
            return true;
    }
//__________________________________________________________________________________________


    public Cursor ShowallData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor result=db.rawQuery("select * from " + TBL_NAME ,null);

        return result;
    }





}

