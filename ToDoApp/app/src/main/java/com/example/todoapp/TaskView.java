package com.example.todoapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TaskView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks_view);
    }
}
