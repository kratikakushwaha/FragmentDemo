package com.example.fragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment();
    }
   private void addFragment()
   {
       FragOne f=new FragOne();
       FragmentManager fragmentManager= getSupportFragmentManager();
       FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
      fragmentTransaction.add(R.id.myactivity,f,"my");
      fragmentTransaction.commit();

   }
}
