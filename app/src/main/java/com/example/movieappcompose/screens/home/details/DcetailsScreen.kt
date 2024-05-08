package com.example.movieappcompose.screens.home.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController,movieData :String?) {

    Scaffold(topBar = {
        TopAppBar(title = {},colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.errorContainer),
            navigationIcon = { MyBack(navController) })
    }) {it
        Surface(modifier = Modifier.fillMaxSize()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(movieData.toString(), style = MaterialTheme.typography.titleLarge)
        }

    }
    }
}
@Composable
fun MyBack(navController: NavController) {
    Row(horizontalArrangement = Arrangement.Start) {
    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow Back",
        modifier = Modifier.clickable {
            navController.popBackStack()
        })
}}

//


