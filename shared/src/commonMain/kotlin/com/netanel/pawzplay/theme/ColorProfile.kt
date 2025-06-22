package com.netanel.pawzplay.theme

sealed class ColorProfile {
    data object HumanVision : ColorProfile()
    data object CatVision : ColorProfile()
}
