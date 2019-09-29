package com.example.giaodienfragment;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends androidx.fragment.app.ListFragment {
    private ArrayList<Student>students;


    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        students = new ArrayList<>();

        students.add(new Student("Đức Đạt", "ducdatse@gmail.com", "Sài Gòn",1998));
        students.add(new Student("Đức Trọng", "ductrong@gmail.com", "Thanh Hóa",2000));
        students.add(new Student("Hoàng Được", "hoangduoc@gmail.com", "Miền Tây",2001));
        students.add(new Student("Đức Đạt", "ducdatse@gmail.com", "Sài Gòn",1998));
        students.add(new Student("Đức Đạt", "ducdatse@gmail.com", "Sài Gòn",1998));
        students.add(new Student("Đức Đạt", "ducdatse@gmail.com", "Sài Gòn",1998));
        students.add(new Student("Đức Đạt", "ducdatse@gmail.com", "Sài Gòn",1998));
        students.add(new Student("Đức Đạt", "ducdatse@gmail.com", "Sài Gòn",1998));
        students.add(new Student("Đức Đạt", "ducdatse@gmail.com", "Sài Gòn",1998));
        students.add(new Student("Đức Đạt", "ducdatse@gmail.com", "Sài Gòn",1998));
        students.add(new Student("Đức Đạt", "ducdatse@gmail.com", "Sài Gòn",1998));
        CustomAdapter adapter = new CustomAdapter(getActivity(),R.layout.custom_listview, students);
        setListAdapter(adapter);
        return view;
    }

    public void openDetailActivity(Student student){
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("student", student);
        intent.putExtra("data", bundle);
        startActivity(intent);
    }
    public void laScapeMode (Student student){
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        DetailFragment detailFragment = (DetailFragment) fragmentManager.findFragmentById(R.id.fragDetail);
        detailFragment.applyData(student);

    }


    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        int oreint = getResources().getConfiguration().orientation;
        if(oreint == Configuration.ORIENTATION_PORTRAIT){
            openDetailActivity(students.get(position));

        }else {
            laScapeMode(students.get(position));


        }
    }
}
