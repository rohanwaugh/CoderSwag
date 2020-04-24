package com.android.coderswag.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import com.android.coderswag.R
import com.android.coderswag.adapters.ProductRecyclerviewAdapter
import com.android.coderswag.services.DataService
import com.android.coderswag.utility.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var productAdapter: ProductRecyclerviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val category = intent.getStringExtra(EXTRA_CATEGORY)
        productAdapter = ProductRecyclerviewAdapter(this,DataService.getProducts(category))
        val orientation = resources.configuration.orientation
        val spanCount = if(orientation == Configuration.ORIENTATION_LANDSCAPE) 3 else 2
        val layoutManager = GridLayoutManager(this,spanCount)
        productsRecyclerview.layoutManager = layoutManager
        productsRecyclerview.adapter = productAdapter
    }
}
