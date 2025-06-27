package com.netanel.pawzplay.baseUI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.netanel.pawzplay.theme.LocalPawzColors

@Composable
fun PawzBackgroundBox(content: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalPawzColors.current.background)
    ) {
        content()
    }
}
