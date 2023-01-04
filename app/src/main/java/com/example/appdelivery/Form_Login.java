package com.example.appdelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Form_Login extends AppCompatActivity {

    private TextView txt_criar_conta, txt_mensagemErro;
    private EditText edit_email, edit_senha;
    private Button bt_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        iniciarComponentes();

        txt_criar_conta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formCadastro = new Intent(Form_Login.this, Form_Cadastro.class);
                startActivity(formCadastro);
            }
        });

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edit_email.getText().toString();
                String senha = edit_senha.getText().toString();

                if (email.isEmpty() || senha.isEmpty()){
                    txt_mensagemErro.setText("Preencha todos os campos!");
                }else{
                    txt_mensagemErro.setText("");
                    AutenticarUsuario();
                }
            }
        });


    }

    public void AutenticarUsuario(){

    }

    private void iniciarComponentes() {
        txt_criar_conta = findViewById(R.id.txt_criar_conta);
        txt_mensagemErro = findViewById(R.id.txt_mensagemErro);
        edit_email = findViewById(R.id.edt_email);
        edit_senha = findViewById(R.id.edt_senha);
        bt_entrar = findViewById(R.id.bt_entrar);
    }
}