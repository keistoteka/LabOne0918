package com.example.labone0918;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain=findViewById(R.id.tvMain);

        Button ButtonChangeText = (Button) findViewById(R.id.ButtonChangeText);
        ButtonChangeText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvMain.setText("Change text");
            }
        });

        tvMain=(TextView) findViewById(R.id.tvMain);
        tvMain.setTextColor(Color.MAGENTA);
    }
}