package com.example.disasterrelief;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PowerOutage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_outage);
    }

    public void call(View view){
        phoneNums nums = (phoneNums)getApplication();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        String utilityNum = nums.getUtility();
        intent.setData(Uri.parse("tel:" + utilityNum));
        startActivity(intent);
    }
}
