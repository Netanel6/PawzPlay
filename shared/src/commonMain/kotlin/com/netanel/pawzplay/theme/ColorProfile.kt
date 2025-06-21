package com.netanel.pawzplay.theme

sealed class ColorProfile(val name: String) {
    data object HumanVision : ColorProfile("Human")
    data object CatVision : ColorProfile("Cat")
    // Add more profiles if needed
}
