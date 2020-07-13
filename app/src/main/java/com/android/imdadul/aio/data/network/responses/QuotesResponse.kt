package com.android.imdadul.aio.data.network.responses

import com.android.imdadul.aio.data.db.entities.Quote

data class QuotesResponse (
    val isSuccessful: Boolean,
    val quotes: List<Quote>
)