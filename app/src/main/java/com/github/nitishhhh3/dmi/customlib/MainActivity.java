package com.github.nitishhhh3.dmi.customlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import java.util.List;

import customlib.dmi.nitishhhh3.github.com.maven_central_demo.RssFeedProvider;
import customlib.dmi.nitishhhh3.github.com.maven_central_demo.RssItem;

public class MainActivity extends AppCompatActivity {

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = (TextView) findViewById(R.id.textView);

        Button fab = (Button) findViewById(R.id.button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateDetail();

            }
        });
    }

    public void updateDetail() {  //
        List<RssItem> list = RssFeedProvider
                .parse();
        String text = String.valueOf(list.toString());
        textview.setText("GOT::" + text);

    }
}
