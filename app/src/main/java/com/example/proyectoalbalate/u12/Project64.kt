package com.example.proyectoalbalate.u12

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.proyectoalbalate.ui.theme.MyBlack
import com.example.proyectoalbalate.ui.theme.MyBrown
import com.example.proyectoalbalate.ui.theme.MyDarkBrown
import com.example.proyectoalbalate.ui.theme.MyWhite
//Enter 3 values 5 times to determine the sum of only the largest values.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project64(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    var x by remember { mutableStateOf(1) }
    var addition by remember { mutableStateOf(0.00) }
    var firstNumber by remember { mutableStateOf("") }
    var secondNumber by remember { mutableStateOf("") }
    var thirdNumber by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var left by remember { mutableStateOf(5) }
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Box(Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(
                            rememberScrollState()
                        ),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Project 64",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(top = 7.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Enter 5 times 3 numbers to know the accumulated of the highest numbers",
                            textAlign = TextAlign.Center,
                        )
                    }
                    OutlinedTextField(
                        value = firstNumber,
                        onValueChange = { firstNumber = it },
                        label = {
                            Text("First number")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyBrown
                        )
                    )
                    OutlinedTextField(
                        value = secondNumber,
                        onValueChange = { secondNumber = it },
                        label = {
                            Text("Second number")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyBrown
                        )
                    )
                    OutlinedTextField(
                        value = thirdNumber,
                        onValueChange = { thirdNumber = it },
                        label = {
                            Text("Third number")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyBrown
                        )
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = {
                                when {
                                    firstNumber.toFloatOrNull() != null
                                            && secondNumber.toFloatOrNull() != null
                                            && thirdNumber.toFloatOrNull() != null -> {
                                        when {
                                            x < 5 -> {
                                                left--
                                                outcome = "$left number/s left"
                                                x++
                                                addition += when {
                                                    firstNumber.toFloat() > secondNumber.toFloat() -> {
                                                        when {
                                                            firstNumber.toFloat() > thirdNumber.toFloat() -> {
                                                                firstNumber.toFloat()
                                                            }

                                                            else -> {
                                                                thirdNumber.toFloat()
                                                            }
                                                        }
                                                    }

                                                    else -> {
                                                        when {
                                                            secondNumber.toFloat() > thirdNumber.toFloat() -> {
                                                                secondNumber.toFloat()
                                                            }

                                                            else -> {
                                                                thirdNumber.toFloat()
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else -> {
                                                addition += when {
                                                    firstNumber.toFloat() > secondNumber.toFloat() -> {
                                                        if (firstNumber.toFloat() > thirdNumber.toFloat()) {
                                                            firstNumber.toFloat()
                                                        } else {
                                                            thirdNumber.toFloat()
                                                        }
                                                    }

                                                    else -> {
                                                        when {
                                                            secondNumber.toFloat() > thirdNumber.toFloat() -> {
                                                                secondNumber.toFloat()
                                                            }

                                                            else -> {
                                                                thirdNumber.toFloat()
                                                            }
                                                        }
                                                    }
                                                }
                                                outcome =
                                                    "The cumulative value of the largest of each\nlist of 3 values is: $addition"
                                                x = 1
                                                left = 5
                                                addition = 0.00
                                            }
                                        }
                                    }
                                    else -> {
                                        outcome = "Introduce all the numbers please"
                                    }
                                }
                            },
                            modifier = Modifier.padding(10.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "Calculate")
                        }
                    }
                    Text(
                        text = outcome,
                        modifier = Modifier.padding(bottom = 10.dp),
                        color = MyBlack
                    )
                }
            }
            Box(modifier = Modifier.fillMaxSize()) {
                FloatingActionButton(
                    onClick = { navController.navigate("Project63") },
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
                    onClick = { navController.navigate("FrontPageU12") },
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
                    onClick = { navController.navigate("Project65") },
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
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Project 64",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Enter 5 times 3 numbers to know the\naccumulated of the highest numbers",
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = firstNumber,
                        onValueChange = { firstNumber = it },
                        label = {
                            Text("First number")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyBrown
                        )
                    )

                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = secondNumber,
                        onValueChange = { secondNumber = it },
                        label = {
                            Text("Second number")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyBrown
                        )
                    )
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = thirdNumber,
                        onValueChange = { thirdNumber = it },
                        label = {
                            Text("Third number")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyBrown
                        )
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = {
                                when {
                                    firstNumber.toFloatOrNull() != null
                                            && secondNumber.toFloatOrNull() != null
                                            && thirdNumber.toFloatOrNull() != null -> {
                                        when {
                                            x < 5 -> {
                                                left--
                                                outcome = "$left number/s left"
                                                x++
                                                addition += when {
                                                    firstNumber.toFloat() > secondNumber.toFloat() -> {
                                                        when {
                                                            firstNumber.toFloat() > thirdNumber.toFloat() -> {
                                                                firstNumber.toFloat()
                                                            }

                                                            else -> {
                                                                thirdNumber.toFloat()
                                                            }
                                                        }
                                                    }

                                                    else -> {
                                                        when {
                                                            secondNumber.toFloat() > thirdNumber.toFloat() -> {
                                                                secondNumber.toFloat()
                                                            }

                                                            else -> {
                                                                thirdNumber.toFloat()
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            else -> {
                                                addition += when {
                                                    firstNumber.toFloat() > secondNumber.toFloat() -> {
                                                        if (firstNumber.toFloat() > thirdNumber.toFloat()) {
                                                            firstNumber.toFloat()
                                                        } else {
                                                            thirdNumber.toFloat()
                                                        }
                                                    }

                                                    else -> {
                                                        when {
                                                            secondNumber.toFloat() > thirdNumber.toFloat() -> {
                                                                secondNumber.toFloat()
                                                            }

                                                            else -> {
                                                                thirdNumber.toFloat()
                                                            }
                                                        }
                                                    }
                                                }
                                                outcome =
                                                    "The cumulative value of the largest of each list of 3 values is: $addition"
                                                x = 1
                                                left = 5
                                                addition = 0.00
                                            }
                                        }
                                    }
                                    else -> {
                                        outcome = "Introduce all the numbers please"
                                    }
                                }
                            },
                            modifier = Modifier.padding(10.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "Calculate")
                        }
                    }
                    Text(
                        text = outcome,
                        modifier = Modifier.padding(10.dp),
                        color = MyBlack
                    )
                }
            }
            Box(modifier = Modifier.fillMaxSize()) {
                FloatingActionButton(
                    onClick = { navController.navigate("Project63") },
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
                    onClick = { navController.navigate("FrontPageU12") },
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
                    onClick = { navController.navigate("Project65") },
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