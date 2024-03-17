package com.example.workflowmanagementandroid;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class NotificationActivity extends AppCompatActivity {


    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        findId();
        setSupportActionBar(toolbar);

    }
    private void findId(){
        toolbar = findViewById(R.id.toolbbar_notice);
    }
}