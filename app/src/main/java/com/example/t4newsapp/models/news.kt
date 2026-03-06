package com.example.t4newsapp.models

import com.example.t4newsapp.R

// Diferentes tipos de clases, abstract class, open class

// LOGICA DE NEGOCIO
data class News(
    val id : Int,
    val new : String,
    val image : Int
)

val news = listOf(
    News(1, "El presidente de EE.UU. no muestra signos de arrepentimiento", R.drawable.trump),
    News(2, "Bañarse en la piscina del desierto de Cleopatra", R.drawable.cleopatra),
    News(3, "Gigantes tecnológicos", R.drawable.ai_image),
    News(4, "El rover de Marte envía", R.drawable.marte),
    News(5, "Apple presenta nuevo chip", R.drawable.apple),
    News(6, "SpaceX lanza nuevo cohete", R.drawable.spacex)
)