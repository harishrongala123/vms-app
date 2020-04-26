package com.example.vms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class EVMS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evms);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public void home(View view) {
        Intent intent=new Intent(this,HomeActivity.class);
        startActivity(intent);
    }

    public void help(View view) {Intent intent=new Intent(this,HelpEmp.class);
        startActivity(intent);
    }

    public void alert(View view) {
        Intent intent=new Intent(this,AlertsEmp.class);
        startActivity(intent);
    }

    public void event(View view) {
        Intent intent=new Intent(this,EventsEmp.class);
        startActivity(intent);
    }

    public void previous(View view) {
        super.onBackPressed();
    }

    public void cancel(View view) {
        super.onRestart();
    }

    public void next(View view) {
        Intent intent=new Intent(this,Details.class);
        startActivity(intent);
    }
}