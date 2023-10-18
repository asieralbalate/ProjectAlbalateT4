package com.example.proyectoalbalatet4.U11

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
import com.example.proyectoalbalatet4.ui.theme.MyBlack
import com.example.proyectoalbalatet4.ui.theme.MyBrown
import com.example.proyectoalbalatet4.ui.theme.MyDarkBrown
import com.example.proyectoalbalatet4.ui.theme.MyWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project57(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    var numPoints by remember { mutableStateOf("") }
    var xValue by remember { mutableStateOf("") }
    var yValue by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var x by remember { mutableStateOf(1) }
    var firstQuadrant by remember { mutableStateOf(0) }
    var secondQuadrant by remember { mutableStateOf(0) }
    var thirdQuadrant by remember { mutableStateOf(0) }
    var fourthQuadrant by remember { mutableStateOf(0) }
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
                            text = "Project 57",
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
                            text = "Enter the number of points and their coordinates to find out how many are in each quadrant",
                            textAlign = TextAlign.Center,
                        )
                    }
                    OutlinedTextField(
                        value = numPoints,
                        onValueChange = { numPoints = it },
                        label = {
                            Text("Number of points")
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
                        value = xValue,
                        onValueChange = { xValue = it },
                        label = {
                            Text("X")
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
                        value = yValue,
                        onValueChange = { yValue = it },
                        label = {
                            Text("Y")
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
                                if (xValue.toFloatOrNull() != null
                                    && yValue.toFloatOrNull() != null
                                    && numPoints.toIntOrNull() != null
                                ) {
                                    if (x < numPoints.toInt()) {
                                        val left = numPoints.toInt() - x
                                        outcome = "$left point/s left\n"
                                        if (xValue.toFloat() > 0.0) {
                                            if (yValue.toFloat() > 0) {firstQuadrant++} else {secondQuadrant++}
                                        } else {
                                            if (yValue.toFloat() < 0) {thirdQuadrant++}else {fourthQuadrant++}
                                        }
                                        x++
                                    } else {
                                        if (xValue.toFloat() > 0.0) {
                                            if (yValue.toFloat() > 0) {firstQuadrant++} else {secondQuadrant++}
                                        } else {
                                            if (yValue.toFloat() < 0) {thirdQuadrant++}else {fourthQuadrant++}
                                        }
                                        outcome = "First Quadrant: $firstQuadrant\n" +
                                                "Second Quadrant: $secondQuadrant\n" +
                                                "Third Quadrant: $thirdQuadrant\n" +
                                                "Fourth Quadrant: $fourthQuadrant"
                                        firstQuadrant = 0
                                        secondQuadrant = 0
                                        thirdQuadrant = 0
                                        fourthQuadrant = 0
                                        x = 1
                                    }
                                    xValue = ""
                                    yValue = ""
                                } else {
                                    outcome = "Introduce all the numbers please"
                                    xValue = ""
                                    yValue = ""
                                    numPoints = ""
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
                    onClick = { navController.navigate("Project56") },
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
                    onClick = { navController.navigate("FrontPageU11") },
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
                    onClick = { navController.navigate("Project58") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopEnd),
                    containerColor = MyBrown,
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
                            text = "Project 57",
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
                            text = "Enter the number of points and their coordinates\n" +
                                    "to find out how many are in each quadrant",
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = numPoints,
                        onValueChange = { numPoints = it },
                        label = {
                            Text("Number of points")
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
                        value = xValue,
                        onValueChange = { xValue = it },
                        label = {
                            Text("X")
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
                        value = yValue,
                        onValueChange = { yValue = it },
                        label = {
                            Text("Y")
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
                                if (xValue.toFloatOrNull() != null
                                    && yValue.toFloatOrNull() != null
                                    && numPoints.toIntOrNull() != null
                                ) {
                                    if (x < numPoints.toInt()) {
                                        val left = numPoints.toInt() - x
                                        outcome = "$left point/s left\n"
                                        if (xValue.toFloat() > 0.0) {
                                            if (yValue.toFloat() > 0) {firstQuadrant++} else {secondQuadrant++}
                                        } else {
                                            if (yValue.toFloat() < 0) {thirdQuadrant++}else {fourthQuadrant++}
                                        }
                                        x++
                                    } else {
                                        if (xValue.toFloat() > 0.0) {
                                            if (yValue.toFloat() > 0) {firstQuadrant++} else {secondQuadrant++}
                                        } else {
                                            if (yValue.toFloat() < 0) {thirdQuadrant++}else {fourthQuadrant++}
                                        }
                                        outcome = "First Quadrant: $firstQuadrant\n" +
                                                "Second Quadrant: $secondQuadrant\n" +
                                                "Third Quadrant: $thirdQuadrant\n" +
                                                "Fourth Quadrant: $fourthQuadrant"
                                        firstQuadrant = 0
                                        secondQuadrant = 0
                                        thirdQuadrant = 0
                                        fourthQuadrant = 0
                                        x = 1
                                    }
                                    xValue = ""
                                    yValue = ""
                                } else {
                                    outcome = "Introduce all the numbers please"
                                    xValue = ""
                                    yValue = ""
                                    numPoints = ""
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
                    onClick = { navController.navigate("Project56") },
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
                    onClick = { navController.navigate("FrontPageU11") },
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
                    onClick = { navController.navigate("Project58") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomEnd),
                    containerColor = MyBrown,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null)}
            }
        }
    }
}