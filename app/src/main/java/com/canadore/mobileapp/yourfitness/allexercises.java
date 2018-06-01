package com.canadore.mobileapp.yourfitness;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by gagan on 3/9/2018.
 */

public class allexercises extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises);

        final Button button1 = (Button) findViewById(R.id.biceps);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(allexercises.this, biceps.class);
                startActivity(intent);

                final Button button2 = (Button) findViewById(R.id.triceps);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent(allexercises.this, triceps.class);
                        startActivity(intent2);

                        final Button button3 = (Button) findViewById(R.id.chest);
                        button3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent3 = new Intent(allexercises.this, chest.class);
                                startActivity(intent3);

                                final Button button4 = (Button) findViewById(R.id.back);
                                button4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent4 = new Intent(allexercises.this, back.class);
                                        startActivity(intent4);

                                        final Button button5 = (Button) findViewById(R.id.shoulder);
                                        button5.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intent5 = new Intent(allexercises.this, shoulder.class);
                                                startActivity(intent5);

                                                final Button button6 = (Button) findViewById(R.id.legs);
                                                button6.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        Intent intent4 = new Intent(allexercises.this, legs.class);
                                                        startActivity(intent4);

                                                        final Button button7 = (Button) findViewById(R.id.cardio);
                                                        button7.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                Intent intent5 = new Intent(allexercises.this, cardio.class);
                                                                startActivity(intent5);

                                                                final Button button8 = (Button) findViewById(R.id.yoga);
                                                                button8.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        Intent intent4 = new Intent(allexercises.this, yoga.class);
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
                });

            }
        });
    }
}