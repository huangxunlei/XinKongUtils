package com.xinkong.xinkongutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.xinkong.myutils.SlideView;

public class MainActivity extends AppCompatActivity {
    private SlideView mSlideView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSlideView = (SlideView) findViewById(R.id.slideview);
        mSlideView.addSlideListener(new SlideView.OnSlideListener() {
            @Override
            public void onSlideSuccess() {
                mSlideView.setBgTextComplete("验证成功");
                Toast.makeText(MainActivity.this, "确认成功", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
