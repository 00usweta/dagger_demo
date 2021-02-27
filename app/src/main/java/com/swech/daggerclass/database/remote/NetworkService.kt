package com.swech.daggerclass.database.remote

import android.content.Context
import com.swech.daggerclass.di.qualifiers.ApplicationContext
import com.swech.daggerclass.di.qualifiers.NetworkInfo
import javax.inject.Inject

class NetworkService @Inject constructor (@ApplicationContext context: Context, @NetworkInfo apiKey:String)
{
    fun getDummyData():String{
        return "NETWORK_DUMMY_DATA"
    }
}