package com.android.imdadul.aio.ui.home.quotes

import androidx.lifecycle.ViewModel;
import com.android.imdadul.aio.data.repositories.QuotesRepository
import com.android.imdadul.aio.util.lazyDeferred

class QuotesViewModel(
    repository: QuotesRepository
) : ViewModel() {

    val quotes by lazyDeferred {
        repository.getQuotes()
    }
}
