package com.jackie.efficientloadimage.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.jackie.efficientloadimage.R;

/**
 * Created by Administrator on 2016/12/20.
 */
public class MainActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv);

        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / (1024 * 1024));
        textView.setText("最大内存是：" + maxMemory + "MB");
    }
}
