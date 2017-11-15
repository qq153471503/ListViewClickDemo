package com.example.listviewclickdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by KunGe on 2017/11/16.
 */

public class FragmentRight1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment_right_1, container, false);
        /**
         *
         * 利用view.findViewById(),在此处写view上控件的控制
         *
         */
        return view;
    }
}
