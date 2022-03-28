package com.example.sample_constraint_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama,tvnomor;



    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
        tvnama = findViewById(R.id.tvnama_item);
        tvnomor = findViewById(R.id.tvNamaKontak);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama) {
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122233344");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("08122533344");
                break;
            case "Eris":
                tvnama.setText("Eris ");
                tvnomor.setText("08121233344");
                break;
            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("08122233341");
                break;
            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("08122233342");
                break;
            case "Intan":
                tvnama.setText("Intan s");
                tvnomor.setText("08122233343");
                break;
            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08122233356");
                break;
            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("08122233346");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("08122233347");
                break;
            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("08122233348");
                break;
        } Toast t = Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_SHORT);
        t.show();
        Bundle b = new Bundle();
        Intent i = new Intent(getApplicationContext(), ViewHolder.class );
        i.putExtras(b);
        startActivity(i);
    }
}
