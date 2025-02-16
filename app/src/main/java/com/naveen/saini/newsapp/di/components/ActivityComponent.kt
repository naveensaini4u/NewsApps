package com.naveen.saini.newsapp.di.components

import androidx.appcompat.app.AppCompatActivity
import com.naveen.saini.newsapp.MainActivity
import com.naveen.saini.newsapp.di.ActivityScope
import com.naveen.saini.newsapp.di.module.ActivityModule
import com.naveen.saini.newsapp.di.module.ApplicationModule
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponet::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity:AppCompatActivity)
}