package com.netanel.pawzplay.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.netanel.pawzplay.App
import com.netanel.pawzplay.theme.ColorProfile
import com.netanel.pawzplay.theme.PawzPlayTheme
import com.netanel.pawzplay.theme.ThemeController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    PawzPlayTheme(ColorProfile.HumanVision) {
        App()
    }
}
