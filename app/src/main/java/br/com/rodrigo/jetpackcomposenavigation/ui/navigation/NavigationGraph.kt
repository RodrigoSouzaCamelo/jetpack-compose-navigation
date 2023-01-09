package br.com.rodrigo.jetpackcomposenavigation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.rodrigo.jetpackcomposenavigation.ui.screens.*

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomNavItem.Home.screenRoute
    ) {
        composable(BottomNavItem.Home.screenRoute) {
            HomeScreen()
        }
        composable(BottomNavItem.MyNetwork.screenRoute) {
            NetworkScreen()
        }
        composable(BottomNavItem.AddPost.screenRoute) {
            AddPostScreen()
        }
        composable(BottomNavItem.Notification.screenRoute) {
            NotificationScreen()
        }
        composable(BottomNavItem.Jobs.screenRoute) {
            JobScreen()
        }
    }
}