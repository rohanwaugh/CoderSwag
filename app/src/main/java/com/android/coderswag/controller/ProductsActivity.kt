package com.android.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.coderswag.R
import com.android.coderswag.utility.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val category = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
