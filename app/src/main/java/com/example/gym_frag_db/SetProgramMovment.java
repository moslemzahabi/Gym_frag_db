package com.example.gym_frag_db;


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


import java.util.ArrayList;
import java.util.List;

import static com.example.gym_frag_db.MainActivity.DayNumber;
import static com.example.gym_frag_db.MainActivity.movments;


public class SetProgramMovment extends Fragment implements View.OnClickListener {

SendMessage SM;

List<Movment>list;


    Spinner mov1  ,mov2  ,mov3  ,
            mov1_1,mov2_1,mov3_1,
            mov1_2,mov2_2,mov3_2,
            mov1_3,mov2_3,mov3_3,
            mov1_4,mov2_4,mov3_4;


    String[] mov       ;
    String[] peres     ;
    String[] sarshaneh ;
    String[] jelobazoo ;
    String[] poshtbazoo;
    String[] zirbaghal ;
    String[] kool      ;
    String[] noting    ;



    ArrayAdapter<String> adapter ;
    ArrayAdapter<String> adapter0;
    ArrayAdapter<String> adapter1;
    ArrayAdapter<String> adapter2;
    ArrayAdapter<String> adapter3;
    ArrayAdapter<String> adapter4;
    ArrayAdapter<String> adapter5;
    ArrayAdapter<String> adapter6;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                View rootView = inflater.inflate(
                R.layout.fragment_setprogrammovment, container, false);



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


        mov1  =view.findViewById(R.id.mov1  );
        mov1_1=view.findViewById(R.id.mov1_1);
        mov1_2=view.findViewById(R.id.mov1_2);
        mov1_3=view.findViewById(R.id.mov1_3);
        mov1_4=view.findViewById(R.id.mov1_4);
        mov2  =view.findViewById(R.id.mov2  );
        mov2_1=view.findViewById(R.id.mov2_1);
        mov2_2=view.findViewById(R.id.mov2_2);
        mov2_3=view.findViewById(R.id.mov2_3);
        mov2_4=view.findViewById(R.id.mov2_4);
        mov3  =view.findViewById(R.id.mov3  );
        mov3_1=view.findViewById(R.id.mov3_1);
        mov3_2=view.findViewById(R.id.mov3_2);
        mov3_3=view.findViewById(R.id.mov3_3);
        mov3_4=view.findViewById(R.id.mov3_4);

