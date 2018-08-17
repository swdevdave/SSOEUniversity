package com.swdave.anrdoid.ssoeuniversity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.ssoeuniversity.R;

public class ThingsToDoFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_things_to_do, container, false);

        Button btnHilton = view.findViewById(R.id.btnHilton);
        final Button btnDowntown = view.findViewById(R.id.btnDowntown);
        Button btnLevis = view.findViewById(R.id.btnLevis);

        btnLevis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent levis = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.shopleviscommons.com/directory"));
                startActivity(levis);
            }
        });

        btnDowntown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent downTown = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.downtowntoledo.org/events/"));
                startActivity(downTown);
            }
        });

        btnHilton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hilton = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hiltongardeninn3.hilton.com/en/hotels/ohio/hilton-garden-inn-toledo-perrysburg-TOLPBGI/attractions/index.html"));
                startActivity(hilton);
            }
        });

        return view;


    }
}
