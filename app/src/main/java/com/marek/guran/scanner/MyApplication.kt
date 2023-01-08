package com.marek.guran.scanner

import android.annotation.SuppressLint
import android.app.Application
import com.google.android.material.color.DynamicColors

class MyApplication : Application() {

    @SuppressLint("MissingSuperCall")
    override fun onCreate() {
        // Apply dynamic color
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}