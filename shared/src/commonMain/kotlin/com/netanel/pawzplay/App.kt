package com.netanel.pawzplay

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.netanel.pawzplay.theme.LocalPawzColors

@Composable
fun App() {
    val colors = LocalPawzColors.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.background)
            .padding(24.dp)
    ) {
        Text(
            modifier = Modifier.padding(top = 24.dp),
            text = "Welcome to PawzPlay 🐾",
            color = colors.onBackground
        )
    }
}
