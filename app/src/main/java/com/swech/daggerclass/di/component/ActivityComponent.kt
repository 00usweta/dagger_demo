package com.swech.daggerclass.di.component

import com.swech.daggerclass.di.module.ActivityModule
import com.swech.daggerclass.di.scope.ActivityScope
import com.swech.daggerclass.ui.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies =[ApplicationComponent::class] ,modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity:MainActivity)
}