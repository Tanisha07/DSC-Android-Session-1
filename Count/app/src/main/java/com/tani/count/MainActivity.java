package com.tani.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e =(EditText) findViewById(R.id.editText);
        b = (Button) findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e.getText().toString();
                if(TextUtils.isEmpty(s)){
                    Toast.makeText(MainActivity.this, "No number is entered", Toast.LENGTH_LONG).show();
                }

                else{
                    int n = Integer.parseInt(s);
                    e.setText(n+1+"");
                }
            }
        });

//        int n1 = Integer.parseInt(e.getText().toString());





    }
}
