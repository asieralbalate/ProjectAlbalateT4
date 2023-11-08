package com.example.proyectoalbalate.fronts

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.proyectoalbalate.ui.theme.MyBlue
import com.example.proyectoalbalate.ui.theme.MyDarkBrown
import com.example.proyectoalbalate.ui.theme.MyGreen
import com.example.proyectoalbalate.ui.theme.MyPurple
import com.example.proyectoalbalate.ui.theme.MyWhite

@Composable
fun FrontPageU27(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Box(Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "U27: Access",
                        fontSize = 65.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("Project124")
                            },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P124: 5 Numbers")
                        }
                    }
                }
            }
            Box(modifier = Modifier.fillMaxSize()) {
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU26") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopStart),
                    containerColor = MyGreen,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null
                    )
                }
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPage") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomStart),
                    containerColor = MyDarkBrown,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = null
                    )
                }
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU28") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopEnd),
                    containerColor = MyGreen,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null
                    )
                }
            }
        }
        else -> {
            Box(modifier = Modifier
                .fillMaxSize()
                .verticalScroll(
                    rememberScrollState()
                )) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "U27: Access",
                        fontSize = 65.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Column {
                        Button(
                            onClick = {
                                navController.navigate("Project124")
                            },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P124: 5 Numbers")
                        }
                    }
                }
            }
            Box(modifier = Modifier.fillMaxSize()) {
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU26") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomStart),
                    containerColor = MyGreen,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null
                    )
                }
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPage") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomCenter),
                    containerColor = MyDarkBrown,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = null
                    )
                }
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU28") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomEnd),
                    containerColor = MyGreen,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null
                    )
                }
            }
        }
    }
}