package com.example.android_course_view

import java.lang.IllegalStateException

class TransliterationHandler {

    companion object {

        fun rus2eng(text: CharSequence): String =
            text.map { RUS_ALPH[it.toString().lowercase()] }.joinToString("")

        fun eng2rus(text: CharSequence): String {
            val engAlphMap = RUS_ALPH.inverseMap()

            var resultString = StringBuilder()

            var i = 0
            while (i < text.length) {
                if (text[i].lowercase() == "j") {
                    i++
                    when (text[i].lowercase()) {
                        "e" -> resultString = resultString.append("ё")
                        "s" -> {
                            resultString.append("щ")
                            i++
                            if (text[i].lowercase() != "h") throw IllegalStateException("Неверная комбинация")
                        }

                        "h" -> resultString.append("ь")
                        "u" -> resultString.append("ю")
                        "a" -> resultString.append("а")
                        else -> throw IllegalStateException("Неверная комбинация")
                    }
                } else if (i + 1 < text.length && text[i].lowercase() == "h" && i + 2 >= text.length) {
                    when (text[i].lowercase()) {
                        "z" -> resultString.append("ж")
                        "k" -> resultString.append("х")
                        "c" -> resultString.append("ч")
                        "s" -> resultString.append("ш")
                        "e" -> resultString.append("э")
                        "h" -> resultString.append("ъ")
                        "i" -> resultString.append("ы")
                        else -> throw IllegalStateException("Неверная комбинация")
                    }
                    i++
                } else {
                    resultString.append(engAlphMap[text[i].lowercase().toString()])
                }
                i++
            }

            return resultString.toString()
        }
    }
}
