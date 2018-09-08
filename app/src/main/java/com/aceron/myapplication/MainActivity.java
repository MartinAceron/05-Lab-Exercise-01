package com.aceron.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.male);
        Button button2 = findViewById(R.id.female);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.male:
                Intent buttonsDemoIntent = new Intent(this, MainActivity.class);
                startActivity(buttonsDemoIntent);
                break;

            case R.id.female:
                Intent textFieldDemoIntent = new Intent(this, MainActivity.class);
                startActivity(textFieldDemoIntent);
                break;

        }
        

    }

}



