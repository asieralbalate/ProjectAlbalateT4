package com.example.proyectoalbalatet4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Proyecto6() {
    Column(modifier = Modifier.padding(20.dp)) {
        Text(text = "Proyecto 5",textAlign = TextAlign.Center,color= Color.Green,
            fontWeight = FontWeight.Bold)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        var user by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var outcome by remember { mutableStateOf("Inconclusive") }

        OutlinedTextField (
            value = user,
            onValueChange = { user = it },
            label = {
                Text("User name")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField (
            value = password,
            onValueChange = { password = it },
            label = {
                Text("Password")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true,
            visualTransformation = PasswordVisualTransformation()
        )

        Button(
            onClick = {
                var catena = ""
                if (password.length < 10)
                    catena += "Password: at least 10 characters\n"
                if (user.length == 0)
                    catena += "User: empty"
                outcome = catena
            },
            modifier = Modifier.padding(10.dp)
        ) {
            Text(text = "Log in")
        }

        Text(
            text = outcome,
            modifier = Modifier.padding(10.dp)
        )

    }
}
