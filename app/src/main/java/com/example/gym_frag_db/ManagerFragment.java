package com.example.gym_frag_db;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ManagerFragment extends Fragment {
//List<Answers> answerList;
//    SendMessage SM;
//    RecyclerView recyclerView;
//    Adapter_Result adapter;
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View rootView = inflater.inflate(
//                R.layout.manager_fragment, container, false);
//
//        return rootView;
//
//
//    }
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
//
//
//
///////////////////////////////////////////////////////////////////////////////////////////////////
//    setData(view);
//////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//
//
//
//
//        Button introo=view.findViewById(R.id.introo);
//
//        introo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//
//                SM.pages(-1);
//            }
//        });
//
//
//
//
//
//
//        Button manager=view.findViewById(R.id.test);
//        manager.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//setData(v.getRootView());
//
//////نمایش داده ها با دستور Alert
////                AlertDialog.Builder alert=new AlertDialog.Builder(getActivity());
////                alert.setCancelable(true);
////                alert.setTitle("نمایش داده ها");
////                alert.setMessage(data.toString());
////                alert.show();
//
//            }
//        });
//
//
//
//
////..................................................
//    }
//
//    private void setData(View view) {
//
//        myDatabaseHelper mydb = new myDatabaseHelper(getActivity());
//
//
////فراخوانی تابع Select
//        Cursor res=mydb.ShowallData();
//
////بررسی خالی بودن جدول
//        if(res.getCount()==0){
//            Toast.makeText(getActivity(),"جدول خالی بود",Toast.LENGTH_LONG).show();
//
//        }
////ایجاد متغیر
//
//        answerList=new ArrayList<>();
////گرفتن تمام داداه های داخل جدول
//        while (res.moveToNext()){
//            StringBuffer data=new StringBuffer();
////                    data.append("ID:  " + res.getString(0) + "  ");
////                    data.append(""      + res.getString(1) + "  ");
////                    data.append(""      + res.getString(2) + "\n");
//
//            data.append("A:  "  + res.getString(3) + "  ");
//            data.append("B:  "  + res.getString(4) + "  ");
//            data.append("C:  "  + res.getString(5) + "  ");
//
//            data.append("D:  "  + res.getString(6) + "  ");
//            data.append("E:  "  + res.getString(7) + "  ");
//            data.append("F:  "  + res.getString(8) );
//
//            String id      =String.valueOf(res.getString(0));
//            String name    =res.getString(1);
//            String lastname=res.getString(2);
//
//            answerList.add(new Answers(id,name,lastname,data.toString()));
//
//        }
//
//        recyclerView  =view.findViewById(R.id.resRecycle  );
//
//        adapter=new Adapter_Result(answerList);
//        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
//        recyclerView.setAdapter(adapter);
//
//
//
//    }
//
//
//    //.............................................................................................
//    interface SendMessage {
//        void pages(int Pag_number);
//
//
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//
//        try {
//            SM = (SendMessage) getActivity();
//        } catch (ClassCastException e) {
//
//        }
//    }
}
