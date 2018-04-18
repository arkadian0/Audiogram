package com.example.myapplication3.app;

import android.app.Activity;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {




    static TextView tAmplitude;
    static TextView tFrequency;
    static TextView tekscik3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bDoAudiogram = (Button) findViewById(R.id.doAudiogram);
        Button bHeard = (Button) findViewById(R.id.heard);
        Button bNoHeard = (Button) findViewById(R.id.noHeard);
        bHeard.setOnClickListener(this);
        bDoAudiogram.setOnClickListener(this);
        bNoHeard.setOnClickListener(this);
        Button dwatony = (Button) findViewById(R.id.button2);

        Button wypiszz = (Button) findViewById(R.id.button);
        wypiszz.setOnClickListener(this);

    }
    static int[] mojatab = new int[10];
    static int x;
    static int y;
    static int z =1;
    static float leftVol;
    static float rightVol;



    public static void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.leftChannel:
                if (checked)
                    leftVol = 1.0f;
                rightVol = 0.0f;
                break;
            case R.id.rightChannel:
                if (checked)
                    leftVol = 0.0f;
                rightVol = 1.0f;
                break;
        }
    }

    @Override
    public void onClick(final View v) {
        // TODO Auto-generated method stub
        tFrequency = (TextView) findViewById(R.id.valueFreq);
        tAmplitude = (TextView) findViewById(R.id.valueAmp);
        tekscik3 = (TextView) findViewById(R.id.textView);
        switch (v.getId()) {
            case R.id.doAudiogram:
                x = 1;
                y = 1;
                SetText.setText();
                Audiogram.genTone();
                Audiogram.playSound();

                break;
            case R.id.heard:
                if(z==1)
                {
                    mojatab[0] = SetText.wartoscOdniesienia;

                }
                if(z==2)
                {
                    mojatab[1] = SetText.wartoscOdniesienia;

                }
                if(z==3)
                {
                    mojatab[2] = SetText.wartoscOdniesienia;
                }
                if(z==4)
                {
                    mojatab[3] = SetText.wartoscOdniesienia;
                }
                if(z==5)
                {
                    mojatab[4] = SetText.wartoscOdniesienia;
                }
                if(z==6)
                {
                    mojatab[5] = SetText.wartoscOdniesienia;
                }
                if(z==7)
                {
                    mojatab[6] = SetText.wartoscOdniesienia;
                }
                if(z==8)
                {
                    mojatab[7] = SetText.wartoscOdniesienia;
                }


                y = 1;
                x++;
z++;

                SetText.setText();
                Audiogram.genTone();
                Audiogram.playSound();
                SetText.wartoscOdniesienia=0;

                break;
            case R.id.noHeard:
                y++;
                SetText.setText();
                Audiogram.genTone();
                Audiogram.playSound();
                break;
            case R.id.button:
                tekscik3.setText( String.valueOf(mojatab[0]) +  String.valueOf(mojatab[1]) + String.valueOf(mojatab[2])+ String.valueOf(mojatab[3]) + String.valueOf(mojatab[4])+ String.valueOf(mojatab[5])+ String.valueOf(mojatab[6])+ String.valueOf(mojatab[7]));
        }

    }


}



