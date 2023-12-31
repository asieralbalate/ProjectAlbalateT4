package com.example.proyectoalbalate.u13

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
import com.example.proyectoalbalate.ui.theme.MyBrown
import com.example.proyectoalbalate.ui.theme.MyDarkBrown
import com.example.proyectoalbalate.ui.theme.MyPurple
import com.example.proyectoalbalate.ui.theme.MyWhite
//Enter the number of children in 10 families to determine how many have 0, 1, 2, or more children.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project69(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    var numberOfKids by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var x by remember { mutableStateOf(1) }
    var noKids by remember { mutableStateOf(0) }
    var oneKid by remember { mutableStateOf(0) }
    var twoKids by remember { mutableStateOf(0) }
    var moreKids by remember { mutableStateOf(0) }
    var left by remember { mutableStateOf(10) }
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
                            text = "Project 69",
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
                            text = "Enter the number of children in 10 families",
                            textAlign = TextAlign.Center,
                        )
                    }
                    OutlinedTextField(
                        value = numberOfKids,
                        onValueChange = { numberOfKids = it },
                        label = {
                            Text("Number of kids")
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
                                    numberOfKids.toIntOrNull() != null -> {
                                        when {
                                            x < 10 -> {
                                                left--
                                                outcome = "$left families left"
                                                when {
                                                    numberOfKids.toInt() == 0 -> {
                                                        noKids++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() == 1 -> {
                                                        oneKid++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() == 2 -> {
                                                        twoKids++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() > 2 -> {
                                                        moreKids++
                                                    }
                                                }
                                                x++
                                            }
                                            else -> {
                                                when {
                                                    numberOfKids.toInt() == 0 -> {
                                                        noKids++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() == 1 -> {
                                                        oneKid++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() == 2 -> {
                                                        twoKids++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() > 2 -> {
                                                        moreKids++
                                                    }
                                                }

                                                outcome = "Number of families with 0 children: $noKids\n" +
                                                        "Number of families with 1 child: $oneKid\n" +
                                                        "Number of families with 2 children: $twoKids\n" +
                                                        "Number of families with more than 2 children: $moreKids"
                                                oneKid = 0
                                                noKids = 0
                                                twoKids = 0
                                                moreKids = 0
                                                x = 1
                                                left = 10
                                            }
                                        }
                                    }
                                    else -> {
                                        outcome = "Introduce a number"
                                    }
                                }
                                numberOfKids = ""
                            },
                            modifier = Modifier.padding(10.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
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
                    onClick = { navController.navigate("Project65") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopStart),
                    containerColor = MyBrown,
                    contentColor = MyWhite) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null)}
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU13") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomStart),
                    containerColor = MyDarkBrown,
                    contentColor = MyWhite) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = null)}
                FloatingActionButton(
                    onClick = { navController.navigate("Project72") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopEnd),
                    containerColor = MyPurple,
                    contentColor = MyWhite) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null) }
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
                            text = "Project 69",
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
                            text = "Enter the number of children in 10 families",
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = numberOfKids,
                        onValueChange = { numberOfKids = it },
                        label = {
                            Text("Number of kids")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyBrown
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
                                when {
                                    numberOfKids.toIntOrNull() != null -> {
                                        when {
                                            x < 10 -> {
                                                left--
                                                outcome = "$left families left"
                                                when {
                                                    numberOfKids.toInt() == 0 -> {
                                                        noKids++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() == 1 -> {
                                                        oneKid++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() == 2 -> {
                                                        twoKids++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() > 2 -> {
                                                        moreKids++
                                                    }
                                                }
                                                x++
                                            }
                                            else -> {
                                                when {
                                                    numberOfKids.toInt() == 0 -> {
                                                        noKids++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() == 1 -> {
                                                        oneKid++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() == 2 -> {
                                                        twoKids++
                                                    }
                                                }
                                                when {
                                                    numberOfKids.toInt() > 2 -> {
                                                        moreKids++
                                                    }
                                                }

                                                outcome = "Number of families with 0 children: $noKids\n" +
                                                        "Number of families with 1 child: $oneKid\n" +
                                                        "Number of families with 2 children: $twoKids\n" +
                                                        "Number of families with more than 2 children: $moreKids"
                                                oneKid = 0
                                                noKids = 0
                                                twoKids = 0
                                                moreKids = 0
                                                x = 1
                                                left = 10
                                            }
                                        }
                                    }
                                    else -> {
                                        outcome = "Introduce a number"
                                    }
                                }
                                numberOfKids = ""
                            },
                            modifier = Modifier.padding(10.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyBrown, contentColor = MyWhite
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
                    onClick = { navController.navigate("Project65") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomStart),
                    containerColor = MyBrown,
                    contentColor = MyWhite){
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null)}
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU13") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomCenter),
                    containerColor = MyDarkBrown,
                    contentColor = MyWhite){
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowUp,
                        contentDescription = null)}
                FloatingActionButton(
                    onClick = { navController.navigate("Project72") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomEnd),
                    containerColor = MyPurple,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null)}
            }
        }
    }
}