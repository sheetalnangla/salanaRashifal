package com.ayraa.app1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar bar = getSupportActionBar();
        getSupportActionBar().setTitle("Salana Rashifal");

        bar.show();
    }

    public void mesha(View view) {
        Toast.makeText(getApplicationContext(), "Mesha", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "mesha".toString());
        startActivity(intent);
    }

    public void vrishbha(View view) {
        Toast.makeText(getApplicationContext(), "Vrishbha", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "vrishbha".toString());
        startActivity(intent);
    }

    public void mithuna(View view) {
        Toast.makeText(getApplicationContext(), "Mithuna", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "mithuna".toString());
        startActivity(intent);
    }

    public void karkata(View view) {
        Toast.makeText(getApplicationContext(), "Karkata", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "karkata".toString());
        startActivity(intent);
    }

    public void simha(View view) {
        Toast.makeText(getApplicationContext(), "Simha", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "simha".toString());
        startActivity(intent);
    }

    public void kanya(View view) {
        Toast.makeText(getApplicationContext(), "Kanya", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "kanya".toString());
        startActivity(intent);
    }

    public void tula(View view) {
        Toast.makeText(getApplicationContext(), "Tula", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "tula".toString());
        startActivity(intent);
    }

    public void vrishika(View view) {
        Toast.makeText(getApplicationContext(), "Vrishika", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "vrishika".toString());
        startActivity(intent);
    }

    public void dhanu(View view) {
        Toast.makeText(getApplicationContext(), "Dhanu", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "dhanu".toString());
        startActivity(intent);
    }

    public void makara(View view) {
        Toast.makeText(getApplicationContext(), "Makara", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "makara".toString());
        startActivity(intent);
    }

    public void khumbha(View view) {
        Toast.makeText(getApplicationContext(), "Khumbha", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "khumbha".toString());
        startActivity(intent);
    }

    public void meena(View view) {
        Toast.makeText(getApplicationContext(), "Meena", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Details.class);
        intent.putExtra("sign", "meena".toString());
        startActivity(intent);
    }

}
