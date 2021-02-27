package com.swech.daggerclass.ui

import com.swech.daggerclass.database.local.DatabaseService
import com.swech.daggerclass.database.remote.NetworkService
import com.swech.daggerclass.di.scope.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor (val networkService: NetworkService?, val databseService: DatabaseService?)
{
    fun getSomeData():String{
        return "${networkService?.getDummyData()} : ${databseService?.getDummyData()}"
    }
}