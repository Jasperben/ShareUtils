package com.jasperben.sharedemo;

import java.io.File;

import com.jasperben.share.ShareUtils;

import android.app.Application;
import android.os.Environment;

public class APP extends Application {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		File file = new File(Environment.getExternalStorageDirectory().toString() + File.separator + "sample");
        if (!file.exists()) {
            file.mkdirs();
        }
        ShareUtils.init("CACHE", 10 * 1024, file.toString());
	}
}
