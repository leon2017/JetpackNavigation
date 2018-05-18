package com.wangjun.app.jetpacktodolist.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wangjun.app.jetpacktodolist.R
import com.wangjun.app.jetpacktodolist.ui.setting.SettingFragment

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setting_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, SettingFragment.newInstance())
                    .commitNow()
        }
    }

}
