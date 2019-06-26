package com.example.heriana.javaaplikasi.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.heriana.javaaplikasi.R;

public class MenuMateriActivity extends AppCompatActivity implements View.OnClickListener  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menumateri);


        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);

        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button4:
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                Intent f = new Intent(MenuMateriActivity.this,MateriJavaFundamental.class);
                startActivity(f);
                break;
            case R.id.button5:
                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
                Intent g = new Intent(MenuMateriActivity.this,MateriJavaProgramming.class);
                startActivity(g);
                break;
            case R.id.button6:
                Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
                Intent h = new Intent(MenuMateriActivity.this,HomeActivity.class);
                startActivity(h);
                break;

        }
    }
}
