package com.example.ibrahim.a355assignment4pt2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ibrahim on 4/2/18.
 */

public class Display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username = getIntent().getStringExtra("Username");

        TextView tv = (TextView)findViewById(R.id.TVusername);
        tv.setText(username);
    }
}
