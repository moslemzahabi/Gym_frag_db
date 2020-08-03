package com.example.gym_frag_db;


import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.gym_frag_db.MainActivity.DayNumber;
import static com.example.gym_frag_db.MainActivity.movments;


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


      init(view);

      setTextView();


    }

    private void init(View view) {


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

        view.findViewById(R.id.bt_weekprogram).setOnClickListener(this);
        view.findViewById(R.id.bt_edit).setOnClickListener(this);


    }
    private void setTextView() {
        int DAY=DayNumber();
        mov1   .setText(String.valueOf(list.get(DAY-1).getDay1 ()))  ;
        mov1_1 .setText(String.valueOf(list.get(DAY-1).getDay11()))  ;
        mov1_2 .setText(String.valueOf(list.get(DAY-1).getDay12()))  ;
        mov1_3 .setText(String.valueOf(list.get(DAY-1).getDay13()))  ;
        mov1_4 .setText(String.valueOf(list.get(DAY-1).getDay14()))  ;

        mov2   .setText(String.valueOf(list.get(DAY-1).getDay2 ()))  ;
        mov2_1 .setText(String.valueOf(list.get(DAY-1).getDay21()))  ;
        mov2_2 .setText(String.valueOf(list.get(DAY-1).getDay22()))  ;
        mov2_3 .setText(String.valueOf(list.get(DAY-1).getDay23()))  ;
        mov2_4 .setText(String.valueOf(list.get(DAY-1).getDay24()))  ;

        mov3   .setText(String.valueOf(list.get(DAY-1).getDay3 ()))  ;
        mov3_1 .setText(String.valueOf(list.get(DAY-1).getDay31()))  ;
        mov3_2 .setText(String.valueOf(list.get(DAY-1).getDay32()))  ;
        mov3_3 .setText(String.valueOf(list.get(DAY-1).getDay33()))  ;
        mov3_4 .setText(String.valueOf(list.get(DAY-1).getDay34()))  ;
        day.setText(String.valueOf(DAY));

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bt_weekprogram){SM.pages(1,DayNumber());}
        if(view.getId()==R.id.bt_edit)       {SM.pages(3,DayNumber());}
    }


    //............................................................interface..............
    interface SendMessage {
        void pages(int Pag_number,int day);

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


