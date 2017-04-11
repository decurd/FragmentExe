package kr.co.roonets.fragmentexe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // XML에서 프래그먼트 가져오기
        ColorFragment colorFragment = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.color_fragment);
        ColorFragment colorFragment1 = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.color_fragment1);

        colorFragment1.setColor(Color.BLUE);

        // 동적 프래그먼트 추가가하기
        ColorFragment colorFragment2 = new ColorFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, colorFragment2)
                .commit();

    }

    public void btn_Change(View view) {
        ColorFragment newColorFragment = new ColorFragment();
        newColorFragment.setColor(Color.BLACK);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, newColorFragment)
                .commit();
    }
}
