package com.example.sudo.basu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        user = et_username.getText().toString();
        pass = et_password.getText().toString();

        if(user == "sudo" && pass == "zmaj"){
            Intent intent = new Intent(getApplicationContext(),playliste.class);
            startActivity(intent);

        }
    }
}
