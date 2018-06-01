package com.canadore.mobileapp.yourfitness;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by gagan on 3/3/2018.
 */

public class video extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        final Button button = (Button) findViewById(R.id.log_in);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(video.this, login.class);
                startActivity(intent);

                final Button join=(Button)findViewById(R.id.join);
                join.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        Intent intent1 = new Intent(video.this,create.class);
                        startActivity(intent1);

                        final Button fbtn=(Button)findViewById(R.id.fbtn);
                        fbtn.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent2=new Intent(video.this,fb.class);
                                startActivity(intent2);
                            }
                        });

                    }
                });

            }
        });
    }}
