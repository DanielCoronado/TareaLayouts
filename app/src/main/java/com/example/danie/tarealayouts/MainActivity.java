package com.example.danie.tarealayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = (Button) findViewById(R.id.button);
        final EditText texto1 = (EditText) findViewById(R.id.entrada1);

                boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main2);
                final TextView aaaa = (TextView) findViewById(R.id.vista);
                String bbbb = texto1.getText().toString();
                aaaa.setText(bbbb);
            }
        });
    }
}
