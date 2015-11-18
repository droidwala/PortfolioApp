package com.example.punit.portfolioapp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.punit.portfolioapp.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar tbar;
    TextView title;
    Button spotify,scores,library,buildit,xyzreader,capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbar = (Toolbar) findViewById(R.id.toolbar);
        title = (TextView) tbar.findViewById(R.id.toolbar_txt);
        spotify = (Button) findViewById(R.id.spotify_app);
        scores = (Button) findViewById(R.id.scores_app);
        library = (Button) findViewById(R.id.library_app);
        buildit = (Button) findViewById(R.id.bigger_app);
        xyzreader = (Button) findViewById(R.id.xyzreader_app);
        capstone = (Button) findViewById(R.id.capstone_app);
        setSupportActionBar(tbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);

        spotify.setOnClickListener(this);
        scores.setOnClickListener(this);
        library.setOnClickListener(this);
        buildit.setOnClickListener(this);
        xyzreader.setOnClickListener(this);
        capstone.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.spotify_app:
                Toast.makeText(MainActivity.this,"This button will launch Spotify Streamer App!!",Toast.LENGTH_SHORT).show();
                 break;
            case R.id.scores_app:
                Toast.makeText(MainActivity.this,"This button will launch Scores App!!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.library_app:
                Toast.makeText(MainActivity.this,"This button will launch Library App!!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bigger_app:
                Toast.makeText(MainActivity.this,"This button will launch Build it Bigger App!!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyzreader_app:
                Toast.makeText(MainActivity.this,"This button will launch XYZ Reader App!!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone_app:
                Toast.makeText(MainActivity.this,"This button will launch Capstone App!!",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
