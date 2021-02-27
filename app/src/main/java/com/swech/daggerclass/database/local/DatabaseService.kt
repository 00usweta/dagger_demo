package com.swech.daggerclass.database.local

import android.content.Context
import com.swech.daggerclass.di.qualifiers.ApplicationContext
import com.swech.daggerclass.di.qualifiers.DatabaseInfo
import javax.inject.Inject

class DatabaseService @Inject constructor(@ApplicationContext context: Context, @DatabaseInfo databaseName:String, @DatabaseInfo version:Int)
{
    fun getDummyData():String{
        return "DATABASE_DUMMY_DATA"
    }
}