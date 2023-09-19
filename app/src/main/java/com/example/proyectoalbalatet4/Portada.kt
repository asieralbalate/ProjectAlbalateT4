package com.example.proyectoalbalatet4

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun Portada(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "T4",
                    fontSize = 50.sp
                )
                Spacer(modifier = Modifier.size(50.dp))
                Row {
                    Button(
                        onClick = {
                            navController.navigate("Proyecto5")
                        },
                        modifier = Modifier.width(200.dp)
                    ) {
                        Text(text = "Proyecto 5")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Proyecto6") },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Proyecto 6")
                        }

                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = { navController.navigate("Proyecto7") },
                        modifier = Modifier.width(200.dp)
                    ) {
                        Text(text = "Proyecto 7")
                    }
                }
            }
        }

        else -> Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "T4",
                fontSize = 50.sp
            )
            Spacer(modifier = Modifier.size(50.dp))
            Row {
                Button(
                    onClick = {
                        navController.navigate("Proyecto5")
                    },
                    modifier = Modifier.width(200.dp)
                ) {
                    Text(text = "Proyecto 5")
                }
                Spacer(modifier = Modifier.width(15.dp))
            }
            Spacer(modifier = Modifier.size(50.dp))
            Row {
                Button(
                    onClick = { navController.navigate("Proyecto6") },
                    modifier = Modifier.width(200.dp)
                ) {
                    Text(text = "Proyecto 6")
                }
                Spacer(modifier = Modifier.width(15.dp))
            }
            Spacer(modifier = Modifier.size(50.dp))
            Row {
                Button(
                    onClick = { navController.navigate("Proyecto7") },
                    modifier = Modifier.width(200.dp)
                ) {
                    Text(text = "Proyecto 7")
                }
                Spacer(modifier = Modifier.width(15.dp))
            }
        }
    }
}





