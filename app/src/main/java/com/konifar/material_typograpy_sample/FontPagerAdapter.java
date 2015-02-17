package com.konifar.material_typograpy_sample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FontPagerAdapter extends FragmentPagerAdapter {

    private static final int POS_DEFAULT = 0;
    private static final int POS_ROBOTO = 1;
    private static final int POS_NOTO = 2;

    private Context context;

    public FontPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int pos) {
        switch (pos) {
            case POS_DEFAULT:
                return FontFragment.create(R.layout.fragment_font_default);
            case POS_ROBOTO:
                return FontFragment.create(R.layout.fragment_font_roboto);
            case POS_NOTO:
                return FontFragment.create(R.layout.fragment_font_noto);
            default:
                throw new UnsupportedOperationException("pos: " + pos);
        }
    }

    @Override
    public CharSequence getPageTitle(int pos) {
        switch (pos) {
            case POS_DEFAULT:
                return context.getString(R.string.font_default);
            case POS_ROBOTO:
                return context.getString(R.string.font_roboto);
            case POS_NOTO:
                return context.getString(R.string.font_noto);
            default:
                throw new UnsupportedOperationException("pos: " + pos);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

}
