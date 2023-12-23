package com.dicoding.rempahidonesia

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Rempah(
    val name: String?,
    val description: String?,
    val photo: Int,
    val tv_detail_name: String?,
    val tv_detail_description: String?,
    val img_detail_photo: Int,

) : Parcelable { }
