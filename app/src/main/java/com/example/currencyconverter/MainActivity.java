package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void currency(View view) {
        EditText editText=(EditText) findViewById(R.id.editText);

        String AmtInDollars= editText.getText().toString();
        double AmtInDollarsDouble= Double.parseDouble(AmtInDollars);
        double AmtInRupeesDouble= AmtInDollarsDouble*79.59;
        
        String AmtInRupeesString=String.format("%.2f",AmtInRupeesDouble);

        Toast.makeText(this, "$"+AmtInDollars+" is Rs"+AmtInRupeesString, Toast.LENGTH_LONG).show();
    }
}