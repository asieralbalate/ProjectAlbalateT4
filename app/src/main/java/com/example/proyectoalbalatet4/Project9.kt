package com.example.proyectoalbalatet4


import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import com.example.proyectoalbalatet4.ui.theme.Dark
import com.example.proyectoalbalatet4.ui.theme.SoftBlue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Project9() {
    val configuration = LocalConfiguration.current
    var firstNumber by remember { mutableStateOf("") }
    var secondNumber by remember { mutableStateOf("") }
    var thirdNumber by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
    var productOutcome by remember { mutableStateOf("") }
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {
                Row(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Project 5",
                        textAlign = TextAlign.Center,
                        color = SoftBlue,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.size(10.dp))
                OutlinedTextField(
                    value = firstNumber,
                    onValueChange = { firstNumber = it },
                    label = {
                        Text("First value")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp)
                )

                OutlinedTextField(
                    value = secondNumber,
                    onValueChange = { secondNumber = it },
                    label = {
                        Text("Second value")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    singleLine = true,
                    shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            if (firstNumber.toIntOrNull() != null && secondNumber.toIntOrNull() != null) {
                                var result = 0
                                result = firstNumber.toInt() + secondNumber.toInt()
                                outcome =
                                    "The addition of $firstNumber and $secondNumber equals: $result"
                            } else {
                                outcome = "Introduce numbers please"
                            }
                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Add")
                    }
                    Button(
                        onClick = {
                            if (firstNumber.toFloatOrNull() != null && secondNumber.toFloatOrNull() != null && thirdNumber.toFloatOrNull() != null) {
                                var addition: Float = firstNumber.toFloat() + secondNumber.toFloat() + thirdNumber.toFloat()
                                var average: Float = (firstNumber.toFloat() + secondNumber.toFloat()+ thirdNumber.toFloat())/3
                                val formattedAdditionResult = String.format("%.2f", addition)
                                val formattedAveragenResult = String.format("%.2f", average)
                                outcome =
                                    "The addition of $firstNumber and $secondNumber and $thirdNumber equals: $formattedAdditionResult \n" +
                                            "The arithmetic average is: $formattedAveragenResult"
                            } else {
                                outcome = "Introduce all the numbers please"
                            }
                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Multiply")
                    }
                }
                Text(
                    text = outcome,
                    modifier = Modifier.padding(10.dp),
                    color = Dark
                )

            }
        } else -> {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Project 5",
                    textAlign = TextAlign.Center,
                    color = SoftBlue,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.size(10.dp))
            OutlinedTextField(
                value = firstNumber,
                onValueChange = { firstNumber = it },
                label = {
                    Text("First value")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                singleLine = true,
                shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp)
            )

            OutlinedTextField(
                value = secondNumber,
                onValueChange = { secondNumber = it },
                label = {
                    Text("Second value")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                singleLine = true,
                shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp)
            )
            OutlinedTextField(
                value = thirdNumber,
                onValueChange = { thirdNumber = it },
                label = {
                    Text("Third value")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                singleLine = true,
                shape = RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = {
                        if (firstNumber.toFloatOrNull() != null && secondNumber.toFloatOrNull() != null && thirdNumber.toFloatOrNull() != null) {
                            var addition: Float = firstNumber.toFloat() + secondNumber.toFloat() + thirdNumber.toFloat()
                            var average: Float = (firstNumber.toFloat() + secondNumber.toFloat()+ thirdNumber.toFloat())/3
                            val formattedAdditionResult = String.format("%.2f", addition)
                            val formattedAveragenResult = String.format("%.2f", average)
                            outcome =
                                "The addition of $firstNumber and $secondNumber and $thirdNumber equals: $formattedAdditionResult \n" +
                                        "The arithmetic average is: $formattedAveragenResult"
                        } else {
                            outcome = "Introduce all the numbers please"
                        }
                    },
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(text = "Calculate")
                }
            }
            Text(
                text = outcome,
                modifier = Modifier.padding(10.dp),
                color = Dark
            )

        }
    }
    }
}

