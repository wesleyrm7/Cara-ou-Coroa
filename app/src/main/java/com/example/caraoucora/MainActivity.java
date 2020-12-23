package com.example.caraoucora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button7);

        //Onclick

        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),SegundaActivity2.class);

                int numeroSorteado=new Random().nextInt(2);
                intent.putExtra("numero",numeroSorteado);

                startActivity(intent);

            }
        });
    }
  }
