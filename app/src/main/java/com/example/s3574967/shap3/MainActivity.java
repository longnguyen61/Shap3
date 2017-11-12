package com.example.s3574967.shap3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected  void onStart() {
        super.onStart();
        Log.i("Main Activity", "start activity");
    }
    public void onClickMenu(View view) {
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }

    public void onClickInfomationActivity(View view){
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Main Activity", "pause activitvy");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("Main Activity", "resume activity");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("Main Activity", "stop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("Main Activity", "bye bye");
    }
}
