package com.jacrosdevs.layoutjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun SaludoColumn(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(vertical = 36.dp, horizontal = 8.dp)
            .background(Color.Red)
            .fillMaxSize()
    ) {
        Text(
            text = "Hola",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )
        Text(
            text = "Hola ,my name is Jacros."

        )
        Text(
            text = "Adios."

        )
    }
}