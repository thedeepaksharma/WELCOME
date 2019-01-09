package com.example.deepaksharma.welcome;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListArray extends Activity {

    ListView listView;
    String country[] = {"India","America","Japan","China","Russia","Germany","France    "};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        listView = (ListView) findViewById(R.id.list1);

        final ArrayAdapter aa = new ArrayAdapter(ListArray.this, android.R.layout.simple_expandable_list_item_1,country);
        listView.setAdapter(aa);

    }
}
