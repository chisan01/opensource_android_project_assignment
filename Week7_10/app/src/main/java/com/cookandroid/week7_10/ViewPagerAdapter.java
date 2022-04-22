package com.cookandroid.week7_10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.Objects;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    int[] imageList;
    LayoutInflater layoutInflater;

    public ViewPagerAdapter(Context context) {
        this.context = context;
        this.imageList = new int[]{R.drawable.seagulls, R.drawable.bedroom, R.drawable.glacier};
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.pagerview_layout, container, false);

        ImageView imageView = view.findViewById(R.id.imageView);
        System.out.println(position + " 그림 출력");
        imageView.setImageResource(imageList[position]);

        Objects.requireNonNull(container).addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return imageList.length;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((LinearLayout) object);
    }
}
