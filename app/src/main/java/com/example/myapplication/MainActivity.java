package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private frag1 frag1;
    private frag2 frag2;
    private frag3 frag3;
    private frag4 frag4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @androidx.annotation.NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_aaa:
                        setFrag(0);
                        break;
                    case R.id.action_bbb:
                        setFrag(1);
                        break;
                    case R.id.action_ccc:
                        setFrag(2);
                        break;
                    case R.id.action_ddd:
                        setFrag(3);
                        break;
                }
                return false;
            }
        });


                frag1 = new frag1();
        frag2 = new frag2();
        frag3 = new frag3();
        frag4 = new frag4();
        setFrag(0); //첫 화면 지정

    }
    // 프래그먼트 교체가 일어나는 실행문
    private void setFrag(int n){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n){
            case 0:
                ft.replace(R.id.main_frame, frag1);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, frag2);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, frag3);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame, frag4);
                ft.commit();
                break;

        }
    }

}