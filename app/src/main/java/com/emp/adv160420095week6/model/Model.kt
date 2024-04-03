package com.emp.adv160420095week6.model

import com.google.gson.annotations.SerializedName

data class Superhero(
val id: Int,
@SerializedName("nama")
val nama: String,
val kekuatan: List<String>,
val identitas: Identitas,
@SerializedName("photo")
val images: String
)

data class Identitas(
    val nama_asli: String,
    val usia: Int,
    val pekerjaan: String
)