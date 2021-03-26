package com.example.layout_mcsf19m016;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn5,btn6;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button2);
        btn1 = findViewById(R.id.button5);
        btn1 = findViewById(R.id.button6);
        textView = findViewById(R.id.textViewCode);
    }

    public void Button2WasClicked(View view) {
        textView.setText("Button2WasClicked");
    }

    public void Button1WasClicked(View view) {
        textView.setText("Button1WasClicked");
    }

    public void Button3WasClicked(View view) {
        textView.setText("Button3WasClicked");
    }
}