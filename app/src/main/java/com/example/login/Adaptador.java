package com.example.login;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String[] nombres;
    int[] datosImg;

    public Adaptador(Context contexto, String[] nombres, int[] imagenes) {

        this.contexto = contexto;
        this.nombres = nombres;
        this.datosImg = imagenes;
        inflater =(LayoutInflater)contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

    final View vista = inflater.inflate(R.layout.list_view_second_act, null);
    TextView estudiante =  (TextView)vista.findViewById(R.id.tvEstudiantes);
    ImageView imagen = (ImageView)vista.findViewById(R.id.image1);
    estudiante.setText(nombres[i]);
    imagen.setImageResource(datosImg[i]);

    /*
    imagen.setTag(i);
    imagen.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent visorImagen = new Intent(contexto, visorImagen.Class);
            visorImagen.putExtra("IMG", datosImg[(Integer)v.getTag()]);
            contexto.startActivity(visorImagen);

        }


    });

    */
        return vista;
    }


    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}
