package com.example.restaurantapp.ui.myaccount.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.restaurantapp.Greeting

@Composable
fun MyAccountScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        GreetingAccount()
    }

}


@Composable
fun GreetingAccount() {
    Greeting("Account")

}