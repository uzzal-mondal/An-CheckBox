package com.example.checkbox2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox ch1, ch2, ch3;
    private Button btn;
    private TextView text;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = findViewById(R.id.check1);
        ch2 = findViewById(R.id.check2);
        ch3 = findViewById(R.id.check3);
        btn = findViewById(R.id.btnSubmit);
        text = findViewById(R.id.textRes);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               StringBuilder stringBuilder = new StringBuilder();
               if (ch1.isChecked()){
                   String value = ch1.getText().toString();
                   stringBuilder.append(value+" is orderd"+"\n");
               }

               if (ch2.isChecked()){
                   String value = ch2.getText().toString();
                   stringBuilder.append(value+" is orderd"+"\n");
               }

               if (ch3.isChecked()){
                  String value =  ch3.getText().toString();
                  stringBuilder.append(value+" is orderd"+"\n");
               }

               text.setText(stringBuilder);

            }
        });



    }
}
