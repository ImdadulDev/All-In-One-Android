package com.android.imdadul.aio.ui.home.profile

import androidx.lifecycle.ViewModel;
import com.android.imdadul.aio.data.repositories.UserRepository

class ProfileViewModel(
    repository: UserRepository
) : ViewModel() {

    val user = repository.getUser()

}
