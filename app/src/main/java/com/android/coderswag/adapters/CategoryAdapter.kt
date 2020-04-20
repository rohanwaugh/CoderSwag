package com.android.coderswag.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.android.coderswag.R
import com.android.coderswag.model.Category

class CategoryAdapter(private val context: Context, private val categories: List<Category>) :
    BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View
        val viewHolder: CategoryViewHolder
        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            viewHolder = CategoryViewHolder()
            viewHolder.categoryImageView = categoryView.findViewById<ImageView>(R.id.categotyImage)
            viewHolder.categoryName = categoryView.findViewById<TextView>(R.id.categoryTitle)
            categoryView.tag = viewHolder
        } else {
            viewHolder = convertView.tag as CategoryViewHolder
            categoryView = convertView
        }
        viewHolder.categoryName?.text = categories[position].title
        val resourceId =
            context.resources.getIdentifier(
                categories[position].image,
                "drawable",
                context.packageName
            )
        viewHolder.categoryImageView?.setImageResource(resourceId)
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

    private class CategoryViewHolder {
        var categoryImageView: ImageView? = null
        var categoryName: TextView? = null
    }

}