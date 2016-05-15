package com.jasperben.share;

import android.graphics.Bitmap;

/**
 * 缓存接口
 * @author Jasperben
 *
 */
public interface Cache {

    Bitmap getBitmap(String key);

    Object getString(String key);

    byte[] getBytes(String key);

    Object getObject(String key);

    Integer getInt(String key);

    Long getLong(String key);

    Double getDouble(String key);

    Float getFloat(String key);

    Boolean getBoolean(String key);


    void put(String key, Object value);

    void remove(String key);

    void clear();
}
