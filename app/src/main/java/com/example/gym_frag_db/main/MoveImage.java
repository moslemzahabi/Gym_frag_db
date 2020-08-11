package com.example.gym_frag_db.main;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.example.gym_frag_db.R;

import static com.example.gym_frag_db.main.MainActivity.MovmentImageText;


public class MoveImage extends Fragment implements View.OnLongClickListener {

 SendMessage SM;
 ImageView image;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.fragment_moveimage, container, false);





        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        init(view);





    }

    private void init(View view) {

        image=view.findViewById(R.id.imageView);

        Glide.with(getContext())
                .load(SetImageId())
                .into(image);
image.setOnLongClickListener(this);
    }

    private int SetImageId() {
       int ImageId=R.mipmap.ic_launcher ;
String movmentImageText= MovmentImageText();
        switch (movmentImageText){

            case "جلوبازو 1":ImageId=R.mipmap.jelo_bazoo_chakoshi;break;
            case "جلوبازو 2":ImageId=R.mipmap.jelo_bazoo_halter_istade_bamile;break;
            case "جلوبازو 3":ImageId=R.mipmap.jelo_bazoo_halter_istade_dasbaz;break;
            case "جلوبازو 4":ImageId=R.mipmap.jelo_bazoo_halter_istadeh_dasbaraks;break;

        }





        return ImageId;
    }

    @Override
    public boolean onLongClick(View view) {

        SM.pages(2);

        return false;
    }

    //............................................................interface..............
    interface SendMessage {
        void pages(int Pag_number);

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


