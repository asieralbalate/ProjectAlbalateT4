package com.example.proyectoalbalatet4

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun FrontPageU4(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Box(Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "U4",
                        fontSize = 70.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("Project5")
                            },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Project 5")
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Button(
                            onClick = { navController.navigate("Project6") },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Project 6")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = { navController.navigate("Project7") },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Project 7")
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("Project8")
                            },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Project 8")
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Button(
                            onClick = { navController.navigate("Project9") },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Project 9")
                        }
                    }
                }
                FloatingActionButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomStart)
                    // Posicionar en la esquina inferior izquierda
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null
                    )
                }
            }
        }
        else -> {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "U4",
                        fontSize = 70.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("Project5")
                            },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Project 5")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project6") },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Project 6")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project7") },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Project 7")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project8") },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Project 8")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project9") },
                            modifier = Modifier.width(200.dp)
                        ) {
                            Text(text = "Project 9")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                    }
                }
                FloatingActionButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomStart)
                    // Posicionar en la esquina inferior izquierda
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null
                    )
                }
            }
        }
    }
}





