package com.swech.daggerclass.di.module

import android.app.Activity
import android.content.Context
import com.swech.daggerclass.database.local.DatabaseService
import com.swech.daggerclass.database.remote.NetworkService
import com.swech.daggerclass.di.qualifiers.ActivityContext
import com.swech.daggerclass.ui.MainViewModel
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val activity:Activity)
{
    @ActivityContext
    @Provides
    fun provideContext():Context{
        return activity
    }
   /* @Provides
  fun getViewModel(network_service:NetworkService,databse_service:DatabaseService):MainViewModel{
      return MainViewModel(network_service,databse_service)
  }*/
}