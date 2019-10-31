package id.ac.poliban.mi.sarwan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etAngkaPertama = findViewById(R.id.etAngkaPertama);
        EditText etAngkaKedua = findViewById(R.id.etAngkaKedua);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btClear = findViewById(R.id.btClear);
        TextView tvHasil = findViewById(R.id.tvHasil);


        btTambah.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkaPertama.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkaKedua.getText().toString());
            int Hasil = aPertama + aKedua;
            tvHasil.setText(Integer.toString(Hasil));
        } );


        btKurang.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkaPertama.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkaKedua.getText().toString());
            int Hasil = aPertama - aKedua;
            tvHasil.setText(Integer.toString(Hasil));
        } );


        btKali.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkaPertama.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkaKedua.getText().toString());
            int Hasil = aPertama * aKedua;
            tvHasil.setText(Integer.toString(Hasil));
        } );


        btBagi.setOnClickListener(v -> {
            Double aPertama = Double.parseDouble(etAngkaPertama.getText().toString());
            Double aKedua = Double.parseDouble(etAngkaKedua.getText().toString());
            Double Hasil = aPertama / aKedua;
            tvHasil.setText(Double.toString(Hasil));
        } );


        btClear.setOnClickListener(v -> {
            etAngkaPertama.setText("");
            etAngkaKedua.setText("");
            etAngkaPertama.requestFocus();
            tvHasil.setText("0");
        });

    }

}
