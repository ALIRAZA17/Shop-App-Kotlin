package com.example.coffee_masters_android

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.coffee_masters_android.pages.InfoPage
import com.example.coffee_masters_android.pages.MenuPage
import com.example.coffee_masters_android.pages.OrderPage
import com.example.coffee_masters_android.ui.theme.Coffee_Masters_AndroidTheme


@Preview
@Composable
fun App_Preview() {
    Coffee_Masters_AndroidTheme {
        App()
    }
}

@Composable
fun App() {
    val mySelectedRoute= remember {
        mutableStateOf(Routes.MenuPage.route)
    }
    Scaffold(
        topBar = {
                 TopAppBar{
                     Apptitle()
                 }
        },
        content = {
            when(mySelectedRoute.value) {
                Routes.MenuPage.route -> MenuPage()
                Routes.offersPage.route -> OffersPage()
                Routes.OrderPage.route -> OrderPage()
                Routes.InfoPage.route -> InfoPage()
            }
        },
        bottomBar ={
            NavBar(
                selectedRoute = mySelectedRoute.value,
                onchange = {
                    newRoute->
                mySelectedRoute.value=newRoute
            })
        }
    )

}


@Composable
fun Apptitle() {
    Box(
        contentAlignment=Alignment.Center,
        modifier = Modifier.fillMaxWidth()
    ){
    Image(painter = painterResource(id = R.drawable.logo),
        contentDescription = "Coffee Masters Logo")
}}