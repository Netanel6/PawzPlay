package com.netanel.pawzplay

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.netanel.pawzplay.home.HomeScreen
import com.netanel.pawzplay.theme.PawzPlayTheme
import com.netanel.pawzplay.theme.ThemeController

@Composable
fun App() {
    val currentProfile by ThemeController.theme.collectAsState()
    PawzPlayTheme(profile = currentProfile) {
        HomeScreen()
    }
}
