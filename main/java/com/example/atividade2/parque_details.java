package com.example.atividade2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class parque_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_details);

        findViewById(R.id.btnVerMapa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse("geo:-23.476410807739615, -47.412805440957726?q=Natural+Park+Chico+Mendes");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        findViewById(R.id.btnAbrirSite).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://central156.sorocaba.sp.gov.br/Carta-Servicos/Home/Servico/a20c7586-6413-e511-87fb-005056bf74cb");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        findViewById(R.id.btnTelefonar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+551532281256"));
                startActivity(callIntent);
            }
        });
    }
}
