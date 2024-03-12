package com.example.pisenac_teste;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FormBemvindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_bemvindo); // Substitua "seu_layout" pelo nome do seu arquivo de layout

        Button botaoCadastro = findViewById(R.id.botao_para_login);
        Button botaoLogin = findViewById(R.id.botao_para_cadastro);

        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ao clicar no botão de cadastro, iniciar a atividade de registro
                Intent intent = new Intent(FormBemvindo.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ao clicar no botão de login, iniciar a atividade de login
                Intent intent = new Intent(FormBemvindo.this, FormLogin.class);
                startActivity(intent);
            }
        });
    }
}
