package com.envr.dicoding.infolaptop

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Laptop(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable