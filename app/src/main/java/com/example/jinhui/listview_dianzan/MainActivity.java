package com.example.jinhui.listview_dianzan;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

	private ListView listView;
	private List<DianZan> list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(R.id.listView1);
		list = new ArrayList<DianZan>();
		for (int i = 0; i < 20; i++) {
			list.add(new DianZan());
		}
		Adapter adapter = new Adapter(MainActivity.this, list);
		listView.setAdapter(adapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
