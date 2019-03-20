package com.pro.deepak.meal;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.design.widget.BottomNavigationView;

import com.pro.deepak.meal.Tabs.about;
import com.pro.deepak.meal.Tabs.home;


public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigation;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener= new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.highlight_home: {
                    home homeTAB = new home();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, homeTAB)
                            .commit();
                    navigation.setBackgroundColor(getResources().getColor(R.color.navigation_Background));
                    return true;
                }

                case R.id.navigation_about:
                    about aboutTAB = new about();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragment_container, aboutTAB)
                            .commit();
                    navigation.setBackgroundColor(getResources().getColor(R.color.white));
                    return true;
            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.highlight_home);

    }
}
