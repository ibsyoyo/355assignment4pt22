package com.example.ibrahim.a355assignment4pt2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = new DatabaseHelper(this);
    }


    public void onButtonClick(View v)
    {
        if (v.getId() == R.id.Benterval)
        {
            EditText a = (EditText)findViewById(R.id.TFusername);
            String str = a.getText().toString();

            EditText b = (EditText)findViewById(R.id.TFemail);
            String pass = b.getText().toString();

            String password = helper.searchPass(str);
            if(pass.equals(password)){
                Intent i = new Intent(MainActivity.this, Display.class);
                i.putExtra("Username", str);
                startActivity(i);
            }
            else{
                Toast.makeText(MainActivity.this, "Username and Password don't match!!", Toast.LENGTH_SHORT).show();

            }
        }
        if (v.getId() == R.id.Bresults)
        {
            Intent i = new Intent(MainActivity.this, SignUp.class);
            startActivity(i);
        }


    }
}
