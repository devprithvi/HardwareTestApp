package com.ipie.hardwaretestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.appbar.MaterialToolbar
import com.ipie.mvvmhardwarelibrary.activity.TestMainActivity

/**
 * Step1: ADD ALL DEPENDENCY in build.gradle(:app) and build.gradle(:Project)
 *
 *
 */





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
//        toolbar.title = "Secure App"
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, TestMainActivity::class.java)
            intent.putExtra("mobileNumber", "2337508060767")
            startActivity(intent)
        }
    }
}
