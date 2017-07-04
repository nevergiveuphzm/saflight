package com.b303.saflight.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import com.b303.saflight.R;
import com.b303.saflight.widget.HorizontalListView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HP on 2017/7/3.
 */
public class MainNewActivity extends AppCompatActivity {
    @Bind(R.id.imageView)
    ImageView imageView;
    @Bind(R.id.lv_battery)
    HorizontalListView lvBattery;
    @Bind(R.id.lv_battery_second)
    HorizontalListView lvBatterySecond;
    @Bind(R.id.btn_kinetism)
    Button btnKinetism;
    @Bind(R.id.btn_technique)
    Button btnTechnique;
    @Bind(R.id.btn_combined_train)
    Button btnCombinedTrain;
    @Bind(R.id.btn_app_tools)
    Button btnAppTools;
    @Bind(R.id.btn_hacker_space)
    Button btnHackerSpace;
    @Bind(R.id.btn_setting)
    Button btnSetting;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);
        ButterKnife.bind(this);

    }
}
