package koding.web.aplikasimuslim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Doa extends AppCompatActivity {
    private Button BtnDoaSebelumBelajar,
            BtnDoaSetelahBelajar, BtnDoaMenghafal, BtnDoaToilet,
            BtnDoaWudhu, BtnDoaAdzan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);
        BtnDoaSebelumBelajar = (Button) findViewById
                (R.id.btn_doa_sebelum_belajar);
        BtnDoaSetelahBelajar = (Button) findViewById
                (R.id.btn_doa_sesudah_belajar);
        BtnDoaMenghafal = (Button) findViewById
                (R.id.btn_doa_menghafal);
        BtnDoaToilet = (Button) findViewById
                (R.id.btn_doa_masuk_toilet);
        BtnDoaWudhu = (Button) findViewById
                (R.id.btn_doa_setelah_wudhu);
        BtnDoaAdzan = (Button) findViewById
                (R.id.btn_doa_setelah_adzan);

        BtnDoaSebelumBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doa.this, DoaSebelumBelajar.class);
                startActivity(intent);
            }
        });

        BtnDoaSetelahBelajar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doa.this, DoaSetelahBelajar.class);
                startActivity(intent);
            }
        });

        BtnDoaMenghafal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doa.this, DoaMudahMenghafal.class);
                startActivity(intent);
            }
        });

        BtnDoaToilet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doa.this, DoaMasukToilet.class);
                startActivity(intent);
            }
        });

        BtnDoaAdzan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doa.this, DoaSetelahAdzan.class);
                startActivity(intent);
            }
        });

        BtnDoaWudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doa.this, DoaSetelahWudhu.class);
                startActivity(intent);
            }
        });
    }
}
