package com.android.coderswag.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.coderswag.R
import com.android.coderswag.adapters.CategoryRecyclerviewAdapter
import com.android.coderswag.services.DataService
import com.android.coderswag.utility.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerviewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerviewAdapter(this,DataService.categories){ category->
            val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }
        catogoriesRecyclerview.adapter = adapter
        catogoriesRecyclerview.layoutManager = LinearLayoutManager(this)
        catogoriesRecyclerview.setHasFixedSize(true)
    }

}
