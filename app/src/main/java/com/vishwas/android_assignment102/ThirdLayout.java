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

public class ThirdLayout extends Fragment {
    //declaring variable
    TextView txtViw3;
    /**
     * now Calling onCreateView  to create the view hierarchy associated with the fragment.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.layout_three,container,false);
        view.findViewById(R.id.lay3);
        txtViw3=(TextView)view.findViewById(R.id.lay3);
        String string="Bitti Mishra (Kriti) is a bohemian Bareilly girl who falls deeply in love with Pritam Vidrohi(Rajkummar)" +
                "an author because she admires his progressive way of thinking. Finding him though proves to be as hard as looking for a needle in the haystack " +
                "So Bitti seeks the help of the local printing press-owner, Chirag Dubey (Ayushmann) on her journey of love.";
        txtViw3.setText(string);
        return view;

    }
}
