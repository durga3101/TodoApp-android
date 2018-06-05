package com.example.nvankaya.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import javax.xml.transform.Result;

public class AddTodo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_todo);
    }

    public void addNewTodo(View view) {
        String todo = ((EditText) findViewById(R.id.addTodo)).getText().toString();
        Intent intent = new Intent();
        intent.putExtra("newTodo", todo);
        setResult(RESULT_OK, intent);
        finish();
    }
}
