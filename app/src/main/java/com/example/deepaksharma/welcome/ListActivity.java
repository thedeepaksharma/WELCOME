package com.example.deepaksharma.welcome;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity extends Activity {
    int IMAGES[] = {R.drawable.bigb, R.drawable.gandhi, R.drawable.vajpayee, R.drawable.modi, R.drawable.kalam, R.drawable.sachin, R.drawable.kalpanachawla, R.drawable.tata};
    String NAMES[] = {"Amitabh Bachchan","Gandhi Ji","Vajpeyee Ji","Narendra Modi","APJ Kalam","Sachin Tendulkar","Kalpana Chavla","Ratan Tata"};
    String DESCRIPTIONS[] = {"Actor","Freedom Fighter","Former Prime Minister","Prime Minister","Scientist","Sports","Astronot","TATA Motors"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ListView listView = (ListView) findViewById(R.id.list1);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }
    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            TextView textView_name = (TextView) view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView) view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);
            return view;
        }
    }
}
