package com.example.fragcomdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by VinceBarry on 2016/4/30.
 */
public class ShowFragment extends Fragment {
    private TextView mTvReceiver;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show,container,false);
        mTvReceiver = (TextView) view.findViewById(R.id.tv_receiver);

        return view;
    }

    public void showResult(String pass) {
        mTvReceiver.setText(pass);
    }
}
