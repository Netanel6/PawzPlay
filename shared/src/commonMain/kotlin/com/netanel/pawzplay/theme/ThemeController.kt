package com.netanel.pawzplay.theme

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

object ThemeController {
    private val _theme = MutableStateFlow<ColorProfile>(ColorProfile.HumanVision)
    val theme: StateFlow<ColorProfile> = _theme

    fun toggle() {
        _theme.value = when (_theme.value) {
            is ColorProfile.HumanVision -> ColorProfile.CatVision
            is ColorProfile.CatVision -> ColorProfile.HumanVision
        }
    }

}
