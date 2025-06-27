package com.netanel.pawzplay.baseUI

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.netanel.pawzplay.theme.LocalPawzColors

@Composable
fun PawzButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier
) {
    val colors = LocalPawzColors.current
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = colors.primary,
            contentColor = colors.onPrimary
        ),
        modifier = modifier
    ) {
        Text(text)
    }
}