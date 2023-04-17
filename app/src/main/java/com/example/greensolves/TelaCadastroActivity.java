package com.example.greensolves;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaCadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        Button btncadastrarConta = findViewById(R.id.btnEntrar);
        btncadastrarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email= StringReader(editTextEmail.getText().toString());
                String senha= StringReader(editTextSenha.getText().toString());
            }
        });

    }
}