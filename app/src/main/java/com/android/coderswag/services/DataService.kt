package com.android.coderswag.services

import com.android.coderswag.model.Category
import com.android.coderswag.model.Product
import com.android.coderswag.utility.*

object DataService {

    val categories = listOf(
        Category(SHIRTS, SHIRTS_IMAGE),
        Category(HOODIES, HOODIES_IMAGE),
        Category(HATS, HAT_IMAGE),
        Category(DIGITAL, DIGITAL_IMAGE)
    )

    val hats = listOf(
        Product("Devslops Graphic Beanie","$18","hat01"),
        Product("Devslops Hat Black","$20","hat02"),
        Product("Devslops Hat White","$24","hat03"),
        Product("Devslops Hat Snapback","$25","hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey","$20","hoodie01"),
        Product("Devslopes Hoodie White","$22","hoodie02"),
        Product("Devslopes Hoodie Red","$24","hoodie03"),
        Product("Devslopes Hoodie Black","$26","hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Grey","$20","shirt01"),
        Product("Devslopes Shirt White","$22","shirt02"),
        Product("Devslopes Shirt Red","$24","shirt03"),
        Product("Devslopes Shirt Black","$26","shirt04"),
        Product("Devslops Hustle","$40","shirt05")
    )

}