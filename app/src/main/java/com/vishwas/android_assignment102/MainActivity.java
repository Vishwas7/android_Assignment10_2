package com.vishwas.android_assignment102;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListFragment.OnItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onRssItemSelected(String link)
    {
        /**
         * in here creating an object of fragment manager..
         * that help us to handle  Android fragment trasaction between fragments.
         *
         */

        FragmentManager fragmentManager = getFragmentManager();
        //now in here  creating object of fragment transaction
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        FirstLayout layoutOne;
        SecondLayout layoutTwo;
        ThirdLayout layoutThree;
        FourthLayout layoutFour;

        // now in here applying condition for linking the layout with frame layout..
        if (link.equals("layout_one"))
        {
            layoutOne = new FirstLayout();
            fragmentTransaction.replace(R.id.fragment_container,layoutOne );
            fragmentTransaction.commit();
        } else if (link.equals("layout_two"))
        {
            layoutTwo = new SecondLayout();
            fragmentTransaction.replace(R.id.fragment_container, layoutTwo);
            fragmentTransaction.commit();
        } else if (link.equals("layout_three"))
        {
            layoutThree = new ThirdLayout();
            fragmentTransaction.replace(R.id.fragment_container, layoutThree);
            fragmentTransaction.commit();
        } else if (link.equals("layout_four"))
        {
            layoutFour = new FourthLayout();
            fragmentTransaction.replace(R.id.fragment_container, layoutFour);
            fragmentTransaction.commit();
        }
    }
}
