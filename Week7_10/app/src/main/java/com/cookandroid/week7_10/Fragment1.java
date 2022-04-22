package com.cookandroid.week7_10;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    ViewPager viewPager;
    ArrayList<Integer> imageList;
    static final int DP = 24;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_1, container, false);

        this.initializeData();

        viewPager = v.findViewById(R.id.viewPager);
//        viewPager.setClipToPadding(false);
//
//        float density = getResources().getDisplayMetrics().density;
//        int margin = (int) (DP * density);
//        viewPager.setPadding(margin, 0, margin, 0);
//        viewPager.setPageMargin(margin/2);

        viewPager.setAdapter(new ViewPagerAdapter(super.getContext()));
        return v;
    }

    public void initializeData()
    {
        imageList = new ArrayList();

        imageList.add(R.drawable.seagulls);
        imageList.add(R.drawable.bedroom);
        imageList.add(R.drawable.glacier);
    }
}