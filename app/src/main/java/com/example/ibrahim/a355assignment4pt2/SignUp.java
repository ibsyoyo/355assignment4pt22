package com.example.ibrahim.a355assignment4pt2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ibrahim on 4/2/18.
 */

public class SignUp extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void onSignUpClick(View v){
        if (v.getId() == R.id.Bsignupbutton){

            EditText name = (EditText)findViewById(R.id.TFname);
            EditText email = (EditText)findViewById(R.id.TFemail);
            EditText pass1 = (EditText)findViewById(R.id.TFpass1);
            EditText pass2 = (EditText)findViewById(R.id.TFpass2);
            EditText uname = (EditText)findViewById(R.id.TFuname);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();
            String unamestr = uname.getText().toString();

            if (!pass1str.equals(pass2str)){
                //popup msg

                Toast.makeText(SignUp.this, "Passwords don't match!!", Toast.LENGTH_SHORT).show();
            }

        }
    }

}
