package com.example.coffee_masters_android

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
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
    Scaffold(
        topBar = {
                 TopAppBar{
                     Apptitle()
                 }
        },
        bottomBar ={}
    ){
        OffersPage()
    }

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