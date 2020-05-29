package com.meyou.where.Example;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.meyou.where.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyExpandableListViewAdapter extends BaseExpandableListAdapter {
    private Context context;
    private HashMap<String, List<String>> ChildTitles;
    private List<String> HeaderTitles;


    public MyExpandableListViewAdapter(Context context, HashMap<String, List<String>> ChildTitles, List<String> HeaderTitles) {
        this.context = context;
        this.ChildTitles = ChildTitles;
        this.HeaderTitles = HeaderTitles;
    }


    @Override
    public int getGroupCount() {
        return HeaderTitles.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return ChildTitles.get(HeaderTitles.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return HeaderTitles.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return ChildTitles.get(HeaderTitles.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String title = (String) this.getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_header, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.TextViewHeader_On_ExpandableListViewExample);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setText(title);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String title = (String) this.getChild(groupPosition, childPosition);
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_childitems, null);

        TextView textView = convertView.findViewById(R.id.TextViewChild_On_ExpandableListViewExample);
        textView.setText(title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }


    public static class ChildProvider {
        public static HashMap<String, List<String>> getInfo() {
            HashMap<String, List<String>> HeaderDetails = new HashMap<>();

            List<String> ChildDetails_1 = new ArrayList<>();
            ChildDetails_1.add("This is Children 11");
            ChildDetails_1.add("This is Children 12");
            ChildDetails_1.add("This is Children 13");
            ChildDetails_1.add("This is Children 14");

            List<String> ChildDetails_2 = new ArrayList<>();
            ChildDetails_2.add("This is Children 21");
            ChildDetails_2.add("This is Children 22");
            ChildDetails_2.add("This is Children 23");
            ChildDetails_2.add("This is Children 24");

            List<String> ChildDetails_3 = new ArrayList<>();
            ChildDetails_3.add("This is Children 31");
            ChildDetails_3.add("This is Children 32");
            ChildDetails_3.add("This is Children 33");
            ChildDetails_3.add("This is Children 34");

            List<String> ChildDetails_4 = new ArrayList<>();
            ChildDetails_4.add("This is Children 41");
            ChildDetails_4.add("This is Children 42");
            ChildDetails_4.add("This is Children 43");
            ChildDetails_4.add("This is Children 44");

            HeaderDetails.put("Header 1", ChildDetails_1);
            HeaderDetails.put("Header 2", ChildDetails_2);
            HeaderDetails.put("Header 3", ChildDetails_3);
            HeaderDetails.put("Header 4", ChildDetails_4);

            return HeaderDetails;
        }
    }


}
