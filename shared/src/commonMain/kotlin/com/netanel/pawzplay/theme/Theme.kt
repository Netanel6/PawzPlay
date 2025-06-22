package com.netanel.pawzplay.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val LocalPawzColors = staticCompositionLocalOf { ColorPalette.get(ColorProfile.HumanVision) }

@Composable
fun PawzPlayTheme(
    profile: ColorProfile,
    content: @Composable () -> Unit
) {
    val colors = ColorPalette.get(profile)

    val materialColorScheme = if (profile == ColorProfile.CatVision) {
        darkColorScheme(
            primary = colors.primary,
            secondary = colors.secondary,
            tertiary = colors.tertiary,
            background = colors.background,
            onBackground = colors.onBackground
        )
    } else {
        lightColorScheme(
            primary = colors.primary,
            secondary = colors.secondary,
            tertiary = colors.tertiary,
            background = colors.background,
            onBackground = colors.onBackground
        )
    }

    val typography = Typography(
        bodyMedium = TextStyle(
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    )

    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp)
    )

    CompositionLocalProvider(LocalPawzColors provides colors) {
        MaterialTheme(
            colorScheme = materialColorScheme,
            typography = typography,
            shapes = shapes,
            content = content
        )
    }
}
