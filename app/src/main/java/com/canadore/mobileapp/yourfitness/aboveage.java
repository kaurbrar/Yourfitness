package com.canadore.mobileapp.yourfitness;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by gagan on 3/9/2018.
 */

public class aboveage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.above);
        final Button button1 = (Button) findViewById(R.id.yoga);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(aboveage.this, yoga.class);
                startActivity(intent);

                final Button button2 = (Button) findViewById(R.id.meditation);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent(aboveage.this, meditatioin.class);
                        startActivity(intent2);

                        final Button button3 = (Button) findViewById(R.id.cardio);
                        button3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent3 = new Intent(aboveage.this, cardio.class);
                                startActivity(intent3);

                                final Button button4 = (Button) findViewById(R.id.yogaagain);
                                button4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent4 = new Intent(aboveage.this, yoga.class);
                                        startActivity(intent4);

                                        final Button button5 = (Button) findViewById(R.id.cardiothree);
                                        button5.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intent5 = new Intent(aboveage.this, cardio.class);
                                                startActivity(intent5);

                                                final Button button6 = (Button) findViewById(R.id.meditationagain);
                                                button6.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        Intent intent4 = new Intent(aboveage.this, meditatioin.class);
                                                        startActivity(intent4);


                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });


    }
}