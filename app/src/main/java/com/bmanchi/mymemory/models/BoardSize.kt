package com.bmanchi.mymemory.models

enum class BoardSize(val numCards: Int) {
    EASY(8)
    ,
    MEDIUM(18)
    ,
    HARD(24)
    ;

    fun getwidth(): Int {
        return when (this) {
            EASY -> 2
            MEDIUM -> 3
            HARD -> 4
        }
    }

    fun getHeight(): Int {
        return numCards / getwidth()
    }

    fun getNumPairs(): Int {
        return numCards / 2
    }
}