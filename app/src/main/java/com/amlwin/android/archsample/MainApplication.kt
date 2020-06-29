package com.amlwin.android.archsample

import android.app.Application
import timber.log.Timber

/**
 * a touch of amlwin on 08/04/2020.
 * made with <3
 */

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}