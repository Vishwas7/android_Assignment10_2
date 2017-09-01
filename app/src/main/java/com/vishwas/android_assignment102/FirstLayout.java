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

public class FirstLayout extends Fragment {
    //declaring variable
    TextView TxtViw1;
    /**
     * now onCreateView Called to create the view hierarchy associated with the fragment.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_one,container,false);
        view.findViewById(R.id.lay1);
        TxtViw1=(TextView)view.findViewById(R.id.lay1);
        String  string="The director has put a lot of efforts in giving Baadshaho a period film look" +
                "The vehicles and props have been designed as per the need of the narration." +
                "However, it is yet to be seen whether Baadshaho works as a complete package or not.";
        TxtViw1.setText(string);
        return view;
    }
}
