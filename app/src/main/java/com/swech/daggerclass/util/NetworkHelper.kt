package com.swech.daggerclass.util

import android.content.Context
import com.swech.daggerclass.di.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkHelper @Inject constructor(@ApplicationContext context: Context)
{
    fun isNetworkConnected():Boolean{
        return false
    }
}