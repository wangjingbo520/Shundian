package com.eims.shundian.ui.activity;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;

import com.eims.shundian.R;
import com.eims.shundian.base.MyNetDataBaseActivity;
import com.eims.shundian.common.utils.LocationManageUtil;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 城市定位，获取列表
 */
public class CityLocationActivity extends MyNetDataBaseActivity {
    private LocationManager locationManager;
    private LocationManageUtil locationManageUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_location);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locationManageUtil = new LocationManageUtil(this,locationManager);
        Location location = locationManageUtil.beginLocation();
        locationManageUtil.getCity(location);
    }


}
