package com.example.disasterrelief;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Property_Damage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property__damage);
    }

    public void powerOutage(View view){
        Intent intent = new Intent(this, PowerOutage.class);
        startActivity(intent);
    }

    public void gasLeak(View view){
        Intent intent = new Intent(this, GasLeak.class);
        startActivity(intent);
    }
}
