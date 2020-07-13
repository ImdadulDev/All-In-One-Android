package com.android.imdadul.aio.ui.activities

import android.content.Context
import android.net.wifi.WifiManager
import android.os.Bundle
import com.android.imdadul.aio.R
import com.android.imdadul.aio.internetconnection.NetworkSensingBaseActivity

class MainActivity : NetworkSensingBaseActivity() {

    private val wm by lazy {
        applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
