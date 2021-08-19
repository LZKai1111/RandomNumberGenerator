package sg.edu.rp.c346.id20014063.randomnumbergenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText etMin, etMax;
    Button btnBack, btnApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etMax = findViewById(R.id.editTextMax);
        etMin = findViewById(R.id.editTextTextMin);
        btnBack = findViewById(R.id.buttonBack);
        btnApply = findViewById(R.id.buttonApply);

        String max = getIntent().getStringExtra("max");
        String min = getIntent().getStringExtra("min");
        etMax.setText(max);
        etMin.setText(min);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                i.setClass(SecondActivity.this,MainActivity.class);
                i.putExtra("max",etMax.getText().toString());
                i.putExtra("min",etMin.getText().toString());
                startActivity(i);
            }
        });
    }
}