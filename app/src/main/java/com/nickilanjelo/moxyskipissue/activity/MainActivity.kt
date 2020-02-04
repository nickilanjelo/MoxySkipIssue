package com.nickilanjelo.moxyskipissue.activity

import android.os.Bundle
import com.nickilanjelo.moxyskipissue.R
import moxy.MvpAppCompatActivity

class MainActivity : MvpAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
