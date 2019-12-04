package com.sdk.ui.core.net;



import com.sdk.ui.core.model.BaseEntry;
import com.sdk.ui.core.model.ResultData;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitService {


    /**
     * google登录
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-google")
    Observable<BaseEntry<ResultData>> googleLogin(@Header("LT-AppID") String LTAppID,
                                                  @Header("LT-Token") String LTToken,
                                                  @Header("LT-T") int LTTime,
                                                  @Body Map<String, Object> map);

    /**
     * facebook登录
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-facebook")
    Observable<BaseEntry<ResultData>> faceBookLogin(@Header("LT-AppID") String LTAppID,
                                                    @Header("LT-Token") String LTToken,
                                                    @Header("LT-T") int LTTime,
                                                    @Body Map<String, Object> map);

    /**
     * 自动登录验证
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-check")
    Observable<BaseEntry> autoLogin(@Header("LT-AppID") String LTAppID,
                                    @Header("LT-Token") String LTToken,
                                    @Header("LT-T") int LTTime,
                                    @Body RequestBody requestBody);

    /**
     * 游客登录验证
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-visitors")
    Observable<BaseEntry<ResultData>> guestLogin(@Header("LT-AppID") String LTAppID,
                                                 @Header("LT-Token") String LTToken,
                                                 @Header("LT-T") int LTTime,
                                                 @Body Map<String, Object> map);

    /**
     * 绑定账户
     */
    @Headers({"Content-Type:application/json",
            "Accept:application/json"})
    @POST("/api/auth/login-visitors-bind")
    Observable<BaseEntry<ResultData>> bindAccount(@Header("LT-AppID") String LTAppID,
                                                  @Header("LT-Token") String LTToken,
                                                  @Header("LT-T") int LTTime,
                                                  @Body Map<String, Object> map);
}
