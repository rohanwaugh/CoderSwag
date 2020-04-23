package com.android.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.coderswag.R
import com.android.coderswag.adapters.CategoryAdapter
import com.android.coderswag.adapters.CategoryRecyclerviewAdapter
import com.android.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerviewAdapter(this,DataService.categories)
        catogoriesListView.adapter = adapter
        catogoriesListView.layoutManager = LinearLayoutManager(this)
        catogoriesListView.setHasFixedSize(true)
    }
}
