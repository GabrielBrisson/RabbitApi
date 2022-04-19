package com.brisson.data.model

@kotlinx.serialization.Serializable
data class Rabbit(
    val name : String,
    val description : String,
    val imageUrl : String
)
