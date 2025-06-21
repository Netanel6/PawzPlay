package com.netanel.pawzplay.util

import androidx.compose.ui.graphics.Color

fun String.toColor(): Color {
    val colorLong = removePrefix("#").toLong(16)
    return if (length == 9) { // e.g. #AARRGGBB
        Color(colorLong)
    } else { // e.g. #RRGGBB
        Color(colorLong or 0x00000000FF000000)
    }
}
