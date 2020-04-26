package com.example.vms;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.HttpClientStack;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

public class Employee extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);




        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public void login(View view) {
        Intent intent = new Intent(this,Employee1.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);

    }

    public void alerts(View view) {
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

    public void alert(View view) {
        Intent intent = new Intent(this,AlertsEmp.class);
        startActivity(intent);
    }
    @Override
    public void onResume(){
        super.onResume();
        BusProvider.getInstance().register(this);
    }
}
