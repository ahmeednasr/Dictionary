package com.example.dictionary.feature_dictionary.data.remote.dto


import com.google.gson.annotations.SerializedName

data class License(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)