package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClick(View view)
    {
        Button bt=(Button) findViewById(view.getId());
        CharSequence toastText="This button will launch my "+bt.getText()+" app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(this, toastText, duration);
        toast.show();

    }
}
