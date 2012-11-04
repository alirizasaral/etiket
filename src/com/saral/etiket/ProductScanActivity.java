package com.saral.etiket;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ProductScanActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_scan);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_product_scan, menu);
        return true;
    }
}
