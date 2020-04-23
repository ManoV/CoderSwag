package com.example.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R.layout
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import com.example.coderswag.adapter.CategoryRecycleAdapter
import com.example.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.categoryListView

class MainActivity : AppCompatActivity() {

    lateinit var adaptor : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        adaptor = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }

        categoryListView.adapter = adaptor

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager

        categoryListView.setHasFixedSize(true)
    }


}
