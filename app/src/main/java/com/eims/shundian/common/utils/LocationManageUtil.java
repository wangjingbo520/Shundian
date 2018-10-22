package com.eims.shundian.common.utils;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

import com.eims.shundian.common.Constants;
import com.eims.shundian.net.Urls;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

import java.util.List;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 获取定位操作
 */
public class LocationManageUtil {
    private Activity activity;
    private LocationManager lm;

    public LocationManageUtil(Activity activity, LocationManager locationManager) {
        this.activity = activity;
        this.lm = locationManager;
    }

    public Location beginLocation() {
        String provider = judgeProvider(lm);
        if (provider != null) {
            if (ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED
                    && ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_COARSE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED) {
                return null;
            }
            return lm.getLastKnownLocation(provider);
        } else {
            ToastUtil.showMessage("定位失败");
        }
        return null;
    }

    private String judgeProvider(LocationManager locationManager) {
        List<String> prodiverlist = locationManager.getProviders(true);
        if (prodiverlist.contains(LocationManager.NETWORK_PROVIDER)) {
            return LocationManager.NETWORK_PROVIDER;
        } else if (prodiverlist.contains(LocationManager.GPS_PROVIDER)) {
            return LocationManager.GPS_PROVIDER;
        } else {
            ToastUtil.showMessage("定位失败");
        }
        return null;
    }


    public void getCity(Location location) {
        String url = Urls.BAIDU + "coords=" + location.getLatitude() + "," + location.getLongitude() + "&output=json&pois=1"
                + "&ak=" + Constants.BAIDU_AK + "&mcode=" + Constants.SHALL1;
        Log.e("--->", url);
        OkGo.<String>get(url)
                .tag(this)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        String resBody = response.body();
                        Log.d("---->", resBody);
                    }
                });
    }


}
