package com.example.disasterrelief;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.KeyEvent;
import android.widget.TextView;

public class Update_Numbers extends AppCompatActivity {

    EditText hwy;
    EditText utl;
    EditText pol;
    EditText med;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__numbers);
        setTitle("Update Phone Numbers");
        Log.i("hwy: ", "running Update_Numbers");

        hwy = (EditText) findViewById(R.id.local_highway);
        hwy.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER){
                    main(textView);
                }
                return false;
            }
        });

        utl = (EditText) findViewById(R.id.local_utility);
        utl.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER){
                    main(textView);
                }
                return false;
            }
        });

        pol = (EditText) findViewById(R.id.local_police);
        pol.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER){
                    main(textView);
                }
                return false;
            }
        });

        med = (EditText) findViewById(R.id.local_medical);
        med.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER){
                    main(textView);
                }
                return false;
            }
        });
    }


    public void main(View view) {
        phoneNums nums = (phoneNums) getApplication();
        Log.i("hwy: ", "Start of main");
        switch(view.getId()){
            case R.id.local_highway:
                EditText localHiWay = (EditText) findViewById(R.id.local_highway);
                String localHiWayNum = localHiWay.getText().toString();
                Log.i("hwy: ", localHiWayNum);
                nums.setHighway(localHiWayNum);
                Log.i("hwy: ", localHiWayNum);
                break;
            case R.id.local_medical:
                EditText localMedical = (EditText) findViewById(R.id.local_medical);
                String localMedicalNum = localMedical.getText().toString();
                nums.setMedical(localMedicalNum);
                break;
            case R.id.local_police:
                EditText localPolice = (EditText) view;
                String localPoliceNum = localPolice.getText().toString();
                nums.setPolice(localPoliceNum);
                break;
            case R.id.local_utility:
                EditText localUtilities = (EditText) findViewById(R.id.local_utility);
                String localUtilityNum = localUtilities.getText().toString();
                nums.setUtility(localUtilityNum);
                break;
        }
    }

    public void back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
