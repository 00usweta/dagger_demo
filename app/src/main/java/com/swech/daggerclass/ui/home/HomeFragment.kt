package com.swech.daggerclass.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.swech.daggerclass.MyApplication
import com.swech.daggerclass.R
import com.swech.daggerclass.di.component.DaggerFragmentComponent
import com.swech.daggerclass.di.module.FragmentModule
import kotlinx.android.synthetic.main.home_fragment.view.*
import javax.inject.Inject

class HomeFragment : Fragment() {

    @Inject
    lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDepencies()
    }

    private fun getDepencies() {
        val application = requireContext().applicationContext as MyApplication
        DaggerFragmentComponent.builder()
            .applicationComponent(application.application_componet)
            .fragmentModule(FragmentModule(this))
            .build().inject(this)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.tv_message.text = viewModel.getSomeData()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    companion object{
        var TAG = "HomeFragment"
        fun newInstance():HomeFragment{
            val args = Bundle()
            val fragment = HomeFragment()
            fragment.arguments = args
            return fragment
        }
    }
}