package com.example.disasterrelief;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Other extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    public void call211(View view){
        Intent intent = new Intent(this, Unsure.class);
        startActivity(intent);
    }

    public void petInjury(View view){
        Intent intent = new Intent(this, PetInjury.class);
        startActivity(intent);
    }


}
