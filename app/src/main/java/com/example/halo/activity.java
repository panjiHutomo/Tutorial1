package com.example.halo;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class activity extends Activity {
    public activity() {
        super();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_satu);
    }
}
