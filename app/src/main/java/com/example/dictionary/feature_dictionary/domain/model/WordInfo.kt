package com.example.dictionary.feature_dictionary.domain.model

import com.example.dictionary.feature_dictionary.data.remote.dto.License

data class WordInfo(
    val license: License?,
    val meanings: List<Meaning>?,
    val phonetic: String?,
    val sourceUrls: List<String>?,
    val word: String?
)
