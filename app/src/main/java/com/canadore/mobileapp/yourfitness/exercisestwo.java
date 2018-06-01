package com.canadore.mobileapp.yourfitness;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by gagan on 3/9/2018.
 */

public class exercisestwo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercisestwoo);

        final Button button1 = (Button) findViewById(R.id.biceps);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(exercisestwo.this, biceps.class);
                startActivity(intent);

                final Button button2 = (Button) findViewById(R.id.yoga);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent(exercisestwo.this, yoga.class);
                        startActivity(intent2);

                        final Button button3 = (Button) findViewById(R.id.triceps);
                        button3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent3 = new Intent(exercisestwo.this, triceps.class);
                                startActivity(intent3);

                                final Button button4 = (Button) findViewById(R.id.cardio);
                                button4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Intent intent4 = new Intent(exercisestwo.this, cardio.class);
                                        startActivity(intent4);

                                        final Button button5 = (Button) findViewById(R.id.chest);
                                        button5.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intent5 = new Intent(exercisestwo.this, chest.class);
                                                startActivity(intent5);

                                                final Button button6 = (Button) findViewById(R.id.back);
                                                button6.setOnClickListener(new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        Intent intent4 = new Intent(exercisestwo.this, back.class);
                                                        startActivity(intent4);

                                                        final Button button7 = (Button) findViewById(R.id.shoulder);
                                                        button7.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                Intent intent5 = new Intent(exercisestwo.this, shoulder.class);
                                                                startActivity(intent5);

                                                                final Button button8 = (Button) findViewById(R.id.legs);
                                                                button8.setOnClickListener(new View.OnClickListener() {
                                                                    @Override
                                                                    public void onClick(View v) {
                                                                        Intent intent4 = new Intent(exercisestwo.this, legs.class);
                                                                        startActivity(intent4);


                                                                        final Button button8 = (Button) findViewById(R.id.meditation);
                                                                        button8.setOnClickListener(new View.OnClickListener() {
                                                                            @Override
                                                                            public void onClick(View v) {
                                                                                Intent intent4 = new Intent(exercisestwo.this, meditatioin.class);
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
        });
    }}

