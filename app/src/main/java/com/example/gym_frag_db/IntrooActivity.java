package com.example.gym_frag_db;


import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.gym_frag_db.adapter.Adapter_DataBase;
import com.example.gym_frag_db.model.DataBase;
import com.example.gym_frag_db.storage.PrefManager;
import com.example.gym_frag_db.storage.myDatabaseHelper2;

import java.util.ArrayList;
import java.util.List;

public class IntrooActivity extends AppCompatActivity implements View.OnClickListener {
//PrefManager pref;
myDatabaseHelper2 db;
ImageView  set;

List<DataBase> list;
Adapter_DataBase adapter;
RecyclerView recycleView;

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
   //   pref=new PrefManager(this);




        set=findViewById(R.id.set);
       set.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


runAlert();

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

    private void runAlert() {

        LayoutInflater aInflater = getLayoutInflater();
        View alertLayout = aInflater.inflate(R.layout.get_database_name, null);

       final EditText et=alertLayout.findViewById(R.id.dbname);


        new AlertDialog.Builder(this, R.style.DialogTheme)
                .setTitle("Login")
                .setCancelable(false)
                .setView(alertLayout)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        db.insertData(et.getText().toString());
                        setDataInList();
                        //      setRecycleViewData();
                    }
                })

                .create()
                .show();

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1){
            setDataInList();
            finish();
        }

        if (requestCode == 2){
            finish();
        }


    }


}
