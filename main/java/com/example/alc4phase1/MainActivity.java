package com.example.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOneClicked(View view) {
        startActivity(new Intent(MainActivity.this, AboutALC.class));

    }

    public void buttonTwoClicked(View view) {
        startActivity(new Intent(MainActivity.this, MyProfile.class));
    }
}
