package com.example.musicplayer;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button firstSongButton, secondSongButton;
    MediaPlayer mpthe_rulers_back, mpre_bina_skompo;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        firstSongButton = (Button)findViewById(R.id.the_rulers_back_jayz);
        secondSongButton = (Button)findViewById(R.id.re_bina_skompo_shebeshxt);

        firstSongButton.setOnClickListener(bTheRulersBack);
        secondSongButton.setOnClickListener(bReBinaSkompo);

        mpthe_rulers_back = new MediaPlayer();
        mpthe_rulers_back = MediaPlayer.create(this,R.raw.the_rulers_back);

        mpre_bina_skompo = new MediaPlayer();
        mpre_bina_skompo = MediaPlayer.create(this,R.raw.re_bina_skompo);

        playing = 0;

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    Button.OnClickListener bTheRulersBack = new Button.OnClickListener()
    {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v)
        {
            switch (playing)
            {
                case 0:
                    mpthe_rulers_back.start();
                    playing = 1;
                    firstSongButton.setText("Pause The Ruler's Back");
                    secondSongButton.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpthe_rulers_back.pause();
                    playing = 0;
                    firstSongButton.setText("Play The Ruler's Back");
                    secondSongButton.setVisibility(View.VISIBLE);
                    break;
            }


        }

    };

    Button.OnClickListener bReBinaSkompo = new Button.OnClickListener()
    {
        @SuppressLint("SetTextI18n")
        @Override
        public void onClick(View v)
        {
            switch (playing)
            {
                case 0:
                    mpre_bina_skompo.start();
                    playing = 1;
                    secondSongButton.setText("Pause Re Bina Skompo");
                    firstSongButton.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpre_bina_skompo.pause();
                    playing = 0;
                    secondSongButton.setText("Play Re Bina Skompo");
                    firstSongButton.setVisibility(View.VISIBLE);
                    break;
            }


        }
    };

}