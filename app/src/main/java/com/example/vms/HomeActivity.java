package com.example.vms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void guest(View view) {

        Intent intent= new Intent(this,Guest1.class);

        startActivity(intent);

    }

    public void employee(View view) {
        Intent intent = new Intent(this,Employee.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }

    public void alert(View view) {
        Intent intent = new Intent(this,Alert.class);
        startActivity(intent);
    }

    public void events(View view) {
        Intent intent = new Intent(this,Events.class);
        startActivity(intent);
    }

    public void help(View view) {
        Intent intent = new Intent(this,Help.class);
        startActivity(intent);
    }
}


