package com.example.sudo.basu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_username, et_password;
    private Button b_login;
    private String user, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        b_login = (Button) findViewById(R.id.b_login);


        b_login.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        Log.d("click", "login");


        switch (v.getId()) {
            case R.id.b_login:
                user = et_username.getText().toString();
                pass = et_password.getText().toString();
                Log.d("click user", user);
                Log.d("click pass", pass);

                if (user.equals("sudo") && pass.equals("zmaj") ) {
                    Log.d("login", "if");
                    Intent playliste = new Intent(this, playliste.class);
                    startActivity(playliste);
                }
                break;
        }
    }
}
