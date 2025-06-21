package com.netanel.pawzplay.theme

import androidx.compose.ui.graphics.Color

object ColorPalette {
    private val palettes = mapOf(
        ColorProfile.HumanVision to PawzColors(
            primary = Color(0xFF6750A4),     // Material 3 primary
            secondary = Color(0xFF625B71),   // M3 secondary
            tertiary = Color(0xFF7D5260),    // M3 tertiary
            background = Color(0xFFFFFFFF),  // White background
            onPrimary = Color(0xFFFFFFFF),   // White text on primary
            onBackground = Color(0xFF000000) // Black text on background
        ),
        ColorProfile.CatVision to PawzColors(
            primary = Color(0xFFCCCC33),     // Yellow-green (visible to cats)
            secondary = Color(0xFF99994D),   // Olive-gray (visible to cats)
            tertiary = Color(0xFF666633),    // Earthy tone (visible to cats)
            background = Color(0xFFF0F0D9),  // Slight off-white (low blue)
            onPrimary = Color(0xFF1A1A1A),   // Almost black
            onBackground = Color(0xFF1A1A1A) // Same for contrast
        )
    )
    fun get(profile: ColorProfile): PawzColors {
        return palettes[profile] ?: palettes[ColorProfile.HumanVision]!!
    }
}
