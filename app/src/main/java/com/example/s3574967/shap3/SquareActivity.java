package com.example.s3574967.shap3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Float.parseFloat;

public class SquareActivity extends AppCompatActivity {
    private Float operand = new Float(0);
    private Float perimeter = new Float(0);
    private Float area = new Float(0);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
    }

    @Override
    protected  void onStart(){
        super.onStart();
        Log.i("Square Activity","start activity");}
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("SquareActivity", "pause activitvy");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("SquareActivity", "resume activity");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("SquareActivity", "stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("SquareActivity", "bye bye");
    }

    protected  void onRestart(){
        super.onRestart();
        Log.i("Square Activity","start activity");}

    public void onClickArea(View view) {
        EditText editText = (EditText) findViewById(R.id.value);
        operand = parseFloat(editText.getText().toString());
        area = operand * operand;
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(area.toString());
    }

    public void onClickPerimeter(View view) {
        EditText editText = (EditText) findViewById(R.id.value);
        operand = parseFloat(editText.getText().toString());
        perimeter = operand * 4;
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(perimeter.toString());
    }
}