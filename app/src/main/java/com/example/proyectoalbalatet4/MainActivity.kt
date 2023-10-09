package com.example.proyectoalbalatet4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectoalbalatet4.ui.theme.ProyectoAlbalateT4Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoAlbalateT4Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "FrontPage") {
                        composable("Project5") { Project5(navController = navController) }
                        composable("Project6") { Project6(navController = navController) }
                        composable("Project7") { Project7(navController = navController) }
                        composable("Project8") { Project8(navController = navController) }
                        composable("Project9") { Project9(navController = navController) }
                        composable("Project10") { Project10(navController = navController) }
                        composable("Project11") { Project11(navController = navController) }
                        composable("Project12") { Project12(navController = navController) }
                        composable("Project13") { Project13(navController = navController) }
                        composable("Project14") { Project14(navController = navController) }
                        composable("Project15") { Project15(navController = navController) }
                        composable("Project16") { Project16(navController = navController) }
                        composable("Project17") { Project17(navController = navController) }
                        composable("Project18") { Project18(navController = navController) }
                        composable("Project19") { Project19(navController = navController) }
                        composable("Project20") { Project20(navController = navController) }
                        composable("Project21") { Project21(navController = navController) }
                        composable("Project22") { Project22(navController = navController) }
                        composable("Project23") { Project23(navController = navController) }
                        composable("Project24") { Project24(navController = navController) }
                        composable("Project25") { Project25(navController = navController) }
                        composable("Project26") { Project26(navController = navController) }
                        composable("Project27") { Project27(navController = navController) }
                        composable("Project28") { Project28(navController = navController) }
                        composable("Project29") { Project29(navController = navController) }
                        composable("Project30") { Project30(navController = navController) }
                        composable("Project31") { Project31(navController = navController) }
                        composable("Project32") { Project32(navController = navController) }
                        composable("Project33") { Project33(navController = navController) }
                        composable("Project34") { Project34(navController = navController) }
                        composable("Project35") { Project35(navController = navController) }
                        composable("Project36") { Project36(navController = navController) }
                        composable("Project37") { Project37(navController = navController) }
                        composable("Project38") { Project38(navController = navController) }
                        composable("Project39") { Project39(navController = navController) }
                        composable("Project40") { Project40(navController = navController) }
                        composable("Project41") { Project41(navController = navController) }
                        composable("Project42") { Project42(navController = navController) }
                        composable("Project43") { Project43(navController = navController) }
                        composable("Project44") { Project44(navController = navController) }
                        composable("Project45") { Project45(navController = navController) }
                        composable("Project46") { Project46(navController = navController) }
                        composable("Project47") { Project47(navController = navController) }
                        composable("Project48") { Project48(navController = navController) }
                        composable("Project49") { Project49(navController = navController) }
                        composable("Project50") { Project50(navController = navController) }
                        composable("Project51") { Project51(navController = navController) }
                        composable("Project52") { Project52(navController = navController) }
                        composable("Project53") { Project53(navController = navController) }
                        composable("Project54") { Project54(navController = navController) }
                        composable("Project55") { Project55(navController = navController) }
                        composable("Project56") { Project56(navController = navController) }
                        composable("Project57") { Project57(navController = navController) }
                        composable("Project58") { Project58(navController = navController) }
                        composable("FrontPageU4") { FrontPageU4(navController = navController) }
                        composable("FrontPageU5") { FrontPageU5(navController = navController) }
                        composable("FrontPageU6") { FrontPageU6(navController = navController) }
                        composable("FrontPageU7") { FrontPageU7(navController = navController) }
                        composable("FrontPageU8") { FrontPageU8(navController = navController) }
                        composable("FrontPageU9") { FrontPageU9(navController = navController) }
                        composable("FrontPageU10") { FrontPageU10(navController = navController) }
                        composable("FrontPageU11") { FrontPageU11(navController = navController) }
                        composable("FrontPage") {
                            FrontPage(navController = navController)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProyectoAlbalateT4Theme {
    }
}