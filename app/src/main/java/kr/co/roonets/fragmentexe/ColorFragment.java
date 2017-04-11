package kr.co.roonets.fragmentexe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by decurd on 2017-04-11.
 */

public class ColorFragment extends Fragment {

    private int mColor = Color.RED;

    // 필수
    public ColorFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lifecycle, container, false);
        v.setBackgroundColor(mColor);
        return v;
    }

    public void setColor(int color) {
        // 프래그먼트 내부에서 자기 자신의 뷰 레퍼런스는 getView()로 가져올 수 있음
        mColor = color;
        if (getView() != null) {
            getView().setBackgroundColor(mColor);
        }
    }
}
