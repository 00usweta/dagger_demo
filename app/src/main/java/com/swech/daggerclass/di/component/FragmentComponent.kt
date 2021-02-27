package com.swech.daggerclass.di.component

import com.swech.daggerclass.di.module.FragmentModule
import com.swech.daggerclass.di.scope.FragmenScope
import com.swech.daggerclass.ui.home.HomeFragment
import dagger.Component

@FragmenScope
@Component(dependencies = [ApplicationComponent::class],modules = [FragmentModule::class])
interface FragmentComponent
{
    fun inject(homeFragment: HomeFragment)
}