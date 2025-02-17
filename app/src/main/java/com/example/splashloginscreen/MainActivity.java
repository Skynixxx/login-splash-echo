package com.example.splashloginscreen;

    import android.content.Intent;
    import android.os.Bundle;
    import android.os.Handler;
    import android.widget.ImageView;

    import androidx.appcompat.app.AppCompatActivity;

    public class MainActivity extends AppCompatActivity {

        Handler handler;
        Runnable runnable;
        ImageView img;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            img = findViewById(R.id.img);
            img.animate().alpha(1.0f).setDuration(4000);

            handler = new Handler();
            runnable = new Runnable() {
                @Override
                public void run() {
                    Intent dsp = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(dsp);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    finish();
                }
            };
            handler.postDelayed(runnable, 4000);
        }
    }