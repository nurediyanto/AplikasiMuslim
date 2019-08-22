package koding.web.aplikasimuslim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSholat, btnProduk, btnDoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSholat = (Button)findViewById(R.id.btn_sholat);
        btnProduk = (Button)findViewById(R.id.btn_produk_halal);
        btnDoa = (Button) findViewById(R.id.btn_doa);

        btnSholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JadwalSholat.class);
                startActivity(intent);
            }
        });

        btnProduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Halal.class);
                startActivity(intent);
            }
        });

        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Doa.class);
                startActivity(intent);
            }
        });


    }
}
