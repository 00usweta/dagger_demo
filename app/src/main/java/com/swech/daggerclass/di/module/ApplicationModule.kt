package com.swech.daggerclass.di.module

import android.content.Context
import com.swech.daggerclass.MyApplication
import com.swech.daggerclass.database.local.DatabaseService
import com.swech.daggerclass.database.remote.NetworkService
import com.swech.daggerclass.di.qualifiers.ApplicationContext
import com.swech.daggerclass.di.qualifiers.DatabaseInfo
import com.swech.daggerclass.di.qualifiers.NetworkInfo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext():Context{
        return application
    }

    @Singleton
    @NetworkInfo
    @Provides
    fun provideApiKey():String{
        return "abc"
    }

    @Singleton
    @DatabaseInfo
    @Provides
    fun provideDatabaseName():String{
        return "XYZ"
    }

    @Singleton
    @DatabaseInfo
    @Provides
    fun provideDatabaseVersion():Int{
        return  1
    }

    /*@Singleton
    @Provides
    fun provideNetworkService():NetworkService{
        return NetworkService(application,"abc")
    }

    @Singleton
    @Provides
    fun provideDatabaseService():DatabaseService{
        return DatabaseService(application,"XYZ",1)
    }*/
}