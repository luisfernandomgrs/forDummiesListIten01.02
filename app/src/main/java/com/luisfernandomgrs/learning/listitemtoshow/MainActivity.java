package com.luisfernandomgrs.learning.listitemtoshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listItens;
    String[] localesToGoVisit = {"Itajubá", "Maria da Fé", "Pouso Alegre",
            "Campinas", "Campos do Jordão", "Jacutinga", "Mossoró, SE",
            "Aeroporto Congonhas, SP", "Gramado, RS", "Três de Maio, RS",
            "Rio de Janeiro", "Salvador", "Santa Catarina", "Blumenau, SC",
            "Paraná"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // define title do screen...
        setTitle("Lista de Cidades");

        listItens = findViewById(R.id.ListItem);
        ArrayAdapter<String> adapterListItens = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                localesToGoVisit);

        // Define adapter...
        listItens.setAdapter(adapterListItens);

        listItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Get String to current item...
                String valorSelecionado = listItens.getItemAtPosition(i).toString();

                // Using Toast
                Toast.makeText(getApplicationContext(),
                        valorSelecionado,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}