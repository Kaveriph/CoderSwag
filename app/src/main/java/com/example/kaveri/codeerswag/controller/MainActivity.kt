package com.example.kaveri.codeerswag.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.kaveri.codeerswag.R
import com.example.kaveri.codeerswag.adapter.CategoryAdapter
import com.example.kaveri.codeerswag.constants.EXTRA_CATEGORY
import com.example.kaveri.codeerswag.model.Category
import com.example.kaveri.codeerswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialise()
    }

    fun initialise() {
        adapter = CategoryAdapter(this, DataService.categories)
        categoriesList.adapter = adapter

        categoriesList.setOnItemClickListener { adapterView, view, i, l ->
         val category = DataService.categories.get(i)
            val intent = Intent(this, ProductActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY,category)
            startActivity(intent)
        }

    }
}
