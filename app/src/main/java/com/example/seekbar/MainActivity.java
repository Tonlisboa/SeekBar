package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekbarEscala;
    private TextView textResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekbarEscala = findViewById(R.id.seekBarEscala);
        textResultado = findViewById(R.id.textResultado);
        seekbarEscala.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textResultado.setText("Progresso: " + progress + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                textResultado.setText("Escolhido: " + seekbarEscala.getProgress());
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                textResultado.setText("Escolhido: " + seekbarEscala.getProgress());
            }
        });
    }
    public void recuperarProgresso(View view){
        textResultado.setText("Escolhido: " + seekbarEscala.getProgress());
    }
}