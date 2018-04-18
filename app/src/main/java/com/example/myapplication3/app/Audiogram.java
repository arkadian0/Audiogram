package com.example.myapplication3.app;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;

/**
 * Created by Radoslaw on 07.04.14.
 */
public class Audiogram {

    private final static int duration = 1; // seconds
    private final static int sampleRate = 44100;
    private final static int numSamples = duration * sampleRate;
    private final static double sample[] = new double[numSamples];

    private final static byte generatedSnd[] = new byte[2 * numSamples];

    static void genTone() {

        for (int i = 0; i < numSamples; ++i) {
            sample[i] = Math.sin(2 * Math.PI * i
                    / (sampleRate / SetText.frequency));
        }

        // convert to 16 bit pcm sound array
        // assumes the sample buffer is normalised.
        int idx = 0;
        for (final double dVal : sample) {
            // scale to maximum amplitude
            final short val = (short) ((dVal * SetText.amplitude));
            // in 16 bit wav PCM, first byte is the low order byte
            generatedSnd[idx++] = (byte) (val & 0x00ff);
            generatedSnd[idx++] = (byte) ((val & 0xff00) >>> 8);

        }
    }


    static void playSound() {
        AudioTrack audioTrack = new AudioTrack(AudioManager.STREAM_MUSIC,
                sampleRate, AudioFormat.ENCODING_PCM_16BIT,
                AudioFormat.ENCODING_PCM_16BIT, generatedSnd.length,
                AudioTrack.MODE_STATIC);

        audioTrack.write(generatedSnd, 0, generatedSnd.length);
        audioTrack.play();
        audioTrack.setStereoVolume(MainActivity.leftVol, MainActivity.rightVol);
    }



}
