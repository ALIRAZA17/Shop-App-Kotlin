package com.example.coffee_masters_android

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffee_masters_android.ui.theme.Alternative1
import com.example.coffee_masters_android.ui.theme.Alternative2

//@Preview(showBackground = true, widthDp = 400)


@Preview(showBackground = true)
@Composable
fun OffersPage() {
    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())
    ) {
        Offers(title = "Early Coffee", description = "10% off. Offer valid from 6am to 9am.")
        Offers(title = "Welcome Gift", description = "25% off on your first order.")
        Offers(title = "Welcome Gift", description = "25% off on your first order.")
    }
}


@Composable
fun Offers(title: String, description: String = "") {
    Box(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.background_pattern),
            contentDescription = "Background Pattern",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.matchParentSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h5,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Alternative1)
                    .padding(16.dp)
            )
            Text(
                text = description,
                style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Alternative2    )
                    .padding(16.dp)
            )

        }
    }
}