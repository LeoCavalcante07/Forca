package br.com.senaijandira.quizsenai;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by 17259211 on 13/08/2018.
 */

public class MainActivity extends Activity {

    Animation shake;
    Animation fade;

    TextView acertos;
    int acerto = 0;
    ImageView cabeca;
    ImageView bracoD;
    ImageView bracoE;
    ImageView pernaD;
    ImageView pernaE;
    LinearLayout llForca;


    TextView erros;
    int erro = 0;
    int random;
    int sorteadoCategoria;
    int sorteadoPalavra;
    int tamanhoVetor;
    int sorteado;
    String palavra;

    TextView txtChances;
    int qtdChances;
    LinearLayout llLetras;
    TextView txtLetra;

    TextView txtDica;

    Button btnU;
    Button btnV;
    Button btnA;
    Button btnB;
    Button btnC;
    Button btnD;
    Button btnE;
    Button btnF;
    Button btnG;
    Button btnH;
    Button btnI;
    Button btnJ;
    Button btnK;
    Button btnL;
    Button btnM;
    Button btnN;
    Button btnO;
    Button btnP;
    Button btnQ;
    Button btnR;
    Button btnS;
    Button btnT;
    Button btnW;
    Button btnX;
    Button btnY;
    Button btnZ;
    Button btnDica;

    String[] [] palavras = {
            {"pato", "vaca", "coelho", "elefante", "cabra"},
            {"jandira", "itapevi", "osasco", "barueri", "paris"},
            {"amor", "medo", "felicidade", "alegria", "tristeza"}

    };


    private void alert(String titulo, String msg){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);


        alert.setTitle(titulo);
        alert.setMessage(msg);

