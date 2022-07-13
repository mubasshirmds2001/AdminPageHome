package com.mubasshir.adminpagehome;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class project_click extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private Home_Fragment homeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_click);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;

                switch(item.getItemId()){
                    case R.id.home:
                        selectedFragment = new Home_Fragment();
                        break;

                    case R.id.profile:
                        selectedFragment = new Profile_fragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container,selectedFragment).commit();
                return true;
            }
        });
    }
}