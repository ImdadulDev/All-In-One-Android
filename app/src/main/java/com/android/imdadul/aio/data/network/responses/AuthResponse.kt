package com.android.imdadul.aio.data.network.responses

import com.android.imdadul.aio.data.db.entities.User

data class AuthResponse(
    val isSuccessful : Boolean?,
    val message: String?,
    val user: User?
)