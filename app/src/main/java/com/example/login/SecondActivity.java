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

    //public static int[] nombres;
    private ListView lv1;

   // public static String nombres [] = {"Miguel Ant. Linares S.", "Anthony Hernandez", "Jose Carlos Ramirez", "Eduardo Herrera"};

    public static String  selection;

    //private int estudiantes;

    //public class  estudiantes extends Activity {
                private List<Estudiantes>  myestudiantes= new ArrayList<Estudiantes>();

               // @Override
   /* protected void onCreate(Bundle saveInstanceState){
                    super.onCreate(saveInstanceState);
                    setContentView(R.layout.activity_second);

                    FotoEstudiantes();
                    FotoEstudiantesView();
                }*/
//}
            private void FotoEstudiantes(){

                myestudiantes.add(new Estudiantes("Miguel Ant. Linares S", R.drawable.foto_1));
                myestudiantes.add(new Estudiantes("Antony Hernandez", R.drawable.foto_2));
                myestudiantes.add(new Estudiantes("Jose Carlos Ramirez", R.drawable.foto_3));
                myestudiantes.add(new Estudiantes("Eduardo Herrera", R.drawable.foto_4));
            }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FotoEstudiantes();

        lv1 = findViewById(R.id.lv1);

        final ArrayAdapter <Estudiantes> adapter = new ArrayAdapter<>(this, R.layout.list_item_names, myestudiantes);
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
