package com.example.dictionary.feature_dictionary.data.remote.dto


import com.google.gson.annotations.SerializedName

data class PhoneticDto(
    @SerializedName("audio")
    val audio: String?,
    @SerializedName("license")
    val license: License?,
    @SerializedName("sourceUrl")
    val sourceUrl: String?,
    @SerializedName("text")
    val text: String?
)