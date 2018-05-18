package com.wangjun.app.jetpacktodolist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.wangjun.app.jetpacktodolist.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }


    override fun onSupportNavigateUp()
            = Navigation.findNavController(this, R.id.my_nav_host_fragment).navigateUp()
}
