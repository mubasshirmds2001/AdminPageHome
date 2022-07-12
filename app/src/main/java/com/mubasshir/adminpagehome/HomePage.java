package com.mubasshir.adminpagehome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    Button helpbutton;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        listView=(ListView)findViewById(R.id.project_lists);


        helpbutton=(Button)findViewById(R.id.btn_help);
        helpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePage.this, "Button Clicked successfully", Toast.LENGTH_LONG).show();
            }
        });
    }
}