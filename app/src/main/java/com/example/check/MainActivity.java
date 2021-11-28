package com.example.check;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper myDB;

    EditText editTextTitle, editTextPlace, editTextTime, editTextContent;
    Button buttonInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDB = new DatabaseHelper(this);

        editTextTitle = findViewById(R.id.crud_title);
        editTextPlace = findViewById(R.id.crud_place);
        editTextTime =  findViewById(R.id.crud_time);
        editTextContent = findViewById(R.id.crud_content);

        buttonInsert = findViewById(R.id.crud_submit);

//        ViewData();
    }

//    private void ViewData() {
//        Cursor res = myDB.getAllData();
//
//        StringBuffer buffer = newStringBuffer();
//        while(res.moveToNext()){
//            buffer.append(res.getString(0)+"\n");
//            buffer.append("장소" + res.get)
//        }
//
//    }
}