package com.example.listviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity  {

    ListView listView;
    String[] listTopics = {"Android","Java","Kotlin","Javascript","Python"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);  // חיפוש וקישור הרכיב ListView לקוד ה-Java.

        ArrayAdapter adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, listTopics);
        // יצירת מתאם לטיפול בנתונים של הרשימה.

        listView.setAdapter(adapter);  // הגדרת המתאם על ה-ListView.


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                Toast.makeText(MainActivity.this, "You have clicked on " + listTopics[index], Toast.LENGTH_SHORT).show();
            }
        });
   }
}