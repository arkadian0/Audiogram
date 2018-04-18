package com.example.myapplication3.app;

/**
 * Created by Radoslaw on 07.04.14.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Radoslaw on 06.04.14.
 */
public class doObliczen extends Activity implements OnClickListener {
    static TextView tekscik;
    static TextView tekscik2;
    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oblicznia);
        tekscik = (TextView) findViewById(R.id.textView);
        tekscik2 = (TextView) findViewById(R.id.textView2);

    }


    public void Kali(View view) throws InterruptedException {
        kalibracja.Kalibruj();
    }

    public void jeden(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void Klikacz(View view) {
        kalibracja.X = kalibracja.X +1;
        switch(kalibracja.X)
        {
            case 0:
                kalibracja.wstawZmienna = 1000;
                kalibracja.wstawZmienna2 = 562;
                break;
            case 1:
                kalibracja.wstawZmienna = 900;
                kalibracja.wstawZmienna2 = 506;
                break;
            case 2:
                kalibracja.wstawZmienna = 800;
                kalibracja.wstawZmienna2 = 449;
                break;
            case 3:
                kalibracja.wstawZmienna = 700;
                kalibracja.wstawZmienna2 = 393;
                break;
            case 4:
                kalibracja.wstawZmienna = 600;
                kalibracja.wstawZmienna2 = 337;
                break;
            case 5:
                kalibracja.wstawZmienna = 500;
                kalibracja.wstawZmienna2 = 281;
                break;

            case 6:
                kalibracja.wstawZmienna = 400;
                kalibracja.wstawZmienna2 = 224;
                break;
            case 7:
                kalibracja.wstawZmienna = 300;
                kalibracja.wstawZmienna2 =168;
                break;
            case 8:
                kalibracja.wstawZmienna = 200;
                kalibracja.wstawZmienna2 = 112;
                break;
            case 9:
                kalibracja.wstawZmienna = 100;
                kalibracja.wstawZmienna2 = 56;
                break;
            case 10:
                kalibracja.wstawZmienna = 50;
                kalibracja.wstawZmienna2 = 28;
                break;
            case 11:
                kalibracja.wstawZmienna = 25;
                kalibracja.wstawZmienna2 = 14;
            case 12:
                kalibracja.wstawZmienna = 20;
                kalibracja.wstawZmienna2 = 5;
                break;
            case 13:
                kalibracja.wstawZmienna = 15;
                kalibracja.wstawZmienna2 = 5;
                break;

            case 14:
            kalibracja.wstawZmienna = 10;
            kalibracja.wstawZmienna2 = 5;
            break;

            case 15:
                kalibracja.wstawZmienna = 5;
                kalibracja.wstawZmienna2 = 2;
                break;
        }
        if(kalibracja.X == 15)
        {
            kalibracja.X = -1;
        }

        tekscik.setText(String.valueOf(kalibracja.wstawZmienna));
        tekscik2.setText(String.valueOf(kalibracja.wstawZmienna2));
    }

    @Override
    public void onClick(View view) {

    }
}