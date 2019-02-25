package com.example.disasterrelief;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NoLifeThreat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_life_threat);
    }

    public void personalInjury(View view){
        Intent intent = new Intent(this,PersonalInjury.class);
        startActivity(intent);
    }

    public void propertyDamage(View view){
        Intent intent = new Intent(this,Property_Damage.class);
        startActivity(intent);
    }

    public void autoAccident(View view){
        Intent intent = new Intent(this,AutoAccident.class);
        startActivity(intent);
    }

    public void other(View view){
        Intent intent = new Intent(this,Other.class);
        startActivity(intent);
    }

}
