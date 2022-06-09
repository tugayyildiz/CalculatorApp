package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView sonuc;
    double number1,number2,islem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.number1Text);
        n2=findViewById(R.id.number2text);

        sonuc=findViewById(R.id.reasultText);

        sonuc.setText("Sonuç");

    }


    public void toplama(View view){

        try {

            if(n1.getText().toString().matches("") || n2.getText().toString().matches("")){
                sonuc.setText("Değerleri boş bırakamazsınız . !!");
            }
            else{

                number1=Integer.parseInt(n1.getText().toString());
                number2=Integer.parseInt(n2.getText().toString());
                islem=number1+number2;
                sonuc.setText("Sonuç" + islem);

            }

        }
        catch (Exception e){

        }


    }


    public void cikarma(View view){

        try {

            if(n1.getText().toString().matches("") || n2.getText().toString().matches("")){
                sonuc.setText("Değerleri boş bırakamazsınız . !!");
            }
            else{

                number1=Integer.parseInt(n1.getText().toString());
                number2=Integer.parseInt(n2.getText().toString());
                islem=number1-number2;
                sonuc.setText("Sonuç" + islem);

            }

        }
        catch (Exception e){

        }
    }

    public void carpma(View view){
        try {

            if(n1.getText().toString().matches("") || n2.getText().toString().matches("")){
                sonuc.setText("Değerleri boş bırakamazsınız . !!");
            }
            else{

                number1=Integer.parseInt(n1.getText().toString());
                number2=Integer.parseInt(n2.getText().toString());
                islem=number1*number2;
                sonuc.setText("Sonuç" + islem);

            }

        }
        catch (Exception e){

        }

    }

    public void bolme(View view){
        try {

            if(n1.getText().toString().matches("") || n2.getText().toString().matches("")){
                sonuc.setText("Değerleri boş bırakamazsınız . !!");
            }



            else{

                number1=Integer.parseInt(n1.getText().toString());
                number2=Integer.parseInt(n2.getText().toString());
                islem=number1/number2;
                sonuc.setText("Sonuç" + islem);

            }

        }
        catch (Exception e){

        }

    }

}