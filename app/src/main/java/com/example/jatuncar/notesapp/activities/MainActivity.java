package com.example.jatuncar.notesapp.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jatuncar.notesapp.R;
import com.example.jatuncar.notesapp.models.User;
import com.example.jatuncar.notesapp.repositories.UserRepository;

public class MainActivity extends AppCompatActivity {
    private EditText txt_usuario;
    private EditText txt_contrasena;
    private Button btn_ingresar;
    private Button btn_registrar;
    private User user;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_usuario = findViewById(R.id.txt_usuario);
        txt_contrasena = findViewById(R.id.txt_contrasena);
        btn_ingresar = findViewById(R.id.btn_ingresar);
        btn_registrar = findViewById(R.id.btn_registrar);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = UserRepository.devuelve_user(txt_usuario.getText().toString(), txt_contrasena.getText().toString());
                if(user != null ) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("iduser",user.getId().toString());
                    editor.commit();
                    startActivity(new Intent(MainActivity.this, SeeNotesActivity.class));
                }
            }
        });

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RegistrarActivity.class ));
            }
        });
    }

}

