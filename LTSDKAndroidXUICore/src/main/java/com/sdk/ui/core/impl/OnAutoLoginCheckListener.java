package com.sdk.ui.core.impl;


import com.sdk.ui.core.model.BaseEntry;

public interface OnAutoLoginCheckListener {

    void onCheckSuccess(BaseEntry result);

    void onCheckFailed(Throwable ex);
}
