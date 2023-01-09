package br.com.rodrigo.jetpackcomposenavigation.ui.navigation

import androidx.annotation.DrawableRes
import br.com.rodrigo.jetpackcomposenavigation.R

sealed class BottomNavItem(
    val title: String,
    @DrawableRes val icon: Int,
    val screenRoute: String
) {
    object Home : BottomNavItem("Home", R.drawable.ic_home, "home")
    object MyNetwork : BottomNavItem("My Network", R.drawable.ic_my_network, "my_network")
    object AddPost : BottomNavItem("Post", R.drawable.ic_post, "add_post")
    object Notification : BottomNavItem("Notification", R.drawable.ic_notification, "notification")
    object Jobs : BottomNavItem("Jobs", R.drawable.ic_job, "jobs")
}