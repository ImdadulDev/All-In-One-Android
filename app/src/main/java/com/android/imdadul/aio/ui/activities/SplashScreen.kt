package com.android.imdadul.aio.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.android.imdadul.aio.R


class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(Runnable { // This method will be executed once the timer is over
            // Start home activity
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            // close splash activity
            finish()
        }, 1000)


    }
}
