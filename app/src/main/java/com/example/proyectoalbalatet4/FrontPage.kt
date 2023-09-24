package com.example.proyectoalbalatet4

import android.content.res.Configuration
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ShapeDefaults
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
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun FrontPage(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    var isMenuVisible by remember { mutableStateOf(false) }
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "T4",
                    fontSize = 70.sp,
                    fontWeight = FontWeight.ExtraBold,
                )
                Spacer(modifier = Modifier.size(15.dp))
                Row {
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 4")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 5")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 6")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 7")
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
                        Text(text = "Unit 8")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 9")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 10")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 11")
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
                        Text(text = "Unit 12")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 13")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 14")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 15")
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
                        Text(text = "Unit 16")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 17")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 18")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 19")
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
                        Text(text = "Unit 20")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 21")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 22")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 23")
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
                        Text(text = "Unit 24")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 25")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 26")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 27")
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
                        Text(text = "Unit 28")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 29")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(
                        onClick = {
                            navController.navigate("FrontPageU4")
                        },
                        modifier = Modifier.width(150.dp)
                    ) {
                        Text(text = "Unit 30")
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
                        text = "T4",
                        fontSize = 70.sp,
                        fontWeight = FontWeight.ExtraBold,
                    )
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 4")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 5")
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
                            Text(text = "Unit 6")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 7")
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
                            Text(text = "Unit 8")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 9")
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
                            Text(text = "Unit 10")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 11")
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
                            Text(text = "Unit 12")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 13")
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
                            Text(text = "Unit 14")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 15")
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
                            Text(text = "Unit 16")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 17")
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
                            Text(text = "Unit 18")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 19")
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
                            Text(text = "Unit 20")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 21")
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
                            Text(text = "Unit 22")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 23")
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
                            Text(text = "Unit 24")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 25")
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
                            Text(text = "Unit 26")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 27")
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
                            Text(text = "Unit 28")
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Button(
                            onClick = {
                                navController.navigate("FrontPageU4")
                            },
                            modifier = Modifier.width(150.dp)
                        ) {
                            Text(text = "Unit 29")
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
                            Text(text = "Unit 30")
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
                        .align(Alignment.TopStart)
                    // Posicionar en la esquina inferior izquierda
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
                            .background(color = Color.LightGray, shape = RectangleShape)
                            .align(Alignment.BottomCenter)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalArrangement = Arrangement.spacedBy(8.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Row(){
                                Text(text = "Leyenda de Colores")
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
                                        color = Color.Blue
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
                                        color = Color.Black
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
                                        color = Color.White
                                    ) {
                                    }
                                    Spacer(Modifier.width(8.dp))
                                    Text(text = "POD")
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
                                        color = Color.Blue
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
                                        color = Color.Black
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
                                        color = Color.White
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

