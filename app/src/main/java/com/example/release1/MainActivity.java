package com.example.release1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edit_Nome;
    private EditText edit_Senha;
    private Button bt_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_Nome = findViewById(R.id.editNome);
        edit_Senha = findViewById(R.id.editSenha);
        bt_Login = findViewById(R.id.btLogin);

        bt_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edit_Nome.getText().toString();
                String password = edit_Senha.getText().toString();

                if (email.equals("123") && password.equals("123")) {
                    Toast.makeText(MainActivity.this, "Login realizado com sucesso", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Credenciais inválidas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}