package com.example.oopconcepts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView vehicle,car,rickshaw,cycle,testing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vehicle = findViewById(R.id.vehicle);
        car = findViewById(R.id.car);
        rickshaw = findViewById(R.id.rickshaw);
        cycle = findViewById(R.id.cycle);
        testing = findViewById(R.id.testing);
    }
}