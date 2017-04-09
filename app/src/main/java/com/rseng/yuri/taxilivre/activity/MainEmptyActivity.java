package com.rseng.yuri.taxilivre.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rseng.yuri.taxilivre.R;

public class MainEmptyActivity extends AppCompatActivity {

    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_empty);

        Intent activityIntent;

        activityIntent = new Intent(this, MapsActivity.class);
        //activityIntent = new Intent(this, LoginActivity.class);
        // go straight to main if a token is stored
        /*if (Util.getToken() != null) {
            activityIntent = new Intent(this, MapsActivity.class);
        } else {
            activityIntent = new Intent(this, LoginActivity.class);
        }*/

        startActivity(activityIntent);
        finish();

    }
}
