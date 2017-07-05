package com.debugapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by King6rf on 2017/7/4.
 */

public class TmpActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DebugUtil.start3dmWeb2(this);
        getSupportFragmentManager();
        getFragmentManager();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        finish();
    }
    @SuppressLint("ValidFragment")
    class TestFragment extends android.support.v4.app.Fragment{
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            getSupportFragmentManager();
            return super.onCreateView(inflater, container, savedInstanceState);
        }
    }
    @SuppressLint("ValidFragment")
    class Test2Fragment extends android.app.Fragment {
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
            getFragmentManager();
            return super.onCreateView(inflater, container, savedInstanceState);
        }
    }
}
