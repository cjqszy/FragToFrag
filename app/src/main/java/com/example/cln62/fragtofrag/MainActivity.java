package com.example.cln62.fragtofrag;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MyInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().beginTransaction().replace(R.id.mainLayout, new Fragment1()).commit();

    }

    @Override
    public void myMethod(String n) {
        Fragment2 fragment2= new Fragment2();
        Bundle bundle = new Bundle();
        bundle.putString("key", n);
        fragment2.setArguments(bundle);
        getFragmentManager().beginTransaction().replace(R.id.mainLayout, fragment2).commit();
    }
}
