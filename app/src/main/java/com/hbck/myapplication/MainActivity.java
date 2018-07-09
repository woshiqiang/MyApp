package com.hbck.myapplication;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private List<Icon> list;
    private String[] names = new String[]{
            "交接班", "新增会员", "销售单据", "退货", "盘点",
            "货流通知", "调货", "进货", "订货", "商品编辑",
            "系统设置", "帮助", "通知", "预付卡"};
    private int[] resIds = new int[]{
            R.mipmap.icon_jiaojieban, R.mipmap.icon_vip, R.mipmap.icon_xiao_shou_dan_ju, R.mipmap.icon_tui_huo, R.mipmap.icon_pan_dian,
            R.mipmap.icon_wu_liu_tong_zhi, R.mipmap.icon_diao_huo, R.mipmap.icon_jin_huo, R.mipmap.icon_ding_huo, R.mipmap.icon_edit,
            R.mipmap.icon_setting, R.mipmap.icon_help, R.mipmap.icon_notice, R.mipmap.icon_yu_fu_ka
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initData() {
        list = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Icon icon = new Icon();
            icon.setName(names[i]);
            icon.setResId(resIds[i]);
            list.add(icon);
        }

        gridView.setAdapter(new MyAdapter(this, list));

    }


    private void initView() {
        gridView = (GridView) findViewById(R.id.gridView);

    }


}
