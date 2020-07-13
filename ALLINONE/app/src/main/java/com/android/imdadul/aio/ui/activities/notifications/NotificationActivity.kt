package com.android.imdadul.aio.notifications

import android.os.Bundle
import android.util.Log
import com.android.imdadul.aio.R
import com.android.imdadul.aio.activities.BaseActivity
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.InstanceIdResult
import java.io.IOException

//send notification using postman: https://medium.com/android-school/test-fcm-notification-with-postman-f91ba08aacc3
class NotificationActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        initView()
    }

    private fun initView() {

        Thread(Runnable {
            FirebaseInstanceId.getInstance().instanceId.addOnSuccessListener(
                this
            ) { instanceIdResult: InstanceIdResult ->
                val newToken = instanceIdResult.token
                Log.e("----newToken", newToken)
            }
        }).start()
    }
}
