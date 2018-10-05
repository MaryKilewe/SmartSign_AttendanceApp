package com.example.marys.smartsign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }

    public void nextStudent(View view) {
        Intent intent = new Intent(this,StudentAccess.class);
        startActivity(intent);
    }

    public void nextManage(View view) {
        Intent intent = new Intent(this,ManageStudents.class);
        startActivity(intent);
    }

    public void nextView(View view) {
        Intent intent = new Intent(this,ViewAttendance.class);
        startActivity(intent);
    }








}
