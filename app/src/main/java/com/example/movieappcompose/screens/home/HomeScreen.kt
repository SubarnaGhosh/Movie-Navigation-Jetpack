package com.example.movieappcompose.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import com.example.movieappcompose.MovieRow
import com.example.movieappcompose.navigations.MovieScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text("Movies")
            },colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.errorContainer) )
        }) {innerPadding ->
        MainContent(Modifier.padding(innerPadding),
            navController = navController)

    }
}
@Composable
fun MainContent(modifier : Modifier = Modifier,
                navController: NavController,
                movieList: List<String> = listOf(
                    "Avatar","Harry Potter","The dark Knight","Joker",
                    "Avatar","Harry Potter","The dark Knight","Joker",
                    "Avatar","Harry Potter","The dark Knight","Joker")) {
    Column(modifier = Modifier.padding(12.dp).padding(top = 60.dp)) {
        LazyColumn {
            items(items = movieList) {
                MovieRow(movie = it) {
                    movie ->
                    navController.navigate(route = MovieScreens.DetailScreen.name+"/$movie")
                }
            }
        }
    }
}