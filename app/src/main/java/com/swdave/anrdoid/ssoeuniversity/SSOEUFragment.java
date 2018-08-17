package com.swdave.anrdoid.ssoeuniversity;

import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.ssoeuniversity.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class SSOEUFragment extends Fragment implements View.OnClickListener {

    private static final int REQUEST_CALL = 1;

    Activity context;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        context = getActivity();
        View view = inflater.inflate(R.layout.fragment_ssoeu, container, false);

            maps(view);


        TextView phone = view.findViewById(R.id.callHotel);
        phone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                phoneCall();

            }
        });

        openTwitter(view);

        return view;
    }


    private void phoneCall() {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:4198730700"));

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions((getActivity()), new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                startActivity(callIntent);
            }
        }

    }


    private void maps(View view) {
        ImageView map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=6165 Levis Commons Rd., Perrysbury, Ohio");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

    }

    void openTwitter(View view) {

        ImageView twitter_iv = view.findViewById(R.id.twitter_iv);
        TextView twitter_tv = view.findViewById(R.id.twitter_tv);

        twitter_iv.setOnClickListener(this);
        twitter_tv.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.twitter_iv:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/login?lang=en"));
                startActivity(intent);
                break;
            case R.id.twitter_tv:
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/login?lang=en"));
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
