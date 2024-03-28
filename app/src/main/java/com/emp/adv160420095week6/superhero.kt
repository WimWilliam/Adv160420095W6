package com.emp.adv160420095week6

data class superhero(
    val id: Int,
    val nama: String,
    val kekuatan: List<String>,
    val identitas: Identitas,
    val images: String
)
data class Identitas(
    val nama_asli: String,
    val usia: Int,
    val pekerjaan: String
)


