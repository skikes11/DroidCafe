package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewDonut, imageViewIcecream, imageViewFroyo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapping();
        imageViewDonut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You ordered a donut", Toast.LENGTH_SHORT).show();
            }
        });

        imageViewIcecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You ordered a ice cream", Toast.LENGTH_SHORT).show();
            }
        });

        imageViewFroyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You ordered a FroYo", Toast.LENGTH_SHORT).show();
            }
        });

    }


    private void Mapping(){
        imageViewDonut = (ImageView) findViewById(R.id.imageView1);
        imageViewIcecream = (ImageView) findViewById(R.id.imageView2);
        imageViewFroyo = (ImageView) findViewById(R.id.imageView3);
    }




}