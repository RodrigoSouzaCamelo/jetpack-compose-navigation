package br.com.rodrigo.jetpackcomposenavigation.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import br.com.rodrigo.jetpackcomposenavigation.ui.components.BottomNavigation
import br.com.rodrigo.jetpackcomposenavigation.ui.navigation.NavigationGraph

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) }
    ) {
        NavigationGraph(navController = navController)
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}