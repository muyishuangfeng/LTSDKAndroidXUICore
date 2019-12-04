package com.sdk.ui.core.impl;


import com.sdk.ui.core.model.BaseEntry;
import com.sdk.ui.core.model.ResultData;

public interface OnLoginSuccessListener {

    void onSuccess(BaseEntry<ResultData> data);

    void onFailed(String code);

    void onParameterError(String result);
}
