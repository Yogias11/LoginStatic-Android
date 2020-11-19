package com.example.testandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //identifikasi
        et1 = findViewById(R.id.txtUname);
        et2 = findViewById(R.id.txtPass);
        btn = findViewById(R.id.btnLogin);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("gbs_user") && et2.getText().toString().equals("123456")) {
                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplication(), HomeActivity.class));
                } else {
                    Toast.makeText(getApplication(), "Maaf, Anda tidak dapat mengakses modul tersebut.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}