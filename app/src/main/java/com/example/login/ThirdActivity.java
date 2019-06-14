package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.login.SecondActivity.nombres;

public class ThirdActivity extends AppCompatActivity {

    private Button btn_atras;
    private Button btn_map;
    private TextView lbname;
    private EditText txtprof;
    private EditText txtmap;
    private EditText txtsexo;
    private EditText txtbday;
    private ImageView img_est;

    public static String direccion[] = {"Calle Paseo de Madrid no. 2", "Av. México no. 24", "Calle Roberto Pastoriza no. 25", "Calle Puerta de Hierro no. 4"};
    public static String profesion[] = {"Ingeniero en Sistemas", "Ingeniero Civil", "Ingeniero Industrial", "Ingeniero Electromecánico"};
    public static String cf [] = {"07/07/1999", "25/05/1996", "04/12/1998", "15/04/1999"};

    double cor1;
    double cor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);



        lbname = (TextView)findViewById(R.id.lbname_st);
        txtprof = (EditText)findViewById(R.id.txtname_st);
        txtsexo = (EditText)findViewById(R.id.txtsexo_st);
        txtmap = (EditText)findViewById(R.id.txtdir_st);
        txtbday = (EditText)findViewById(R.id.txtcumple_st);
        img_est = (ImageView)findViewById(R.id.img_est);

        ListView names = (ListView)findViewById(R.id.lv1);

        Intent inten = getIntent();
        Bundle b = inten.getExtras();
        //Toast.makeText(getApplicationContext(), pos, Toast.LENGTH_SHORT).show();


        if (b != null){
            lbname.setText(b.getString("Nombre"));
            txtprof.setText(b.getString("Profesion"));
            txtsexo.setText("Masculino");
            txtmap.setText(b.getString("Direccion"));
            txtbday.setText(b.getString("BD"));
            img_est.setImageResource(b.getInt("Foto"));
            cor1 = b.getDouble("cor1");
            cor2 = b.getDouble("cor2");
            Toast.makeText(getApplicationContext(), String.valueOf(b.getString("Nombre")), Toast.LENGTH_SHORT).show();

            /*if (nombres[0] == String.valueOf(b.getString("Nombre"))){
                posi = 0;
            }

            else if (nombres[1] == String.valueOf(b.getString("Nombre"))){
                posi = 1;
            }

            else if (nombres[2] == String.valueOf(b.getString("nombre"))){
                posi = 2;
            }

            else if (profesion[3] == String.valueOf(b.getString("Profesion"))){
                posi = 3;
            }*/

        }

        btn_atras = (Button)findViewById(R.id.btn_atras);

        btn_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), SecondActivity.class);
                startActivityForResult(intent2, 0);
            }
        });

        btn_map = (Button)findViewById(R.id.btn_map);
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(ThirdActivity.this, MapActivity.class);
                intent3.putExtra("cor1", cor1);
                intent3.putExtra("cur2", cor2);
                /*Toast.makeText(getApplicationContext(), String.valueOf(cor2), Toast.LENGTH_SHORT).show();*/
                startActivityForResult(intent3, 0);
            }
        });


    }
}
