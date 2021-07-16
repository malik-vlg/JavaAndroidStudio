package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    int buffer;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textView4);
        Button ans = findViewById(R.id.button4);
        ans.setOnClickListener(v -> {
            switch (op){
                case '+':
                    buffer += Integer.parseInt(txt.getText().toString());
                    txt.setText(String.valueOf(buffer));
                    break;
                case '-':
                    buffer -= Integer.parseInt(txt.getText().toString());
                    txt.setText(String.valueOf(buffer));
                    break;
                case '*':
                    buffer *= Integer.parseInt(txt.getText().toString());
                    txt.setText(String.valueOf(buffer));
                    break;
                case '/':
                    buffer /= Integer.parseInt(txt.getText().toString());
                    txt.setText(String.valueOf(buffer));
                    break;
            }
        });
        Log.d("My label", "onCreate invoked");
    }


    @Override
    protected void onPause(){
        super.onPause();
        Log.d("My label", "onPause invoked");
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("My label", "onDestroy invoked");
    }


    public void ops(View view){
        buffer = Integer.parseInt(txt.getText().toString());
        Button button = (Button) view;
        op = button.getText().charAt(0);
        txt.setText("");
        Log.d("ops", buffer + " " + op);
    }

    public void appendText(View view){
        Button button = (Button) view;
        txt.setText(txt.getText().toString() + button.getText().toString());

    }

    public void clear(View view){
        Button button = (Button) view;
        txt.setText("");
    }


}