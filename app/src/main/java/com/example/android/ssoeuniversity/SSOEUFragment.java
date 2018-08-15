package com.example.android.ssoeuniversity;

import android.Manifest;
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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class SSOEUFragment extends Fragment {

    private static final int REQUEST_CALL = 1;

    private static final int ERROR_DIALOG_REQUEST = 9001;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ssoeu, container, false);


        if (isServicesOK()) {
            maps(view);
        }

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


    private void maps(View view) {
        TextView hilton = view.findViewById(R.id.hilton_address);
        hilton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=6165 Levis Commons Rd., Perrysbury, Ohio");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

    }


    public boolean isServicesOK() {


        int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getActivity());

        if (available == ConnectionResult.SUCCESS) {
            // Everything is fine, user can make map requests.

            return true;

        } else if (GoogleApiAvailability.getInstance().isUserResolvableError(available)) {
            // An Error occurred, but fixable

            Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(getActivity(), available, ERROR_DIALOG_REQUEST);
            dialog.show();

        } else {
            Toast.makeText(getActivity(), "Unable to make map requests", Toast.LENGTH_SHORT).show();

        }
        return false;
    }
}
