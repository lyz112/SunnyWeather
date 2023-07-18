package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

// data class 只保存数据的类
data class PlaceResponse(val status: String, val places: List<Place>)

// @SerializedName("formatted_address") 使用了@SerializedName注解的方式，来让JSON字段和Kotlin字段之间建立映射关系
data class Place(val name: String, val location: String,@SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)
