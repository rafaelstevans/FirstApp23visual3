package br.com.fabricadeprogramador.firstapp23visual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MENU";
    RadioButton radiomas;
    RadioButton radiofem;
    String cumprimento;

    @OnClick(R.id.fechar)
    public void fechar() {
        Log.i(TAG, "Clicou botão fechar");
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Chamou On Create...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx = (TextView) findViewById(R.id.textView);
        radiomas = (RadioButton) findViewById(R.id.radioMasculino);
        radiofem = (RadioButton) findViewById(R.id.radioFeminino);
        ButterKnife.bind(this);


        Button bt = (Button) findViewById(R.id.button);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = (EditText) findViewById(R.id.editText);
                EditText ed2 = (EditText) findViewById(R.id.editText2);
                if (radiomas.isChecked()){
                    cumprimento = "Querido";
                } else {cumprimento = "Querida";
                }

                int nasc = Integer.parseInt(ed2.getText().toString());
                int idade = 2016 - nasc;
                if (nasc <= 2016) {
                    Toast.makeText(MainActivity.this, "Olá, " + ed.getText().toString() + " ! Você tem " + idade + " anos.", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, cumprimento +", você ainda não nasceu !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onStart() {
        Log.i(TAG, "Chamou On Start...");
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "Chamou On Destroy...");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "Chamou On Pause...");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "Chamou On Resume...");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "Chamou On Stop...");
        super.onStop();
    }
}
