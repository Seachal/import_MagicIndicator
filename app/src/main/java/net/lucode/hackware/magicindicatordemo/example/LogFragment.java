package net.lucode.hackware.magicindicatordemo.example;

/**
 * *
 * *
 * Project_Name:MagicIndicator
 *
 * @author zhangxc
 * @Description: TODO
 * @date 2023/2/1 11:15
 * @Version：1.0
 */

import android.util.Log;

import androidx.fragment.app.Fragment;

public class LogFragment extends Fragment {

    protected String TAG = this.getClass().getSimpleName();

    @Override
    public void onStart() {
        super.onStart();
        Log.d(this.TAG, "onStart: ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(this.TAG, "onResume: ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(this.TAG, "onPause: ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(this.TAG, "onStop: ");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(this.TAG, "onDestroyView: ");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(this.TAG, "onDetach: ");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.d(this.TAG, "onHiddenChanged:hidden-->" + hidden);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.d(this.TAG, "isVisibleToUser:isVisibleToUser-->" + isVisibleToUser);
    }
}
