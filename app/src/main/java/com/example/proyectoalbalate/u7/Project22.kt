package com.example.proyectoalbalate.u7

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
import com.example.proyectoalbalate.ui.theme.MyGrey
import com.example.proyectoalbalate.ui.theme.MyWhite
//Enter through the keyboard the total number of questions and the number of correct answers to determine the level of your test.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project22(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    var totalQuestions by remember { mutableStateOf("") }
    var correctAnswers by remember { mutableStateOf("") }
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
                            text = "Project 22",
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
                            text = "Calculate the percentage of correct questions:",
                            textAlign = TextAlign.Center,
                        )
                    }
                    OutlinedTextField(
                        value = totalQuestions,
                        onValueChange = { totalQuestions = it },
                        label = {
                            Text("Total questions")
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
                        value = correctAnswers,
                        onValueChange = { correctAnswers = it },
                        label = {
                            Text("Correct answers")
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
                                if (totalQuestions.toFloatOrNull() != null
                                    && correctAnswers.toFloatOrNull() != null
                                ) {
                                    val percentage = correctAnswers.toFloat() * 100 / totalQuestions.toFloat()
                                    outcome = if (percentage in 0.0..100.0) {
                                        if (percentage >= 90) {
                                            "MAX LEVEL!"
                                        } else {
                                            if(percentage >= 75) {
                                                "Medium level"
                                            } else {
                                                if (percentage >= 50) {
                                                    "Regular level"
                                                } else {
                                                    "Out of level"
                                                }
                                            }
                                        }
                                    } else {
                                        "You have introduced wrong parameters"
                                    }
                                } else {
                                    outcome = "Enter the data correctly please"
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
                    onClick = { navController.navigate("Project21") },
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
                    onClick = { navController.navigate("FrontPageU7") },
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
                    onClick = { navController.navigate("Project23") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopEnd),
                    containerColor = MyGrey,
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
                            text = "Project 22",
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
                            text = "Calculate the percentage of correct questions:",
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = totalQuestions,
                        onValueChange = { totalQuestions = it },
                        label = {
                            Text("Total questions")
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
                        value = correctAnswers,
                        onValueChange = { correctAnswers = it },
                        label = {
                            Text("Correct answers")
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
                                if (totalQuestions.toFloatOrNull() != null
                                    && correctAnswers.toFloatOrNull() != null
                                ) {
                                    val percentage = correctAnswers.toFloat() * 100 / totalQuestions.toFloat()
                                    outcome = if (percentage in 0.0..100.0) {
                                        if (percentage >= 90) {
                                            "MAX LEVEL!"
                                        } else {
                                            if(percentage >= 75) {
                                                "Medium level"
                                            } else {
                                                if (percentage >= 50) {
                                                    "Regular level"
                                                } else {
                                                    "Out of level"
                                                }
                                            }
                                        }
                                    } else {
                                        "You have introduced wrong parameters"
                                    }
                                } else {
                                    outcome = "Enter the data correctly please"
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
                    onClick = { navController.navigate("Project21") },
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
                    onClick = { navController.navigate("FrontPageU7") },
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
                    onClick = { navController.navigate("Project23") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomEnd),
                    containerColor = MyGrey,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null)}
            }
        }
    }
}