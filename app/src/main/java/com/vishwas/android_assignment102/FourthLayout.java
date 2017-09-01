package com.vishwas.android_assignment102;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Vishwas on 8/26/2017.
 */

public class FourthLayout extends Fragment
{
    //declaring variable
    TextView txtViw4;

    /**
     * now onCreateView Called to create the view hierarchy associated with the fragment.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.layout_four,container,false);
        view.findViewById(R.id.lay4);
        //in here casting variable
        txtViw4=(TextView)view.findViewById(R.id.lay4);
        String string="The plot is wafer-thin and it’s been done to death by none other than Imtiaz Ali in each of his earlier films—be it Jab We Met, Cocktail (writer) and Tamasha.\n" +
                "It’s the routine girl is engaged elsewhere story but she discovers half-way through that her soulmate is someone other." +
                "In this case, Sejal is engaged to Rupen but actually ends up falling for Harry ";
        txtViw4.setText(string);
        //returning view
        return view;
    }
}
