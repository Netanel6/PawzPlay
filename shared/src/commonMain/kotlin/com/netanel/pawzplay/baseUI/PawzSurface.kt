package com.netanel.pawzplay.baseUI

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.netanel.pawzplay.theme.LocalPawzColors

@Composable
fun PawzSurface(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val colors = LocalPawzColors.current
    Surface(
        modifier = modifier,
        color = colors.background,
        contentColor = colors.onBackground
    ) {
        content()
    }
}
