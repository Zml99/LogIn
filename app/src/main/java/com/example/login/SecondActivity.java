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

import static com.example.login.ThirdActivity.cf;
import static com.example.login.ThirdActivity.direccion;
import static com.example.login.ThirdActivity.profesion;

public class SecondActivity extends AppCompatActivity {

    private ListView lv1;

    public static String nombres [] = {"Miguel Ant. Linares S.", "Anthony Hernandez", "Jose Carlos Ramirez", "Eduardo Herrera"};
    int[] datosImg  = {R.drawable.foto_1, R.drawable.foto_2, R.drawable.foto_3, R.drawable.foto_4};
    public static double cor1 [] = {18.528470, 15.0323174, 18.5272709, 18.5295363};
    public static double cor2 [] = {-69.968398, -92.104198, -69.868887, -69.9700582};

    public static String  selection;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        lv1 = findViewById(R.id.lv1);
        lv1.setAdapter(new Adaptador(this, nombres, datosImg));


        /*ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.list_item_names, nombres);

        lv1.setAdapter(adapter);*/

        

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(view.getContext(), ThirdActivity.class);
                intent.putExtra("Nombre", nombres[position]);
                intent.putExtra("Direccion", direccion[position]);
                intent.putExtra("Profesion", profesion[position]);
                intent.putExtra("Foto", datosImg[position]);
                intent.putExtra("BD", cf[position]);
                intent.putExtra("cor1", cor1[position]);
                intent.putExtra("cor2", cor2[position]);
                startActivityForResult(intent, 0);

            }
            });
    }
}
