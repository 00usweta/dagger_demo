package com.swech.daggerclass

import android.app.Application
import android.util.Log
import com.swech.daggerclass.database.local.DatabaseService
import com.swech.daggerclass.database.remote.NetworkService
import com.swech.daggerclass.di.component.ApplicationComponent
import com.swech.daggerclass.di.component.DaggerApplicationComponent
import com.swech.daggerclass.di.module.ApplicationModule
import javax.inject.Inject

class MyApplication:Application() {
    var application_componet : ApplicationComponent?=null
    @set:Inject
    var network_service: NetworkService? =null

    @set:Inject
    var databse_service : DatabaseService?=null
    
    override fun onCreate() {
        super.onCreate()
        application_componet = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
        application_componet?.inject(this)

        Log.d("Debug",network_service?.toString()!!)

    }
}