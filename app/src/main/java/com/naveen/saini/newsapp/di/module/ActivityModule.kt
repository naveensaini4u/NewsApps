package com.naveen.saini.newsapp.di.module

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.naveen.saini.newsapp.di.ActivityContext
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: AppCompatActivity) {
    @ActivityContext
    @Provides
    fun getActivityContext():Context = activity
}