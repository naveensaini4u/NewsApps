package com.naveen.saini.newsapp.di.components

import com.naveen.saini.newsapp.NewsApplication
import com.naveen.saini.newsapp.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponet {
    fun inject(application: NewsApplication)

}