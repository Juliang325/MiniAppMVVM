package com.example.miniappmvvm.model

class QuoteProvider {
    companion object {
        val quotes = listOf<QuoteModel>(
            QuoteModel("Odio Android", "Julian"),
            QuoteModel("Me encanta programar en Android", "Alex"),
            QuoteModel("Las animaciones en Android son geniales", "Emily"),
            QuoteModel("Android Studio es mi mejor amigo", "Luis"),
            QuoteModel("Siempre encuentro soluciones en la documentación de Android", "Ana"),
            QuoteModel("Los fragmentos en Android son fascinantes", "Carlos"),
            QuoteModel("Amo resolver problemas en Kotlin", "Sophia"),
            QuoteModel("Las notificaciones en Android son divertidas de implementar", "Diego"),
            QuoteModel("Kotlin coroutines hacen que el código sea más legible", "Isabella"),
            QuoteModel("Mis aplicaciones Android son mi orgullo", "Gabriel"),
            QuoteModel("Android Jetpack facilita el desarrollo de aplicaciones", "Mia")
        )

        fun random(): QuoteModel {
            val randomIndex = (quotes.indices).random()
            return quotes[randomIndex]
        }
    }
}