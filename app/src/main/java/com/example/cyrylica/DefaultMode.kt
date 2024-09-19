package com.example.cyrylica

import kotlin.random.Random
import kotlin.random.nextInt

class DefaultMode {
    private val questions = listOf(
        Pair("А а", "a"),
        Pair("Б б", "b"),
        Pair("В в", "w"),
        Pair("Г г", "g"),
        Pair("Д д", "d"),
        Pair("Е е", "je"),
        Pair("Ё ё", "jo"),
        Pair("Ж ж", "ż"),
        Pair("З з", "z"),
        Pair("И и", "i"),
        Pair("Й й", "j"),
        Pair("К к", "k"),
        Pair("Л л", "l, ł"),
        Pair("М м", "m"),
        Pair("Н н", "n"),
        Pair("О о", "o"),
        Pair("П п", "p"),
        Pair("Р р", "r"),
        Pair("С с", "s"),
        Pair("Т т", "t"),
        Pair("У у", "u"),
        Pair("Ф ф", "f"),
        Pair("Х х", "ch"),
        Pair("Ц ц", "c"),
        Pair("Ч ч", "cz"),
        Pair("Ш ш", "sz"),
        Pair("Щ щ", "szcz"),
        Pair("Ъ ъ", "[twardy znak]"),
        Pair("Ы ы", "y"),
        Pair("Ь ь", "[miękki znak]"),
        Pair("Э э", "e"),
        Pair("Ю ю", "ju"),
        Pair("Я я", "ja"),
    )


    fun getQuestion(): Question{
        val i = Random.nextInt(questions.indices)
        return Question(
            questions[i].first,
            questions[i].second,
            questions.random().second,
            questions.random().second,
            questions.random().second,
        )
    }
}