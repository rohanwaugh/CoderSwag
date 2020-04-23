package com.android.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.coderswag.R
import com.android.coderswag.adapters.CategoryAdapter
import com.android.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)
        catogoriesListView.adapter = adapter
    }
}
