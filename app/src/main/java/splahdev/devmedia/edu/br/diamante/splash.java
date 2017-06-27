package splahdev.devmedia.edu.br.diamante;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000; // variavel pra determinar tempo de exibiçao da minha splash
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);// chamando primeira tela da aplicação splash no caso

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run(){
                Intent MainActivity = new Intent(splash.this, MainActivity.class);
                startActivity(MainActivity);  //estava errando questao minuscula
                finish();
            }

        },SPLASH_TIME_OUT);

    }

}
