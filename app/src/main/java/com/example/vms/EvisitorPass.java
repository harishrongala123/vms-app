package com.example.vms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class EvisitorPass extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Spinner spinner=findViewById(R.id.visitorspinner);
        if(spinner!=null)
        {
            spinner.setOnItemSelectedListener(this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,R.array.visitorspinner,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        if (adapterView.getItemAtPosition(i).equals("contractor")) {
            Intent intent = new Intent(EvisitorPass.this, EVMS.class);
            startActivity(intent);}

        if (adapterView.getItemAtPosition(i).equals("marketing")) {
            Intent intent1 = new Intent(EvisitorPass.this, EVMS.class);
            startActivity(intent1);}

        if (adapterView.getItemAtPosition(i).equals("courier")) {
            Intent intent2 = new Intent(EvisitorPass.this, EVMS.class);
            startActivity(intent2);}
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
