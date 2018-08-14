package com.alanyuan.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import io.flutter.facade.Flutter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ft = supportFragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.layout_root, Flutter.createFragment("/a"))
        ft.replace(R.id.layout_root, Flutter.createFragment("/b"))
        ft.commit()
    }
}
