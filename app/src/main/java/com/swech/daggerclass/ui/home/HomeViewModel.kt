package com.swech.daggerclass.ui.home

import androidx.lifecycle.ViewModel
import com.swech.daggerclass.database.local.DatabaseService
import com.swech.daggerclass.database.remote.NetworkService
import com.swech.daggerclass.di.scope.FragmenScope
import com.swech.daggerclass.util.NetworkHelper
import javax.inject.Inject

@FragmenScope
class HomeViewModel @Inject constructor(val networkService: NetworkService?,val databseService: DatabaseService?,val networkHelper: NetworkHelper) {
    fun getSomeData():String{
        return "${networkService?.getDummyData()} : ${databseService?.getDummyData()} ${networkHelper.isNetworkConnected()}"
    }
}