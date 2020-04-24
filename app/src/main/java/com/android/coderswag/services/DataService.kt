package com.android.coderswag.services

import com.android.coderswag.model.Category
import com.android.coderswag.model.Product
import com.android.coderswag.utility.*

object DataService {

    val categories = listOf(
        Category(SHIRTS, SHIRTS_IMAGE),
        Category(HOODIES, HOODIES_IMAGE),
        Category(HATS, HAT_IMAGE),
        Category(DIGITAL, DIGITAL_IMAGE),
        Category(SHIRTS, SHIRTS_IMAGE),
        Category(HOODIES, HOODIES_IMAGE),
        Category(HATS, HAT_IMAGE),
        Category(DIGITAL, DIGITAL_IMAGE),
        Category(SHIRTS, SHIRTS_IMAGE),
        Category(HOODIES, HOODIES_IMAGE),
        Category(HATS, HAT_IMAGE),
        Category(DIGITAL, DIGITAL_IMAGE)
    )

    val hats = listOf(
        Product("Devslops Graphic Beanie", "$18", "hat1"),
        Product("Devslops Hat Black", "$20", "hat2"),
        Product("Devslops Hat White", "$24", "hat3"),
        Product("Devslops Hat Snapback", "$25", "hat4"),
        Product("Devslops Graphic Beanie", "$18", "hat1"),
        Product("Devslops Hat Black", "$20", "hat2"),
        Product("Devslops Hat White", "$24", "hat3"),
        Product("Devslops Hat Snapback", "$25", "hat4"),
        Product("Devslops Graphic Beanie", "$18", "hat1"),
        Product("Devslops Hat Black", "$20", "hat2"),
        Product("Devslops Hat White", "$24", "hat3"),
        Product("Devslops Hat Snapback", "$25", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "$20", "hoodie1"),
        Product("Devslopes Hoodie White", "$22", "hoodie2"),
        Product("Devslopes Hoodie Red", "$24", "hoodie3"),
        Product("Devslopes Hoodie Black", "$26", "hoodie4"),
        Product("Devslopes Hoodie Grey", "$20", "hoodie1"),
        Product("Devslopes Hoodie White", "$22", "hoodie2"),
        Product("Devslopes Hoodie Red", "$24", "hoodie3"),
        Product("Devslopes Hoodie Black", "$26", "hoodie4"),
        Product("Devslopes Hoodie Grey", "$20", "hoodie1"),
        Product("Devslopes Hoodie White", "$22", "hoodie2"),
        Product("Devslopes Hoodie Red", "$24", "hoodie3"),
        Product("Devslopes Hoodie Black", "$26", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Grey", "$20", "shirt1"),
        Product("Devslopes Shirt White", "$22", "shirt2"),
        Product("Devslopes Shirt Red", "$24", "shirt3"),
        Product("Devslopes Shirt Black", "$26", "shirt4"),
        Product("Devslops Hustle", "$40", "shirt5"),
        Product("Devslopes Shirt Grey", "$20", "shirt1"),
        Product("Devslopes Shirt White", "$22", "shirt2"),
        Product("Devslopes Shirt Red", "$24", "shirt3"),
        Product("Devslopes Shirt Black", "$26", "shirt4"),
        Product("Devslops Hustle", "$40", "shirt5"),
        Product("Devslopes Shirt Grey", "$20", "shirt1"),
        Product("Devslopes Shirt White", "$22", "shirt2"),
        Product("Devslopes Shirt Red", "$24", "shirt3"),
        Product("Devslopes Shirt Black", "$26", "shirt4"),
        Product("Devslops Hustle", "$40", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String?): List<Product> {

        return when (category) {
            SHIRTS -> shirts
            HATS -> hats
            HOODIES -> hoodies
            else -> digitalGoods
        }
    }

}