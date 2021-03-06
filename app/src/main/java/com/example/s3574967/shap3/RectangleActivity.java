package com.example.s3574967.shap3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Float.parseFloat;

public class RectangleActivity extends AppCompatActivity {
    private Float widthValue = new Float(0);
    private Float lengthValue = new Float(0);
    private Float perimeter = new Float(0);
    private Float area = new Float(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
    }

    @Override
    protected  void onStart(){
        super.onStart();
        Log.i("Rec Activity","start activity");}
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Rec Activity", "pause activitvy");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Rec Activity", "resume activity");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Rec Activity", "stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Rec Activity", "bye bye");
    }

    public void onClickArea(View view) {
        EditText editText = (EditText) findViewById(R.id.lengthValue);
        EditText editText2 = (EditText) findViewById(R.id.widthValue);
        lengthValue = parseFloat(editText.getText().toString());
        widthValue = parseFloat(editText2.getText().toString());
        area = lengthValue * widthValue;
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(area.toString());

    }



    public void onClickPerimeter(View view) {
        EditText editText = (EditText) findViewById(R.id.lengthValue);
        EditText editText2 = (EditText) findViewById(R.id.widthValue);
        lengthValue = parseFloat(editText.getText().toString());
        widthValue = parseFloat(editText2.getText().toString());
        perimeter = (lengthValue + widthValue) * 2;
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText(perimeter.toString());
    }
}
