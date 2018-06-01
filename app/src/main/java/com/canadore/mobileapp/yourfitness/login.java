package com.canadore.mobileapp.yourfitness;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by gagan on 3/3/2018.
 */

public class login extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logindesign);
                Button button=(Button) findViewById(R.id.loginop);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(login.this, ages.class);
                        startActivity(intent);
                    }
                });

            }
        }