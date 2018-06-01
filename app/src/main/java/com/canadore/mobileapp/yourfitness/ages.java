package com.canadore.mobileapp.yourfitness;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.canadore.mobileapp.yourfitness.R.id.buttonagetwo;

public class ages extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.age);
        final Button button = (Button) findViewById(R.id.buttonageone);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ages.this, allexercises.class);
                startActivity(intent);

                final Button button = (Button) findViewById(R.id.buttonagetwo);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent(ages.this, exercisestwo.class);
                        startActivity(intent2);

                        final Button button = (Button) findViewById(R.id.buttonagethree);
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent3 = new Intent(ages.this, aboveage.class);
                                startActivity(intent3);
                            }
                        });


                    }
                });

            }
        });

    }
}