package com.example.vms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Guest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest1);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void visitor(View view) {

        Intent intent=new Intent(this,Visitor.class);
        startActivity(intent);


    }

    public void home(View view) {
        Intent intent=new Intent(this,HomeActivity.class);
        startActivity(intent);
    }

    public void alerts(View view) {
        Intent intent=new Intent(this,Alert.class);
        startActivity(intent);
    }

    public void help(View view) {
        Intent intent=new Intent(this,Help.class);
        startActivity(intent);
    }

    public void events(View view) {
        Intent intent=new Intent(this,Events.class);
        startActivity(intent);
    }

    public void visits(View view) {
        Intent intent=new Intent(this,GVisits.class);
        startActivity(intent);
    }

    public void timelogs(View view) {
        Intent intent=new Intent(this,GTimeLogs.class);
        startActivity(intent);
    }


}
