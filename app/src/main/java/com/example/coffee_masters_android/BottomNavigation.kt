package com.example.coffee_masters_android

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee_masters_android.Routes.pages
import com.example.coffee_masters_android.ui.theme.Alternative1
import com.example.coffee_masters_android.ui.theme.OnPrimary

data class NavPage(
    var name:String,
    var icon:ImageVector,
    var route:String,
)


object Routes{
    val MenuPage=NavPage("Menu", Icons.Outlined.Menu,"menu")
    val offersPage=NavPage("Offers", Icons.Outlined.Star,"offers")
    val OrderPage=NavPage("My Order", Icons.Outlined.ShoppingCart,"orders")
    val InfoPage=NavPage("Info", Icons.Outlined.Info,"info")

    val pages= listOf(MenuPage,offersPage, OrderPage, InfoPage)
}

@Preview
@Composable
fun NavbarItem_Preview() {
    NavBarItem(page = Routes.offersPage)
}

@Composable
fun NavBar(selectedRoute: String=Routes.MenuPage.route,onchange:(String)->Unit) {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier.fillMaxWidth().background(MaterialTheme.colors.primary).padding(16.dp)
    ) {
        for (page in Routes.pages){
            NavBarItem(
                page = page,
                selected = selectedRoute==page.route,
                modifier = Modifier.clickable {
                    onchange(page.route)
                }

            )
        }
    }
}

@Composable
fun NavBarItem(page: NavPage, selected: Boolean = false, modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(horizontal = 12.dp)) {
        Image(
            imageVector = page.icon,
            contentDescription = page.name,
            colorFilter = ColorFilter.tint(
                if (selected) OnPrimary else Alternative1
            ),
            modifier = Modifier
                .padding(bottom = 8.dp)
                .size(24.dp)
        )
        Text(page.name,
            fontSize = 12.sp,
            color = if (selected) OnPrimary else Alternative1
        )
    }
}