package com.meyou.where.Example;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.meyou.Fragment;
import com.meyou.where.R;


public class FragmentB extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {

        View view = layoutInflater.inflate(R.layout.fragment_b, viewGroup, false);
        textView = view.findViewById(R.id.TextView_On_InterFragmentCommunicationExample);
        textView.setBackgroundColor(Color.BLUE);
        return view;
    }

    public void setShow(String data) {
        textView.setText(data);
    }

}
