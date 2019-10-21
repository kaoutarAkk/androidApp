package com.recyclingideas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.recyclingideas.insideapp.Tabs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"fire base connected",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getBaseContext(), Tabs.class);
        startActivity(intent);
    }
}
