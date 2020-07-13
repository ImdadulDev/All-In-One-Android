package com.android.imdadul.aio.ui.auth

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.android.imdadul.aio.data.db.entities.User
import com.android.imdadul.aio.data.repositories.UserRepository


class AuthViewModel(
    private val repository: UserRepository
) : ViewModel() {

    fun getLoggedInUser() = repository.getUser()

    suspend fun userLogin(
        email: String,
        password: String
    ) = withContext(Dispatchers.IO) { repository.userLogin(email, password) }

    suspend fun userSignup(
        name: String,
        email: String,
        password: String
    ) = withContext(Dispatchers.IO) { repository.userSignup(name, email, password) }

    suspend fun saveLoggedInUser(user: User) = repository.saveUser(user)

}