package com.example.proyectoalbalate.u37

import android.annotation.SuppressLint
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
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.proyectoalbalate.ui.theme.MyBlack
import com.example.proyectoalbalate.ui.theme.MyDarkBrown
import com.example.proyectoalbalate.ui.theme.MyRed
import com.example.proyectoalbalate.ui.theme.MyWhite
import java.lang.StringBuilder

//Enter a string of characters to separate the vowels, lowercase letters, and non-alphabetic characters. We've used a function with a lambda expression that returns a boolean. Later, within the structure, we use this function to filter the received message.


@SuppressLint("MutableCollectionMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project151(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    var text by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
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
                            text = "Project 151",
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
                            text = "Enter a string of characters to separate the vowels,\n" +
                                    "lowercase letters, and non-alphabetic characters.",
                            textAlign = TextAlign.Center,
                        )
                    }
                    OutlinedTextField(
                        value = text,
                        onValueChange = { text = it },
                        label = {
                            Text("Text")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyRed
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        ),
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = {
                                outcome = ""
                                if (!text.equals(null)) {
                                    outcome += "Original String: $text\n"
                                    val result1 = filter(text) {
                                        it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
                                            it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U'
                                    }
                                    outcome += "Only vowels: $result1\n"

                                    val result2 = filter(text) {
                                        it in 'a'..'z'
                                    }
                                    outcome += "Only lowercase: $result2\n"

                                    val result3 = filter(text) {
                                        it !in 'a'..'z' && it !in 'A'..'Z'
                                    }
                                    outcome += "Only non-alphabetic characters: $result3"
                                } else {
                                    outcome = "Introduce correct parameters"
                                }
                                text = ""
                            },
                            modifier = Modifier.padding(10.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyRed, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "Enter")
                        }
                    }
                    Text(
                        text = outcome,
                        modifier = Modifier.padding(bottom = 20.dp),
                        color = MyBlack
                    )
                }
            }
            Box(modifier = Modifier.fillMaxSize()) {
                FloatingActionButton(
                    onClick = { navController.navigate("Project150") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopStart),
                    containerColor = MyRed,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null
                    )
                }
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU37") },
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
                    onClick = { navController.navigate("Project153") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopEnd),
                    containerColor = MyRed,
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
                            text = "Project 151",
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
                            text = "Enter a string of characters to separate\n" +
                                    "the vowels,lowercase letters, and\n" +
                                    "non-alphabetic characters.",
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = text,
                        onValueChange = { text = it },
                        label = {
                            Text("Text")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyRed
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        ),
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = {
                                outcome = ""
                                if (!text.equals(null)) {
                                    outcome += "Original String: $text\n"
                                    val result1 = filter(text) {
                                        it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' ||
                                            it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U'
                                    }
                                    outcome += "Only vowels: $result1\n"

                                    val result2 = filter(text) {
                                        it in 'a'..'z'
                                    }
                                    outcome += "Only lowercase: $result2\n"

                                    val result3 = filter(text) {
                                        it !in 'a'..'z' && it !in 'A'..'Z'
                                    }
                                    outcome += "Only non-alphabetic characters: $result3"
                                } else {
                                    outcome = "Introduce correct parameters"
                                }
                                text = ""
                            },
                            modifier = Modifier.padding(10.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyRed, contentColor = MyWhite
                            )
                        ) {
                            Text(text = "Enter")
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
                    onClick = { navController.navigate("Project150") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomStart),
                    containerColor = MyRed,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null
                    )
                }
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU37") },
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
                    onClick = { navController.navigate("Project153") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomEnd),
                    containerColor = MyRed,
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

fun filter(chain: String, fn: (Char) -> Boolean): String {
    val ch = StringBuilder()
    for (elem in chain) {
        if (fn(elem)) {
            ch.append(elem)
        }
    }
    return ch.toString()
}
