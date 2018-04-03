package com.example.ibrahim.a355assignment4pt2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ibrahim on 4/2/18.
 */

public class SignUp extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void onSignUpClick(View v){
        if (v.getId() == R.id.Bsignupbutton){

            EditText name = (EditText)findViewById(R.id.TFname);
            EditText email = (EditText)findViewById(R.id.TFemail);

            //EditText uname = (EditText)findViewById(R.id.TFuname);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();


            Contact c = new Contact();



                c.setSyn(namestr);
                c.setAnt(emailstr);

            Intent i = new Intent(SignUp.this, MainActivity.class);

            startActivity(i);

            }

        }
    }


