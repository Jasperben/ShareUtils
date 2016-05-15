package com.jasperben.sharedemo;

import java.util.ArrayList;
import java.util.List;

import com.jasperben.share.ShareUtils;
import com.luke.sharedemo.R;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	List<String> items = new ArrayList<String>();
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);

		Student student = new Student("Jasperben", 25);
		items.add("1");
		items.add("2");
		items.add("3");
		items.add("4");
		items.add("5");

		// 设置字符串
		ShareUtils.putString("string", "你好啊");
		// 设置int
		ShareUtils.putInt("int", 1);
		// 设置boolean
		ShareUtils.putBoolean("boolean", true);
		// 设置double
		ShareUtils.putDouble("double", 2.1d);
		// 设置long
		ShareUtils.putLong("long", 20000);
		// 设置flot
		ShareUtils.putFloat("float", 2.2f);
		// 设置类
		ShareUtils.putObject("object", student);
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
		// 设置bitmap
		ShareUtils.putBitmap("bitmap", bitmap);
		// 设置集合
		ShareUtils.putObject("list", items);

		// 得到字符串
		String str = ShareUtils.getString("string");
		// 得到double
		double dd = ShareUtils.getDouble("double", 0.0d);
		// 得到int
		int value = ShareUtils.getInt("int", 0);
		// 得到float
		float ff = ShareUtils.getFloat("float", 0.0f);
		// 得到long
		long ll = ShareUtils.getLong("long", 0);

		// 得到bitmap
		Bitmap map = ShareUtils.getBitmap("bitmap");
		// 得到集合
		List<String> liststring = (List<String>) ShareUtils.getObject("list");
		for (int i = 0; i < liststring.size(); i++) {
			System.out.print(liststring.get(i));
		}

		Student stu = (Student) ShareUtils.getObject("object");
		tv.setText(stu.getAge() + "  " + stu.getName());
		
		
		/**
		 * 清除全部数据
		 */
		ShareUtils.clearData();
		/**
		 * 清除指定key的数据
		 */
		ShareUtils.remove("object");

	}

}
