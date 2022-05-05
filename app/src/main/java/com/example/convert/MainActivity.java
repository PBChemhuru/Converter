package com.example.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final double factor=1.609;
    EditText dist;
    RadioButton rBtn;
    EditText temp;
    RadioButton rBtnT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dist=(EditText)findViewById(R.id.txtDist);
        temp=(EditText)findViewById(R.id.txtTemp);
        rBtn=(RadioButton)findViewById(R.id.cmdMl);
        rBtnT=(RadioButton)findViewById(R.id.cmdFaren);
    }

    public void distClear(View view) {
        dist.setText("");
    }

    public void Convert(View view) {
        String tem = dist.getText().toString();

        if(tem.isEmpty()) {
            return;
        }
        double val;
        val = Double.parseDouble(tem);
        if(rBtn.isChecked())
            val=val* factor;
        else
            val=val/factor;
        dist.setText(String.valueOf(val));

    }

    public void Convert2(View view) {
        String temper =temp.getText().toString();
        if(temper.isEmpty()) {
            return;
        }
        double val;
        val = Double.parseDouble(temper);
        if(rBtnT.isChecked())
            val=(val-32)*(5/9);
            else
                val=(val*(9/5))+32;
            temp.setText(String.valueOf(val));


    }

    public void TempClear(View view) {
        temp.setText("");
    }
}