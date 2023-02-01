package com.example.coffee_masters_android

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffee_masters_android.ui.theme.Coffee_Masters_AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Coffee_Masters_AndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   App()
                }
            }
        }
    }
}

// My first Composable to test the Previews
@Preview(showBackground = true)
@Composable
fun FirstComposable(){


    var name = remember {
        mutableStateOf("")
    }

    Column() {
        Text(text = "Hello ${name.value}", modifier = Modifier
            .padding(16.dp)
            .background(androidx.compose.ui.graphics.Color.Yellow)
        )

        TextField(value = name.value, onValueChange = {
            name.value=it
        })
    }

}
