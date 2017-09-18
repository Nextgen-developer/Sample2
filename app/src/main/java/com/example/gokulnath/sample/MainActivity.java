package com.example.gokulnath.sample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code for start browser button
        Button browser =  (Button) findViewById(R.id.start_browser);
        browser.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.example.com"));
                startActivity(i);
            }
        });
    }
}
