package com.vishwas.android_assignment102;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Vishwas on 8/26/2017.
 */

public class ListFragment extends Fragment
{
    private OnItemSelectedListener listener;
    /**
     * now onCreateView Called to create the view hierarchy associated with the fragment.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        // casting variable
        Button review1 = (Button) view.findViewById(R.id.button);
        Button review2 = (Button) view.findViewById(R.id.button2);
        Button review3 = (Button) view.findViewById(R.id.button3);
        Button review4 = (Button) view.findViewById(R.id.button4);
        // setting on setOnClickListener for review1
        review1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                updateDetail("layout_one");
            }
        });
        // setting on setOnClickListener for review2
        review2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                updateDetail("layout_two");
            }
        });
        // setting on setOnClickListener for review3
        review3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                updateDetail("layout_three");
            }
        });
        // setting on setOnClickListener for review4
        review4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                updateDetail("layout_four");
            }
        });
// returning view
        return view;
    }

    public interface OnItemSelectedListener {
        public void onRssItemSelected(String link);
    }

    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        if (context instanceof OnItemSelectedListener)
        {
            listener = (OnItemSelectedListener) context;
        } else {
            throw new ClassCastException(context.toString()
                    + " must implement ListFragment.OnItemSelectedListener");
        }

    }

    public void updateDetail(String s) {
        listener.onRssItemSelected(s);
    }
}

