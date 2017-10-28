package com.example.administrator.prevent;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder  builder = new AlertDialog.Builder(this);
        View dialogView = getLayoutInflater().from(this).inflate(R.layout.password_main,null);
        builder.setView(dialogView);

        AlertDialog  mAlertDialog  = builder.create();
        mAlertDialog.show();
    }
}
