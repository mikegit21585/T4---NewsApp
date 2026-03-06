package com.example.t4newsapp.models

// Diferentes tipos de clases, abstract class, open class

// LOGICA DE NEGOCIO
data class News(
    val id : Int,
    val new : String,
    val image : String
)

val news = listOf(
    News(1, "El presidente de EE.UU. no muestra signos de arrepentimiento", ""),
    News(2, "Bañarse en la piscina del desierto de Cleopatra", ""),
    News(3, "GIgantes tecnológicos", ""),
    News(4, "El rover de Marte envía", ""),
    News(5, "Apple presenta nuevo chip", ""),
    News(6, "SpaceX lanza nuevo cohete", "")
)