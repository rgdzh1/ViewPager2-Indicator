package com.badoualy.stepperindicator.sample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.badoualy.stepperindicator.sample.PageFragment;
import com.badoualy.stepperindicator.yey.StepperIndicator2;
import com.badoualy.stepperindicator.sample.R;

import java.util.ArrayList;

public class ViewPager2Activity extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private StepperIndicator2 stepperIndicator2;
    private ArrayList<Fragment> fragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager2);
        initFaragment();
        viewPager2 = (ViewPager2) findViewById(R.id.vp2);
        stepperIndicator2 = (StepperIndicator2) findViewById(R.id.stepper_indicator2);
        viewPager2.setAdapter(new FragmentStateAdapter(getSupportFragmentManager(), this.getLifecycle()) {
            @NonNull
            @Override
            public Fragment createFragment(int position) {
                return fragments.get(position);
            }

            @Override
            public int getItemCount() {
                return fragments.size();
            }
        });
        // 这里设置的意思是,如果有4个Fragment, 指示器只显示3个,当滑动到第四个Fragment时候,第三个指示器才会打上对勾.
        // stepperIndicator2.setViewPager(viewPager2,true);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                stepperIndicator2.setCurrentStep(position);
            }
        });
    }

    private void initFaragment() {
        fragments = new ArrayList<>();
        fragments.add(PageFragment.newInstance(1, false));
        fragments.add(PageFragment.newInstance(2, false));
        fragments.add(PageFragment.newInstance(3, false));
        fragments.add(PageFragment.newInstance(4, true));
    }
}