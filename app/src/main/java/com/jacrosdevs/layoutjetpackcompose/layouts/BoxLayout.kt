package com.jacrosdevs.layoutjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun BoxLayout(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.BottomEnd,
        modifier = modifier
            .padding(vertical = 36.dp, horizontal = 24.dp)
            //.background(Color.Green)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )


    }

    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = modifier
            .padding(vertical = 36.dp, horizontal = 24.dp)
            //.background(Color.Green)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
        )


    }

    Box(
        contentAlignment = Alignment.TopStart,
        modifier = modifier
            .padding(vertical = 36.dp, horizontal = 24.dp)
            //.background(Color.Green)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Yellow)
        )


    }

    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = modifier
            .padding(vertical = 36.dp, horizontal = 24.dp)
            //.background(Color.Green)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Green)
        )


    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .padding(vertical = 36.dp, horizontal = 24.dp)
            //.background(Color.Green)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Magenta)
        )


    }
}