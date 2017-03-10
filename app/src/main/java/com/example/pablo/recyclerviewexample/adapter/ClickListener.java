package com.example.pablo.recyclerviewexample.adapter;

import android.view.View;

/**
 * Created by Pablo on 08/01/2017.
 */

/**
 * Interface de click
 */

public interface ClickListener {

    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
