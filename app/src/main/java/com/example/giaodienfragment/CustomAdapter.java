package com.example.giaodienfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Student> {
    private Context context;
    private int resource;
    private ArrayList<Student> students;
    public CustomAdapter(Context context, int resource, ArrayList<Student> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.students=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_listview, parent, false);
        }
        TextView tvName = convertView.findViewById(R.id.tvName);
        tvName.setText(students.get(position).getName());
        return convertView;
    }
}
