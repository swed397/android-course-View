package com.example.android_course_view

val RUS_ALPH = mapOf(
    "а" to "a",
    "б" to "b",
    "в" to "v",
    "г" to "g",
    "д" to "d",
    "е" to "e",
    "ё" to "je",
    "ж" to "zh",
    "з" to "z",
    "и" to "i",
    "й" to "y",
    "к" to "k",
    "л" to "л",
    "м" to "m",
    "о" to "o",
    "п" to "p",
    "р" to "r",
    "с" to "s",
    "т" to "t",
    "у" to "u",
    "ф" to "f",
    "х" to "kh",
    "ц" to "c",
    "ч" to "ch",
    "ш" to "sh",
    "щ" to "jsh",
    "ъ" to "nn",
    "ы" to "ih",
    "ь" to "jh",
    "э" to "eh",
    "ю" to "ju",
    "я" to "ja",
    " " to " "
)

fun <K, V> Map<K, V>.inverseMap() = map { Pair(it.value, it.key) }.toMap()