package com.sdk.ui.core.net;


import com.sdk.ui.core.net.retrofit.BaseApiImpl;

public class Api extends BaseApiImpl {
    //测试服务器
    public static final String TEST_SERVER_URL="http://testgco.appcpi.com";
    //正式服务器
    public static final String FORMAL_SERVER_URL="https://gco.appcpi.com";

    private Api(String baseUrl) {
        super(baseUrl);
    }

    public static RetrofitService getInstance(String baseUrl) {
        return new Api(baseUrl).getRetrofit().create(RetrofitService.class);
    }


}
