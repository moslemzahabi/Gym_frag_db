package com.example.gym_frag_db.main;


import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import com.example.gym_frag_db.R;
import com.example.gym_frag_db.model.Movment;
import com.example.gym_frag_db.storage.myDatabaseHelper;

import java.util.ArrayList;
import java.util.List;

import static com.example.gym_frag_db.main.MainActivity.DayNumber;
import static com.example.gym_frag_db.main.MainActivity.getDbName;
import static com.example.gym_frag_db.main.MainActivity.movments;


public class SetProgramMovment extends Fragment implements View.OnClickListener {

SendMessage SM;

List<Movment>list;

TextView tv_day;
    Spinner
            mov1  ,       mov2  ,       mov3  ,
            mov11,set11,num111,num211,mov21,set21,num121,num221,mov31,set31,num131,num231,
            mov12,set12,num112,num212,mov22,set22,num122,num222,mov32,set32,num132,num232,
            mov13,set13,num113,num213,mov23,set23,num123,num223,mov33,set33,num133,num233,
            mov14,set14,num114,num214,mov24,set24,num124,num224,mov34,set34,num134,num234,
            mov15,set15,num115,num215,mov25,set25,num125,num225,mov35,set35,num135,num235;






    ArrayAdapter<String> adapter ;
    ArrayAdapter<String> adapter0;
    ArrayAdapter<String> adapter1;
    ArrayAdapter<String> adapter2;
    ArrayAdapter<String> adapter3;
    ArrayAdapter<String> adapter4;
    ArrayAdapter<String> adapter5;
    ArrayAdapter<String> adapter6;

    ArrayAdapter<String> numberAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                View rootView = inflater.inflate(
                R.layout.test2, container, false);



       list=new ArrayList<>();
        list =movments();


        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
init(view);
setArray();
setmoveAdapter();
setMove();
    }

    private void init(View view) {


        tv_day  =view.findViewById(R.id.day     )   ;

        mov1    =view.findViewById(R.id. mov1   )   ;
        mov11   =view.findViewById(R.id. mov1_1 )   ;
        mov12   =view.findViewById(R.id. mov1_2 )   ;
        mov13   =view.findViewById(R.id. mov1_3 )   ;
        mov14   =view.findViewById(R.id.mov1_4  )   ;
        mov15   =view.findViewById(R.id.mov1_5  )   ;

        set11    =view.findViewById(R.id.set11)   ;
        set12    =view.findViewById(R.id. set12 )   ;
        set13    =view.findViewById(R.id. set13 )   ;
        set14    =view.findViewById(R.id. set14 )   ;
        set15    =view.findViewById(R.id. set15 )   ;

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

        //...............................................................

        mov2     =view.findViewById(R.id. mov2   )  ;
        mov21    =view.findViewById(R.id. mov2_1 )  ;
        mov22    =view.findViewById(R.id. mov2_2 )  ;
        mov23    =view.findViewById(R.id. mov2_3 )  ;
        mov24    =view.findViewById(R.id. mov2_4 )  ;
        mov25    =view.findViewById(R.id. mov2_5 )  ;

        set21    =view.findViewById(R.id. set21 )   ;
        set22    =view.findViewById(R.id. set22 )   ;
        set23    =view.findViewById(R.id. set23 )   ;
        set24    =view.findViewById(R.id. set24 )   ;
        set25    =view.findViewById(R.id. set25 )   ;

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
        //.................................................................
        mov3     =view.findViewById(R.id. mov3   )  ;
        mov31   =view.findViewById(R.id. mov3_1 )  ;
        mov32   =view.findViewById(R.id. mov3_2 )  ;
        mov33   =view.findViewById(R.id. mov3_3 )  ;
        mov34   =view.findViewById(R.id. mov3_4 )  ;
        mov35   =view.findViewById(R.id. mov3_5 )  ;

        set31   =view.findViewById(R.id. set31 )   ;
        set32   =view.findViewById(R.id. set32 )   ;
        set33   =view.findViewById(R.id. set33 )   ;
        set34   =view.findViewById(R.id. set34 )   ;
        set35   =view.findViewById(R.id. set35 )   ;

        num131   =view.findViewById(R.id. num131 )   ;
        num132   =view.findViewById(R.id. num132 )   ;
        num133   =view.findViewById(R.id. num133 )   ;
        num134   =view.findViewById(R.id. num134 )   ;
        num135   =view.findViewById(R.id. num135 )   ;

        num231   =view.findViewById(R.id. num231 )   ;
        num232   =view.findViewById(R.id. num232 )   ;
        num233   =view.findViewById(R.id. num233 )   ;
        num234   =view.findViewById(R.id. num234 )   ;
        num235   =view.findViewById(R.id. num235 )   ;


        view.findViewById(R.id.bt_dailyProgram).setOnClickListener(this);
        view.findViewById(R.id.save           ).setOnClickListener(this);
    }

    private void setArray() {








    }

    private void setmoveAdapter() {


        String[]   mov       =getResources().getStringArray(R.array.exersise   )  ;
        String[]   noting    =getResources().getStringArray(R.array. noting    )  ;
        String[]   peres     =getResources().getStringArray(R.array. peres     )  ;
        String[]   sarshaneh =getResources().getStringArray(R.array. sarshaneh )  ;
        String[]   jelobazoo =getResources().getStringArray(R.array. jelobazoo )  ;
        String[]   poshtbazoo=getResources().getStringArray(R.array. poshtbazoo)  ;
        String[]   zirbaghal =getResources().getStringArray(R.array. zirbaghal )  ;
        String[]   kool      =getResources().getStringArray(R.array. kool      )  ;
        String[]   number      =getResources().getStringArray(R.array. number      )  ;
//.............................................orgin mov........................................................
        adapter =new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,mov        );
        numberAdapter =new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,number);
