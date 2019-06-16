package com.example.phrases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void buttonPressed(View view)
    {
        int id = view.getId();
        String myid = "";
      myid =   view.getResources().getResourceEntryName(id);
        Log.i("button tapped",myid);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
