package com.example.binder;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class main extends AppCompatActivity implements View.OnClickListener {


    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.mainxml );


        start = (Button) findViewById( R.id.startButton );

        stop = (Button) findViewById( R.id.stopButton );

        start.setOnClickListener( this );
        stop.setOnClickListener( this );
    }

    public void onClick(View view) {

        if(view == start){

            startService(new Intent( this, service.class ) );
        }


        else if (view == stop){

            stopService(new Intent( this, service.class ) );

        }
    }
}