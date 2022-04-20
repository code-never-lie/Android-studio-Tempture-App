package com.example.temperatureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText A;
    TextView S;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A = (EditText) findViewById(R.id.data);
        S = (TextView) findViewById(R.id.result);
        btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float f1=Float.parseFloat(A.getText().toString());
                Float f2=f1/(3+4);
                S.setText("The appropriate temperature range"+"="+Float.toString(f2));
            }

        });
    }
}