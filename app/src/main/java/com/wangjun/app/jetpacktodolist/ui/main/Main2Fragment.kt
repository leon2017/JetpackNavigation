package com.wangjun.app.jetpacktodolist.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.AppCompatTextView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wangjun.app.jetpacktodolist.R

class Main2Fragment : Fragment() {

    private lateinit var testArg: String
    private lateinit var testArg2: String

    companion object {
        fun newInstance() = Main2Fragment()
    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.main2_fragment, container, false)

        arguments?.let {
            testArg = it["testArg"] as String
            testArg2 = it["testArg2"] as String
        }

        var tvMain = view.findViewById<AppCompatTextView>(R.id.tv_main)

        tvMain.text = "$testArg---$testArg2"

        return view
    }

}
