package com.naveen.saini.newsapp

import android.app.Application
import com.naveen.saini.newsapp.di.components.ApplicationComponet
import com.naveen.saini.newsapp.di.components.DaggerApplicationComponet
import com.naveen.saini.newsapp.di.module.ApplicationModule

class NewsApplication:Application() {
    lateinit var applicationComponet: ApplicationComponet
    override fun onCreate() {
        super.onCreate()
        getDependencies()
    }
    private fun getDependencies(){
        applicationComponet = DaggerApplicationComponet
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()

        applicationComponet.inject(this);
    }
}