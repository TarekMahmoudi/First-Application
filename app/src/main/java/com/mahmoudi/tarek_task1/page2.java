package com.mahmoudi.tarek_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class page2 extends AppCompatActivity {

    TextView name1;
    TextView adr;
    TextView prf;
    TextView dream;
    TextView fv;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        name1=findViewById(R.id.activity2_name);
        adr=findViewById(R.id.adr_1);
        prf=findViewById(R.id.prof_1);
        dream=findViewById(R.id.dr_job);
        fv=findViewById(R.id.fv_food);


        Intent i = getIntent();


        String name = i.getStringExtra("Your_Name");
        String ad=i.getStringExtra("Your_Address");
        String profession=i.getStringExtra("Your_Profession");
        String d_job=i.getStringExtra("Dream_Job");
        String f_food=i.getStringExtra("Your_Food");


        adr.setText(ad);
        name1.setText(name);
        prf.setText(profession);
        dream.setText(d_job);
        fv.setText(f_food);










    }
}