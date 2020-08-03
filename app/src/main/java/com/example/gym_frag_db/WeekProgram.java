package com.example.gym_frag_db;



import android.content.Context;
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

import static com.example.gym_frag_db.MainActivity.movments;


public class WeekProgram extends Fragment implements View.OnClickListener {

SendMessage SM;

 TextView
          saturday1,sunday1,monday1,tuesday1,wednesday1,thursday1,friday1,
          saturday2,sunday2,monday2,tuesday2,wednesday2,thursday2,friday2,
          saturday3,sunday3,monday3,tuesday3,wednesday3,thursday3,friday3;

List<Movment>list;







    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.fragment_program, container, false);



        init(rootView);


        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setTextView();

    }








    private void init(View view) {

        view.findViewById(R.id.satr).setOnClickListener(this);
        view.findViewById(R.id.sunr).setOnClickListener(this);
        view.findViewById(R.id.monr).setOnClickListener(this);
        view.findViewById(R.id.tusr).setOnClickListener(this);
        view.findViewById(R.id.wenr).setOnClickListener(this);
        view.findViewById(R.id.terr).setOnClickListener(this);
        view.findViewById(R.id.frir).setOnClickListener(this);


        list = new ArrayList<>();
        list =movments();

        saturday1  =view.findViewById(R.id.saturday_textviw );
        saturday2  =view.findViewById(R.id.saturday_textviw2);
        saturday3  =view.findViewById(R.id.saturday_textviw3);
        sunday1    =view.findViewById(R.id.sunday_textviw   );
        sunday2    =view.findViewById(R.id.sunday_textviw2  );
        sunday3    =view.findViewById(R.id.sunday_textviw3  );
        monday1    =view.findViewById(R.id.monday_textviw   );
        monday2    =view.findViewById(R.id.monday_textviw2  );
        monday3    =view.findViewById(R.id.monday_textviw3  );
        tuesday1   =view.findViewById(R.id.tusday_textviw   );
        tuesday2   =view.findViewById(R.id.tusday_textviw2  );
        tuesday3   =view.findViewById(R.id.tusday_textviw3  );
        wednesday1 =view.findViewById(R.id.wensday_textviw  );
        wednesday2 =view.findViewById(R.id.wensday_textviw2 );
        wednesday3 =view.findViewById(R.id.wensday_textviw3 );
        thursday1  =view.findViewById(R.id.tursday_textviw  );
        thursday2  =view.findViewById(R.id.tursday_textviw2 );
        thursday3  =view.findViewById(R.id.tursday_textviw3 );
        friday1    =view.findViewById(R.id.friday_textviw   );
        friday2    =view.findViewById(R.id.friday_textviw2  );
        friday3    =view.findViewById(R.id.friday_textviw3  );



    }
    private void setTextView() {

     saturday1 .setText(String.valueOf(list.get(0).getDay1()));
     saturday2 .setText(String.valueOf(list.get(0).getDay2()));
     saturday3 .setText(String.valueOf(list.get(0).getDay3()));
     sunday1   .setText(String.valueOf(list.get(1).getDay1()));
     sunday2   .setText(String.valueOf(list.get(1).getDay2()));
     sunday3   .setText(String.valueOf(list.get(1).getDay3()));
     monday1   .setText(String.valueOf(list.get(2).getDay1()));
     monday2   .setText(String.valueOf(list.get(2).getDay2()));
     monday3   .setText(String.valueOf(list.get(2).getDay3()));
     tuesday1  .setText(String.valueOf(list.get(3).getDay1()));
     tuesday2  .setText(String.valueOf(list.get(3).getDay2()));
     tuesday3  .setText(String.valueOf(list.get(3).getDay3()));
     wednesday1.setText(String.valueOf(list.get(4).getDay1()));
     wednesday2.setText(String.valueOf(list.get(4).getDay2()));
     wednesday3.setText(String.valueOf(list.get(4).getDay3()));
     thursday1 .setText(String.valueOf(list.get(5).getDay1()));
     thursday2 .setText(String.valueOf(list.get(5).getDay2()));
     thursday3 .setText(String.valueOf(list.get(5).getDay3()));
     friday1   .setText(String.valueOf(list.get(6).getDay1()));
     friday2   .setText(String.valueOf(list.get(6).getDay2()));
     friday3   .setText(String.valueOf(list.get(6).getDay3()));


    }

    @Override
    public void onClick(View v) {


        SM.pages(2,Integer.valueOf(v.getTag().toString()));

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


