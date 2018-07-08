package com.example.jatuncar.notesapp.activities;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.jatuncar.notesapp.R;
import com.example.jatuncar.notesapp.repositories.NotesRepository;

public class RegisterNotesActivity extends AppCompatActivity {
    private Button btn_registrar_nota;
    private EditText txt_titulo;
    private EditText txt_multi_contenido;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_notes);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        final String username = sharedPreferences.getString("iduser", null);
        btn_registrar_nota = findViewById(R.id.btn_registrar_nota);
        txt_titulo = findViewById(R.id.txt_titulo);
        txt_multi_contenido = findViewById(R.id.txt_multi_contenido);
        btn_registrar_nota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotesRepository.create(Long.getLong(username),txt_titulo.getText().toString(),txt_multi_contenido.getText().toString());
            }
        });
    }
}
