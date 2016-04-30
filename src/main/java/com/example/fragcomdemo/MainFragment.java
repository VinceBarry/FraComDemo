package com.example.fragcomdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by VinceBarry on 2016/4/30.
 * 发送方定义接口
 */
public class MainFragment extends Fragment{
    private Button mBtPasser;
    OnMessageSendListener mCallback;
    public interface OnMessageSendListener{
        public void onAction(int res);//事件
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        mBtPasser = (Button) view.findViewById(R.id.bt_passer);
        mBtPasser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = 1;
                mCallback.onAction(res);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            //在此处将activity强转成接口
            mCallback = (OnMessageSendListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }
}
