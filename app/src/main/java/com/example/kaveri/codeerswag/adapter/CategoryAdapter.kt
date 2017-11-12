package com.example.kaveri.codeerswag.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.kaveri.codeerswag.R
import com.example.kaveri.codeerswag.model.Category

/**
 * Created by KAVERI on 11/12/2017.
 */
class CategoryAdapter(val context : Context,val categories:List<Category>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var categoryView:View
        var viewHolder:ViewHolder
        if(convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.layout_category_list, null)
            viewHolder = ViewHolder()
            viewHolder.categoryImage = categoryView.findViewById(R.id.categoryimage)
            viewHolder.categoryName = categoryView.findViewById(R.id.categoryNameTxt)
            categoryView.tag = viewHolder
            Log.d("CategoryAdapter","Creating")
        } else {
            viewHolder = convertView.tag as ViewHolder
            categoryView = convertView
            Log.d("CategoryAdapter","Reusing")
        }
        val category = categories[position]
        viewHolder.categoryName?.text = category.title
        val resourceId = context.resources.getIdentifier(category.image,"drawable", context.packageName)
        viewHolder.categoryImage?.setImageResource(resourceId)
1
        return categoryView
    }

    override fun getItem(position: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return categories.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.size
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder {
        var categoryImage :ImageView? = null
        var categoryName : TextView? = null
    }
}