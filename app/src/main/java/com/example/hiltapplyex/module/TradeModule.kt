package com.example.hiltapplyex.module

import android.content.Context
import com.example.hiltapplyex.TradeApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TradeModule {

    @Singleton
    @Provides
    fun provideTradeApi(
       @ApplicationContext context: Context
    ): TradeApi = TradeApi(context)

}