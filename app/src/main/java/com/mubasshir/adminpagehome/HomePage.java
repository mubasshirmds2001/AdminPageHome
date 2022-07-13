package com.mubasshir.adminpagehome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    Button helpbutton,addbutton;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        listView=(ListView)findViewById(R.id.project_lists);

        ArrayList<String> project = new ArrayList<>();
        project.add("Demo-1");
        project.add("Demo-2");
        project.add("Demo-3");
        project.add("Demo-4");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,project);
        listView.setAdapter(arrayAdapter);


        helpbutton=(Button)findViewById(R.id.btn_help);

        addbutton=(Button)findViewById(R.id.add_button);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddProjectActivity();
            }

            private void openAddProjectActivity() {
                Intent intent= new Intent(HomePage.this,project_click.class);
                startActivity(intent);
            }
        });
        helpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePage.this, "Button Clicked successfully", Toast.LENGTH_LONG).show();
            }
        });
    }
}