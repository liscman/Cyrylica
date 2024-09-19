package com.example.cyrylica

data class Question (
    val question: String,
    val answer: String,
    val firstWrongAnswer: String,
    val secondWrongAnswer: String,
    val thirdWrongAnswer: String,
)