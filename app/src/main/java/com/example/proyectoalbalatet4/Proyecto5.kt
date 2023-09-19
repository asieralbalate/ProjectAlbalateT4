package com.example.proyectoalbalatet4

import android.content.res.Configuration
import android.view.WindowMetrics
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Proyecto5() {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(modifier = Modifier.padding(20.dp)) {
                Text(
                    text = "Proyecto 5", textAlign = TextAlign.Center, color = Color.Green,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {

                var user by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("Inconclusive") }

                OutlinedTextField(
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

                OutlinedTextField(
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

        else -> {


            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {

                var firstNumber by remember { mutableStateOf("") }
                var secondNumber by remember { mutableStateOf("") }
                var outcome by remember { mutableStateOf("") }

                Row(modifier = Modifier.padding(20.dp)) {
                    Text(
                        text = "Proyecto 5", textAlign = TextAlign.Center, color = Color.Green,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.size(10.dp))
                OutlinedTextField(
                    value = firstNumber,
                    onValueChange = { firstNumber = it },
                    label = {
                        Text("First value")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                OutlinedTextField(
                    value = secondNumber,
                    onValueChange = { secondNumber = it },
                    label = {
                        Text("Second value")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true
                )

                Row(

                ) {

                    Button(
                        onClick = {
                            if (firstNumber.toIntOrNull() != null && secondNumber.toIntOrNull() != null) {
                                var result = 0
                                result = firstNumber.toInt() + secondNumber.toInt()
                                outcome =
                                    "The addition of $firstNumber and $secondNumber equals: $result"
                            } else {
                                outcome = "Introduce numbers please"
                            }
                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Add")
                    }
                    Button(
                        onClick = {
                            if (firstNumber.toIntOrNull() != null && secondNumber.toIntOrNull() != null) {
                                var result = 0
                                result = firstNumber.toInt() * secondNumber.toInt()
                                outcome =
                                    "The multiplication of $firstNumber and $secondNumber equals: $result"
                            } else {
                                outcome = "Introduce numbers please"
                            }
                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Multiply")
                    }
                }
                Text(
                    text = outcome,
                    modifier = Modifier.padding(10.dp)
                )

            }
        }
    }
}
