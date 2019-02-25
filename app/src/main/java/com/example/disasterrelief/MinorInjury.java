package com.example.disasterrelief;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MinorInjury extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor_injury);
    }

    public void callMedical(View view){
        phoneNums nums = (phoneNums)getApplication();
        String med = nums.getMedical();
        String call = "tel:" + med;
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        dialIntent.setData(Uri.parse(call));
        startActivity(dialIntent);

    }
}