//.............................................sub mov.........................................................
        adapter0=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item, noting    );
        adapter1=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item, peres     );
        adapter2=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item, sarshaneh );
        adapter3=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item, jelobazoo );
        adapter4=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item, poshtbazoo);
        adapter5=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item, zirbaghal );
        adapter6=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item, kool      );

        mov1.setAdapter(adapter);
        mov2.setAdapter(adapter);
        mov3.setAdapter(adapter);

        set11.setAdapter(numberAdapter);
        set12.setAdapter(numberAdapter);
        set13.setAdapter(numberAdapter);
        set14.setAdapter(numberAdapter);
        set15.setAdapter(numberAdapter);

        set21.setAdapter(numberAdapter);
        set22.setAdapter(numberAdapter);
        set23.setAdapter(numberAdapter);
        set24.setAdapter(numberAdapter);
        set25.setAdapter(numberAdapter);

        set31.setAdapter(numberAdapter);
        set32.setAdapter(numberAdapter);
        set33.setAdapter(numberAdapter);
        set34.setAdapter(numberAdapter);
        set35.setAdapter(numberAdapter);
        //...........................................
        num111.setAdapter(numberAdapter);
        num112.setAdapter(numberAdapter);
        num113.setAdapter(numberAdapter);
        num114.setAdapter(numberAdapter);
        num115.setAdapter(numberAdapter);

        num121.setAdapter(numberAdapter);
        num122.setAdapter(numberAdapter);
        num123.setAdapter(numberAdapter);
        num124.setAdapter(numberAdapter);
        num125.setAdapter(numberAdapter);

        num131.setAdapter(numberAdapter);
        num132.setAdapter(numberAdapter);
        num133.setAdapter(numberAdapter);
        num134.setAdapter(numberAdapter);
        num135.setAdapter(numberAdapter);
        //...........................................
        num211.setAdapter(numberAdapter);
        num212.setAdapter(numberAdapter);
        num213.setAdapter(numberAdapter);
        num214.setAdapter(numberAdapter);
        num215.setAdapter(numberAdapter);

        num221.setAdapter(numberAdapter);
        num222.setAdapter(numberAdapter);
        num223.setAdapter(numberAdapter);
        num224.setAdapter(numberAdapter);
        num225.setAdapter(numberAdapter);

        num231.setAdapter(numberAdapter);
        num232.setAdapter(numberAdapter);
        num233.setAdapter(numberAdapter);
        num234.setAdapter(numberAdapter);
        num235.setAdapter(numberAdapter);
    }

    private void setMove() {
final int day =DayNumber()-1;
          mov3  .setSelection(list.get(day).getDay1());
          mov2  .setSelection(list.get(day).getDay2());
          mov1  .setSelection(list.get(day).getDay3());

        set11.setSelection(list.get(day).getSet11());
        set12.setSelection(list.get(day).getSet12());
        set13.setSelection(list.get(day).getSet13());
        set14.setSelection(list.get(day).getSet14());
        set15.setSelection(list.get(day).getSet15());

        set21.setSelection(list.get(day).getSet21());
        set22.setSelection(list.get(day).getSet22());
        set23.setSelection(list.get(day).getSet23());
        set24.setSelection(list.get(day).getSet24());
        set25.setSelection(list.get(day).getSet25());

        set31.setSelection(list.get(day).getSet31());
        set32.setSelection(list.get(day).getSet32());
        set33.setSelection(list.get(day).getSet33());
        set34.setSelection(list.get(day).getSet34());
        set35.setSelection(list.get(day).getSet35());
//......................................................................
        num111.setSelection(list.get(day).getNum111());
        num112.setSelection(list.get(day).getNum112());
        num113.setSelection(list.get(day).getNum113());
        num114.setSelection(list.get(day).getNum114());
        num115.setSelection(list.get(day).getNum115());

        num121.setSelection(list.get(day).getNum121());
        num122.setSelection(list.get(day).getNum122());
        num123.setSelection(list.get(day).getNum123());
        num124.setSelection(list.get(day).getNum124());
        num125.setSelection(list.get(day).getNum125());

        num131.setSelection(list.get(day).getNum131());
        num132.setSelection(list.get(day).getNum132());
        num133.setSelection(list.get(day).getNum133());
        num134.setSelection(list.get(day).getNum134());
        num135.setSelection(list.get(day).getNum135());
//...................................................................................
        num211.setSelection(list.get(day).getNum211());
        num212.setSelection(list.get(day).getNum212());
        num213.setSelection(list.get(day).getNum213());
        num214.setSelection(list.get(day).getNum214());
        num215.setSelection(list.get(day).getNum215());

        num221.setSelection(list.get(day).getNum221());
        num222.setSelection(list.get(day).getNum222());
        num223.setSelection(list.get(day).getNum223());
        num224.setSelection(list.get(day).getNum224());
        num225.setSelection(list.get(day).getNum225());

        num231.setSelection(list.get(day).getNum231());
        num232.setSelection(list.get(day).getNum232());
        num233.setSelection(list.get(day).getNum233());
        num234.setSelection(list.get(day).getNum234());
        num235.setSelection(list.get(day).getNum235());


        mov1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {
                    mov11.setAdapter(adapter0);
                    mov12.setAdapter(adapter0);
                    mov13.setAdapter(adapter0);
                    mov14.setAdapter(adapter0);
                    mov15.setAdapter(adapter0);
                }
                if (i == 1) {
                    mov11.setAdapter(adapter1);
                    mov12.setAdapter(adapter1);
                    mov13.setAdapter(adapter1);
                    mov14.setAdapter(adapter1);
                    mov15.setAdapter(adapter1);
                }
                if (i == 2) {
                    mov11.setAdapter(adapter2);
                    mov12.setAdapter(adapter2);
                    mov13.setAdapter(adapter2);
                    mov14.setAdapter(adapter2);
                    mov15.setAdapter(adapter2);
                }
                if (i == 3) {
                    mov11.setAdapter(adapter3);
                    mov12.setAdapter(adapter3);
                    mov13.setAdapter(adapter3);
                    mov14.setAdapter(adapter3);
                    mov15.setAdapter(adapter3);
                }
                if (i == 4) {
                    mov11.setAdapter(adapter4);
                    mov12.setAdapter(adapter4);
                    mov13.setAdapter(adapter4);
                    mov14.setAdapter(adapter4);
                    mov15.setAdapter(adapter4);
                }
                if (i == 5) {
                    mov11.setAdapter(adapter5);
                    mov12.setAdapter(adapter5);
                    mov13.setAdapter(adapter5);
                    mov14.setAdapter(adapter5);
                    mov15.setAdapter(adapter5);
                }
                if (i == 6) {
                    mov11.setAdapter(adapter6);
                    mov12.setAdapter(adapter6);
                    mov13.setAdapter(adapter6);
                    mov14.setAdapter(adapter6);
                    mov15.setAdapter(adapter6);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        mov2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    mov21.setAdapter(adapter0);
                    mov22.setAdapter(adapter0);
                    mov23.setAdapter(adapter0);
                    mov24.setAdapter(adapter0);
                    mov25.setAdapter(adapter0);
                }
                if (i == 1) {
                    mov21.setAdapter(adapter1);
                    mov22.setAdapter(adapter1);
                    mov23.setAdapter(adapter1);
                    mov24.setAdapter(adapter1);
                    mov25.setAdapter(adapter1);
                }
                if (i == 2) {
                    mov21.setAdapter(adapter2);
                    mov22.setAdapter(adapter2);
                    mov23.setAdapter(adapter2);
                    mov24.setAdapter(adapter2);
                    mov25.setAdapter(adapter2);
                }
                if (i == 3) {
                    mov21.setAdapter(adapter3);
                    mov22.setAdapter(adapter3);
                    mov23.setAdapter(adapter3);
                    mov24.setAdapter(adapter3);
                    mov25.setAdapter(adapter3);
                }
                if (i == 4) {
                    mov21.setAdapter(adapter4);
                    mov22.setAdapter(adapter4);
                    mov23.setAdapter(adapter4);
                    mov24.setAdapter(adapter4);
                    mov25.setAdapter(adapter4);
                }
                if (i == 5) {
                    mov21.setAdapter(adapter5);
                    mov22.setAdapter(adapter5);
                    mov23.setAdapter(adapter5);
                    mov24.setAdapter(adapter5);
                    mov25.setAdapter(adapter5);
                }
                if (i == 6) {
                    mov21.setAdapter(adapter6);
                    mov22.setAdapter(adapter6);
                    mov23.setAdapter(adapter6);
                    mov24.setAdapter(adapter6);
                    mov25.setAdapter(adapter6);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        mov3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    mov31.setAdapter(adapter0);
                    mov32.setAdapter(adapter0);
                    mov33.setAdapter(adapter0);
                    mov34.setAdapter(adapter0);
                    mov35.setAdapter(adapter0);
                }
                if (i == 1) {
                    mov31.setAdapter(adapter1);
                    mov32.setAdapter(adapter1);
                    mov33.setAdapter(adapter1);
                    mov34.setAdapter(adapter1);
                    mov35.setAdapter(adapter1);
                }
                if (i == 2) {
                    mov31.setAdapter(adapter2);
                    mov32.setAdapter(adapter2);
                    mov33.setAdapter(adapter2);
                    mov34.setAdapter(adapter2);
                    mov35.setAdapter(adapter2);
                }
                if (i == 3) {
                    mov31.setAdapter(adapter3);
                    mov32.setAdapter(adapter3);
                    mov33.setAdapter(adapter3);
                    mov34.setAdapter(adapter3);
                    mov35.setAdapter(adapter3);
                }
                if (i == 4) {
                    mov31.setAdapter(adapter4);
                    mov32.setAdapter(adapter4);
                    mov33.setAdapter(adapter4);
                    mov34.setAdapter(adapter4);
                    mov35.setAdapter(adapter4);
                }
                if (i == 5) {
                    mov31.setAdapter(adapter5);
                    mov32.setAdapter(adapter5);
                    mov33.setAdapter(adapter5);
                    mov34.setAdapter(adapter5);
                    mov35.setAdapter(adapter5);
                }
                if (i == 6) {
                    mov31.setAdapter(adapter6);
                    mov32.setAdapter(adapter6);
                    mov33.setAdapter(adapter6);
                    mov34.setAdapter(adapter6);
                    mov35.setAdapter(adapter6);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                   mov11.setSelection(list.get(day).getDay11());
                   mov12.setSelection(list.get(day).getDay12());
                   mov13.setSelection(list.get(day).getDay13());
                   mov14.setSelection(list.get(day).getDay14());
                   mov15.setSelection(list.get(day).getDay15());

                   mov21.setSelection(list.get(day).getDay21());
                   mov22.setSelection(list.get(day).getDay22());
                   mov23.setSelection(list.get(day).getDay23());
                   mov24.setSelection(list.get(day).getDay24());
                   mov25.setSelection(list.get(day).getDay25());

                   mov31.setSelection(list.get(day).getDay31());
                   mov32.setSelection(list.get(day).getDay32());
                   mov33.setSelection(list.get(day).getDay33());
                   mov34.setSelection(list.get(day).getDay34());
                   mov35.setSelection(list.get(day).getDay35());

            }
        },100);

    }

    @Override
    public void onClick(View view) {


        if(view.getId()==R.id.bt_dailyProgram){  SM.pages(2);}
        if(view.getId()==R.id.save)       {Save();SM.Reaction(1);}


    }

    private void Save() {
        myDatabaseHelper db=new myDatabaseHelper(getContext(),getDbName());


        int m1   = mov1  .getSelectedItemPosition();
        int m11  = mov11.getSelectedItemPosition();
        int m12  = mov12.getSelectedItemPosition();
        int m13  = mov13.getSelectedItemPosition();
        int m14  = mov14.getSelectedItemPosition();
        int m15  = mov15.getSelectedItemPosition();
        int m2   = mov2  .getSelectedItemPosition();
        int m21  = mov21.getSelectedItemPosition();
        int m22  = mov22.getSelectedItemPosition();
        int m23  = mov23.getSelectedItemPosition();
        int m24  = mov24.getSelectedItemPosition();
        int m25  = mov25.getSelectedItemPosition();
        int m3   = mov3  .getSelectedItemPosition();
        int m31  = mov31.getSelectedItemPosition();
        int m32  = mov32.getSelectedItemPosition();
        int m33  = mov33.getSelectedItemPosition();
        int m34  = mov34.getSelectedItemPosition();
        int m35  = mov35.getSelectedItemPosition();

        int s11  = set11.getSelectedItemPosition();
        int s12  = set12.getSelectedItemPosition();
        int s13  = set13.getSelectedItemPosition();
        int s14  = set14.getSelectedItemPosition();
        int s15  = set15.getSelectedItemPosition();

        int s21  = set21.getSelectedItemPosition();
        int s22  = set22.getSelectedItemPosition();
        int s23  = set23.getSelectedItemPosition();
        int s24  = set24.getSelectedItemPosition();
        int s25  = set25.getSelectedItemPosition();

        int s31  = set31.getSelectedItemPosition();
        int s32  = set32.getSelectedItemPosition();
        int s33  = set33.getSelectedItemPosition();
        int s34  = set34.getSelectedItemPosition();
        int s35  = set35.getSelectedItemPosition();
//..............................................................
        int n111  = num111.getSelectedItemPosition();
        int n112  = num112.getSelectedItemPosition();
        int n113  = num113.getSelectedItemPosition();
        int n114  = num114.getSelectedItemPosition();
        int n115  = num115.getSelectedItemPosition();

        int n121  = num121.getSelectedItemPosition();
        int n122  = num122.getSelectedItemPosition();
        int n123  = num123.getSelectedItemPosition();
        int n124  = num124.getSelectedItemPosition();
        int n125  = num125.getSelectedItemPosition();

        int n131  = num131.getSelectedItemPosition();
        int n132  = num132.getSelectedItemPosition();
        int n133  = num133.getSelectedItemPosition();
        int n134  = num134.getSelectedItemPosition();
        int n135  = num135.getSelectedItemPosition();

//...........................................................
        int n211  = num211.getSelectedItemPosition();
        int n212  = num212.getSelectedItemPosition();
        int n213  = num213.getSelectedItemPosition();
        int n214  = num214.getSelectedItemPosition();
        int n215  = num215.getSelectedItemPosition();


        int n221  = num221.getSelectedItemPosition();
        int n222  = num222.getSelectedItemPosition();
        int n223  = num223.getSelectedItemPosition();
        int n224  = num224.getSelectedItemPosition();
        int n225  = num225.getSelectedItemPosition();

        int n231  = num231.getSelectedItemPosition();
        int n232  = num232.getSelectedItemPosition();
        int n233  = num233.getSelectedItemPosition();
        int n234  = num234.getSelectedItemPosition();
        int n235  = num235.getSelectedItemPosition();

db.updateData(DayNumber(),m1,m11,s11,n111,n211,
                             m12,s12,n112,n212,
                             m13,s13,n113,n213,
                             m14,s14,n114,n214,
                             m15,s15,n115,n215,
                          m2,m21,s21,n121,n221,
                             m22,s22,n122,n222,
                             m23,s23,n123,n223,
                             m24,s24,n124,n224,
                             m25,s25,n125,n225,
                          m3,m31,s31,n131,n231,
                             m32,s32,n132,n232,
                             m33,s33,n133,n233,
                             m34,s34,n134,n234,
                             m35,s35,n135,n235);

    }

    //............................................................interface..............
    interface SendMessage {
        void pages(int Pag_number);
        void Reaction(int cod);
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


