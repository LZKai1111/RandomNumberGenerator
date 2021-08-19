package sg.edu.rp.c346.id20014063.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnCustomize, btnGenerate;
    TextView tvNum;
    int max, min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCustomize = findViewById(R.id.buttonCustomize);
        btnGenerate = findViewById(R.id.buttonGenerate);
        tvNum = findViewById(R.id.textViewNumber);

        max = 10;
        min = 0;
        /*
        Intent a = this.getIntent();
        if(a != null) {
            String strmax = getIntent().getStringExtra("max");
            String strmin = getIntent().getStringExtra("min");
            max = Integer.parseInt(strmax);
            min = Integer.parseInt(strmin);
        }*/

        btnCustomize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("max",max);
                i.putExtra("min",min);
                startActivity(i);
            }
        });

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int num = r.nextInt(max - min + 1) + min;
                tvNum.setText(String.valueOf(num));
            }
        });
    }
}