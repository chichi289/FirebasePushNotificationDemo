package com.chichi289.fcm.models.pushResponse

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("error")
    val error: String?
)