package com.netanel.pawzplay

import androidx.compose.ui.window.ComposeUIViewController
import com.netanel.pawzplay.theme.ColorProfile
import com.netanel.pawzplay.theme.PawzPlayTheme
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController {
    PawzPlayTheme(profile = ColorProfile.CatVision) {
        App()
    }
}