        view.findViewById(R.id.bt_dailyProgram).setOnClickListener(this);
        view.findViewById(R.id.save           ).setOnClickListener(this);
    }

    private void setArray() {

        mov=getResources().getStringArray(R.array.exersise)  ;

        noting    =getResources().getStringArray(R.array. noting    )  ;
        peres     =getResources().getStringArray(R.array. peres     )  ;
        sarshaneh =getResources().getStringArray(R.array. sarshaneh )  ;
        jelobazoo =getResources().getStringArray(R.array. jelobazoo )  ;
        poshtbazoo=getResources().getStringArray(R.array. poshtbazoo)  ;
        zirbaghal =getResources().getStringArray(R.array. zirbaghal )  ;
        kool      =getResources().getStringArray(R.array. kool      )  ;

    }

    private void setmoveAdapter() {

//.............................................orgin mov........................................................
        adapter =new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_item,mov        );
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

    }

    private void setMove() {
final int day =DayNumber()-1;
          mov3  .setSelection(list.get(day).getDay1());
          mov2  .setSelection(list.get(day).getDay2());
          mov1  .setSelection(list.get(day).getDay3());



        mov1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {
                    mov1_1.setAdapter(adapter0);
                    mov1_2.setAdapter(adapter0);
                    mov1_3.setAdapter(adapter0);
                    mov1_4.setAdapter(adapter0);
                }
                if (i == 1) {
                    mov1_1.setAdapter(adapter1);
                    mov1_2.setAdapter(adapter1);
                    mov1_3.setAdapter(adapter1);
                    mov1_4.setAdapter(adapter1);
                }
                if (i == 2) {
                    mov1_1.setAdapter(adapter2);
                    mov1_2.setAdapter(adapter2);
                    mov1_3.setAdapter(adapter2);
                    mov1_4.setAdapter(adapter2);
                }
                if (i == 3) {
                    mov1_1.setAdapter(adapter3);
                    mov1_2.setAdapter(adapter3);
                    mov1_3.setAdapter(adapter3);
                    mov1_4.setAdapter(adapter3);
                }
                if (i == 4) {
                    mov1_1.setAdapter(adapter4);
                    mov1_2.setAdapter(adapter4);
                    mov1_3.setAdapter(adapter4);
                    mov1_4.setAdapter(adapter4);
                }
                if (i == 5) {
                    mov1_1.setAdapter(adapter5);
                    mov1_2.setAdapter(adapter5);
                    mov1_3.setAdapter(adapter5);
                    mov1_4.setAdapter(adapter5);
                }
                if (i == 6) {
                    mov1_1.setAdapter(adapter6);
                    mov1_2.setAdapter(adapter6);
                    mov1_3.setAdapter(adapter6);
                    mov1_4.setAdapter(adapter6);
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
                    mov2_1.setAdapter(adapter0);
                    mov2_2.setAdapter(adapter0);
                    mov2_3.setAdapter(adapter0);
                    mov2_4.setAdapter(adapter0);
                }
                if (i == 1) {
                    mov2_1.setAdapter(adapter1);
                    mov2_2.setAdapter(adapter1);
                    mov2_3.setAdapter(adapter1);
                    mov2_4.setAdapter(adapter1);
                }
                if (i == 2) {
                    mov2_1.setAdapter(adapter2);
                    mov2_2.setAdapter(adapter2);
                    mov2_3.setAdapter(adapter2);
                    mov2_4.setAdapter(adapter2);
                }
                if (i == 3) {
                    mov2_1.setAdapter(adapter3);
                    mov2_2.setAdapter(adapter3);
                    mov2_3.setAdapter(adapter3);
                    mov2_4.setAdapter(adapter3);
                }
                if (i == 4) {
                    mov2_1.setAdapter(adapter4);
                    mov2_2.setAdapter(adapter4);
                    mov2_3.setAdapter(adapter4);
                    mov2_4.setAdapter(adapter4);
                }
                if (i == 5) {
                    mov2_1.setAdapter(adapter5);
                    mov2_2.setAdapter(adapter5);
                    mov2_3.setAdapter(adapter5);
                    mov2_4.setAdapter(adapter5);
                }
                if (i == 6) {
                    mov2_1.setAdapter(adapter6);
                    mov2_2.setAdapter(adapter6);
                    mov2_3.setAdapter(adapter6);
                    mov2_4.setAdapter(adapter6);
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
                    mov3_1.setAdapter(adapter0);
                    mov3_2.setAdapter(adapter0);
                    mov3_3.setAdapter(adapter0);
                    mov3_4.setAdapter(adapter0);
                }
                if (i == 1) {
                    mov3_1.setAdapter(adapter1);
                    mov3_2.setAdapter(adapter1);
                    mov3_3.setAdapter(adapter1);
                    mov3_4.setAdapter(adapter1);
                }
                if (i == 2) {
                    mov3_1.setAdapter(adapter2);
                    mov3_2.setAdapter(adapter2);
                    mov3_3.setAdapter(adapter2);
                    mov3_4.setAdapter(adapter2);
                }
                if (i == 3) {
                    mov3_1.setAdapter(adapter3);
                    mov3_2.setAdapter(adapter3);
                    mov3_3.setAdapter(adapter3);
                    mov3_4.setAdapter(adapter3);
                }
                if (i == 4) {
                    mov3_1.setAdapter(adapter4);
                    mov3_2.setAdapter(adapter4);
                    mov3_3.setAdapter(adapter4);
                    mov3_4.setAdapter(adapter4);
                }
                if (i == 5) {
                    mov3_1.setAdapter(adapter5);
                    mov3_2.setAdapter(adapter5);
                    mov3_3.setAdapter(adapter5);
                    mov3_4.setAdapter(adapter5);
                }
                if (i == 6) {
                    mov3_1.setAdapter(adapter6);
                    mov3_2.setAdapter(adapter6);
                    mov3_3.setAdapter(adapter6);
                    mov3_4.setAdapter(adapter6);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                   mov1_1.setSelection(list.get(day).getDay11());
                   mov1_2.setSelection(list.get(day).getDay12());
                   mov1_3.setSelection(list.get(day).getDay13());
                   mov1_4.setSelection(list.get(day).getDay14());
                   mov2_1.setSelection(list.get(day).getDay21());
                   mov2_2.setSelection(list.get(day).getDay22());
                   mov2_3.setSelection(list.get(day).getDay23());
                   mov2_4.setSelection(list.get(day).getDay24());
                   mov3_1.setSelection(list.get(day).getDay31());
                   mov3_2.setSelection(list.get(day).getDay32());
                   mov3_3.setSelection(list.get(day).getDay33());
                   mov3_4.setSelection(list.get(day).getDay34());

            }
        },100);






    }





    @Override
    public void onClick(View view) {


        if(view.getId()==R.id.bt_dailyProgram){  SM.pages(2,DayNumber());}
        if(view.getId()==R.id.save)       {Save();SM.Reaction(1);}


    }

    private void Save() {
        myDatabaseHelper db=new myDatabaseHelper(getContext());
db.updateData(DayNumber(),
            3,3,3,3,3,
            3,3,3,3,3,
            3,3,3,3,3);
    }

    //............................................................interface..............
    interface SendMessage {
        void pages(int Pag_number,int day);
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


