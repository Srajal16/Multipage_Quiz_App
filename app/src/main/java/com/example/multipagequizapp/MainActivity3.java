package com.example.multipagequizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button b1,b2;
    RadioButton r1,r2,r3,r4;
    RadioGroup radioGr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1 = findViewById(R.id.button);
        radioGr =(RadioGroup)findViewById(R.id.hero);
        b2 = findViewById(R.id.button2);
        r1 = findViewById(R.id.radioButton);
        r2 = findViewById(R.id.radioButton2);
        r3 = findViewById(R.id.lion);
        r4 = findViewById(R.id.king);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedid;
                selectedid = radioGr.getCheckedRadioButtonId();
                if (r2.getId( ) == selectedid ) {

                    r2.setBackgroundColor(Color.parseColor("#85e085"));
                    r1.setBackgroundColor(Color.parseColor("#ff8080"));
                    r3.setBackgroundColor(Color.parseColor("#ff8080"));
                    r4.setBackgroundColor(Color.parseColor("#ff8080"));
                    Toast toast = Toast.makeText(MainActivity3.this,"Correct Answer", Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                    startActivity(intent);
                }
                else {

                    r2.setBackgroundColor(Color.parseColor("#85e085"));
                    r1.setBackgroundColor(Color.parseColor("#ff8080"));
                    r3.setBackgroundColor(Color.parseColor("#ff8080"));
                    r4.setBackgroundColor(Color.parseColor("#ff8080"));
                    Toast toast = Toast.makeText(MainActivity3.this,"Wrong Answer", Toast.LENGTH_SHORT);
                    toast.show();
                    Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
                    startActivity(intent);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioGr.clearCheck();
                r2.setBackgroundColor(Color.parseColor("#CE93D8"));
                r1.setBackgroundColor(Color.parseColor("#4D77FF"));
                r3.setBackgroundColor(Color.parseColor("#4D77FF"));
                r4.setBackgroundColor(Color.parseColor("#CE93D8"));

            }
        });
    }
}