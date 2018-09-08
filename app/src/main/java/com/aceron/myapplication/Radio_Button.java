package com.aceron.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Radio_Button extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio__button);
        RadioGroup flavorGroup = findViewById(R.id.radio);
        flavorGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.male:
                        Toast.makeText(Radio_Button.this, "Vanilla!", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.female:
                        Toast.makeText(Radio_Button.this, "Chocolate!", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });
    }
}
