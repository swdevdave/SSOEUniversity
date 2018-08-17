package com.swdave.anrdoid.ssoeuniversity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.ssoeuniversity.R;

public class Day1Fragment extends Fragment implements View.OnClickListener {

    Activity context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getActivity();
        View view = inflater.inflate(R.layout.fragment_day1, container, false);


        setViews(view);


        return view;
    }


    void setViews(View view) {

        TextView day1_1a = view.findViewById(R.id.day1_1a);
        TextView day1_1b = view.findViewById(R.id.day1_1b);
        TextView day1_1c = view.findViewById(R.id.day1_1c);
        TextView day1_2a = view.findViewById(R.id.day1_2a);
        TextView day1_2b = view.findViewById(R.id.day1_2b);
        TextView day1_2c = view.findViewById(R.id.day1_2c);
        TextView day1_3a = view.findViewById(R.id.day1_3a);
        TextView day1_3b = view.findViewById(R.id.day1_3b);
        TextView day1_3c = view.findViewById(R.id.day1_3c);
        TextView day1_4a = view.findViewById(R.id.day1_4a);
        TextView day1_4b = view.findViewById(R.id.day1_4b);
        TextView day1_4c = view.findViewById(R.id.day1_4c);


        day1_1a.setOnClickListener(this);
        day1_1b.setOnClickListener(this);
        day1_1c.setOnClickListener(this);
        day1_2a.setOnClickListener(this);
        day1_2b.setOnClickListener(this);
        day1_2c.setOnClickListener(this);
        day1_3a.setOnClickListener(this);
        day1_3b.setOnClickListener(this);
        day1_3c.setOnClickListener(this);
        day1_4a.setOnClickListener(this);
        day1_4b.setOnClickListener(this);
        day1_4c.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.day1_1a:
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("location", "0");
                startActivity(intent);
                break;
            case R.id.day1_1b:
                Intent intent1 = new Intent(context, DetailActivity.class);
                intent1.putExtra("location", "1");
                startActivity(intent1);
                break;
            case R.id.day1_1c:
                Intent intent2 = new Intent(context, DetailActivity.class);
                intent2.putExtra("location", "2");
                startActivity(intent2);
                break;
            case R.id.day1_2a:
                Intent intent3 = new Intent(context, DetailActivity.class);
                intent3.putExtra("location", "3");
                startActivity(intent3);
                break;
            case R.id.day1_2b:
                Intent intent4 = new Intent(context, DetailActivity.class);
                intent4.putExtra("location", "4");
                startActivity(intent4);
                break;
            case R.id.day1_2c:
                Intent intent5 = new Intent(context, DetailActivity.class);
                intent5.putExtra("location", "5");
                startActivity(intent5);
                break;
            case R.id.day1_3a:
                Intent intent6 = new Intent(context, DetailActivity.class);
                intent6.putExtra("location", "6");
                startActivity(intent6);
                break;
            case R.id.day1_3b:
                Intent intent7 = new Intent(context, DetailActivity.class);
                intent7.putExtra("location", "7");
                startActivity(intent7);
                break;
            case R.id.day1_3c:
                Intent intent8 = new Intent(context, DetailActivity.class);
                intent8.putExtra("location", "8");
                startActivity(intent8);
                break;
            case R.id.day1_4a:
                Intent intent9 = new Intent(context, DetailActivity.class);
                intent9.putExtra("location", "9");
                startActivity(intent9);
                break;
            case R.id.day1_4b:
                Intent intent10 = new Intent(context, DetailActivity.class);
                intent10.putExtra("location", "10");
                startActivity(intent10);
                break;
            case R.id.day1_4c:
                Intent intent11 = new Intent(context, DetailActivity.class);
                intent11.putExtra("location", "11");
                startActivity(intent11);
                break;
            default:
                break;
        }

    }
}

