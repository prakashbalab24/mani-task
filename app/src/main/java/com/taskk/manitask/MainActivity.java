package com.taskk.manitask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button teaBut,coffBut,vadaBut,milkBut,samBut,vada2But;
    private TextView itemsTv,totalTv;

    private static final int TEA = 5;
    private static final int COFFEE = 10;
    private static final int MILK = 15;
    private static final int SAMOSA = 20;
    private static final int VADA = 10;
    private static final int VADA2 = 10;

    int amt=0;
    int items = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
    }

    private void setViews() {
        teaBut = findViewById(R.id.but_tea);
        coffBut = findViewById(R.id.but_cof);
        vadaBut = findViewById(R.id.but_vad);
        milkBut = findViewById(R.id.but_mil);
        samBut = findViewById(R.id.but_sam);
        vada2But = findViewById(R.id.but_vada2);
        itemsTv = findViewById(R.id.tv_items);
        totalTv = findViewById(R.id.tv_total);

        teaBut.setText("TEA -"+TEA);
        coffBut.setText("COFFEE -"+COFFEE);
        vadaBut.setText("VADA -"+VADA);
        milkBut.setText("MILK -"+MILK);
        samBut.setText("SAMOSA -"+SAMOSA);
        vada2But.setText("VADA2 -"+VADA2);

        teaBut.setOnClickListener(MainActivity.this);
        coffBut.setOnClickListener(MainActivity.this);
        vadaBut.setOnClickListener(MainActivity.this);
        milkBut.setOnClickListener(MainActivity.this);
        samBut.setOnClickListener(MainActivity.this);
        vada2But.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.but_tea:
                items++;
                amt = amt + TEA;
                break;
            case R.id.but_cof:
                items++;
                amt = amt + COFFEE;
                break;
            case R.id.but_mil:
                items++;
                amt = amt + MILK;
                break;
            case R.id.but_sam:
                items++;
                amt = amt + SAMOSA;
                break;
            case R.id.but_vad:
                items++;
                amt = amt + VADA;
                break;
            case R.id.but_vada2:
                items++;
                amt = amt + VADA2;
                break;
            default:
                break;
        }
        setOutputView();
    }

    private void setOutputView() {
        totalTv.setText("Total: "+amt);
        itemsTv.setText("Items: "+items);
    }
}
