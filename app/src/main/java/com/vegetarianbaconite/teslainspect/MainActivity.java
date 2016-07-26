package com.vegetarianbaconite.teslainspect;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchInspection(View view) {
        Intent intent = new Intent(this, InspectionActivity.class);
        startActivity(intent);
    }
}

