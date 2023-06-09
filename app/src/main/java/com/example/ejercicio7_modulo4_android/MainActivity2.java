package com.example.ejercicio7_modulo4_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejercicio7_modulo4_android.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding main2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        main2Binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View view = main2Binding.getRoot();
        setContentView(view);

        String msg = getIntent().getStringExtra("msg");
        String title = getIntent().getStringExtra("title");
        int image_game2 = getIntent().getIntExtra("image", 0);

        main2Binding.titleGame.setText(title);
        main2Binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        main2Binding.imageView3.setImageResource(image_game2);


    }
}