package com.pmdm.ejercicio3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String tlfo;
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        Intent intentRecibido = getIntent();
        if (intentRecibido != null) {
            tlfo = intentRecibido.getStringExtra("Numero_TLF");
        } else {
            tlfo = "988123456";
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        findViewById(R.id.button31).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+tlfo));
            startActivity(intent);
        });

        findViewById(R.id.button32).setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:42.3367,-7.8637?z=15"));
            startActivity(intent);
        });

        findViewById(R.id.button33).setOnClickListener(v -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);

        });

        findViewById(R.id.button34).setOnClickListener(v -> {
            Intent intentImplicito = new Intent(Intent.ACTION_VIEW);
            intentImplicito.setData(Uri.parse("https://www.google.com"));
            startActivity(intentImplicito);

        });
    }
}