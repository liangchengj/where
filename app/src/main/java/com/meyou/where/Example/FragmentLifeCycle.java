package com.meyou.where.Example;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.meyou.Fragment;
import com.meyou.where.R;


public class FragmentLifeCycle extends Fragment {

    private TextView textView;
    private String fragmentExampleText = "";


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    private void lifeCycle() {
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        fragmentExampleText += methodName + " was Called\n";
        textView.setText(fragmentExampleText);
        toast(methodName + " was Called");
    }


    @Override
    @Keep
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = layoutInflater.inflate(R.layout.fragment_example, viewGroup, false);
        textView = view.findViewById(R.id.TextView_B_On_FragmentLifecycleExample);
        lifeCycle();
        return view;
    }


    @Override
    @Keep
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        lifeCycle();
    }


    @Override
    @Keep
    public void onDestroyView() {
        super.onDestroyView();
        lifeCycle();
    }

    @Override
    @Keep
    public void onDetach() {
        super.onDetach();
        lifeCycle();
    }
}
