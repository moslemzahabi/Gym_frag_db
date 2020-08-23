package com.example.gym_frag_db.storage;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class myDatabaseHelper extends SQLiteOpenHelper {
    private String Db_Name ;
    public static final String TBL_NAME="test";

    public myDatabaseHelper( Context context,String Db_Name) {
        super(context, Db_Name, null, 1);

    }

    @Override

        public void onCreate(SQLiteDatabase db) {
            db.execSQL(" CREATE TABLE " + TBL_NAME + "(Id INTEGER PRIMARY KEY AutoIncrement " +
                    ",day1 INTEGER,day11 INTEGER,set11 INTEGER,num111 INTEGER,num211 INTEGER,day12 INTEGER,set12 INTEGER,num112 INTEGER,num212 INTEGER,day13 INTEGER,set13 INTEGER,num113 INTEGER,num213 INTEGER,day14 INTEGER,set14 INTEGER,num114 INTEGER,num214 INTEGER ,day15 INTEGER,set15 INTEGER,num115 INTEGER ,num215 INTEGER  " +
                    ",day2 INTEGER,day21 INTEGER,set21 INTEGER,num121 INTEGER,num221 INTEGER,day22 INTEGER,set22 INTEGER,num122 INTEGER,num222 INTEGER,day23 INTEGER,set23 INTEGER,num123 INTEGER,num223 INTEGER,day24 INTEGER,set24 INTEGER,num124 INTEGER,num224 INTEGER ,day25 INTEGER,set25 INTEGER,num125 INTEGER ,num225 INTEGER  " +
                    ",day3 INTEGER,day31 INTEGER,set31 INTEGER,num131 INTEGER,num231 INTEGER,day32 INTEGER,set32 INTEGER,num132 INTEGER,num232 INTEGER,day33 INTEGER,set33 INTEGER,num133 INTEGER,num233 INTEGER,day34 INTEGER,set34 INTEGER,num134 INTEGER,num234 INTEGER ,day35 INTEGER,set35 INTEGER,num135 INTEGER ,num235 INTEGER  )");

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
       cv.put("day11",day);  cv.put("set11",day); cv.put("num111",day); cv.put("num211",day);
       cv.put("day12",day);  cv.put("set12",day); cv.put("num112",day); cv.put("num212",day);
       cv.put("day13",day);  cv.put("set13",day); cv.put("num113",day); cv.put("num213",day);
       cv.put("day14",day);  cv.put("set14",day); cv.put("num114",day); cv.put("num214",day);
       cv.put("day15",day);  cv.put("set15",day); cv.put("num115",day); cv.put("num215",day);

       cv.put("day2" ,day);
       cv.put("day21",day);  cv.put("set21",day); cv.put("num121",day); cv.put("num221",day);
       cv.put("day22",day);  cv.put("set22",day); cv.put("num122",day); cv.put("num222",day);
       cv.put("day23",day);  cv.put("set23",day); cv.put("num123",day); cv.put("num223",day);
       cv.put("day24",day);  cv.put("set24",day); cv.put("num124",day); cv.put("num224",day);
       cv.put("day25",day);  cv.put("set25",day); cv.put("num125",day); cv.put("num225",day);

       cv.put("day3" ,day);
       cv.put("day31",day);  cv.put("set31",day); cv.put("num131",day); cv.put("num231",day);
       cv.put("day32",day);  cv.put("set32",day); cv.put("num132",day); cv.put("num232",day);
       cv.put("day33",day);  cv.put("set33",day); cv.put("num133",day); cv.put("num233",day);
       cv.put("day34",day);  cv.put("set34",day); cv.put("num134",day); cv.put("num234",day);
       cv.put("day35",day);  cv.put("set35",day); cv.put("num135",day); cv.put("num235",day);

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
    public boolean updateData( int id,int day1,int day11,int set11,int num111,int num211,int day12,int set12,int num112,int num212,int day13,int set13,int num113,int num213,int day14,int set14,int num114,int num214,int day15,int set15,int num115,int num215,
                                      int day2,int day21,int set21,int num121,int num221,int day22,int set22,int num122,int num222,int day23,int set23,int num123,int num223,int day24,int set24,int num124,int num224,int day25,int set25,int num125,int num225,
                                      int day3,int day31,int set31,int num131,int num231,int day32,int set32,int num132,int num232,int day33,int set33,int num133,int num233,int day34,int set34,int num134,int num234,int day35,int set35,int num135,int num235){

//اتصال به دیتابیس قابل نوشتن
        SQLiteDatabase db=this.getWritableDatabase();

//برای ایجاد جفت مقدار و شناسه ستون
        ContentValues cv=new ContentValues();
        cv.put("day1" ,day1 );
        cv.put("day11",day11);  cv.put("set11",set11);  cv.put("num111",num111);  cv.put("num211",num211);
        cv.put("day12",day12);  cv.put("set12",set12);  cv.put("num112",num112);  cv.put("num212",num212);
        cv.put("day13",day13);  cv.put("set13",set13);  cv.put("num113",num113);  cv.put("num213",num213);
        cv.put("day14",day14);  cv.put("set14",set14);  cv.put("num114",num114);  cv.put("num214",num214);
        cv.put("day15",day15);  cv.put("set15",set15);  cv.put("num115",num115);  cv.put("num215",num215);
        cv.put("day2" ,day2 );
        cv.put("day21",day21);  cv.put("set21",set21);  cv.put("num121",num121);  cv.put("num221",num221);
        cv.put("day22",day22);  cv.put("set22",set22);  cv.put("num122",num122);  cv.put("num222",num222);
        cv.put("day23",day23);  cv.put("set23",set23);  cv.put("num123",num123);  cv.put("num223",num223);
        cv.put("day24",day24);  cv.put("set24",set24);  cv.put("num124",num124);  cv.put("num224",num224);
        cv.put("day25",day25);  cv.put("set25",set25);  cv.put("num125",num125);  cv.put("num225",num225);
        cv.put("day3" ,day3 );
        cv.put("day31",day31);  cv.put("set31",set31);  cv.put("num131",num131);  cv.put("num231",num231);
        cv.put("day32",day32);  cv.put("set32",set32);  cv.put("num132",num132);  cv.put("num232",num232);
        cv.put("day33",day33);  cv.put("set33",set33);  cv.put("num133",num133);  cv.put("num233",num233);
        cv.put("day34",day34);  cv.put("set34",set34);  cv.put("num134",num134);  cv.put("num234",num234);
        cv.put("day35",day35);  cv.put("set35",set35);  cv.put("num135",num135);  cv.put("num235",num235);

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

