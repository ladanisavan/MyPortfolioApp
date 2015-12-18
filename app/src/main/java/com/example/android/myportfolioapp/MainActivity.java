package com.example.android.myportfolioapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button spotifyBtn = (Button) findViewById(R.id.spotifyBtn);
        spotifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will launch Spotify streamer app!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button scoreAppBtn = (Button) findViewById(R.id.scoreAppBtn);
        scoreAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will launch Score app!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button libAppBtn = (Button) findViewById(R.id.libAppBtn);
        libAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will launch Library app!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button buildItBigBtn = (Button) findViewById(R.id.buildItBigBtn);
        buildItBigBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will launch Build It Big app!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button xyzReaderBtn = (Button) findViewById(R.id.xyzReaderBtn);
        xyzReaderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will launch XYZ Reader app!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button myAppBtn = (Button) findViewById(R.id.myAppBtn);
        myAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This button will launch my Capstone app!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
