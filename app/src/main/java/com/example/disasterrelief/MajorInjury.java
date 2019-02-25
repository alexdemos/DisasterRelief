package com.example.disasterrelief;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MajorInjury extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major_injury);
    }

    public void call(View view){
        phoneNums nums = (phoneNums)getApplication();
        String highwayNum = nums.getHighway();
        String call = "tel:" + highwayNum;
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        dialIntent.setData(Uri.parse(call));
        startActivity(dialIntent);
    }
}
