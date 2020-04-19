package com.android.coderswag.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.TextView
import com.android.coderswag.R
import com.android.coderswag.model.Category

class CategoryAdapter(private val context: Context, private val categories: List<Category>) :
    BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImageView = categoryView.findViewById<ImageView>(R.id.categotyImage)
        val categoryName = categoryView.findViewById<TextView>(R.id.categoryTitle)
        categoryName.text = categories[position].title
        val resourceId =
            context.resources.getIdentifier(categories[position].image, "drawable", context.packageName)
        Log.d("XYZ",resourceId.toString())
        categoryImageView.setImageResource(resourceId)
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

}