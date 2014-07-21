package edu.colestock.cs.eventhandling;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;

public class ExampleOnClickListener implements View.OnClickListener {

    private int eventCounter = 0;

    @Override
    public void onClick(View view) {
        // Assume Button has been clicked on
        Button btn = (Button) view;
        // Change button's text and include a counter so that user can tell event is being handled
        eventCounter++;
        btn.setText("You just clicked me #" + String.valueOf(eventCounter));
    }

}
