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

public class ThirdActivity extends AppCompatActivity {

    private Button btn_atras;
    private Button btn_map;
    private TextView lbname;
    private EditText txtprof;
    private EditText txtmap;
    private EditText txtsexo;
    private EditText txtbday;
    private ImageView img_est;

    private String direccion[] = {"Calle Paseo de Madrid no. 2", "Av. México no. 24", "Calle Roberto Pastoriza no. 25", "Calle Puerta de Hierro no. 4"};
    private String profesion[] = {"Ingeniero en Sistemas", "Ingeniero Civil", "Ingeniero Industrial", "Ingeniero Electromecánico"};


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

        if (SecondActivity.selection == "Miguel Ant. Linares S."){
            lbname.setText(SecondActivity.nombres[0]);
            txtprof.setText(profesion[0]);
            txtsexo.setText("Masculino");
            txtmap.setText(direccion[0]);
            txtbday.setText("07/07/1999");
            img_est.setImageResource(R.drawable.foto_1);

        }
        else if (SecondActivity.selection == "Anthony Hernandez"){
            lbname.setText(SecondActivity.nombres[1]);
            txtprof.setText(profesion[1]);
            txtsexo.setText("Masculino");
            txtmap.setText(direccion[1]);
            txtbday.setText("25/05/1996");
            img_est.setImageResource(R.drawable.foto_2);
        }
        else if (SecondActivity.selection == "Jose Carlos Ramirez"){
            lbname.setText(SecondActivity.nombres[2]);
            txtprof.setText(profesion[2]);
            txtsexo.setText("Masculino");
            txtmap.setText(direccion[2]);
            txtbday.setText("04/12/1998");
            img_est.setImageResource(R.drawable.logan);
        }
        else if (SecondActivity.selection == "Eduardo Herrera"){
            lbname.setText(SecondActivity.nombres[3]);
            txtprof.setText(profesion[3]);
            txtsexo.setText("Masculino");
            txtmap.setText(direccion[3]);
            txtbday.setText("15/04/1999");
            img_est.setImageResource(R.drawable.foto_4);
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
                Intent intent3 = new Intent(v.getContext(), MapActivity.class);
                startActivityForResult(intent3, 0);
            }
        });


    }
}
