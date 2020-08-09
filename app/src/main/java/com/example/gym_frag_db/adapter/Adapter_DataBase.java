package com.example.gym_frag_db.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gym_frag_db.IntrooActivity;
import com.example.gym_frag_db.MainActivity;
import com.example.gym_frag_db.R;
import com.example.gym_frag_db.model.DataBase;
import com.example.gym_frag_db.storage.myDatabaseHelper2;

import java.util.ArrayList;
import java.util.List;

public class Adapter_DataBase extends RecyclerView.Adapter<Adapter_DataBase.MyViewHolder> {
    private List<DataBase> answerList;
private Context context;

    public Adapter_DataBase(List<DataBase> myfriends,Context context) {
        this.answerList = (myfriends == null) ?
                new ArrayList<DataBase>() : myfriends;
this.context=context;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_base, parent, false);


        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(answerList.get(position));
    }

    @Override
    public int getItemCount() {//...........تعداد عناصر لیست...............
        return answerList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

       Button addProgram,deletProgram;

        MyViewHolder(View itemView) {

            super(itemView);


            addProgram         =itemView.findViewById(R.id.button);
            deletProgram         =itemView.findViewById(R.id.delet);

        }

          public void bind(final DataBase answerLists) {
              addProgram.setText(answerLists.getDataBaseName());




              addProgram.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(context, MainActivity.class);
        intent.putExtra("dbName",answerLists.getDataBaseName());
        context.startActivity(intent);


//        Intent intent1 = new Intent(context, IntrooActivity.class);
//        ((IntrooActivity) context).startActivityForResult(intent1, 2);


    }});

deletProgram.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        context.deleteDatabase(answerLists.getDataBaseName());
myDatabaseHelper2 db=new myDatabaseHelper2(context);
db.deleteData(answerLists.getId());
        Intent intent1 = new Intent(context, IntrooActivity.class);
        ((IntrooActivity) context).startActivityForResult(intent1, 1);

    }
});

        }

    }
}