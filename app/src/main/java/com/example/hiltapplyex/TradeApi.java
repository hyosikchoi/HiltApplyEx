package com.example.hiltapplyex;

import android.content.Context;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class TradeApi {

    private Context context;

    @Inject
    public TradeApi(@ApplicationContext Context context) {
        this.context = context;
    }
    public String getString() {
        return this.context.toString();
    }

}
