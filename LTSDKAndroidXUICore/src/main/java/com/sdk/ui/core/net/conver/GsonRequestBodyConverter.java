package com.sdk.ui.core.net.conver;


import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

import androidx.annotation.NonNull;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

/**
 */
public class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private Type type;
    private Charset charset;
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8;");

    public GsonRequestBodyConverter(Type type, Charset charset) {
        this.type = type;
        this.charset = charset;
    }

    @Override
    public RequestBody convert(@NonNull T value) throws IOException {
        String json = JSONFactory.toJson(value);
        return RequestBody.create(MEDIA_TYPE, json);
    }
}
