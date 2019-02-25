package com.example.disasterrelief;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GasLeak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_leak);
    }

    public void call(View view){
        phoneNums nums = (phoneNums)getApplication();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        String utilityNum = nums.getUtility();
        intent.setData(Uri.parse("tel:" + utilityNum));
        startActivity(intent);
    }

    public void call911(View view){
        String call911 = "tel:911";
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        dialIntent.setData(Uri.parse(call911));
        startActivity(dialIntent);

    }

}
