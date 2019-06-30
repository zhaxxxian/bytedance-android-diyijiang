package com.zxx.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    TextView txv;
    Button mbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbt = findViewById(R.id.button);
        txv = (TextView) findViewById(R.id.txv);
        mbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txv.setTextSize(++size);
                Log.d(TAG, "bigger");
            }
        });
    }

    int size = 30;
//    protected  void bigger(View v){
//        txv.setTextSize(++size);
//    }
    public  void display(View v){
        EditText name = (EditText)findViewById(R.id.name);
            TextView text = (TextView)findViewById(R.id.txv);
            text.setText(name.getText().toString());
        Log.d(TAG, "confirm");
    }
}
