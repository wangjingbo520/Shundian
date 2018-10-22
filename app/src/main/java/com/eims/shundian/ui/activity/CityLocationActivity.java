package com.eims.shundian.ui.activity;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import com.eims.shundian.R;
import com.eims.shundian.base.MyNetDataBaseActivity;
import com.eims.shundian.bean.BMapLocationBean;
import com.eims.shundian.common.utils.LocationManageUtil;

import butterknife.BindView;

/**
 * @author bobo
 * @date 2018/9/1
 *
 * describe 城市定位，获取列表
 */
public class CityLocationActivity extends MyNetDataBaseActivity implements LocationManageUtil.LocationLisntenser {
    @BindView(R.id.tvCity)
    TextView tvCity;
    private LocationManager locationManager;
    private LocationManageUtil locationManageUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(R.layout.activity_city_location);
        setTitleLayoutVisiable(false);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locationManageUtil = new LocationManageUtil(this, locationManager, this);
        locationManageUtil.getCity(locationManageUtil.beginLocation());
    }

    @Override
    public void sucessLocation(BMapLocationBean bMapLocationBean) {
        tvCity.setText(bMapLocationBean.getResult().getAddressComponent().getCity());
    }

    @Override
    public void failedLocation() {
        tvCity.setText("定位失败");

    }
}
