package com.example.labone0918;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain=findViewById(R.id.tvMain);
    }

    public void onButtonChangeTextClick(View view) {

        this.tvMain.setText("Change text");

        Toast.makeText(this, "Some msg", Toast.LENGTH_LONG).show();
    }
}