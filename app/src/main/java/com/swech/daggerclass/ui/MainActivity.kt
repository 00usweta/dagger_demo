package com.swech.daggerclass.ui

import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.swech.daggerclass.MyApplication
import com.swech.daggerclass.R
import com.swech.daggerclass.di.component.DaggerActivityComponent
import com.swech.daggerclass.di.module.ActivityModule
import com.swech.daggerclass.ui.home.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
    @set:Inject
    lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val application = application as MyApplication
        DaggerActivityComponent.builder()
                .applicationComponent(application.application_componet)
                .activityModule(ActivityModule(this))
                .build().inject(this)
      //  tvData.text = viewModel.getSomeData()

        addHomeFragment()
    }

    private fun addHomeFragment() {
        if (supportFragmentManager.findFragmentByTag(HomeFragment.TAG) == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_fragment, HomeFragment.newInstance(), HomeFragment.TAG)
                .commit()
        }
    }
}