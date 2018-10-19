package com.eims.myapp.base;

import android.text.TextUtils;
import android.util.Log;

import com.eims.myapp.net.DialogCallback;
import com.eims.myapp.net.InterfaceMethod;
import com.eims.myapp.net.LzyResponse;
import com.eims.myapp.net.MyStringCallBack;
import com.eims.myapp.net.Urls;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bobo
 * @date 2018/9/1
 * describe 这里主要做网络请求的基类
 */
public class MyNetDataBaseActivity<T> extends BaseActivity {
    public Map<String, String> map = new HashMap<>(16);

    /**
     * post请求  自定义泛型类型数据
     *
     * @param url
     * @param map
     */
    public void postT(final String url, Map<String, String> map) {
        OkGo.<LzyResponse<T>>post(Urls.SERVER_URL + "login")
                .tag(this)
                .params(map)
                .isMultipart(false)
                .execute(new DialogCallback<LzyResponse<T>>(this) {
                    @Override
                    public void onSuccess(Response<LzyResponse<T>> response) {
                        onNetDataT(url, response.body().data);
                    }
                });
    }

    /**
     * 返回字符串类型
     *
     * @param api_name
     * @param map
     */
    public void postString(final String api_name, Map<String, String> map) {
        OkGo.<String>post(Urls.SERVER_URL + api_name)
                .tag(this)
                .params(map)
                .isMultipart(false)
                .execute(new MyStringCallBack(this, false) {
                    @Override
                    public void onSuccess(Response<String> response) {
                        try {
                            String resBody = response.body();
                            if (!TextUtils.isEmpty(resBody)) {
                                JSONObject jsonObject = new JSONObject(resBody);
                                int code = jsonObject.getInt("code");
                                if (1 == code) {
                                    Object object = jsonObject.get("data");
                                    if (object instanceof JSONObject) {
                                        //返回的数据为jsonobject
                                        onNetJSONObject((JSONObject) object, api_name);
                                    } else {
                                        //返回的数据为jsonarray
                                        onNetJSONArray((JSONArray) object, api_name);
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }


    /**
     * 返回 JSONObject数据
     *
     * @param jsonObject 数据体
     * @param trxcode    请求方法
     */
    public void onNetJSONObject(JSONObject jsonObject, String trxcode) {

    }

    /**
     * 返回 JSONArray数据
     *
     * @param jsonArray 数据体
     * @param trxcode   请求方法
     */
    public void onNetJSONArray(JSONArray jsonArray, String trxcode) {

    }

    /**
     * 泛型数据
     *
     * @param url
     * @param data
     */
    public void onNetDataT(String url, T data) {
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        OkGo.getInstance().cancelTag(this);
    }
}
