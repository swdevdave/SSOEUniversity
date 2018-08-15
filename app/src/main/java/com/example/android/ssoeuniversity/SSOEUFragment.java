package com.example.android.ssoeuniversity;

import android.Manifest;
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
import android.widget.TextView;

public class SSOEUFragment extends Fragment {


    private static final int REQUEST_CALL = 1;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ssoeu, container, false);


        TextView phone = view.findViewById(R.id.callHotel);

        phone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                phoneCall();

            }
        });

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
}
