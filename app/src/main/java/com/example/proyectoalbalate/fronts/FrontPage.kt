package com.example.proyectoalbalate.fronts

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.proyectoalbalate.ui.theme.MyBlue
import com.example.proyectoalbalate.ui.theme.MyBrown
import com.example.proyectoalbalate.ui.theme.MyDarkBrown
import com.example.proyectoalbalate.ui.theme.MyGreen
import com.example.proyectoalbalate.ui.theme.MyGrey
import com.example.proyectoalbalate.ui.theme.MyPurple
import com.example.proyectoalbalate.ui.theme.MyRed
import com.example.proyectoalbalate.ui.theme.MyWhite

@Composable
fun FrontPage(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    var isMenuVisible by remember { mutableStateOf(false) }
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Kotlin",
                        fontSize = 70.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGrey, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U4: Console")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU5")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U5: If")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU6")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U6: If (expression)",
                                fontSize = 12.sp)
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU7")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U7: If (nested)")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU8")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGrey, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U8: If (operator)")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU9")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U9: While")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU10")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U10: Do/While")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU11")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U11: For")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU12")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U12: When")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU13")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U13: When*")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU14")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyPurple, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U14: Functions")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU15")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text( text = "U15: Param.")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU16")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U16: Return")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU17")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U17: Expression")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU18")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U18: Default")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU19")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U19: Args")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU20")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U20: Local")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU21")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyPurple, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U21: Arrays")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU22")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U22: Return")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU23")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U23: Objects")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU24")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U24: Construct")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU25")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U25: Methods")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU26")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U26: Interclass")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU27")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U27: Access")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU28")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U28: Set / Get")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU29")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U29: Data Class")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU30")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U30:Enum Cl.")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 31")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 32")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 33")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 34")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 35")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 36")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 37")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 38")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 39")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 40")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 41")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 42")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 43")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 44")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 45")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 46")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 47")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 48")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit ")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit ")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit ")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                }
                FloatingActionButton(
                    onClick = { isMenuVisible = !isMenuVisible },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopStart),
                    containerColor = MyDarkBrown,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null
                    )
                }
                if (isMenuVisible) {
                    Box(
                        modifier = Modifier
                            .height(70.dp)
                            .fillMaxSize()
                            .background(color = Color.White, shape = RectangleShape)
                            .align(Alignment.BottomCenter)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            verticalArrangement = Arrangement.spacedBy(4.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row {
                                Text(text = "Unit Colors")
                            }
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Surface(
                                    modifier = Modifier
                                        .height(10.dp)
                                        .width(10.dp),
                                    color = MyBrown
                                ) {
                                }
                                Text(
                                    text = "Structures",
                                    modifier = Modifier.padding(start = 8.dp, end = 35.dp)
                                )
                                Surface(
                                    modifier = Modifier
                                        .height(10.dp)
                                        .width(10.dp),
                                    color = MyBlue
                                ) {
                                }
                                Text(
                                    text = "Functions",
                                    modifier = Modifier.padding(start = 8.dp, end = 35.dp)
                                )
                                Surface(
                                    modifier = Modifier
                                        .height(10.dp)
                                        .width(10.dp),
                                    color = MyGreen
                                ) {
                                }
                                Text(
                                    text = "POO",
                                    modifier = Modifier.padding(start = 8.dp, end = 35.dp)
                                )
                                Surface(
                                    modifier = Modifier
                                        .height(10.dp)
                                        .width(10.dp),
                                    color = MyPurple
                                ) {
                                }
                                Text(
                                    text = "Concepts",
                                    modifier = Modifier.padding(start = 8.dp, end = 35.dp)
                                )
                                Surface(
                                    modifier = Modifier
                                        .height(10.dp)
                                        .width(10.dp),
                                    color = MyRed
                                ) {
                                }
                                Text(
                                    text = "Expressions",
                                    modifier = Modifier.padding(start = 8.dp, end = 35.dp)
                                )
                                Surface(
                                    modifier = Modifier
                                        .height(10.dp)
                                        .width(10.dp),
                                    color = MyGrey
                                ) {
                                }
                                Text(
                                    text = "Misc",
                                    modifier = Modifier.padding(start = 8.dp, end = 35.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
        else -> {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Kotlin",
                        fontSize = 70.sp,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.size(10.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGrey, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U4: Console")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU5")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U5: If")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU6")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U6: If (expression)",
                                fontSize = 12.sp
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU7")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U7: If (nested)")
                        }
                    }

                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU8")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGrey, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U8: If (operator)")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU9")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U9: While")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU10")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U10: Do/While")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU11")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U11: For")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU12")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U12: When")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU13")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U13: When*")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU14")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyPurple, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U14: Functions")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU15")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text( text = "U15: Param.")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU16")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U16: Return")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU17")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U17: Expression")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU18")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U18: Default")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU19")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U19: Args")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU20")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U20: Local")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU21")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyPurple, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U21: Arrays")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU22")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBlue, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U22: Return")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU23")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U23: Objects")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU24")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U24: Construct")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU25")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U25: Methods")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU26")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U26: Interclass")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU27")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U27: Access")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU28")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U28: Set / Get")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU29")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U29: Data Class")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU30")
                            },
                            modifier = Modifier.width(150.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "U30: Enum Cl.")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 31")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 32")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 33")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 34")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 35")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 36")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 37")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 38")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 39")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 40")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 41")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 42")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 43")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 44")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 45")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 46")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 47")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 48")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "End")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                }
                FloatingActionButton(
                    onClick = { isMenuVisible = !isMenuVisible },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopStart),
                    containerColor = MyDarkBrown,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null
                    )
                }
                if (isMenuVisible) {
                    Box(
                        modifier = Modifier
                            .height(110.dp)
                            .fillMaxSize()
                            .background(color = Color.White, shape = RectangleShape)
                            .align(Alignment.BottomCenter)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(10.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row {
                                Text(text = "Unit Colors")
                            }
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Row(
                                    modifier = Modifier.padding(end = 20.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Surface(
                                        modifier = Modifier
                                            .height(10.dp)
                                            .width(10.dp),
                                        color = MyBrown
                                    ) {
                                    }
                                    Spacer(Modifier.width(8.dp))
                                    Text(text = "Structures")
                                }
                                Row(
                                    modifier = Modifier.padding(end = 20.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Surface(
                                        modifier = Modifier
                                            .height(10.dp)
                                            .width(10.dp),
                                        color = MyBlue
                                    ) {
                                    }
                                    Spacer(Modifier.width(8.dp))
                                    Text(text = "Functions")
                                }
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Surface(
                                        modifier = Modifier
                                            .height(10.dp)
                                            .width(10.dp),
                                        color = MyGreen
                                    ) {
                                    }
                                    Spacer(Modifier.width(8.dp))
                                    Text(text = "POO")
                                }

                            }
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Row(
                                    modifier = Modifier.padding(end = 20.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Surface(
                                        modifier = Modifier
                                            .height(10.dp)
                                            .width(10.dp),
                                        color = MyPurple
                                    ) {
                                    }
                                    Spacer(Modifier.width(8.dp))
                                    Text(text = "Concepts")
                                }
                                Row(
                                    modifier = Modifier.padding(end = 20.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Surface(
                                        modifier = Modifier
                                            .height(10.dp)
                                            .width(10.dp),
                                        color = MyRed
                                    ) {
                                    }
                                    Spacer(Modifier.width(8.dp))
                                    Text(text = "Expressions")
                                }
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Surface(
                                        modifier = Modifier
                                            .height(10.dp)
                                            .width(10.dp),
                                        color = MyGrey
                                    ) {
                                    }
                                    Spacer(Modifier.width(8.dp))
                                    Text(text = "Misc")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}