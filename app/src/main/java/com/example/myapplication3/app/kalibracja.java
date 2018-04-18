package com.example.myapplication3.app;

/**
 * Created by Radoslaw on 07.04.14.
 */
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
public class kalibracja {

    private final static int duration = 2; // seconds
    private final static int sampleRate = 44100;
    private final static int numSamples = duration * sampleRate;
    private final static double sample[] = new double[numSamples];
    private final static byte generatedSnd[] = new byte[2 * numSamples];
    private final static int freQ = 1000;

    private final static int duration2 = 2; // seconds
    private final static int sampleRate2 = 44100;
    private final static int numSamples2 = duration2 * sampleRate2;
    private final static double sample2[] = new double[numSamples2];
    private final static byte generatedSnd2[] = new byte[2 * numSamples2];
    private final static int freQ2 = 1000;
    public static int X ;
    public static int wstawZmienna;
    public static int wstawZmienna2;
    public static void Kalibruj() throws InterruptedException {

        for(int i=0; i<4; i++){

            Thread.sleep(2000);

            if(i%2==0){

                genTone();
                playSound();

            }
            else {
                genTone2();
                playSound2();

            }

        }

    }

    static void genTone() {

        for (int i = 0; i < numSamples; ++i) {
            sample[i] = Math.sin(2 * Math.PI * i / (sampleRate/ 1000));
        }
        int idx = 0;
        for (final double dVal : sample) {
            // scale to maximum amplitude
            final long val = (long) (dVal * wstawZmienna);
            // in 16 bit wav PCM, first byte is the low order byte
            generatedSnd[idx++] = (byte) (val & 0x00ff);
            generatedSnd[idx++] = (byte) ((val & 0xff00) >>> 8);
        }
    }

    static void genTone2() {

        for (int i = 0; i < numSamples2; ++i) {
            sample2[i] = Math.sin(2 * Math.PI * i / (sampleRate2 / freQ2));
        }
        int idx = 0;
        for (final double dVal : sample2) {
            // scale to maximum amplitude
            final long val = (long) ((dVal * wstawZmienna2));
            // in 16 bit wav PCM, first byte is the low order byte

            generatedSnd2[idx++] = (byte) (val & 0x00ff);
            generatedSnd2[idx++] = (byte) ((val & 0xff00) >>> 8);
        }
    }


    static void playSound() {
        AudioTrack audioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,
                sampleRate, AudioFormat.ENCODING_PCM_16BIT,
                AudioFormat.ENCODING_PCM_16BIT, generatedSnd.length,
                AudioTrack.MODE_STATIC);

        audioTrack.write(generatedSnd, 0, generatedSnd.length);
        audioTrack.play();

    }

    static void playSound2() {
        AudioTrack audioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,
                sampleRate, AudioFormat.ENCODING_PCM_16BIT,
                AudioFormat.ENCODING_PCM_16BIT, generatedSnd.length,
                AudioTrack.MODE_STATIC);

        audioTrack.write(generatedSnd2, 0, generatedSnd2.length);
        audioTrack.play();
        ;
    }

}
