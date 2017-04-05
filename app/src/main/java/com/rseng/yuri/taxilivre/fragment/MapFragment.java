package com.rseng.yuri.taxilivre.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.rseng.yuri.taxilivre.R;

public class MapFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    public static Fragment newInstance(Context context) {
        MapFragment f = new MapFragment();

        return f;
    }

    /*public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
         FragmentManager fManager ;
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) fManager
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_map, null);
        return root;

    }*/

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng posicao = new LatLng(-3.740087, -38.605478);
        mMap.addMarker(new MarkerOptions().position(posicao).title("Marker in Position"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(posicao,15));
    }
}
