package com.example.jatuncar.notesapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jatuncar.notesapp.R;
import com.example.jatuncar.notesapp.repositories.UserRepository;

public class RegistrarActivity extends AppCompatActivity {
    private EditText txt_usuario;
    private EditText txt_nombre_completo;
    private EditText txt_correo_electronico;
    private EditText txt_contrasena_registro;
    private Button btn_guardar_registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        txt_usuario = findViewById(R.id.txt_usuario);
        txt_nombre_completo = findViewById(R.id.txt_nombre_completo);
        txt_correo_electronico = findViewById(R.id.txt_correo_electronico);
        txt_contrasena_registro = findViewById(R.id.txt_contrasena_registro);
        btn_guardar_registro = findViewById(R.id.btn_guardar_registro);

        btn_guardar_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserRepository.create(txt_usuario.getText().toString(),txt_nombre_completo.getText().toString(),
                        txt_correo_electronico.getText().toString(),txt_contrasena_registro.getText().toString());
                finish();
            }
        });

    }
}
