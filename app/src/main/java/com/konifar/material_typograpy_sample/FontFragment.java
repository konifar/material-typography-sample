package com.konifar.material_typograpy_sample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FontFragment extends Fragment {

    private static final String ARG_LAYOUT_RES_ID = "arg_layout_res_id";

    public static Fragment create(int layoutResId) {
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_LAYOUT_RES_ID, layoutResId);
        Fragment fragment = new FontFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getArguments().getInt(ARG_LAYOUT_RES_ID), container, false);
    }

}
