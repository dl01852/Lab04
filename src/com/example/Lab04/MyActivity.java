package com.example.Lab04;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final Button greenButton = (Button)(findViewById(R.id.btnGreen)); // read only green Button
        final Button blueButton = (Button)(findViewById(R.id.btnBlue)); // read only blue button
        final Button whiteButton = (Button)(findViewById(R.id.btnWhite)); // read only white Button..
        TextView textColor = (TextView)(findViewById(R.id.txtColor)); // Text to contain color of the bitmap.

        // Setting the ClickListener's for each of the buttons
        greenButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

            }
        });
    }

}
