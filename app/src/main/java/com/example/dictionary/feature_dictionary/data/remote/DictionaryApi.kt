package com.example.dictionary.feature_dictionary.data.remote

import com.example.dictionary.feature_dictionary.data.remote.dto.WordInfoDtoItem
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {
    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(@Path("word") word: String): List<WordInfoDtoItem>
}