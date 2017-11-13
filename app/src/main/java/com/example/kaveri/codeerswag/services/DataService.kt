package com.example.kaveri.codeerswag.services

import com.example.kaveri.codeerswag.model.Category
import com.example.kaveri.codeerswag.model.Product

/**
 * Created by KAVERI on 11/12/2017.
 */
object DataService {
    val categories = listOf<Category>(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf<Product>(
            Product("Devslpoes graphic viny","18$","hat1"),
            Product("Devslpoes graphic hat black","28$","hat2"),
            Product("Devslpoes graphic hat snap back","20$","hat3"),
            Product("Devslpoes graphic hat zero","25$","hat4")
            )

    val hoodies = listOf<Product>(
            Product("Devslpoes Hoodie grey","18$","hoodie1"),
            Product("Devslpoes Hoodie red","30$","hoodie2"),
            Product("Devslpoes Hoodie white","28$","hoodie3"),
            Product("Devslpoes blue Hoodie","20$","hoodie4")
    )
    val shirts = listOf<Product>(

            Product("Devslpoes Shirt black","18$","shirt1"),
            Product("Devslpoes Shirt white","28$","shirt2"),
            Product("Devslpoes Shirt grey","38$","shirt3"),
            Product("Devslpoes Shirt red","25$","shirt4"),
            Product("Devslpoes Shirt blue","20$","shirt5")
    )

    fun getProducts(category: String?): List<Product> {
        /*if(category?.equals(categories[0].title)!!) {
            return shirts
        } else if(category?.equals(categories[1].title)!!) {
            return hoodies
        } else if(category?.equals(categories[2].title)!!) {
            return hats
        } else
            return listOf<Product>()
*/
        return when(category) {
            categories[0].title ->  shirts
            categories[1].title ->  hoodies
            categories[2].title ->  hats
            else -> listOf<Product>()
        }

    }
}