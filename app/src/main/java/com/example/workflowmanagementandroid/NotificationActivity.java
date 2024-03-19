package com.example.workflowmanagementandroid;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NotificationActivity extends AppCompatActivity {

    private ImageView btnBack;
    private RecyclerView listNotice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        findId();
        click();





    }
    private void findId(){
        btnBack = findViewById(R.id.ic_back);
        listNotice = findViewById(R.id.list_notice);
    }

    private void click(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}