package com.example.proyectoalbalate.u34

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
import com.example.proyectoalbalate.ui.theme.MyGreen
import com.example.proyectoalbalate.ui.theme.MyWhite
//Enter the parameters x and y of a point to determine in which dimension it is located.
@SuppressLint("MutableCollectionMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project143(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    var shortSide by remember { mutableStateOf("") }
    var side by remember { mutableStateOf("") }
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
                            text = "Project 143",
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
                            text = "Enter one value for a Square, two values for Rectangle",
                            textAlign = TextAlign.Center,
                        )
                    }
                    OutlinedTextField(
                        value = side,
                        onValueChange = { side = it },
                        label = {
                            Text("Side / Long Side")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyGreen
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        ),
                    )
                    OutlinedTextField(
                        value = shortSide,
                        onValueChange = { shortSide = it },
                        label = {
                            Text("Short Side")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyGreen
                        )
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = {
                                outcome = ""
                                if (side.toIntOrNull() != null && shortSide.toIntOrNull() == null) {
                                    val shape = Square(side.toInt())
                                    outcome = "Square Perimeter: ${shape.calcPerim()}\n" +
                                            "Square Area: ${shape.calcArea()}"
                                } else if (side.toIntOrNull() != null && shortSide.toIntOrNull() != null){
                                    val shape = Rect(side.toInt(), shortSide.toInt())
                                    outcome = "Rectangle Perimeter: ${shape.calcPerim()}\n" +
                                            "Rectangle Area: ${shape.calcArea()}"
                                }else {
                                    outcome = "Introduce correct parameters"
                                }
                                side = ""
                                shortSide = ""
                            },
                            modifier = Modifier.padding(10.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
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
                    onClick = { navController.navigate("Project142") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopStart),
                    containerColor = MyGreen,
                    contentColor = MyWhite) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null)}
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU34") },
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
                    onClick = { navController.navigate("Project145") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.TopEnd),
                    containerColor = MyGreen,
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
                            text = "Project 143",
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
                            text = "Enter one value for a Square,\n" +
                                    "two values for Rectangle",
                            textAlign = TextAlign.Center,
                        )
                    }
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = side,
                        onValueChange = { side = it },
                        label = {
                            Text("Side / Long Side")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyGreen
                        ),
                        keyboardOptions = KeyboardOptions.Default.copy(
                            keyboardType = KeyboardType.Number
                        ),
                    )
                    Spacer(modifier = Modifier.size(5.dp))
                    OutlinedTextField(
                        value = shortSide,
                        onValueChange = { shortSide = it },
                        label = {
                            Text("Short Side")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        singleLine = true,
                        shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = MyWhite,
                            focusedIndicatorColor = MyGreen
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
                                if (side.toIntOrNull() != null && shortSide.toIntOrNull() == null) {
                                    val shape = Square(side.toInt())
                                    outcome = "Square Perimeter: ${shape.calcPerim()}\n" +
                                            "Square Area: ${shape.calcArea()}"
                                } else if (side.toIntOrNull() != null && shortSide.toIntOrNull() != null){
                                    val shape = Rect(side.toInt(), shortSide.toInt())
                                    outcome = "Rectangle Perimeter: ${shape.calcPerim()}\n" +
                                            "Rectangle Area: ${shape.calcArea()}"
                                }else {
                                    outcome = "Introduce correct parameters"
                                }
                                side = ""
                                shortSide = ""
                            },
                            modifier = Modifier.padding(10.dp),
                            colors = ButtonDefaults.filledTonalButtonColors(
                                containerColor = MyGreen, contentColor = MyWhite
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
                    onClick = { navController.navigate("Project142") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomStart),
                    containerColor = MyGreen,
                    contentColor = MyWhite){
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null)}
                FloatingActionButton(
                    onClick = { navController.navigate("FrontPageU34") },
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
                    onClick = { navController.navigate("Project145") },
                    modifier = Modifier
                        .padding(16.dp)
                        .size(46.dp)
                        .align(Alignment.BottomEnd),
                    containerColor = MyGreen,
                    contentColor = MyWhite
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null)}
            }
        }
    }
}

interface Shape{
    fun calcArea():Int
    fun calcPerim():Int
    fun result(): String{
        return "Shape Data\n"
    }
}

class Square(val side: Int): Shape{
    override fun calcArea(): Int {
        return side*side
    }

    override fun calcPerim(): Int {
        return side*4
    }

}

class Rect(val longSide:Int, val shortSide: Int): Shape{
    override fun calcArea(): Int {
        return longSide*shortSide
    }
    override fun calcPerim(): Int {
        return ((longSide * 2) + (shortSide * 2))
    }
}