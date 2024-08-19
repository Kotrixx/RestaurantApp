package com.example.restaurantapp.ui.order.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.restaurantapp.Greeting
import com.example.restaurantapp.ui.theme.RestaurantAppTheme

@Composable
fun OrderScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        GreetingPreview()
    }

}


@Composable
fun GreetingPreview() {
    RestaurantAppTheme {
        Greeting("Order")
    }
}