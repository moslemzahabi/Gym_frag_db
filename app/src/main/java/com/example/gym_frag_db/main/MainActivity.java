package com.example.gym_frag_db.main;



import android.database.Cursor;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.gym_frag_db.R;
import com.example.gym_frag_db.model.Movment;
import com.example.gym_frag_db.storage.PrefManager;
import com.example.gym_frag_db.storage.myDatabaseHelper;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements WeekProgram.SendMessage
        , DailyProgram.SendMessage, SetProgramMovment.SendMessage, MoveImage.SendMessage{

FragmentManager fragmentManager;
    myDatabaseHelper db;
static List<Movment>list;
static int day;
static  String movmentText;
static  String databasName;
//.................................................................................................



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

databasName=GetDBName();

        list=new ArrayList<>();
       db = new myDatabaseHelper(this,databasName);
     //   db = new myDatabaseHelper(this,"sasan.db");


         bulddatabase();
            setData();



        fragmentManager = getSupportFragmentManager();//Get Fragment Manager
        fragmentManager.beginTransaction().replace(R.id.framelayout, new WeekProgram()).commit();

    }




//........................................................................



//.........................................................fragment implement..............
    @Override
    public void pages(int Pag_number) {



        if(Pag_number==1){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new WeekProgram()).commit();
        }
        if(Pag_number==2){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new DailyProgram()).commit();
        }
        if(Pag_number==3){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new SetProgramMovment()).commit();
        }
        if(Pag_number==4){
            fragmentManager.beginTransaction().replace(R.id.framelayout,new MoveImage()).commit();
        }
    }

    @Override
    public void day_number(int daynumber) {
        day=daynumber;
    }

    @Override
    public void SetTextImage(String text) {
       movmentText=text;
    }

    @Override
    public void Reaction(int cod) {    setData(); }
    //.........................................................fragment implement..............


    public String GetDBName() {
//        String name="noname";
//        Bundle extras = getIntent().getExtras();
//        if (extras.containsKey("dbName")){
//            name=extras.getString("dbName");}
       // return name;
        return "sasan.db";
    }
    private void bulddatabase() {
                PrefManager pref = new PrefManager(this);


        if (pref.getTableName(getDbName())) {


            for (int i = 0; i < 7; i++) {
                db.insertData(0);
                pref.setNewTableName(getDbName(),false);
            }
            Toast.makeText(this, "yesssss", Toast.LENGTH_SHORT).show();
               }

//        PrefManager pref = new PrefManager(this);
//
//
//        if (pref.startSlider()) {
//
//
//            for (int i = 0; i < 7; i++) {
//                db.insertData(0);
//                pref.setStartSlider(false);
//            }
//            Toast.makeText(this, "yesssss", Toast.LENGTH_SHORT).show();
 //       }
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


      int id       = Integer.valueOf(res.getString(0));

      int day1     = Integer.valueOf(res.getString(1));
      int day11    = Integer.valueOf(res.getString(2)) ; int set11    = Integer.valueOf(res.getString(3));   int num111    = Integer.valueOf(res.getString(4)) ;  int num211    = Integer.valueOf(res.getString(5));
      int day12    = Integer.valueOf(res.getString(6)) ; int set12    = Integer.valueOf(res.getString(7));   int num112    = Integer.valueOf(res.getString(8)) ;  int num212    = Integer.valueOf(res.getString(9));
      int day13    = Integer.valueOf(res.getString(10)) ;int set13    = Integer.valueOf(res.getString(11));  int num113    = Integer.valueOf(res.getString(12)) ;  int num213    = Integer.valueOf(res.getString(14));
      int day14    = Integer.valueOf(res.getString(14)) ;int set14    = Integer.valueOf(res.getString(15));  int num114    = Integer.valueOf(res.getString(16)) ;  int num214    = Integer.valueOf(res.getString(17));
      int day15    = Integer.valueOf(res.getString(18)); int set15    = Integer.valueOf(res.getString(19));  int num115    = Integer.valueOf(res.getString(20));  int num215    = Integer.valueOf(res.getString(21));

      int day2     = Integer.valueOf(res.getString(22));
      int day21    = Integer.valueOf(res.getString(23));int set21    = Integer.valueOf(res.getString(24)); int num121    = Integer.valueOf(res.getString(25));  int num221    = Integer.valueOf(res.getString(26));
      int day22    = Integer.valueOf(res.getString(27));int set22    = Integer.valueOf(res.getString(28)); int num122    = Integer.valueOf(res.getString(29));  int num222    = Integer.valueOf(res.getString(30));
      int day23    = Integer.valueOf(res.getString(31));int set23    = Integer.valueOf(res.getString(32)); int num123    = Integer.valueOf(res.getString(33));  int num223    = Integer.valueOf(res.getString(34));
      int day24    = Integer.valueOf(res.getString(35));int set24    = Integer.valueOf(res.getString(34)); int num124    = Integer.valueOf(res.getString(37));  int num224    = Integer.valueOf(res.getString(38));
      int day25    = Integer.valueOf(res.getString(39));int set25    = Integer.valueOf(res.getString(38)); int num125    = Integer.valueOf(res.getString(41));  int num225    = Integer.valueOf(res.getString(42));

      int day3     = Integer.valueOf(res.getString(43));
      int day31    = Integer.valueOf(res.getString(44));int set31    = Integer.valueOf(res.getString(45)); int num131    = Integer.valueOf(res.getString(46));  int num231    = Integer.valueOf(res.getString(47));
      int day32    = Integer.valueOf(res.getString(48));int set32    = Integer.valueOf(res.getString(49)); int num132    = Integer.valueOf(res.getString(50));  int num232    = Integer.valueOf(res.getString(51));
      int day33    = Integer.valueOf(res.getString(52));int set33    = Integer.valueOf(res.getString(53)); int num133    = Integer.valueOf(res.getString(54));  int num233    = Integer.valueOf(res.getString(55));
      int day34    = Integer.valueOf(res.getString(56));int set34    = Integer.valueOf(res.getString(57)); int num134    = Integer.valueOf(res.getString(58));  int num234    = Integer.valueOf(res.getString(59));
      int day35    = Integer.valueOf(res.getString(60));int set35    = Integer.valueOf(res.getString(61)); int num135    = Integer.valueOf(res.getString(62));  int num235    = Integer.valueOf(res.getString(63));

            list.add(new Movment(id ,day1,day11,set11,num111,num211,day12,set12,num112,num212,day13,set13,num113,num213,day14,set14,num114,num214,day15,set15,num115,num215,
                                     day2,day21,set21,num121,num221,day22,set22,num122,num222,day23,set23,num123,num223,day24,set24,num124,num224,day25,set25,num125,num225,
                                     day3,day31,set31,num131,num231,day32,set32,num132,num232,day33,set33,num133,num233,day34,set34,num134,num234,day35,set35,num135,num235   ));

//            Log.i("kirr","0"+res.getString(0));
//            Log.i("kirr","1"+res.getString(1));
//            Log.i("kirr","2"+res.getString(2));
//            Log.i("kirr","3"+res.getString(3));
//            Log.i("kirr","4"+res.getString(4));
//            Log.i("kirr","5"+res.getString(5));
//            Log.i("kirr","6"+res.getString(6));
//            Log.i("kirr","7"+res.getString(7));
//            Log.i("kirr","8"+res.getString(8));
//            Log.i("kirr","9"+res.getString(9));
//            Log.i("kirr","10"+res.getString(10));
//            Log.i("kirr","11"+res.getString(11));
//            Log.i("kirr","12"+res.getString(12));
//            Log.i("kirr","13"+res.getString(13));
//            Log.i("kirr","14"+res.getString(14));
//            Log.i("kirr","15"+res.getString(15));
//            Log.i("kirr","16"+res.getString(16));
//            Log.i("kirr","17"+res.getString(17));
//            Log.i("kirr","18"+res.getString(18));
//            Log.i("kirr","19"+res.getString(19));
//            Log.i("kirr","20"+res.getString(20));
//            Log.i("kirr","21"+res.getString(21));
//            Log.i("kirr","22"+res.getString(22));
//            Log.i("kirr","23"+res.getString(23));
//            Log.i("kirr","24"+res.getString(24));
//            Log.i("kirr","25"+res.getString(25));
//            Log.i("kirr","26"+res.getString(26));
//            Log.i("kirr","27"+res.getString(27));
//            Log.i("kirr","28"+res.getString(28));
//            Log.i("kirr","29"+res.getString(29));
//            Log.i("kirr","30"+res.getString(30));
//            Log.i("kirr","31"+res.getString(31));
//            Log.i("kirr","32"+res.getString(32));
//            Log.i("kirr","33"+res.getString(33));
//            Log.i("kirr","34"+res.getString(34));
//            Log.i("kirr","35"+res.getString(35));
//            Log.i("kirr","36"+res.getString(36));
//            Log.i("kirr","37"+res.getString(37));
//            Log.i("kirr","38"+res.getString(38));
//            Log.i("kirr","39"+res.getString(39));
//            Log.i("kirr","40"+res.getString(40));
//            Log.i("kirr","41"+res.getString(41));
//            Log.i("kirr","42"+res.getString(42));
//            Log.i("kirr","43"+res.getString(43));
//            Log.i("kirr","44"+res.getString(44));
//            Log.i("kirr","45"+res.getString(45));
//            Log.i("kirr","46"+res.getString(46));
//            Log.i("kirr","47"+res.getString(47));
//            Log.i("kirr","48"+res.getString(48));
//            Log.i("kirr","49"+res.getString(49));
//            Log.i("kirr","50"+res.getString(50));
//            Log.i("kirr","51"+res.getString(51));
//            Log.i("kirr","52"+res.getString(52));
//            Log.i("kirr","53"+res.getString(53));
//            Log.i("kirr","54"+res.getString(54));
//            Log.i("kirr","55"+res.getString(55));
//            Log.i("kirr","56"+res.getString(56));
//            Log.i("kirr","57"+res.getString(57));
//            Log.i("kirr","58"+res.getString(58));
//            Log.i("kirr","59"+res.getString(59));
//            Log.i("kirr","60"+res.getString(60));
//            Log.i("kirr","61"+res.getString(61));
//            Log.i("kirr","62"+res.getString(62));
//            Log.i("kirr","63"+res.getString(63));
        }

    }
    public static int DayNumber(){
        return day;
    }
    public static String getDbName(){

     return databasName;
    }
    public static List<Movment> movments(){
        return list;
    }
    public static String MovmentImageText(){   return movmentText;}
}
