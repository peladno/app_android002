package com.example.ejercicio7_modulo4_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String msg = getIntent().getStringExtra("msg");
        String title = getIntent().getStringExtra("title");
        int image_game2 = getIntent().getIntExtra("image",0);

        TextView title_game = findViewById(R.id.title_game);
        title_game.setText(title);


        Button button_back = findViewById(R.id.back_button);
        ImageView image_game = findViewById(R.id.imageView3);

        if (image_game2 != 0) {
            image_game.setImageResource(image_game2);
        }

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}