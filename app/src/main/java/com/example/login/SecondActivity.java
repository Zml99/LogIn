package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

<<<<<<< HEAD

    private ListView lv1;

    public static String nombres [] = {"Miguel Ant. Linares S.", "Anthony Hernandez", "Jose Carlos Ramirez", "Eduardo Herrera"};

    public static String selection;

    int[] datosImg = {R.drawable.foto_1, R.drawable.foto_2, R.drawable.foto_3, R.drawable.foto_4,};

=======
    private ListView lv1;

    public static String nombres [] = {"Miguel Ant. Linares S.", "Anthony Hernandez", "Jose Carlos Ramirez", "Eduardo Herrera"};

    public static String  selection;


>>>>>>> master

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

<<<<<<< HEAD

        lv1 = findViewById(R.id.lv1);

        // ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.list_item_names, nombres);
        //lv1.setAdapter(adapter);
        lv1.setAdapter(new Adaptador(this,nombres,datosImg));
=======


        lv1 = findViewById(R.id.lv1);


        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.list_item_names, nombres);

        lv1.setAdapter(adapter);
>>>>>>> master

        

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(), ThirdActivity.class);
                startActivityForResult(intent, 0);
                selection = (String) parent.getItemAtPosition(position);


            }
            });
    }
}
