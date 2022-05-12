package com.example.androidnaddtion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private Button bt1;
    private Button bt2;
    private Button bt3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editText1);
        et2 = findViewById(R.id.editText2);
        bt1 = findViewById(R.id.button);
        bt2 = findViewById(R.id.button1);
        bt3 = findViewById(R.id.button2);



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value=Integer.parseInt(et1.getText().toString());
                int value1=Integer.parseInt(et2.getText().toString());
                int sum=value+value1;

                Toast.makeText(getApplication(),String.valueOf(sum), Toast.LENGTH_LONG).show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer num=Integer.parseInt(et1.getText().toString());
                Integer num1=Integer.parseInt(et2.getText().toString());
                Toast.makeText(getApplicationContext(),String.valueOf(num-num1),Toast.LENGTH_LONG).show();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer num=Integer.parseInt(et1.getText().toString());
                Integer num1=Integer.parseInt(et2.getText().toString());
                Toast.makeText(getApplicationContext(),String.valueOf(num*num1),Toast.LENGTH_LONG).show();
            }
        });
    }
}