package com.example.fragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentapp.fragment.Fragment1
import com.example.fragmentapp.fragment.Fragment2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.Button1)
        val btn2 = findViewById<Button>(R.id.Button2)

        btn1.setOnClickListener(){
            val fragment1 : Fragment = Fragment1()

            val fragmentTransactions : FragmentTransaction =
                supportFragmentManager.beginTransaction()

            fragmentTransactions.replace(R.id.frame1,fragment1)
                .commit()
        }

        btn2.setOnClickListener(){
            val fragment2 : Fragment = Fragment2()

            val fragmentTransactions : FragmentTransaction =
                supportFragmentManager.beginTransaction()

            fragmentTransactions.replace(R.id.frame2,fragment2)
                .commit()
        }

    }
}