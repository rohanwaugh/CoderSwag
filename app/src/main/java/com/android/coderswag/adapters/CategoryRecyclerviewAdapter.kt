package com.android.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.coderswag.R
import com.android.coderswag.model.Category
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecyclerviewAdapter(private val context: Context, private val categories: List<Category>) :
    RecyclerView.Adapter<CategoryRecyclerviewAdapter.CategoryRecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryRecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_list_item,parent,false)
        return CategoryRecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
       return categories.count()
    }

    override fun onBindViewHolder(holder: CategoryRecyclerViewHolder, position: Int) {
        holder.bindCategory(categories[position],context)
    }

    inner class CategoryRecyclerViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categotyImage)
        val categoryTitle = itemView?.findViewById<TextView>(R.id.categoryTitle)

        fun bindCategory(category: Category,context: Context){
            val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryTitle?.text = category.title
        }
    }
}