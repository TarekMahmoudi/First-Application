package com.mahmoudi.tarek_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.resources.TextAppearanceConfig;

public class MainActivity extends AppCompatActivity {

    TextView name ;
    TextView ad;
    TextView profession;
    TextView d_job;
    TextView f_food;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        name=findViewById(R.id.your_name);
        ad=findViewById(R.id.your_adress);
        profession=findViewById(R.id.your_profession);
        d_job=findViewById(R.id.dream_job);
        f_food=findViewById(R.id.favorite_food);
        submit=findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),page2.class);
                intent.putExtra("Your_Name", name.getText().toString());
                intent.putExtra("Your_Address", ad.getText().toString());
                intent.putExtra("Your_Profession",profession.getText().toString());
                intent.putExtra("Dream_Job",d_job.getText().toString());
                intent.putExtra("Your_Food",f_food.getText().toString());

                startActivity(intent);

            }
        });



    }
}