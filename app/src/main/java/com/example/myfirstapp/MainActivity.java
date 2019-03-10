package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button=(Button) findViewById(R.id. button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstNameeditText= (EditText) findViewById(R.id.FirstNameeditText);
                EditText SecondNameeditTex= (EditText) findViewById(R.id.SecondNameeditText);
                TextView textView2= (TextView) findViewById(R.id.textView2);

                int num1 = Integer.parseInt(FirstNameeditText.getText().toString());
                int num2 = Integer.parseInt(SecondNameeditTex.getText().toString());
                int result= num1+num2;
                textView2.setText(result+"");

            }
        });
    }
}
