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

public class ekranpowitalny extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ekranpow);

    }

    public void przejdzDo(View view) {
        Intent i = new Intent(this , doObliczen.class);
        startActivity(i);
    }

    @Override
    public void onClick(View view) {

    }
}