package com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag.R
import com.example.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val title = intent.getStringExtra(EXTRA_CATEGORY)
        println("Received $title")
    }
}
