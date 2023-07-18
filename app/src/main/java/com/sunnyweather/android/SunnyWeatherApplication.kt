package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.media.session.MediaSession.Token

class SunnyWeatherApplication : Application(){

    //companion object 是一个对象，在类初始化时被实例化。 伴生对象不是类的 static 方法，而是类的实例化对象，
    // 所以在其内部可以声明接口，方法也可以被重写，具备面向对象的所有特点。
    companion object {
        @SuppressLint("StaticFieldLeak")
        // lateinit 延迟初始化
        lateinit var context: Context
        const val TOKEN = "66NcpaaikaFbFcM8"

    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}