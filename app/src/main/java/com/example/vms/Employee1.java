package com.example.vms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Employee1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void home(View view) {
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);

    }

    public void alert(View view) {
        Intent intent = new Intent(this,AlertsEmp.class);
        startActivity(intent);
    }

    public void events(View view) {
        Intent intent = new Intent(this,EventsEmp.class);
        startActivity(intent);
    }

    public void help(View view) {
        Intent intent = new Intent(this,HelpEmp.class);
        startActivity(intent);
    }

    public void visitorpass(View view) {
        Intent intent=new Intent(this,EvisitorPass.class);
        startActivity(intent);
    }

    public void employees(View view) {
        Intent intent=new Intent(this,EEmployees.class);
        startActivity(intent);
    }

    public void training(View view) {
        Intent intent=new Intent(this,ETraining.class);
        startActivity(intent);
    }

    public void tasks(View view) {
        Intent intent=new Intent(this,ETasks.class);
        startActivity(intent);
    }

    public void myvisits(View view) {
        Intent intent=new Intent(this,EMyVisitors.class);
        startActivity(intent);
    }

    public void Events(View view) {
        Intent intent=new Intent(this,EEvents.class);
        startActivity(intent);
    }

    public void projects(View view) {
        Intent intent=new Intent(this,EProjects.class);
        startActivity(intent);
    }

    public void timelogs(View view) {
        Intent intent=new Intent(this,ETimeLogs.class);
        startActivity(intent);
    }

    public void others(View view) {
        Intent intent=new Intent(this,EOthers.class);
        startActivity(intent);
    }
}

