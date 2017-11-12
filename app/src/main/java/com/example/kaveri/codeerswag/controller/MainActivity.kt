package com.example.kaveri.codeerswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.kaveri.codeerswag.R
import com.example.kaveri.codeerswag.model.Category
import com.example.kaveri.codeerswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialise()
    }

    fun initialise() {
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)
        categoriesList.adapter = adapter
    }
}
