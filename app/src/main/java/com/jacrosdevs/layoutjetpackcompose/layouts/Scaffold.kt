package com.jacrosdevs.layoutjetpackcompose.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun ScaffoldLayout(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Green
                ),
                title = {
                    Text(text = "App Bar")
                })
        },
        floatingActionButton = {
            FloatingActionButton(
                shape = CircleShape,
                containerColor = Color.Green,
                onClick = {}
            ) {
                Text(
                    text = "+",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    ) { paddingValues ->
        Box(
            modifier = modifier
                .padding(paddingValues)
                //.background(color = Color.Green)
                .fillMaxSize()
        ) {
            Column {

                ItemContact(name = "Ernesto Jacros", phoneNumber = "123456789")
                ItemContact(name = "Peter Parker", phoneNumber = "123456789")
                ItemContact(name = "Saul Goodman", phoneNumber = "123456789")
                ItemContact(name = "Gonzalo Ramirez", phoneNumber = "123456789")
            }
        }
    }
}

