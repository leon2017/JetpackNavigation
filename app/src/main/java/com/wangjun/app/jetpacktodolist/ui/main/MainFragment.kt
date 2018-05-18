package com.wangjun.app.jetpacktodolist.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.AppCompatButton
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import com.wangjun.app.jetpacktodolist.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)

        view.findViewById<AppCompatButton>(R.id.btn_setting).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_main_fragment_to_settings_activity)
        }


        /**
         * 参数跳转
         */
        view.findViewById<AppCompatButton>(R.id.btn_main2).setOnClickListener {

            val bundle = bundleOf("testArg" to "很高兴遇见你",
                    "testArg2" to "你是猴子派来的逗逼吗")
            Navigation.findNavController(view).navigate(
                    R.id.action_main_fragment_to_main2_fragment,
                    bundle)
        }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

    }

}
