package com.example.splashscreentest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

//參考
//https://itnext.io/a-comprehensive-guide-to-android-12s-splash-screen-api-644609c811fa
//本sample內的anim_drawable_path好像有問題不會動，換成其他動圖應該就ok了
/*
    建立splash_theme，由於31(android 12)以上才能使用動圖所以分為一般跟v31
    如果有light跟night模式需求可再細分
    把manifest的theme改成splash_theme
    launch activity在onCreate內super.OnCreate()前加上installSplashScreen()
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // Enable support for Splash Screen API for
        // proper Android 12+ support
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}