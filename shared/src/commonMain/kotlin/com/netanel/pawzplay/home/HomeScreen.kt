package com.netanel.pawzplay.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.netanel.pawzplay.theme.ColorProfile
import com.netanel.pawzplay.theme.LocalPawzColors
import com.netanel.pawzplay.theme.ThemeController

@Composable
fun HomeScreen() {
    val isCatVision by remember { derivedStateOf { ThemeController.theme.value == ColorProfile.CatVision } }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Welcome to PawzPlay 🐾", color = LocalPawzColors.current.primary)

        Spacer(modifier = Modifier.height(16.dp))

        Switch(
            checked = isCatVision,
            onCheckedChange = { ThemeController.toggle() }
        )
    }
}