package com.example.myapplication3.app;

/**
 * Created by Radoslaw on 07.04.14.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.*;
import java.lang.*;
import java.io.*;
public class SetText extends Activity  {

    static int amplitude; // 32767 - max
    static double frequency;
    static int wartoscOdniesienia = 0;
    private static int i;






    public static void setText() {
        // TODO Auto-generated method stub

        switch (MainActivity.x) {

            case 1:
                frequency = 125;
                MainActivity.tFrequency.setText("125 Hz");

                break;
            case 2:
                frequency = 500;
                MainActivity.tFrequency.setText("500 Hz");
                break;
            case 3:
                frequency = 1000;
                MainActivity.tFrequency.setText("1000 Hz");
                break;
            case 4:
                frequency = 2000;
                MainActivity.tFrequency.setText("2000 Hz");
                break;
            case 5:
                frequency = 4000;
                MainActivity.tFrequency.setText("4000 Hz");
                break;
            case 6:
                frequency = 6000;
                MainActivity.tFrequency.setText("6000 Hz");
                break;
            case 7:
                frequency = 8000;
                MainActivity.tFrequency.setText("8000 Hz");
                break;
            case 8:
                frequency = 10000;
                MainActivity.tFrequency.setText("10000 Hz");
                break;
            default:


        }



        switch (MainActivity.y) {
            case 1:
                amplitude = 3*(kalibracja.wstawZmienna2);
                MainActivity.tAmplitude.setText("10 dB");
                wartoscOdniesienia = 10 ;
                break;
            case 2:
                amplitude = 10*(kalibracja.wstawZmienna2);
                MainActivity.tAmplitude.setText("20 dB");
                wartoscOdniesienia = 20 ;
                break;
            case 3:
                amplitude = 32*(kalibracja.wstawZmienna2);
                MainActivity.tAmplitude.setText("30 dB");
                wartoscOdniesienia =30 ;
                break;
            case 4:
                amplitude = 100*(kalibracja.wstawZmienna2);
                MainActivity.tAmplitude.setText("40 dB");
                wartoscOdniesienia = 40;
                break;
            case 5:
                amplitude = 320*(kalibracja.wstawZmienna2);
                MainActivity.tAmplitude.setText("50 dB");
                wartoscOdniesienia =50;
                break;
            case 6:
                amplitude = 1000*(kalibracja.wstawZmienna2);
                MainActivity.tAmplitude.setText("60 dB");
                wartoscOdniesienia = 60;
                break;
            case 7:
                amplitude = 3200*(kalibracja.wstawZmienna2);
                MainActivity.tAmplitude.setText("70 dB");
                wartoscOdniesienia = 70;
                break;
            case 8:
                amplitude = 10000*(kalibracja.wstawZmienna2);
                MainActivity.tAmplitude.setText("80 dB");
                wartoscOdniesienia = 80;
                break;
            case 9:
                amplitude = 32000*(kalibracja.wstawZmienna2);
                MainActivity.tAmplitude.setText("90 dB");
                wartoscOdniesienia = 90;
                break;
            default:
                amplitude = 3*(kalibracja.wstawZmienna2);
                MainActivity.tAmplitude.setText("10 dB");




        }
    }



}
