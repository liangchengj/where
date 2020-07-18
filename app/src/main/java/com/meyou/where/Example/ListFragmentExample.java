package com.meyou.where.Example;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.meyou.Fragment;
import com.meyou.where.R;


public class ListFragmentExample extends Fragment {
    private ListView listView;
    private String[] data = {"A", "B", "C", "D", "E", "F", "G"};
    private ArrayAdapter<String> arrayAdapter;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {

        View view = layoutInflater.inflate(R.layout.fragment_list_fragment_example, viewGroup, false);
        listView = view.findViewById(R.id.ListView_On_ListFragmentExample);
        arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, data);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                toast(position + "");
            }
        });

        return view;
    }
}
