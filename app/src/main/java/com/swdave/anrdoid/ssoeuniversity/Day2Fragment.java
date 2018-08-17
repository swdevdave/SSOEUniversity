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

public class Day2Fragment extends Fragment implements View.OnClickListener {

    Activity context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getActivity();
        View view = inflater.inflate(R.layout.fragment_day2, container, false);

        setViews(view);

        return view;
    }

    void setViews(View view) {

        TextView day2 = view.findViewById(R.id.day2);
        TextView day2_1a = view.findViewById(R.id.day2_1a);
        TextView day2_1b = view.findViewById(R.id.day2_1b);
        TextView day2_1c = view.findViewById(R.id.day2_1c);
        TextView day2_2a = view.findViewById(R.id.day2_2a);
        TextView day2_2b = view.findViewById(R.id.day2_2b);
        TextView day2_2c = view.findViewById(R.id.day2_2c);
        TextView day2_3a = view.findViewById(R.id.day2_3a);
        TextView day2_3b = view.findViewById(R.id.day2_3b);
        TextView day2_3c = view.findViewById(R.id.day2_3c);
        TextView day2_4a = view.findViewById(R.id.day2_4a);
        TextView day2_4b = view.findViewById(R.id.day2_4b);
        TextView day2_4c = view.findViewById(R.id.day2_4c);


        day2.setOnClickListener(this);
        day2_1a.setOnClickListener(this);
        day2_1b.setOnClickListener(this);
        day2_1c.setOnClickListener(this);
        day2_2a.setOnClickListener(this);
        day2_2b.setOnClickListener(this);
        day2_2c.setOnClickListener(this);
        day2_3a.setOnClickListener(this);
        day2_3b.setOnClickListener(this);
        day2_3c.setOnClickListener(this);
        day2_4a.setOnClickListener(this);
        day2_4b.setOnClickListener(this);
        day2_4c.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.day2:
                Intent intentDay2 = new Intent(context, DetailActivity.class);
                intentDay2.putExtra("location", "12");
                startActivity(intentDay2);
            case R.id.day2_1a:
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("location", "13");
                startActivity(intent);
                break;
            case R.id.day2_1b:
                Intent intent1 = new Intent(context, DetailActivity.class);
                intent1.putExtra("location", "14");
                startActivity(intent1);
                break;
            case R.id.day1_1c:
                Intent intent2 = new Intent(context, DetailActivity.class);
                intent2.putExtra("location", "15");
                startActivity(intent2);
                break;
            case R.id.day1_2a:
                Intent intent3 = new Intent(context, DetailActivity.class);
                intent3.putExtra("location", "16");
                startActivity(intent3);
                break;
            case R.id.day1_2b:
                Intent intent4 = new Intent(context, DetailActivity.class);
                intent4.putExtra("location", "17");
                startActivity(intent4);
                break;
            case R.id.day1_2c:
                Intent intent5 = new Intent(context, DetailActivity.class);
                intent5.putExtra("location", "18");
                startActivity(intent5);
                break;
            case R.id.day1_3a:
                Intent intent6 = new Intent(context, DetailActivity.class);
                intent6.putExtra("location", "19");
                startActivity(intent6);
                break;
            case R.id.day1_3b:
                Intent intent7 = new Intent(context, DetailActivity.class);
                intent7.putExtra("location", "20");
                startActivity(intent7);
                break;
            case R.id.day1_3c:
                Intent intent8 = new Intent(context, DetailActivity.class);
                intent8.putExtra("location", "21");
                startActivity(intent8);
                break;
            case R.id.day1_4a:
                Intent intent9 = new Intent(context, DetailActivity.class);
                intent9.putExtra("location", "22");
                startActivity(intent9);
                break;
            case R.id.day1_4b:
                Intent intent10 = new Intent(context, DetailActivity.class);
                intent10.putExtra("location", "23");
                startActivity(intent10);
                break;
            case R.id.day1_4c:
                Intent intent11 = new Intent(context, DetailActivity.class);
                intent11.putExtra("location", "24");
                startActivity(intent11);
                break;
            default:
                break;
        }

    }




}
