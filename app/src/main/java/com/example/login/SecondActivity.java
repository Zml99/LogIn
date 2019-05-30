package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private ListView lv1;

    private String nombres [] = {"Miguel Ant. Linares S.", "Anthony Hernandez", "Jose Carlos Ramirez", "Eduardo Herrera"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv1 = (ListView)findViewById(R.id.lv1);
        
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_names, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(), ThirdActivity.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
