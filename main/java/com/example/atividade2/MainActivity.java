package com.example.atividade2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openZooDetails(View view) {
        Intent intent = new Intent(this, zoo_details.class);
        startActivity(intent);
    }

    public void openIguatemiDetails(View view) {
        Intent intent = new Intent(this, iguatemi_details.class);
        startActivity(intent);
    }

    public void openParqueDetails(View view) {
        Intent intent = new Intent(this, parque_details.class);
        startActivity(intent);
    }
}
