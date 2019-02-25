package com.example.disasterrelief;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AutoAccident extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_accident);
    }

    public void callStatePatrol(View view){
        phoneNums nums = (phoneNums)getApplication();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        String highwayNum = nums.getHighway();
        intent.setData(Uri.parse("tel:" + highwayNum));
        startActivity(intent);
    }}
