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
fun Project6() {
    val configuration = LocalConfiguration.current
    var squareSide by remember { mutableStateOf("") }
    var outcome by remember { mutableStateOf("") }
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
                        text = "Project 6",
                        textAlign = TextAlign.Center,
                        color = SoftBlue,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.size(10.dp))
                OutlinedTextField(
                    value = squareSide,
                    onValueChange = { squareSide = it },
                    label = {
                        Text("Square side")
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
                            if (squareSide.toIntOrNull() != null) {
                                var result = 0
                                result = squareSide.toInt() * 4
                                outcome =
                                    "The perimeter of the square equals: $result"
                            } else {
                                outcome = "Introduce a number please"
                            }
                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(text = "Perimeter")
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
                    text = "Project 6",
                    textAlign = TextAlign.Center,
                    color = SoftBlue,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.size(10.dp))
            OutlinedTextField(
                value = squareSide,
                onValueChange = { squareSide = it },
                label = {
                    Text("Square side")
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
                        if (squareSide.toIntOrNull() != null) {
                            var result = 0
                            result = squareSide.toInt() * 4
                            outcome =
                                "The perimeter of the square equals: $result"
                        } else {
                            outcome = "Introduce a number please"
                        }
                    },
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(text = "Perimeter")
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

