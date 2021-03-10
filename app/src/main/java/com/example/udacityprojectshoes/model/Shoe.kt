package com.example.udacityprojectshoes.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Shoe (var name: String?, var description: String) : Parcelable