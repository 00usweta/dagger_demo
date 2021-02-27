package com.swech.daggerclass.di.component

import android.content.Context
import com.swech.daggerclass.MyApplication
import com.swech.daggerclass.database.local.DatabaseService
import com.swech.daggerclass.database.remote.NetworkService
import com.swech.daggerclass.di.module.ApplicationModule
import com.swech.daggerclass.di.qualifiers.ApplicationContext
import com.swech.daggerclass.util.NetworkHelper
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    @ApplicationContext
    fun getContext():Context

    fun inject(application:MyApplication)

    fun getNetworkService():NetworkService
    fun getDatabaseService():DatabaseService
    fun getNetworkHelper():NetworkHelper
}