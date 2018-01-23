package com.example.enzoteles.arquiteturamvpk.app

import android.app.Application
import com.example.enzoteles.arquiteturamvpk.MainActivityK

/**
 * Created by enzoteles on 16/01/18.
 */
class MyApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: MyApplication
            private set
    }

    object mainActivity {
        lateinit var activity: MainActivityK
            set
    }

}