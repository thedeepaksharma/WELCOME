package com.example.deepaksharma.welcome;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class GridviewActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        String name[] = {"Ram","Raman","Rajat","Raghav"};
        GridView gv = (GridView) findViewById(R.id.grid1);

        ArrayAdapter aa  = new ArrayAdapter(GridviewActivity.this, android.R.layout.simple_expandable_list_item_1,name);
        gv.setAdapter(aa);

    }
}
