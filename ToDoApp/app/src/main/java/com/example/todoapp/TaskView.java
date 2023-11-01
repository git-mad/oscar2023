package com.example.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TaskView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks_view);
    }

    public void toWelcome(View view) {
        startActivity(new Intent(TaskView.this, WelcomeView.class));
    }
}
