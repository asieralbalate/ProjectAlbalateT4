package com.example.proyectoalbalatet4.U12

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
import com.example.proyectoalbalatet4.ui.theme.MyBlack
import com.example.proyectoalbalatet4.ui.theme.MyBrown
import com.example.proyectoalbalatet4.ui.theme.MyDarkBrown
import com.example.proyectoalbalatet4.ui.theme.MyWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project65(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    var amountTriangles by remember { mutableStateOf("") }
    var side3 by remember { mutableStateOf("") }
    var side2 by remember { mutableStateOf("") }
    var side1 by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var x by remember { mutableStateOf(1) }
    var equilateral by remember { mutableStateOf(0) }
    var isosceles by remember { mutableStateOf(0) }
    var scalene by remember { mutableStateOf(0) }
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
                            text = "Project 65",
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
                            text = "Enter the number of triangles and their sides to find out which are equilateral, isosceles or scales",
                            textAlign = TextAlign.Center,
                        )
                    }
                    OutlinedTextField(
                        value = amountTriangles,
                        onValueChange = { amountTriangles = it },
                        label = {
                            Text("Amount of triangles")
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
                    OutlinedTextField(
                        value = side1,
                        onValueChange = { side1 = it },
                        label = {
                            Text("First side")
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
                    OutlinedTextField(
                        value = side2,
                        onValueChange = { side2 = it },
                        label = {
                            Text("Second Side")
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
                        value = side3,
                        onValueChange = { side3 = it },
                        label = {
                            Text("Third Side")
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
                                if (side2.toFloatOrNull() != null && side1.toFloatOrNull() != null && amountTriangles.toIntOrNull() != null && side3.toFloatOrNull() != null) {
                                    if (x < amountTriangles.toInt()) {
                                        val left = amountTriangles.toInt() - x

                                        if (side1 == side2 && side1 == side3){
                                            equilateral++
                                            outcome = "$left traingles left\n" +
                                                    "Equilateral"
                                        } else if (side1 == side2 || side1 == side3 || side2 == side3){
                                            isosceles++
                                            outcome = "$left traingles left\n" +
                                                    "Isosceles"
                                        } else {
                                            scalene++
                                            outcome = "$left traingles left\n" +
                                                    "Scalene"
                                        }
                                        x++
                                    } else {
                                        if (side1 == side2 && side1 == side3){
                                            equilateral++
                                            outcome = "Equilateral\n"
                                        } else if (side1 == side2 || side1 == side3 || side2 == side3){
                                            isosceles++
                                            outcome = "Isosceles\n"
                                        } else {
                                            scalene++
                                            outcome = "Scalene\n"
                                        }
                                        outcome += "Equilateral: $equilateral\n" +
                                                "Isosceles: $isosceles\n" +
                                                "Scales: $scalene"
                                        equilateral = 0
                                        isosceles = 0
                                        scalene = 0
                                        x = 1
                                    }
                                    side3 = ""
                                    side2 = ""
                                    side1 = ""
                                } else {
                                    outcome = "Introduce correct parameters"
                                    side3 = ""
                                    side2 = ""
                                    side1 = ""
                                    amountTriangles = ""
                                }
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
                    onClick = { navController.navigate("Project64") },
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
                    onClick = { navController.navigate("FrontPageU12") },
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
                    onClick = { navController.navigate("Project69") },
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
            Box(modifier = Modifier.fillMaxSize().verticalScroll(
                rememberScrollState()
            )) {
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
                            text = "Project 65",
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
                            text = "Enter the number of triangles and their sides\n" +
                                    " to find out which are equilateral,\n" +
                                    "isosceles or scales",
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = amountTriangles,
                        onValueChange = { amountTriangles = it },
                        label = {
                            Text("Amount of triangles")
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
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = side1,
                        onValueChange = { side1 = it },
                        label = {
                            Text("First side")
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
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = side2,
                        onValueChange = { side2 = it },
                        label = {
                            Text("Second Side")
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
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = side3,
                        onValueChange = { side3 = it },
                        label = {
                            Text("Third Side")
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
                                if (side2.toFloatOrNull() != null && side1.toFloatOrNull() != null && amountTriangles.toIntOrNull() != null && side3.toFloatOrNull() != null) {
                                    if (x < amountTriangles.toInt()) {
                                        val left = amountTriangles.toInt() - x

                                        if (side1 == side2 && side1 == side3){
                                            equilateral++
                                            outcome = "$left traingles left\n" +
                                                    "Equilateral"
                                        } else if (side1 == side2 || side1 == side3 || side2 == side3){
                                            isosceles++
                                            outcome = "$left traingles left\n" +
                                                    "Isosceles"
                                        } else {
                                            scalene++
                                            outcome = "$left traingles left\n" +
                                                    "Scalene"
                                        }
                                        x++
                                    } else {
                                        if (side1 == side2 && side1 == side3){
                                            equilateral++
                                            outcome = "Equilateral\n"
                                        } else if (side1 == side2 || side1 == side3 || side2 == side3){
                                            isosceles++
                                            outcome = "Isosceles\n"
                                        } else {
                                            scalene++
                                            outcome = "Scalene\n"
                                        }
                                        outcome += "Equilateral: $equilateral\n" +
                                                "Isosceles: $isosceles\n" +
                                                "Scales: $scalene"
                                        equilateral = 0
                                        isosceles = 0
                                        scalene = 0
                                        x = 1
                                    }
                                    side3 = ""
                                    side2 = ""
                                    side1 = ""
                                } else {
                                    outcome = "Introduce correct parameters"
                                    side3 = ""
                                    side2 = ""
                                    side1 = ""
                                    amountTriangles = ""
                                }
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
                    onClick = { navController.navigate("Project64") },
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
                    onClick = { navController.navigate("FrontPageU12") },
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
                    onClick = { navController.navigate("Project69") },
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