package com.example.coderswag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.coderswag.adapter.CategoryAdapter
import com.example.coderswag.model.Category
import com.example.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.categoryListView

class MainActivity : AppCompatActivity() {

    lateinit var adaptor : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adaptor = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adaptor
    }
}
