package com.example.proyectoalbalate.fronts

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
import com.example.proyectoalbalate.ui.theme.MyBrown
import com.example.proyectoalbalate.ui.theme.MyDarkBrown
import com.example.proyectoalbalate.ui.theme.MyGrey
import com.example.proyectoalbalate.ui.theme.MyWhite

@Composable
fun FrontPageU9(navController: NavHostController) {
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
                        text = "U9: While",
                        fontSize = 65.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("Project31")
                            },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P31: 100")
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Button(
                            onClick = { navController.navigate("Project32") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P32: 1 to ?")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = { navController.navigate("Project33") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P33: Sum / Avg")
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project34") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P34: Profiles")
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Button(
                            onClick = { navController.navigate("Project35") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P35: 10 Grades")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = { navController.navigate("Project36") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P36: Heights")
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project37") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P37: Wages")
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Button(
                            onClick = { navController.navigate("Project38") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P38: Series")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = { navController.navigate("Project39") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P39: Eights")
                        }
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project40") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P40: Lists")
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Button(
                            onClick = { navController.navigate("Project41") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P41: Pairs")
                        }
                    }
                }
            }
            Box(modifier = Modifier.fillMaxSize()) {
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU8") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopStart),
                    containerColor = MyGrey,
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
                    onClick = { navController.navigate("FrontPageU10") },
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
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "U9: While",
                        fontSize = 65.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("Project31")
                            },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P31: 100")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project32") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P32: 1 to ?")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project33") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P33: Sum / Avg")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project34") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P34: Profiles")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project35") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P35: 10 Grades")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project36") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P36: Heights")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project37") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P37: Wages")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project38") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P38: Series")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project39") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P39: Eights")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project40") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P40: Lists")
                        }
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Row {
                        Button(
                            onClick = { navController.navigate("Project41") },
                            modifier = Modifier.width(200.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "P41: Pairs")
                        }
                    }
                    Spacer(modifier = Modifier.height(60.dp))
                }

            }
            Box(modifier = Modifier.fillMaxSize()) {
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU8") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomStart),
                    containerColor = MyGrey,
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
                    onClick = { navController.navigate("FrontPageU10") },
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