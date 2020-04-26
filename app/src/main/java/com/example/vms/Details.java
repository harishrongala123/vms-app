package com.example.vms;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.Calendar;

public class Details extends AppCompatActivity {



    Button date;
    Calendar c;
    DatePickerDialog dpd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        date= findViewById(R.id.date);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c= Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(Details.this, new DatePickerDialog.OnDateSetListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onDateSet(DatePicker datePicker, int mYear, int mMonth, int mDay)
                    {
                        date.setText(mDay + "/" + (mMonth+1) + "/" + mYear );
                    }
                },day, month,year);
                dpd.show();
            }
        });




    }




    public void previous(View view) {
        super.onBackPressed();
    }

    public void next(View view) {
        Intent intent=new Intent(this,Camera.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent=new Intent(this,HomeActivity.class);
        startActivity(intent);
    }

    public void alert(View view) {
        Intent intent=new Intent(this,Alert.class);
        startActivity(intent);
    }

    public void event(View view) {
        Intent intent=new Intent(this,Events.class);
        startActivity(intent);
    }

    public void help(View view) {
        Intent intent=new Intent(this,Help.class);
        startActivity(intent);
    }

    public void events(View view) {
    }
}

