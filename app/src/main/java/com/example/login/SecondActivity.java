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

    private ListView lv1;

    public static String nombres [] = {"Miguel Ant. Linares S.", "Anthony Hernandez", "Jose Carlos Ramirez", "Eduardo Herrera"};

    public static String  selection;

    private int estudiantes;

    public class  estudiantes extends Activity {
                private List<estudiantes>  myestudiantes= new ArrayList<estudiantes>();

                @Override
    protected void onCreate(Bundle saveInstanceState){
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_second);

                    FotoEstudiantes();
                    FotoEstudiantesView();
                }
}
            private void FotoEstudiantes(){

               adapter.add(new estudiantes("Miguel Ant. Linares S", R.drawable.foto_1));
               adapter.add(new estudiantes("Antony Hernandez", R.drawable.foto_2));
               adapter.add(new estudiantes("Jose Carlos Ramirez", R.drawable.foto_3));
               adapter.add(new estudiantes("Eduardo Herrera", R.drawable.foto_4));
            }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv1 = (ListView)findViewById(R.id.lv1);

        final ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_names, nombres);
        lv1.setAdapter(adapter);

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
