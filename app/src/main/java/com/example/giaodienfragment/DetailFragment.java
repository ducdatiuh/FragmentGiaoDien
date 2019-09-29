package com.example.giaodienfragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {
    private TextView tvName, tvEmail, tvAddress, tvYear;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        tvAddress = view.findViewById(R.id.tvAddress);
        tvEmail = view.findViewById(R.id.tvEmail);
        tvName = view.findViewById(R.id.tvName);
        tvYear = view.findViewById(R.id.tvYear);

        return view;
    }

    public void applyData(Student student) {
        tvYear.setText("Năm sinh:"+student.getYear()+"");
        tvName.setText("Họ tên:"+student.getName());
        tvEmail.setText("Email:"+student.getEmail());
        tvAddress.setText("Địa chỉ:"+student.getAddress());

    }
}
