package com.android.imdadul.aio

import android.app.Application
import com.android.imdadul.aio.data.db.AppDatabase
import com.android.imdadul.aio.data.network.MyApi
import com.android.imdadul.aio.data.network.NetworkConnectionInterceptor
import com.android.imdadul.aio.data.preferences.PreferenceProvider
import com.android.imdadul.aio.data.repositories.QuotesRepository
import com.android.imdadul.aio.data.repositories.UserRepository
import com.android.imdadul.aio.ui.auth.AuthViewModelFactory
import com.android.imdadul.aio.ui.home.profile.ProfileViewModelFactory
import com.android.imdadul.aio.ui.home.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class BaseApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(androidXModule(this@BaseApplication))

        bind() from singleton { NetworkConnectionInterceptor(instance()) }
        bind() from singleton { MyApi(instance()) }
        bind() from singleton { AppDatabase(instance()) }
        bind() from singleton { PreferenceProvider(instance()) }
        bind() from singleton { UserRepository(instance(), instance()) }
        bind() from singleton { QuotesRepository(instance(), instance(), instance()) }
        bind() from provider { AuthViewModelFactory(instance()) }
        bind() from provider { ProfileViewModelFactory(instance()) }
        bind() from provider{ QuotesViewModelFactory(instance())}


    }

}