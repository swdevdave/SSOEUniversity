package com.example.android.ssoeuniversity;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView phone = findViewById(R.id.tv_phone);
//        phone.setOnClickListener(new View.OnClickListener(){
//
//             @Override
//             public void onClick(View v) {
//                 String phoneNumber = "4198730700";
//                 Intent intent = new Intent(Intent.ACTION_CALL);
//                 intent.setData(Uri.parse(phoneNumber));
//
//
//                 if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                     // TODO: Consider calling
//                     //    ActivityCompat#requestPermissions
//                     // here to request the missing permissions, and then overriding
//                     //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                     //                                          int[] grantResults)
//                     // to handle the case where the user grants the permission. See the documentation
//                     // for ActivityCompat#requestPermissions for more details.
//                     return;
//                 }
//                 startActivity(intent);
//
//             }
//         });

        // Set up the ViewPager with the sections adapter
        ViewPager mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new SSOEUFragment(), "About");
        adapter.addFragment(new Day1Fragment(), "Day 1");
        adapter.addFragment(new Day2Fragment(), "Day 2");
        adapter.addFragment(new ThingsToDoFragment(), "Local TODO");
        viewPager.setAdapter(adapter);
    }


}
