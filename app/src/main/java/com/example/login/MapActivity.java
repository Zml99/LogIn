package com.example.login;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        if (SecondActivity.selection == "Miguel Ant. Linares S."){
            LatLng miguel_casa = new LatLng(18.528470, -69.968398);
            mMap.addMarker(new MarkerOptions().position(miguel_casa).title("Casa"));
            float zoomLevel = 16.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(miguel_casa, zoomLevel));
        }

        else if (SecondActivity.selection == "Anthony Hernandez"){
            LatLng miguel_casa = new LatLng(15.0323174, -92.104198);
            mMap.addMarker(new MarkerOptions().position(miguel_casa).title("Casa"));
            float zoomLevel = 16.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(miguel_casa, zoomLevel));
        }

        else if (SecondActivity.selection == "Jose Carlos Ramirez"){
            LatLng miguel_casa = new LatLng(18.5272709, -69.868887);
            mMap.addMarker(new MarkerOptions().position(miguel_casa).title("Casa"));
            float zoomLevel = 16.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(miguel_casa, zoomLevel));
        }
        else if (SecondActivity.selection == "Eduardo Herrera"){
            LatLng miguel_casa = new LatLng(18.5295363, -69.9700582);
            mMap.addMarker(new MarkerOptions().position(miguel_casa).title("Casa"));
            float zoomLevel = 16.0f;
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(miguel_casa, zoomLevel));
        }
    }
}
