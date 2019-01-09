package com.example.deepaksharma.welcome;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinActivity extends Activity implements AdapterView.OnItemSelectedListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);

        String city[] = {"Jaipur","Udaipur","Jodhpur","Jaisalmer","Kota"};
        Spinner sp = (Spinner) findViewById(R.id.spin);
        sp.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item,city);
        sp.setAdapter(aa);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
