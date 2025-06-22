package com.netanel.pawzplay.theme

import androidx.compose.ui.graphics.Color

object ColorPalette {
    private val palettes = mapOf(
        ColorProfile.HumanVision to PawzColors(
            primary = Color(0xFF6200EE),
            secondary = Color(0xFF03DAC5),
            tertiary = Color(0xFF3700B3),
            background = Color.White,
            onPrimary = Color(0xFFFFFFFF),
            onBackground = Color.Black
        ),
        ColorProfile.CatVision to PawzColors(
            primary = Color(0xFFB6B600),
            secondary = Color(0xFF8F8F00),
            tertiary = Color(0xFF555500),
            background = Color(0xFF1A1A1A),
            onPrimary = Color(0xFF1A1A1A),
            onBackground = Color(0xFFEAEAEA)
        )
    )

    fun get(profile: ColorProfile): PawzColors {
        return palettes[profile] ?: palettes[ColorProfile.HumanVision]!!
    }
}
