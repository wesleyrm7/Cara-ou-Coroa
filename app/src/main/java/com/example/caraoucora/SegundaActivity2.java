    package com.example.caraoucora;

    import androidx.appcompat.app.AppCompatActivity;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.ImageView;
    import android.widget.TextView;

    import java.util.Random;

    public class SegundaActivity2 extends AppCompatActivity {
        private Button button;
        private ImageView resultado;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_segunda2);

            resultado=findViewById(R.id.imageResultado);

            Bundle dados=getIntent().getExtras(); //Recuperando os dados
            int numero=dados.getInt("numero");

            if (numero==0) {//cara
                resultado.setImageResource(R.drawable.moeda_cara);
            }else { //coroa
                resultado.setImageResource(R.drawable.moeda_coroa);
                //magica esta aqui no
            }

            button=findViewById(R.id.buttonVolta);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   finish();


                }

            });

        }


    }