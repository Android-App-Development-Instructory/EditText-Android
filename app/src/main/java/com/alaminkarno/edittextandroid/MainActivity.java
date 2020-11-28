package com.alaminkarno.edittextandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTEXT1);
        editText2 = findViewById(R.id.editTEXT2);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string1 = editText1.getText().toString();
                String string2 = editText2.getText().toString();

                if(string1.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Anyting", Toast.LENGTH_SHORT).show();
                }
                else if(string2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();
                }
                else {

                    textView.setText("Your Text is: "+string1+" and Other is: "+string2);
                }


            }
        });
    }
}