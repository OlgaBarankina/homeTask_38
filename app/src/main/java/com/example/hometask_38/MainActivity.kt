package com.example.hometask_38

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val pages = arrayListOf<Page>(
            Page("Умножение на", "1", BitmapFactory.decodeResource(resources, R.drawable.multiply1),BitmapFactory.decodeResource(resources, R.drawable.math)),
            Page("Умножение на", "2", BitmapFactory.decodeResource(resources, R.drawable.multiply2), BitmapFactory.decodeResource(resources, R.drawable.math)),
            Page("Умножение на", "3", BitmapFactory.decodeResource(resources, R.drawable.multiply3),BitmapFactory.decodeResource(resources, R.drawable.math)),
            Page("Умножение на", "4", BitmapFactory.decodeResource(resources, R.drawable.multiply4),BitmapFactory.decodeResource(resources, R.drawable.math)),
            Page("Умножение на", "5", BitmapFactory.decodeResource(resources, R.drawable.multiply5),BitmapFactory.decodeResource(resources, R.drawable.math)),
            Page("Умножение на", "6", BitmapFactory.decodeResource(resources, R.drawable.multiply6),BitmapFactory.decodeResource(resources, R.drawable.math)),
            Page("Умножение на", "7", BitmapFactory.decodeResource(resources, R.drawable.multiply7),BitmapFactory.decodeResource(resources, R.drawable.math)),
            Page("Умножение на", "8", BitmapFactory.decodeResource(resources, R.drawable.multiply8),BitmapFactory.decodeResource(resources, R.drawable.math)),
            Page("Умножение на", "9", BitmapFactory.decodeResource(resources, R.drawable.multiply9),BitmapFactory.decodeResource(resources, R.drawable.math)),
            Page("Умножение на", "10", BitmapFactory.decodeResource(resources, R.drawable.multiply10),BitmapFactory.decodeResource(resources, R.drawable.math))
        )

       vpMath.adapter = PagesAdapter(pages, supportFragmentManager)


    }

}