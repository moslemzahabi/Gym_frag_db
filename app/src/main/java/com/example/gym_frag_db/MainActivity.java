package com.example.gym_frag_db;



import android.database.Cursor;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements WeekProgram.SendMessage
        ,DailyProgram.SendMessage,SetProgramMovment.SendMessage{

FragmentManager fragmentManager;
    myDatabaseHelper db;
static List<Movment>list;
static int day;

//.................................................................................................



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=new ArrayList<>();
        db = new myDatabaseHelper(this);


            bulddatabase();
            setData();



        fragmentManager = getSupportFragmentManager();//Get Fragment Manager
        fragmentManager.beginTransaction().replace(R.id.framelayout, new WeekProgram()).commit();

    }


//........................................................................



//.........................................................fragment implement..............
    @Override
    public void pages(int Pag_number,int dayd) {
day=dayd;


        if(Pag_number==1){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new WeekProgram()).commit();
        }
        if(Pag_number==2){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new DailyProgram()).commit();
        }
        if(Pag_number==3){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new SetProgramMovment()).commit();
        }
    }

    @Override
    public void Reaction(int cod) {    setData(); }
    //.........................................................fragment implement..............



    private void bulddatabase() {
        SliderPrefManager pref = new SliderPrefManager(this);


        if (pref.startSlider()) {


            for (int i = 0; i < 7; i++) {
                db.insertData(0);
                pref.setStartSlider(false);
            }
            Toast.makeText(this, "yesssss", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData() {

list.clear();
//فراخوانی تابع Select
        Cursor res=db.ShowallData();

//بررسی خالی بودن جدول
        if(res.getCount()==0){
            Toast.makeText(this,"جدول خالی بود",Toast.LENGTH_LONG).show();

        }
//ایجاد متغیر



//گرفتن تمام داداه های داخل جدول
        while (res.moveToNext()){


      int id       = Integer.valueOf(res.getString(0 ));
      int day1     = Integer.valueOf(res.getString(1 ));
      int day11    = Integer.valueOf(res.getString(2 ));
      int day12    = Integer.valueOf(res.getString(3 ));
      int day13    = Integer.valueOf(res.getString(4 ));
      int day14    = Integer.valueOf(res.getString(5 ));
      int day2     = Integer.valueOf(res.getString(6 ));
      int day21    = Integer.valueOf(res.getString(7 ));
      int day22    = Integer.valueOf(res.getString(8 ));
      int day23    = Integer.valueOf(res.getString(9 ));
      int day24    = Integer.valueOf(res.getString(10));
      int day3     = Integer.valueOf(res.getString(11));
      int day31    = Integer.valueOf(res.getString(12));
      int day32    = Integer.valueOf(res.getString(13));
      int day33    = Integer.valueOf(res.getString(14));
      int day34    = Integer.valueOf(res.getString(15));


            list.add(new Movment(id ,day1,day11,day12,day13,day14,
                                     day2,day21,day22,day23,day24,
                                     day3,day31,day32,day33,day34  ));

        }

    }
    public static int DayNumber(){
        return day;
    }
    public static List<Movment> movments(){
        return list;
    }

}
