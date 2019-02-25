package com.example.disasterrelief;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersonalInjury extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_injury);
    }

    public void majorInjury(View view){
        Intent intent = new Intent(this, MajorInjury.class);
        startActivity(intent);
    }

    public void minorInjury(View view){
        Intent intent = new Intent(this, MinorInjury.class);
        startActivity(intent);
    }
}
