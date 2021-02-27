package com.swech.daggerclass.di.module

import android.content.Context
import androidx.fragment.app.Fragment
import com.swech.daggerclass.di.qualifiers.ActivityContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FragmentModule( val frament:Fragment)
{
    @Singleton
    @ActivityContext
    @Provides
    fun provideContext(): Context {
        return frament.requireContext()
    }
}