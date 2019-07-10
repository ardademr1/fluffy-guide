package com.example.fluffy_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText2;
    EditText editTextPassword1;
    EditText editTextPassword2;
    EditText editText5;
    ImageView imageView2;
    Button button;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText2 = findViewById(R.id.editText2);
        editTextPassword1 = findViewById(R.id.editTextPassword1);
        editTextPassword2 = findViewById(R.id.editTextPassword2);
        editText5 = findViewById(R.id.editText5);
        imageView2 = findViewById(R.id.imageView2);
        button = findViewById(R.id.button3);
        button1 = findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText("Jonh Marston");
            }
        });
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(editTextPassword1.getText().toString().equals(editTextPassword2.getText().toString())) {
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        intent.putExtra("AdSoyad", editText2.getText().toString());
                        startActivity(intent);
                    }
                }
            });
        }
}
