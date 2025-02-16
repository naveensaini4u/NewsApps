package com.naveen.saini.newsapp.di.module

import android.content.Context
import com.naveen.saini.newsapp.NewsApplication
import com.naveen.saini.newsapp.di.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: NewsApplication) {

    @ApplicationContext
    @Provides
    fun getApplicationContext():Context = application


}