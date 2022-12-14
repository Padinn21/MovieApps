package com.example.movieapps.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ResponseUserItem(
    @SerializedName("address")
    val address: String,
    @SerializedName("age")
    val age: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("username")
    val username: String
) : Serializable