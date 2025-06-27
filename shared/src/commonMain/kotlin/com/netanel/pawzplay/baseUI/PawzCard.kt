package com.netanel.pawzplay.baseUI

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.netanel.pawzplay.theme.LocalPawzColors

@Composable
fun PawzCard(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    val colors = LocalPawzColors.current
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = colors.background,
            contentColor = colors.onBackground
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            content()
        }
    }
}