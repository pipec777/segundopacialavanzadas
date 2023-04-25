package com.example.parcial2;

import android.view.View;
import android.widget.TextView;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainActivityTest {

    private MainActivity mainActivity;
    private TextView textField;

    @Before
    public void setUp() {
        mainActivity = new MainActivity();
        mainActivity.onCreate(null);
        textField = mainActivity.findViewById(R.id.textField);
    }
    @Test
    public void testPulsarRestar() {
        mainActivity.pulsarRestar(new View(mainActivity));
        assertEquals("-", textField.getText().toString());
    }
}


