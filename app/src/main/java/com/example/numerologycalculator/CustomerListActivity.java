package com.example.numerologycalculator;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class CustomerListActivity extends AppCompatActivity {
    ListView customerList;
    String[] ids;
    String[] names;
    String[] dobs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);

        Resources res = getResources();
        customerList = (ListView) findViewById(R.id.customerList);
        ids = res.getStringArray(R.array.ids);
        names = res.getStringArray(R.array.names);
        dobs = res.getStringArray(R.array.dobs);

        ItemAdapter itemAdapter = new ItemAdapter(this, ids, names, dobs);

        customerList.setAdapter(itemAdapter);
    }
}