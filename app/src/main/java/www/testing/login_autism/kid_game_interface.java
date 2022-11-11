package www.testing.login_autism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class kid_game_interface extends AppCompatActivity {

    ImageView angel,bird,forest,galaxy,piano,rain;
    MediaPlayer mediaPlayer1,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid_game_interface);


        mediaPlayer1 = mediaPlayer1.create(this,R.raw.angelic_sound);
        mediaPlayer2 = mediaPlayer2.create(this,R.raw.bird_sound);
        mediaPlayer3 = mediaPlayer3.create(this,R.raw.forest_sound);
        mediaPlayer4 = mediaPlayer4.create(this,R.raw.galaxy_sound);
        mediaPlayer5 = mediaPlayer5.create(this,R.raw.piano_sound);
        mediaPlayer6 = mediaPlayer6.create(this,R.raw.rain_sound);


        angel = findViewById(R.id.angel);
        bird = findViewById(R.id.birds);
        forest = findViewById(R.id.forest);
        galaxy = findViewById(R.id.galaxy);
        piano = findViewById(R.id.piano);
        rain = findViewById(R.id.rain);

        angel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer1.isPlaying()) {
                    mediaPlayer1.start();
                }
                else{
                    mediaPlayer1.pause();
                }
            }
        });

        bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer2.isPlaying()) {
                    mediaPlayer2.start();
                }
                else{
                    mediaPlayer2.pause();
                }
            }
        });

        forest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer3.isPlaying()) {
                    mediaPlayer3.start();
                }
                else{
                    mediaPlayer3.pause();
                }
            }
        });

        galaxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer4.isPlaying()) {
                    mediaPlayer4.start();
                }
                else{
                    mediaPlayer4.pause();
                }
            }
        });

        piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer5.isPlaying()) {
                    mediaPlayer5.start();
                }
                else{
                    mediaPlayer5.pause();
                }
            }
        });

        rain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer6.isPlaying()) {
                    mediaPlayer6.start();
                }
                else{
                    mediaPlayer6.pause();
                }
            }
        });
    }
}