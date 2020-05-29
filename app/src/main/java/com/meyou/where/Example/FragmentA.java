package com.meyou.where.Example;


import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.meyou.Fragment;
import com.meyou.where.R;


public class FragmentA extends Fragment {

    private EditText editText;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = layoutInflater.inflate(R.layout.fragment_a, viewGroup, false);
        editText = view.findViewById(R.id.EditText_On_InterFragmentCommunicationExample);
        editText.setBackgroundColor(Color.GREEN);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ((MyInterface) getActivity()).set(editText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        return view;
    }

}
