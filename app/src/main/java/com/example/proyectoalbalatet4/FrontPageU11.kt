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
import com.example.proyectoalbalatet4.ui.theme.MyBrown
import com.example.proyectoalbalatet4.ui.theme.MyDarkBrown
import com.example.proyectoalbalatet4.ui.theme.MyWhite

@Composable
fun FrontPageU11(navController: NavHostController) {
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
                        text = "U11: For",
                        fontSize = 65.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("Project47")
                            },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P47: 100")
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Button(
                            onClick = { navController.navigate("Project48") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P48: Average")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = { navController.navigate("Project49") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P49: Grades")
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project50") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P50: 3,5,9")
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Button(
                            onClick = { navController.navigate("Project51") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P51: Pair / Odd")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = { navController.navigate("Project52") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P52: Area")
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project53") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P53: Last 5")
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Button(
                            onClick = { navController.navigate("Project54") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P54: Table 5")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = { navController.navigate("Project55") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P55: N Table")
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project56") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P56: Triangles")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = { navController.navigate("Project57") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P57: Coordinates")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = { navController.navigate("Project58") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P58: 10 Numbers")
                        }
                    }
                }
            }
            Box(modifier = Modifier.fillMaxSize()) {
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU10") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopStart),
                    containerColor = MyBrown,
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
                    onClick = { navController.navigate("FrontPageU12") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopEnd),
                    containerColor = MyBrown,
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
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "U11: For",
                        fontSize = 65.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("Project47")
                            },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P47: 100")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project48") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P48: Average")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project49") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P49: Grades")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project50") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P50: 3,5,9")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project51") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P51: Pair / Odd")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project52") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P52: Area")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project53") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P53: Last 5")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project54") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P54: Table 5")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project55") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P55: N Table")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project56") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P56: Triangles")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project57") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P57: Coordinates")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project58") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P58: 10 Numbers")
                        }
                    }
                    Spacer(modifier = Modifier.height(60.dp))
                }

            }
            Box(modifier = Modifier.fillMaxSize()) {
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU10") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomStart),
                    containerColor = MyBrown,
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
                    onClick = { navController.navigate("FrontPageU12") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomEnd),
                    containerColor = MyBrown,
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