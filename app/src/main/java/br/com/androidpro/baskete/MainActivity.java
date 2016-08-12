package br.com.androidpro.baskete;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pontuacaoTimeA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoTresPontosTimeA = (Button) findViewById(R.id.tresPontosA);
        botaoTresPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosTimeA();
            }
        });
        Button botaoDoisPontosTimeA = (Button) findViewById(R.id.doisPontosA);
        botaoDoisPontosTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosTimeA();
            }
        });
        Button botaoTiroLivreTimeA = (Button) findViewById(R.id.tiroLivreA);
        botaoTiroLivreTimeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUmPontoTimeA();
            }
        });
    }

    public void mostrarPlacarTimeA(int pontuacao) {
        TextView placarTimeA = (TextView) findViewById(R.id.placarTimeA);
        placarTimeA.setText(String.valueOf(pontuacao));
    }

    public void addTresPontosTimeA() {
        pontuacaoTimeA = pontuacaoTimeA + 3;
        mostrarPlacarTimeA(pontuacaoTimeA);
    }

    public void addDoisPontosTimeA() {
        pontuacaoTimeA = pontuacaoTimeA + 2;
        mostrarPlacarTimeA(pontuacaoTimeA);
    }

    public void addUmPontoTimeA() {
        pontuacaoTimeA = pontuacaoTimeA + 1;
        mostrarPlacarTimeA(pontuacaoTimeA);
    }

}
