package com.example.soul.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


    TextView tv;
    TextView tv1;
    TextView tv2;
    int n;
    int n1;
    EditText et;
    Button bt;
    //EditText12
    //Button


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView)findViewById(R.id.textView);
        tv.setText("privetiki");
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tmp = (TextView) v;
                tmp.setText("privet " + n++);
            }
        });

        tv1 = (TextView)findViewById(R.id.textView1);
        tv1.setText("Submit Result");
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tmp = (TextView) v;
                tmp.setText("privet " + n++);
            }
        });
        tv2 = (TextView)findViewById(R.id.textView2);
        tv2.setText("Insert User ID");
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tmp = (TextView) v;
                tmp.setText("Insert User ID" + n1++);
            }
        });
        et = (EditText) findViewById(R.id.EditText);
        et.setText("Enter ID");
        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText tmp = (EditText) v;
                tmp.setText("Insert User ID");
            }
        });
        bt = (Button) findViewById(R.id.Button);
        bt.setText("Submit");
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button tmp = (Button) v;
                tv.setText("Submit succesfull");
                tv1.setText("Submit result= " + et.getText());
            }
        });
    }


}
