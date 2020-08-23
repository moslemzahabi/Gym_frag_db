package com.example.gym_frag_db.main;


import android.content.Context;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.example.gym_frag_db.R;
import com.example.gym_frag_db.model.Movment;

import java.util.ArrayList;
import java.util.List;

import static com.example.gym_frag_db.main.MainActivity.DayNumber;
import static com.example.gym_frag_db.main.MainActivity.movments;


public class DailyProgram extends Fragment implements View.OnClickListener {

SendMessage SM;

 TextView day,
         mov1  ,       mov2 ,        mov3 ,
         mov11,set11,num111,num211,mov21,set21,num121,num221,mov31,set31,num131,num231,
         mov12,set12,num112,num212,mov22,set22,num122,num222,mov32,set32,num132,num232,
         mov13,set13,num113,num213,mov23,set23,num123,num223,mov33,set33,num133,num233,
         mov14,set14,num114,num214,mov24,set24,num124,num224,mov34,set34,num134,num234,
         mov15,set15,num115,num215,mov25,set25,num125,num225,mov35,set35,num135,num235;
List<Movment>list;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.daylyprogram, container, false);

        list = new ArrayList<>();
        list =movments();



        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


      initTextView(view);
      initButton(view);
      setTextView();


    }

    private void initTextView(View view) {


        day     =view.findViewById(R.id.day   )  ;

        mov1    =view.findViewById(R.id. mov1 )  ;
        mov11   =view.findViewById(R.id. mov11)  ;
        mov12   =view.findViewById(R.id. mov12)  ;
        mov13   =view.findViewById(R.id. mov13)  ;
        mov14   =view.findViewById(R.id. mov14)  ;
        mov15   =view.findViewById(R.id. mov15)  ;

        set11   =view.findViewById(R.id.set11  )  ;
        set12   =view.findViewById(R.id. set12 )  ;
        set13   =view.findViewById(R.id. set13 )  ;
        set14   =view.findViewById(R.id. set14 )  ;
        set15   =view.findViewById(R.id. set15 )  ;

        num111   =view.findViewById(R.id. num111 )  ;
        num112   =view.findViewById(R.id. num112 )  ;
        num113   =view.findViewById(R.id. num113 )  ;
        num114   =view.findViewById(R.id. num114 )  ;
        num115   =view.findViewById(R.id. num115 )  ;

        num211   =view.findViewById(R.id. num211 )  ;
        num212   =view.findViewById(R.id. num212 )  ;
        num213   =view.findViewById(R.id. num213 )  ;
        num214   =view.findViewById(R.id. num214 )  ;
        num215   =view.findViewById(R.id. num215 )  ;
       //..............................................................

        mov2    =view.findViewById(R.id. mov2  )  ;
        mov21   =view.findViewById(R.id. mov21 )  ;
        mov22   =view.findViewById(R.id. mov22 )  ;
        mov23   =view.findViewById(R.id. mov23 )  ;
        mov24   =view.findViewById(R.id. mov24 )  ;
        mov25   =view.findViewById(R.id. mov25 )  ;


        set21   =view.findViewById(R.id. set21 )  ;
        set22   =view.findViewById(R.id. set22 )  ;
        set23   =view.findViewById(R.id. set23 )  ;
        set24   =view.findViewById(R.id. set24 )  ;
        set25   =view.findViewById(R.id. set25 )  ;

        num121   =view.findViewById(R.id. num121 )  ;
        num122   =view.findViewById(R.id. num122 )  ;
        num123   =view.findViewById(R.id. num123 )  ;
        num124   =view.findViewById(R.id. num124 )  ;
        num125   =view.findViewById(R.id. num125 )  ;

        num221   =view.findViewById(R.id. num221 )  ;
        num222   =view.findViewById(R.id. num222 )  ;
        num223   =view.findViewById(R.id. num223 )  ;
        num224   =view.findViewById(R.id. num224 )  ;
        num225   =view.findViewById(R.id. num225 )  ;

        //................................................................
        mov3    =view.findViewById(R.id. mov3   )  ;
        mov31   =view.findViewById(R.id. mov31 )  ;
        mov32   =view.findViewById(R.id. mov32 )  ;
        mov33   =view.findViewById(R.id. mov33 )  ;
        mov34   =view.findViewById(R.id. mov34 )  ;
        mov35   =view.findViewById(R.id. mov35 )  ;

        set31   =view.findViewById(R.id. set31 )  ;
        set32   =view.findViewById(R.id. set32 )  ;
        set33   =view.findViewById(R.id. set33 )  ;
        set34   =view.findViewById(R.id. set34 )  ;
        set35   =view.findViewById(R.id. set35 )  ;

        num131   =view.findViewById(R.id. num131 )  ;
        num132   =view.findViewById(R.id. num132 )  ;
        num133   =view.findViewById(R.id. num133 )  ;
        num134   =view.findViewById(R.id. num134 )  ;
        num135   =view.findViewById(R.id. num135 )  ;

        num231   =view.findViewById(R.id. num231 )  ;
        num232   =view.findViewById(R.id. num232 )  ;
        num233   =view.findViewById(R.id. num233 )  ;
        num234   =view.findViewById(R.id. num234 )  ;
        num235   =view.findViewById(R.id. num235 )  ;

    }

    private void initButton(View view){

        view.findViewById(R.id.weekprogram).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {  SM.pages(1);  }



        });
        view.findViewById(R.id.edite).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SM.pages(3);
            }
        });

    }

    private void setTextView() {
        int DAY=DayNumber();
            day.setText("  برنامه روز  "+returnday(DAY));
        mov1   .setText(IntToText  (list.get(DAY-1).getDay1 ()))                             ;
        mov11 .setText(IntToTextSub(list.get(DAY-1).getDay1 (),list.get(DAY-1).getDay11()))  ;
        mov12 .setText(IntToTextSub(list.get(DAY-1).getDay1 (),list.get(DAY-1).getDay12()))  ;
        mov13 .setText(IntToTextSub(list.get(DAY-1).getDay1 (),list.get(DAY-1).getDay13()))  ;
        mov14 .setText(IntToTextSub(list.get(DAY-1).getDay1 (),list.get(DAY-1).getDay14()))  ;
        mov15 .setText(IntToTextSub(list.get(DAY-1).getDay1 (),list.get(DAY-1).getDay15()))  ;

        set11 .setText(String.valueOf(list.get(DAY-1).getSet11()));
        set12 .setText(String.valueOf(list.get(DAY-1).getSet12()));
        set13 .setText(String.valueOf(list.get(DAY-1).getSet13()));
        set14 .setText(String.valueOf(list.get(DAY-1).getSet14()));
        set15 .setText(String.valueOf(list.get(DAY-1).getSet15()));

        num111 .setText(String.valueOf(list.get(DAY-1).getNum111()));
        num112 .setText(String.valueOf(list.get(DAY-1).getNum112()));
        num113 .setText(String.valueOf(list.get(DAY-1).getNum113()));
        num114 .setText(String.valueOf(list.get(DAY-1).getNum114()));
        num115 .setText(String.valueOf(list.get(DAY-1).getNum115()));

        num211 .setText(String.valueOf(list.get(DAY-1).getNum211()));
        num212 .setText(String.valueOf(list.get(DAY-1).getNum212()));
        num213 .setText(String.valueOf(list.get(DAY-1).getNum213()));
        num214 .setText(String.valueOf(list.get(DAY-1).getNum214()));
        num215 .setText(String.valueOf(list.get(DAY-1).getNum215()));
     //.................................................................


        mov2  .setText(IntToText    (list.get(DAY-1).getDay2 ()))                             ;
        mov21 .setText(IntToTextSub(list.get(DAY-1).getDay2 (),list.get(DAY-1).getDay21()))  ;
        mov22 .setText(IntToTextSub(list.get(DAY-1).getDay2 (),list.get(DAY-1).getDay22()))  ;
        mov23 .setText(IntToTextSub(list.get(DAY-1).getDay2 (),list.get(DAY-1).getDay23()))  ;
        mov24 .setText(IntToTextSub(list.get(DAY-1).getDay2 (),list.get(DAY-1).getDay24()))  ;
        mov25 .setText(IntToTextSub(list.get(DAY-1).getDay2 (),list.get(DAY-1).getDay25()))  ;

        set21 .setText(String.valueOf(list.get(DAY-1).getSet21()));
        set22 .setText(String.valueOf(list.get(DAY-1).getSet22()));
        set23 .setText(String.valueOf(list.get(DAY-1).getSet23()));
        set24 .setText(String.valueOf(list.get(DAY-1).getSet24()));
        set25 .setText(String.valueOf(list.get(DAY-1).getSet25()));

        num121 .setText(String.valueOf(list.get(DAY-1).getNum121()));
        num122 .setText(String.valueOf(list.get(DAY-1).getNum122()));
        num123 .setText(String.valueOf(list.get(DAY-1).getNum123()));
        num124 .setText(String.valueOf(list.get(DAY-1).getNum124()));
        num125 .setText(String.valueOf(list.get(DAY-1).getNum125()));

        num221 .setText(String.valueOf(list.get(DAY-1).getNum221()));
        num222 .setText(String.valueOf(list.get(DAY-1).getNum222()));
        num223 .setText(String.valueOf(list.get(DAY-1).getNum223()));
        num224 .setText(String.valueOf(list.get(DAY-1).getNum224()));
        num225 .setText(String.valueOf(list.get(DAY-1).getNum225()));
       //..................................................................

        mov3  .setText(IntToText   (list.get(DAY-1).getDay3 ()))                             ;
        mov31 .setText(IntToTextSub(list.get(DAY-1).getDay3 (),list.get(DAY-1).getDay31()))  ;
        mov32 .setText(IntToTextSub(list.get(DAY-1).getDay3 (),list.get(DAY-1).getDay32()))  ;
        mov33 .setText(IntToTextSub(list.get(DAY-1).getDay3 (),list.get(DAY-1).getDay33()))  ;
        mov34 .setText(IntToTextSub(list.get(DAY-1).getDay3 (),list.get(DAY-1).getDay34()))  ;
        mov35 .setText(IntToTextSub(list.get(DAY-1).getDay3 (),list.get(DAY-1).getDay35()))  ;

        set31 .setText(String.valueOf(list.get(DAY-1).getSet31()));
        set32 .setText(String.valueOf(list.get(DAY-1).getSet32()));
        set33 .setText(String.valueOf(list.get(DAY-1).getSet33()));
        set34 .setText(String.valueOf(list.get(DAY-1).getSet34()));
        set35 .setText(String.valueOf(list.get(DAY-1).getSet35()));

        num131 .setText(String.valueOf(list.get(DAY-1).getNum131()));
        num132 .setText(String.valueOf(list.get(DAY-1).getNum132()));
        num133 .setText(String.valueOf(list.get(DAY-1).getNum133()));
        num134 .setText(String.valueOf(list.get(DAY-1).getNum134()));
        num135 .setText(String.valueOf(list.get(DAY-1).getNum135()));

        num231 .setText(String.valueOf(list.get(DAY-1).getNum231()));
        num232 .setText(String.valueOf(list.get(DAY-1).getNum232()));
        num233 .setText(String.valueOf(list.get(DAY-1).getNum233()));
        num234 .setText(String.valueOf(list.get(DAY-1).getNum234()));
        num235 .setText(String.valueOf(list.get(DAY-1).getNum235()));

//.........................................................................
        mov11.setOnClickListener(this);
        mov12.setOnClickListener(this);
        mov13.setOnClickListener(this);
        mov14.setOnClickListener(this);
        mov15.setOnClickListener(this);
        mov21.setOnClickListener(this);
        mov22.setOnClickListener(this);
        mov23.setOnClickListener(this);
        mov24.setOnClickListener(this);
        mov25.setOnClickListener(this);
        mov31.setOnClickListener(this);
        mov32.setOnClickListener(this);
        mov33.setOnClickListener(this);
        mov34.setOnClickListener(this);
        mov35.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
TextView v= (TextView) view;

SM.SetTextImage(v.getText().toString());
SM.pages(4);

    }


    private String IntToTextSub(int mov,int submov){


        String[][]Submov={getResources().getStringArray(R.array. noting),
        getResources().getStringArray(R.array. peres),
        getResources().getStringArray(R.array. sarshaneh ),
        getResources().getStringArray(R.array. jelobazoo ),
        getResources().getStringArray(R.array. poshtbazoo),
        getResources().getStringArray(R.array. zirbaghal ),
        getResources().getStringArray(R.array. kool)};
        try{Log.i("kir",Submov[mov][submov]);}  catch (Exception e){Log.i("kirrr","kirrr");}
        return Submov[mov][submov];

    }
    private String IntToTextSub2(int mov,int submov){


        String s="";

      if (mov==1){
          switch (submov){

              case 0:  s= "پرس 1"; break;
              case 1:  s= "پرس 2"; break;
              case 2:  s= "پرس 3"; break;
              case 3:  s= "پرس 4"; break;
              case 4:  s= "پرس 5"; break;
              case 5:  s= "پرس 6"; break;
          }
      }
        if (mov==2){
            switch (submov){

                case 0:  s= "سرشانه 1";break;
                case 1:  s= "سرشانه 2";break;
                case 2:  s= "سرشانه 3";break;
                case 3:  s= "سرشانه 4";break;
                case 4:  s= "سرشانه 5";break;
            }
        }
        if (mov==3){
            switch (submov){

                case 0:  s= "جلوبازو 1";break;
                case 1:  s= "جلوبازو 2";break;
                case 2:  s= "جلوبازو 3";break;
                case 3:  s= "جلوبازو 4";break;
                case 4:  s= "جلوبازو 5";break;
            }
        }
        if (mov==4){
            switch (submov){

                case 0:  s= "پشتبازو 1";break;
                case 1:  s= "پشتبازو 2";break;
                case 2:  s= "پشتبازو 3";break;
                case 3:  s= "پشتبازو 4";break;
                case 4:  s= "پشتبازو 5";break;
            }
        }
        if (mov==5){
            switch (submov){

                case 0:  s= "زیربغل 1";break;
                case 1:  s= "زیربغل 2";break;
                case 2:  s= "زیربغل 3";break;
                case 3:  s= "زیربغل 4";break;
                case 4:  s= "زیربغل 5";break;
            }
        }
        if (mov==6){
            switch (submov){

                case 0:  s= "کول 1";break;
                case 1:  s= "کول 2";break;
                case 2:  s= "کول 3";break;
                case 3:  s= "کول 4";break;
                case 4:  s= "کول 5";break;
            }
        }


        return s;

    }
    private String IntToText(int mov){
//        String m="";
//       switch (mov){
//           case 1: m= "پرس سینه";break;
//           case 2: m= "سرشانه"  ;break;
//           case 3: m= "جلو بازو";break;
//           case 4: m= "پشت بازو";break;
//           case 5: m= "زیربغل"  ;break;
//           case 6: m= "کول"     ;break;
//
//       }
//
//        return m;
        String[]   movName       =getResources().getStringArray(R.array.exersise   )  ;
        return movName[mov];
    }
    private  String returnday(int Daynumber){
    String a;
    switch(Daynumber){
        case 1 : a= "شنبه"     ;break;
        case 2 : a= "یکشنبه"   ;break;
        case 3 : a= "دوشنبه"   ;break;
        case 4 : a= "سه شنبه"  ;break;
        case 5 : a= "چهارشنبه" ;break;
        case 6 : a= "پنجشنبه"  ;break;
        case 7 : a= "جمعه"     ;break;
        default: a= "00000"    ;break;
    }
return a;
}



    //............................................................interface..............
    interface SendMessage {
        void pages(int Pag_number);
        void SetTextImage(String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            SM = (SendMessage) getActivity();
        } catch (ClassCastException e) {

        }
    }
//............................................................interface..............


    }


