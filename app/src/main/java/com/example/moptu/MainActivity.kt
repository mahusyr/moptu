package com.example.moptu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    lateinit var frags: List<Fragment>
    lateinit var toolbar: MaterialToolbar
    lateinit var currFrag: Int
    lateinit var selectedSeries: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.navbar)
        currFrag = 0

        frags = ListOf(
            TitleFragment(),
            InfoFragment(),
            ImageFragment()
        )
    }
}