package com.konifar.material_typograpy_sample;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import com.astuetz.PagerSlidingTabStrip;

import butterknife.ButterKnife;
import butterknife.InjectView;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends ActionBarActivity {

    @InjectView(R.id.toolbar)
    Toolbar mToolbar;
    @InjectView(R.id.tab_strip)
    PagerSlidingTabStrip mTabStrip;
    @InjectView(R.id.view_pager)
    ViewPager mViewPager;

    FontPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        setSupportActionBar(mToolbar);

        initViewPager();
    }

    private void initViewPager() {
        adapter = new FontPagerAdapter(getSupportFragmentManager(), this);
        mViewPager.setAdapter(adapter);
        mTabStrip.setViewPager(mViewPager);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

}
