package com.londonappbrewery.magiceightball;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button askBtn = (Button) findViewById(R.id.askButton);
        final ImageView resultImageView = (ImageView) findViewById(R.id.askImageView);


        final String[] resultArr = new String[]{
                "Its a yes",
                "better luck next time",
                "try harder",
                "Roll again",
                "Yes u got it right"
        };


        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random gen = new Random();
                int num = gen.nextInt(4);
                Log.i("lee", "onClick: "+resultArr[num]);
            }
        });



    }
}
