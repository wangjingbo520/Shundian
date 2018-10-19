package com.eims.myapp.net;

import android.util.Log;

import com.eims.myapp.MyApplication;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

/**
 * @author bobo
 * @date 2018/10/10
 * describe
 */
public class CommonInterceptor implements Interceptor {
    private SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

    @Override
    public Response intercept(Chain chain) throws IOException {
        //得到原始的请求对象
        Request request = chain.request();
        //得到用户所使用的请求方式
        String method = request.method();
        if ("GET".equals(method)) {
            HttpUrl.Builder builder = request.url().newBuilder();
            String qTime = format.format(System.currentTimeMillis());
            //加入公共参数
            Map<String, String> params = getParamsGet(request);
            //   params.put("deviceId", DeviceUtils.getDeviceId(MyApplication.context));
            params.put("qTime", qTime);
            //加密的秘钥
            params.put("appkey", "");
            //    builder.addQueryParameter("deviceId", DeviceUtils.getDeviceId(MyApplication
            // .context));
            builder.addQueryParameter("qTime", qTime);
            //     builder.addQueryParameter("appkey", SecretConstains.APP_KEY);
            //     builder.addQueryParameter("sign", SignCore.getSignString(params));
            //重新构建请求体
            request = request.newBuilder().url(builder.build()).build();
            Log.d("RequestClient", request.url().toString());
        } else if ("POST".equals(method)) {
            String qTime = format.format(System.currentTimeMillis());
            Map<String, String> params = getParamsPost(request);
            //加入公共参数
//            params.put("deviceId", DeviceUtils.getDeviceId(MyApplication.context));
//            params.put("qTime", qTime);
//            params.put("appkey", SecretConstains.APP_KEY);
            Request.Builder builder = request.newBuilder();
            FormBody.Builder formBodyBuilder = new FormBody.Builder();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                formBodyBuilder.add(entry.getKey(), entry.getValue());
            }
            //加入公共参数sign
            //     formBodyBuilder.add("sign", SignCore.getSignString(params));
            //重新构建请求体
            request = builder.post(formBodyBuilder.build()).build();
            String postBodyString = bodyToString(request.body());
            String fullUrl = request.url() + "?" + postBodyString;
            Log.e("RequestClient", fullUrl);
        }
        //重新发送请求
        return chain.proceed(request);
    }

    private Map<String, String> getParamsPost(Request request) {
        Map<String, String> map = new HashMap<>();
        if (request.body() instanceof FormBody) {
            FormBody body = (FormBody) request.body();
            for (int i = 0; i < body.size(); i++) {
                map.put(body.name(i), body.value(i));
            }
        }
        return map;
    }

    private Map<String, String> getParamsGet(Request request) {
        Map<String, String> map = new HashMap<>();
        HttpUrl httpUrl = request.url();
        for (int i = 0; i < httpUrl.querySize(); i++) {
            map.put(httpUrl.queryParameterName(i), httpUrl.queryParameterValue(i));
        }
        return map;
    }

    private String bodyToString(final RequestBody request) {
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if (copy != null) {
                copy.writeTo(buffer);
                return buffer.readUtf8();
            } else {
                return "";
            }
        } catch (final IOException e) {
            return "did not work";
        }
    }
}
