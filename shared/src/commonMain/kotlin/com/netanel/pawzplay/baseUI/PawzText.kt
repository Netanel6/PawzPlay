package com.netanel.pawzplay.baseUI

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.netanel.pawzplay.theme.LocalPawzColors

@Composable
fun PawzText(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 16.sp,
    fontWeight: FontWeight = FontWeight.Normal
) {
    val colors = LocalPawzColors.current
    Text(
        text = text,
        color = colors.onBackground,
        modifier = modifier,
        fontSize = fontSize,
        fontWeight = fontWeight
    )
}