package com.example.asus.tenthapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.asus.tenthapp.Constant.Constant;
import com.example.asus.tenthapp.Fragment.ballFragment;

public class MainActivity extends AppCompatActivity   {

    public Menu myMenu;
    public FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.workSpace);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        this.myMenu = menu;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case (R.id.action_item1):
                commitballFragment();
//                Toast.makeText(MainActivity.this, "+1", Toast.LENGTH_LONG).show();
                break;
            case (R.id.action_item2):
                Toast.makeText(MainActivity.this, "+2", Toast.LENGTH_LONG).show();
                break;
            case (R.id.action_item3):
                Toast.makeText(MainActivity.this, "+3", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void commitballFragment() {
        ballFragment BallFragment = new ballFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.workSpace, BallFragment, Constant.BALL_FRAGMENT_TAG)
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                .addToBackStack(Constant.BALL_FRAGMENT_TAG)
                .commit();
    }

//    private void commitballFragment() {
//        ballFragment ballFragment = new ballFragment();
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.frame, ballFragment, "ball")
//                .commit();
//    }



//    private void commitheartFragment() {
//        heartFragment HeartFragment = new heartFragment();
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.workSpace, HeartFragment, Constant.BALL_FRAGMENT_TAG)
//                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//                .addToBackStack(Constant.BALL_FRAGMENT_TAG)
//                .commit();
//    }










}
