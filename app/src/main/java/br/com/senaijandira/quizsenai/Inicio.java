package br.com.senaijandira.quizsenai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

public class Inicio extends Activity {




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_activity);







    }

    public void iniciarJogo(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void abrirRegra(View v){
        Intent intent = new Intent(getApplicationContext(), Regra.class);
        startActivity(intent);
    }




}
