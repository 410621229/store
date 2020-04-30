package com.example.store;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends FragmentActivity {

    public static Context context;
    public static Toolbar toolbar;
    public static ViewPager mViewPager;
    private TabLayout mTabLayout;
    public static int lastPosition = 1;
    public static String board = "-1";
    private ViewPagerAdapter adapter;
    public static TextView txtBarTitle;
    public static ImageView btnSearchProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
