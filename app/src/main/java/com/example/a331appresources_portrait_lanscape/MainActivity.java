package com.example.a331appresources_portrait_lanscape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewInputNumbers;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewInputNumbers = findViewById(R.id.textViewInputNumbers);

        setCalcClickListener((TextView) findViewById(R.id.textViewButton0));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton1));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton2));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton3));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton4));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton5));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton6));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton7));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton8));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton9));
        setCalcClickListener((TextView) findViewById(R.id.textViewButtonDot));

        TextView textViewButtonC = findViewById(R.id.textViewButtonC);
        textViewButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText("");

            }
        });


    }

    private void setCalcClickListener(final TextView button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.append(button.getText());
            }
        });
    }


}
