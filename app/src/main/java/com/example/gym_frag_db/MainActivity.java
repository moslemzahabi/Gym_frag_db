package com.example.gym_frag_db;



import android.database.Cursor;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements WeekProgram.SendMessage {

FragmentManager fragmentManager;
myDatabaseHelper db;
List<Movment>list;


//.................................................................................................



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



bulddatabase();
//        setData();



        fragmentManager = getSupportFragmentManager();//Get Fragment Manager
        fragmentManager.beginTransaction().replace(R.id.framelayout, new WeekProgram()).commit();

    }


//........................................................................






    private void bulddatabase() {
        SliderPrefManager pref = new SliderPrefManager(this);


        if (pref.startSlider()) {

            db = new myDatabaseHelper(this);
            for (int i = 0; i < 7; i++) {
                db.insertData();
                pref.setStartSlider(false);
            }
            Toast.makeText(this, "yesssss", Toast.LENGTH_SHORT).show();
        }
    }


    public void pages(int Pag_number) {
//        if(Pag_number==-2){
//            fragmentManager.beginTransaction().replace(R.id.framelayout,new ManagerFragment()).commit();
//        }
//        if(Pag_number==-1){
//            fragmentManager.beginTransaction().replace(R.id.framelayout,new IntrooFragment()).commit();
//        }
//        if(Pag_number==0){
//            fragmentManager.beginTransaction().replace(R.id.framelayout,new PersonalInformation()).commit();
//        }


    }


    public void data() {

    }


    private void setData() {

     //   myDatabaseHelper mydb = new myDatabaseHelper(this);


//فراخوانی تابع Select
        Cursor res=db.ShowallData();

//بررسی خالی بودن جدول
        if(res.getCount()==0){
            Toast.makeText(this,"جدول خالی بود",Toast.LENGTH_LONG).show();

        }
//ایجاد متغیر

        list=new ArrayList<>();
//گرفتن تمام داداه های داخل جدول
        while (res.moveToNext()){


      int id       = Integer.valueOf(res.getString(0 ));
      int day1     = Integer.valueOf(res.getString(1 ));
      int day2     = Integer.valueOf(res.getString(2 ));
      int day3     = Integer.valueOf(res.getString(3 ));
      int day4     = Integer.valueOf(res.getString(4 ));
      int day11    = Integer.valueOf(res.getString(5 ));
      int day21    = Integer.valueOf(res.getString(6 ));
      int day31    = Integer.valueOf(res.getString(7 ));
      int day41    = Integer.valueOf(res.getString(8 ));
      int day12    = Integer.valueOf(res.getString(9 ));
      int day22    = Integer.valueOf(res.getString(10));
      int day32    = Integer.valueOf(res.getString(11));
      int day42    = Integer.valueOf(res.getString(12));
      int day13    = Integer.valueOf(res.getString(13));
      int day23    = Integer.valueOf(res.getString(14));
      int day33    = Integer.valueOf(res.getString(15));
      int day43    = Integer.valueOf(res.getString(16));


            list.add(new Movment(id  ,day1 , day2 ,day3 ,day4 ,
                                      day11, day21,day31,day41,
                                      day12, day22,day32,day42,
                                      day13, day23,day33,day43 ));

        }




    }


}
