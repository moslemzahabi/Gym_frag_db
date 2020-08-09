package com.example.gym_frag_db.storage;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class myDatabaseHelper extends SQLiteOpenHelper {
    private String Db_Name ;
    public static final String TBL_NAME="test" ;

    public myDatabaseHelper( Context context,String Db_Name) {
        super(context, Db_Name, null, 1);

    }

    @Override

        public void onCreate(SQLiteDatabase db) {
            db.execSQL(" CREATE TABLE " + TBL_NAME + "(Id INTEGER PRIMARY KEY AutoIncrement " +
                    ",day1 INTEGER,day11 INTEGER,day12 INTEGER,day13 INTEGER,day14 INTEGER " +
                    ",day2 INTEGER,day21 INTEGER,day22 INTEGER,day23 INTEGER,day24 INTEGER " +
                    ",day3 INTEGER,day31 INTEGER,day32 INTEGER,day33 INTEGER,day34 INTEGER )");

        }


    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TBL_NAME);
        onCreate(db);
    }

    //_________________________________________________________________________________________________
    //تابع اضافه کردن
    public boolean insertData(int day)
   {

//دیتابیس قابل نوشتن می شود
        SQLiteDatabase db=this.getWritableDatabase();

//برای ایجاد جفت مقدار و شناسه ستون
       ContentValues cv=new ContentValues();


       cv.put("day1" ,day);
       cv.put("day11",day);
       cv.put("day12",day);
       cv.put("day13",day);
       cv.put("day14",day);

       cv.put("day2" ,day);
       cv.put("day21",day);
       cv.put("day22",day);
       cv.put("day23",day);
       cv.put("day24",day);

       cv.put("day3" ,day);
       cv.put("day31",day);
       cv.put("day32",day);
       cv.put("day33",day);
       cv.put("day34",day);


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
    public boolean updateData( int id,int day1,int day11,int day12,int day13,int day14,
                                      int day2,int day21,int day22,int day23,int day24,
                                      int day3,int day31,int day32,int day33,int day34){

//اتصال به دیتابیس قابل نوشتن
        SQLiteDatabase db=this.getWritableDatabase();

//برای ایجاد جفت مقدار و شناسه ستون
        ContentValues cv=new ContentValues();
        cv.put("day1" ,day1 );
        cv.put("day11",day11);
        cv.put("day12",day12);
        cv.put("day13",day13);
        cv.put("day14",day14);
        cv.put("day2" ,day2 );
        cv.put("day21",day21);
        cv.put("day22",day22);
        cv.put("day23",day23);
        cv.put("day24",day24);
        cv.put("day3" ,day3 );
        cv.put("day31",day31);
        cv.put("day32",day32);
        cv.put("day33",day33);
        cv.put("day34",day34);


//آپدیت اطلاعات دیتابیس
        long result=db.update(TBL_NAME,cv,"Id=?",new String [] {String.valueOf(id)});

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

