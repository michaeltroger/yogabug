package com.michaeltroger.yogabug

import android.app.Application
import com.facebook.soloader.SoLoader

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)
    }
}