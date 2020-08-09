package com.example.gym_frag_db;


import android.content.Intent;
import android.database.Cursor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gym_frag_db.adapter.Adapter_DataBase;
import com.example.gym_frag_db.model.DataBase;
import com.example.gym_frag_db.storage.PrefManager;
import com.example.gym_frag_db.storage.myDatabaseHelper2;

import java.util.ArrayList;
import java.util.List;

public class IntrooActivity extends AppCompatActivity implements View.OnClickListener {
PrefManager pref;
myDatabaseHelper2 db;
Button set;
EditText et;
List<DataBase> list;
Adapter_DataBase adapter;
RecyclerView recycleView;
  //FloatingActionButton AddDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introo);
        init();

        setDataInList();


    }

    private void init() {

        list=new ArrayList<>();
      recycleView=findViewById(R.id.recyclerview);
      db= new myDatabaseHelper2(this);
        pref=new PrefManager(this);



//AddDataBase=findViewById(R.id.)
       set=findViewById(R.id.set);
       et=findViewById(R.id.et);

       set.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.set){
            db.insertData(et.getText().toString());
            setDataInList();
      //      setRecycleViewData();
            et.setText("");

        }





    }

    public void setDataInList() {
list.clear();

//فراخوانی تابع Select
        Cursor res=db.ShowallData();

//بررسی خالی بودن جدول
        if(res.getCount()==0){
            Toast.makeText(this,"جدول خالی بود",Toast.LENGTH_LONG).show();

        }

//گرفتن تمام داداه های داخل جدول
        while (res.moveToNext()){

         list.add(new DataBase(res.getInt(0), res.getString(1)));

        }
setRecycleViewData();
    }

    private void  setRecycleViewData(){

        adapter=new Adapter_DataBase(list,this);
        recycleView.setLayoutManager(new LinearLayoutManager(this));
        recycleView.setAdapter(adapter);


    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1){
            setDataInList();
        }

        if (requestCode == 2){
            finish();
        }


    }


}