        //Configurar Botão
        alert.setPositiveButton("Próximo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //quando clicar no botão chama a função para ir para proxima pergunta
                iniciarJogo(null);
            }
        });

        alert.create().show();
    }




    public void iniciarJogo(View v){





        vitoriaDerrota(acerto, erro);


        int tamanhoCategoria = palavras.length;
        sorteadoCategoria = numeroAleatorio(tamanhoCategoria);

        int tamanhoLinha = palavras[0].length;
        sorteadoPalavra = numeroAleatorio(tamanhoLinha);





        llLetras = findViewById(R.id.llLetras);

        txtChances = findViewById(R.id.txtChances);

        // qtdChances = Integer.parseInt(txtChances.getText().toString());
        qtdChances = 5;
        txtChances.setText(Integer.toString(qtdChances));



        shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        fade = AnimationUtils.loadAnimation(this, R.anim.fadein);

        btnU = findViewById(R.id.btnU);
        btnV = findViewById(R.id.btnV);
        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnE = findViewById(R.id.btnE);
        btnF = findViewById(R.id.btnF);
        btnG = findViewById(R.id.btnG);
        btnH = findViewById(R.id.btnH);
        btnI = findViewById(R.id.btnI);
        btnJ = findViewById(R.id.btnJ);
        btnK = findViewById(R.id.btnK);
        btnL = findViewById(R.id.btnL);
        btnM = findViewById(R.id.btnM);
        btnN = findViewById(R.id.btnN);
        btnO = findViewById(R.id.btnO);
        btnP = findViewById(R.id.btnP);
        btnQ = findViewById(R.id.btnQ);
        btnR = findViewById(R.id.btnR);
        btnS = findViewById(R.id.btnS);
        btnT = findViewById(R.id.btnT);
        btnW = findViewById(R.id.btnW);
        btnX = findViewById(R.id.btnX);
        btnY = findViewById(R.id.btnY);
        btnZ = findViewById(R.id.btnZ);
        btnDica = findViewById(R.id.btnDica);
        txtDica = findViewById(R.id.txtDica);

        cabeca = findViewById(R.id.cabeca);
        bracoD = findViewById(R.id.bracoD);
        bracoE = findViewById(R.id.bracoE);
        pernaD = findViewById(R.id.pernaD);
        pernaE = findViewById(R.id.pernaE);

        llForca = findViewById(R.id.llForca);

        llForca.setAnimation(fade);



        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnE.setEnabled(true);
        btnF.setEnabled(true);
        btnG.setEnabled(true);
        btnH.setEnabled(true);
        btnI.setEnabled(true);
        btnJ.setEnabled(true);
        btnK.setEnabled(true);
        btnL.setEnabled(true);
        btnM.setEnabled(true);
        btnN.setEnabled(true);
        btnO.setEnabled(true);
        btnP.setEnabled(true);
        btnQ.setEnabled(true);
        btnR.setEnabled(true);
        btnS.setEnabled(true);
        btnT.setEnabled(true);
        btnU.setEnabled(true);
        btnV.setEnabled(true);
        btnW.setEnabled(true);
        btnX.setEnabled(true);
        btnY.setEnabled(true);
        btnZ.setEnabled(true);



        btnA.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnE.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnI.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnO.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnU.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnB.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnC.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnD.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnF.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnG.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnH.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnJ.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnK.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnL.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnM.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnN.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnP.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnQ.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnR.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnS.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnT.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnV.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnW.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnX.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnY.setBackgroundColor(getResources().getColor(R.color.azulzinho));
        btnZ.setBackgroundColor(getResources().getColor(R.color.azulzinho));


        cabeca.setVisibility(View.INVISIBLE);
        bracoE.setVisibility(View.INVISIBLE);
        bracoD.setVisibility(View.INVISIBLE);
        pernaE.setVisibility(View.INVISIBLE);
        pernaD.setVisibility(View.INVISIBLE);



       acertos = findViewById(R.id.txtAcertos);
       erros = findViewById(R.id.txtErros);

       acertos.setText(String.valueOf(acerto));
       erros.setText(erro + "");

        criarCaixas();

    }


    public void vitoriaDerrota(int acerto, int erro){

        if(acerto > 5){
            Intent intent = new Intent(getApplicationContext(), Vitoria.class);
            startActivity(intent);

        }else if(erro > 5){
            Intent intent = new Intent(getApplicationContext(), GameOver.class);
            startActivity(intent);
        }
    }

    public int numeroAleatorio(int tamanho){
        Random random = new Random();

        sorteado = random.nextInt(tamanho);

        return sorteado;
    }

    //método que cria a quantidade de textView de acordo com a palavra sorteada
    public void criarCaixas(){

        llLetras.removeAllViews();
        txtDica.setText("");

        int cont = 0;

        //**************Palavra sorteada************************
        palavra = palavras[sorteadoCategoria][sorteadoPalavra];

        int tamanhoPalavra = palavra.length();


        while(cont <= tamanhoPalavra - 1){

            txtLetra = new TextView(this);
            txtLetra.setText("_");
            txtLetra.setPadding(0, 0,12,0);
            txtLetra.setId(cont);
            llLetras.addView(txtLetra);
            cont++;
        }
    }






    public void verificar(){
        int y = 0;//váriavel que verifica se todas as caixas estão preenchidas, para então ir para a proxima perfunta
        TextView x;
        int contador = 0;
        while(contador < palavra.length()){

            x = findViewById(contador);

            if(!x.getText().toString().equals("_")){

                y++;//toda vez textview estiver com uma letra, ou seja, não igual a "_", incrementa y
            }
            contador++;
        }

        if(y == palavra.length()){//quando y = ao tamanho do vetor, significa que
            // todas as textview estão preenchidas com uma letras, chamando assim, a proxima palavra
            acerto++;

            //iniciarJogo();
            alert("Acertou!", "Próxima Palavra!");
        }
    }


    public void settarColor(int a, View v){
        if(a > 0){//se o a for maior que 0 significa que a letra existe no vetor, settando assim, a cor cinza
            v.setBackgroundColor(getResources().getColor(R.color.green));
            v.setEnabled(false);
        }else{//se for menor ou igual a zero, a letra clicada não existe no vetor da palavra, settando assim a cor vermelho
            qtdChances--;
            v.setBackgroundColor(getResources().getColor(R.color.red));
            v.setEnabled(false);
            if(qtdChances == 4){
                cabeca.setVisibility(View.VISIBLE);

            }else if(qtdChances == 3){
                bracoD.setVisibility(View.VISIBLE);
            }else if(qtdChances == 2){
                bracoE.setVisibility(View.VISIBLE);
            }else if(qtdChances == 1){
                pernaD.setVisibility(View.VISIBLE);
            }


        }
    }




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);




        iniciarJogo(null);




        View.OnClickListener dicaClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(sorteadoCategoria == 0){
                    txtDica.setText("animal");
                }else if(sorteadoCategoria == 1){
                    txtDica.setText("cidade");
                }else{
                    txtDica.setText("sentimento");
                }

            }
        };

        View.OnClickListener btnClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = 0;//variavel que verifica se o botao clicado existe


                if(qtdChances == 0){
                    pernaE.setVisibility(View.VISIBLE);
                    if(pernaD.getVisibility() == View.VISIBLE && bracoD.getVisibility() == View.VISIBLE &&
                            bracoE.getVisibility() == View.VISIBLE && cabeca.getVisibility() == View.VISIBLE && pernaD.getVisibility() == View.VISIBLE ){

                        cabeca.startAnimation(shake);
                        pernaD.startAnimation(shake);
                        pernaE.startAnimation(shake);
                        bracoD.startAnimation(shake);
                        bracoE.startAnimation(shake);
                    }
                }

                if(qtdChances > 0){
                    int i = 0;
                    while(i<= palavra.length() - 1){
                        String palavraDividida = palavra.substring(i, i+1);
                        //int id =  getResources().getIdentifier("r" + i, "id", getPackageName());
                        txtLetra = findViewById(i);

                        if(v.getTag().equals(palavraDividida)) {
                            //v.setBackgroundColor(getResources().getColor(R.color.cinza));
                            txtLetra.setText(palavraDividida);
                            a++; //incrementa a caso a a letra seja igual ao vetor correspondente
                        }


                        i++;
                    }
                    settarColor(a, v);//metodo que colcoa as cores no botao



                    txtChances.setText(Integer.toString(qtdChances));
                }else{

                    alert("Errou!", "Próxima Palavra!");
                    erro++;



                    /*Intent intent = new Intent(getApplicationContext(), GameOver.class);
                    startActivity(intent);*/
                }

                verificar();

            }
        };





        btnU.setOnClickListener(btnClick);
        btnV.setOnClickListener(btnClick);
        btnA.setOnClickListener(btnClick);
        btnB.setOnClickListener(btnClick);
        btnC.setOnClickListener(btnClick);
        btnD.setOnClickListener(btnClick);
        btnE.setOnClickListener(btnClick);
        btnF.setOnClickListener(btnClick);
        btnG.setOnClickListener(btnClick);
        btnH.setOnClickListener(btnClick);
        btnI.setOnClickListener(btnClick);
        btnJ.setOnClickListener(btnClick);
        btnK.setOnClickListener(btnClick);
        btnL.setOnClickListener(btnClick);
        btnM.setOnClickListener(btnClick);
        btnN.setOnClickListener(btnClick);
        btnO.setOnClickListener(btnClick);
        btnP.setOnClickListener(btnClick);
        btnQ.setOnClickListener(btnClick);
        btnR.setOnClickListener(btnClick);
        btnS.setOnClickListener(btnClick);
        btnT.setOnClickListener(btnClick);
        btnW.setOnClickListener(btnClick);
        btnX.setOnClickListener(btnClick);
        btnY.setOnClickListener(btnClick);
        btnZ.setOnClickListener(btnClick);

        btnDica.setOnClickListener(dicaClick);



    }








    }

