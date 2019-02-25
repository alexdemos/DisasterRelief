package com.example.disasterrelief;

import android.app.Application;

public class phoneNums extends Application {
    private  String highway;
    private  String police;
    private  String medical;
    private  String utility;

    public String getHighway(){
        return highway;
    }

    public void setHighway(String s){
        highway = s;
    }

    public String getPolice(){
        return police;
    }

    public void setPolice(String s){
        police = s;
    }

    public String getMedical(){
        return medical;
    }

    public void setMedical(String s){
        medical = s;
    }

    public String getUtility(){
        return utility;
    }

    public void setUtility(String s){
        utility = s;
    }


}
