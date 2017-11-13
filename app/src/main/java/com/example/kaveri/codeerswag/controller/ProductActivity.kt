package com.example.kaveri.codeerswag.controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import com.example.kaveri.codeerswag.R
import com.example.kaveri.codeerswag.constants.EXTRA_CATEGORY
import com.example.kaveri.codeerswag.model.Category
import com.example.kaveri.codeerswag.services.DataService
import kotlinx.android.synthetic.main.activity_product.*
import layout.ProducRecyclerViewAapter

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : ProducRecyclerViewAapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        initialize()
    }

    private fun initialize() {
        val category = intent.getParcelableExtra<Category>(EXTRA_CATEGORY)
        Toast.makeText(this, category.title, Toast.LENGTH_SHORT).show()

        adapter = ProducRecyclerViewAapter(this, DataService.getProducts(category.title))
        productRecyclerView.adapter = adapter

        var spanCount = 2
        var orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE)
            spanCount = 3

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize>720)
            spanCount=3
        val layoutManager = GridLayoutManager(this, spanCount)
        productRecyclerView.layoutManager = layoutManager

    }

}
