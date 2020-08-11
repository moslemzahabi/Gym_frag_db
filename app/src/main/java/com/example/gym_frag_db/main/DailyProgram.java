package com.example.gym_frag_db.main;


import android.content.Context;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
         mov1 , mov2 , mov3 ,
         mov1_1,mov2_1,mov3_1,
         mov1_2,mov2_2,mov3_2,
         mov1_3,mov2_3,mov3_3,
         mov1_4,mov2_4,mov3_4;

List<Movment>list;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.fragment_daily_program, container, false);

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


        day      =view.findViewById(R.id.day     )  ;

        mov1     =view.findViewById(R.id. mov1   )  ;
        mov1_1   =view.findViewById(R.id. mov1_1 )  ;
        mov1_2   =view.findViewById(R.id. mov1_2 )  ;
        mov1_3   =view.findViewById(R.id. mov1_3 )  ;
        mov1_4   =view.findViewById(R.id. mov1_4 )  ;

        mov2     =view.findViewById(R.id. mov2   )  ;
        mov2_1   =view.findViewById(R.id. mov2_1 )  ;
        mov2_2   =view.findViewById(R.id. mov2_2 )  ;
        mov2_3   =view.findViewById(R.id. mov2_3 )  ;
        mov2_4   =view.findViewById(R.id. mov2_4 )  ;

        mov3     =view.findViewById(R.id. mov3   )  ;
        mov3_1   =view.findViewById(R.id. mov3_1 )  ;
        mov3_2   =view.findViewById(R.id. mov3_2 )  ;
        mov3_3   =view.findViewById(R.id. mov3_3 )  ;
        mov3_4   =view.findViewById(R.id. mov3_4 )  ;




    }
    private void initButton(View view){

        view.findViewById(R.id.bt_weekprogram).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SM.pages(1);
            }
        });
        view.findViewById(R.id.bt_edit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SM.pages(3);
            }
        });

    }

    private void setTextView() {
        int DAY=DayNumber();
            day.setText(returnday(DAY));
        mov1   .setText(IntToText   (list.get(DAY-1).getDay1 ()))                             ;
        mov1_1 .setText(IntToTextSub(list.get(DAY-1).getDay1 (),list.get(DAY-1).getDay11()))  ;
        mov1_2 .setText(IntToTextSub(list.get(DAY-1).getDay1 (),list.get(DAY-1).getDay12()))  ;
        mov1_3 .setText(IntToTextSub(list.get(DAY-1).getDay1 (),list.get(DAY-1).getDay13()))  ;
        mov1_4 .setText(IntToTextSub(list.get(DAY-1).getDay1 (),list.get(DAY-1).getDay14()))  ;

        mov2   .setText(IntToText   (list.get(DAY-1).getDay2 ()))                             ;
        mov2_1 .setText(IntToTextSub(list.get(DAY-1).getDay2 (),list.get(DAY-1).getDay21()))  ;
        mov2_2 .setText(IntToTextSub(list.get(DAY-1).getDay2 (),list.get(DAY-1).getDay22()))  ;
        mov2_3 .setText(IntToTextSub(list.get(DAY-1).getDay2 (),list.get(DAY-1).getDay23()))  ;
        mov2_4 .setText(IntToTextSub(list.get(DAY-1).getDay2 (),list.get(DAY-1).getDay24()))  ;

        mov3   .setText(IntToText   (list.get(DAY-1).getDay3 ()))                             ;
        mov3_1 .setText(IntToTextSub(list.get(DAY-1).getDay3 (),list.get(DAY-1).getDay31()))  ;
        mov3_2 .setText(IntToTextSub(list.get(DAY-1).getDay3 (),list.get(DAY-1).getDay32()))  ;
        mov3_3 .setText(IntToTextSub(list.get(DAY-1).getDay3 (),list.get(DAY-1).getDay33()))  ;
        mov3_4 .setText(IntToTextSub(list.get(DAY-1).getDay3 (),list.get(DAY-1).getDay34()))  ;



        mov1_1.setOnClickListener(this);
        mov1_2.setOnClickListener(this);
        mov1_3.setOnClickListener(this);
        mov1_4.setOnClickListener(this);
        mov2_1.setOnClickListener(this);
        mov2_2.setOnClickListener(this);
        mov2_3.setOnClickListener(this);
        mov2_4.setOnClickListener(this);
        mov3_1.setOnClickListener(this);
        mov3_2.setOnClickListener(this);
        mov3_3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
TextView v= (TextView) view;

SM.SetTextImage(v.getText().toString());
SM.pages(4);

    }

    private String IntToTextSub(int mov,int submov){
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
        String m="";
       switch (mov){
           case 1: m= "پرس سینه";break;
           case 2: m= "سرشانه";break;
           case 3: m= "جلو بازو";break;
           case 4: m= "پشت بازو";break;
           case 5: m= "زیربغل";break;
           case 6: m= "کول";break;

       }

        return m;

    }

    private  String returnday(int Daynumber){
    String a;
    switch(Daynumber){
        case 1 : a= "شنبه" ; break;
        case 2 : a= "یکشنبه" ;break;
        case 3 : a= "دوشنبه" ;break;
        case 4 : a= "سه شنبه" ;break;
        case 5 : a= "چهارشنبه" ;break;
        case 6 : a= "پنجشنبه" ;break;
        case 7 : a= "جمعه" ;break;
        default: a= "00000";break;
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


