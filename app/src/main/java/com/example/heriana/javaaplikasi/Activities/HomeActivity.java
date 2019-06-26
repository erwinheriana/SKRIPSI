package com.example.heriana.javaaplikasi.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.heriana.javaaplikasi.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button1 = findViewById(R.id.buttonMateri);
        Button button2 = findViewById(R.id.buttonSoal);
        Button button3 = findViewById(R.id.buttonCompiler);
        Button button4 = findViewById(R.id.buttonLogout);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonMateri:
                Toast.makeText(this, "Materi", Toast.LENGTH_SHORT).show();
                Intent a = new Intent(HomeActivity.this,MenuMateriActivity.class);
                startActivity(a);
                break;
            case R.id.buttonSoal:
                Toast.makeText(this, "Contoh Soal", Toast.LENGTH_SHORT).show();
                Intent b = new Intent(HomeActivity.this,SoalActivity.class);
                startActivity(b);
                break;
            case R.id.buttonCompiler:
                Toast.makeText(this, "Compiler", Toast.LENGTH_SHORT).show();
                Intent c = new Intent(HomeActivity.this,CompilerActivity.class);
                startActivity(c);
                break;
            case R.id.buttonLogout:
                Toast.makeText(this, "Log Out", Toast.LENGTH_SHORT).show();
                Intent d = new Intent(HomeActivity.this,LoginActivity.class);
                startActivity(d);
                break;

        }
    }
}

