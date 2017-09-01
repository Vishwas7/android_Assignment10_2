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

public class SecondLayout extends Fragment
{
    //declaring variable
    TextView txtViw2;
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
        View view=inflater.inflate(R.layout.layout_two,container,false);
        view.findViewById(R.id.lay2);
        txtViw2=(TextView)view.findViewById(R.id.lay2);
        String string="Shubh Mangal Saavdhan' is a remake of the Tamil film 'Kalyana Samayal Saadham' made in 2013.:-\n" +
                "The story revolves around Mudit Sharma (Ayushmann Khurrana) and Sugandha (Bhumi Pednekar) who fall in love and plan to get married." +
                " But the twist in the tale comes when the groom discovers that he suffers from erectile dysfunction " ;
        txtViw2.setText(string);
        return view;
    }
}
