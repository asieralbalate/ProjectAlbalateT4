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
import com.example.proyectoalbalatet4.fronts.FrontPage
import com.example.proyectoalbalatet4.fronts.FrontPageU10
import com.example.proyectoalbalatet4.fronts.FrontPageU11
import com.example.proyectoalbalatet4.fronts.FrontPageU12
import com.example.proyectoalbalatet4.fronts.FrontPageU13
import com.example.proyectoalbalatet4.fronts.FrontPageU4
import com.example.proyectoalbalatet4.fronts.FrontPageU5
import com.example.proyectoalbalatet4.fronts.FrontPageU6
import com.example.proyectoalbalatet4.fronts.FrontPageU7
import com.example.proyectoalbalatet4.fronts.FrontPageU8
import com.example.proyectoalbalatet4.fronts.FrontPageU9
import com.example.proyectoalbalatet4.u10.Project42
import com.example.proyectoalbalatet4.u10.Project43
import com.example.proyectoalbalatet4.u10.Project44
import com.example.proyectoalbalatet4.u10.Project45
import com.example.proyectoalbalatet4.u10.Project46
import com.example.proyectoalbalatet4.u11.Project47
import com.example.proyectoalbalatet4.u11.Project48
import com.example.proyectoalbalatet4.u11.Project49
import com.example.proyectoalbalatet4.u11.Project50
import com.example.proyectoalbalatet4.u11.Project51
import com.example.proyectoalbalatet4.u11.Project52
import com.example.proyectoalbalatet4.u11.Project53
import com.example.proyectoalbalatet4.u11.Project54
import com.example.proyectoalbalatet4.u11.Project55
import com.example.proyectoalbalatet4.u11.Project56
import com.example.proyectoalbalatet4.u11.Project57
import com.example.proyectoalbalatet4.u11.Project58
import com.example.proyectoalbalatet4.u13.Project69
import com.example.proyectoalbalatet4.u12.Project63
import com.example.proyectoalbalatet4.u12.Project64
import com.example.proyectoalbalatet4.u12.Project65
import com.example.proyectoalbalatet4.u4.Project5
import com.example.proyectoalbalatet4.u4.Project6
import com.example.proyectoalbalatet4.u4.Project7
import com.example.proyectoalbalatet4.u4.Project8
import com.example.proyectoalbalatet4.u4.Project9
import com.example.proyectoalbalatet4.u5.Project10
import com.example.proyectoalbalatet4.u5.Project11
import com.example.proyectoalbalatet4.u5.Project12
import com.example.proyectoalbalatet4.u5.Project13
import com.example.proyectoalbalatet4.u5.Project14
import com.example.proyectoalbalatet4.u6.Project15
import com.example.proyectoalbalatet4.u6.Project16
import com.example.proyectoalbalatet4.u6.Project17
import com.example.proyectoalbalatet4.u7.Project18
import com.example.proyectoalbalatet4.u7.Project19
import com.example.proyectoalbalatet4.u7.Project20
import com.example.proyectoalbalatet4.u7.Project21
import com.example.proyectoalbalatet4.u7.Project22
import com.example.proyectoalbalatet4.u8.Project23
import com.example.proyectoalbalatet4.u8.Project24
import com.example.proyectoalbalatet4.u8.Project25
import com.example.proyectoalbalatet4.u8.Project26
import com.example.proyectoalbalatet4.u8.Project27
import com.example.proyectoalbalatet4.u8.Project28
import com.example.proyectoalbalatet4.u8.Project29
import com.example.proyectoalbalatet4.u8.Project30
import com.example.proyectoalbalatet4.u9.Project31
import com.example.proyectoalbalatet4.u9.Project32
import com.example.proyectoalbalatet4.u9.Project33
import com.example.proyectoalbalatet4.u9.Project34
import com.example.proyectoalbalatet4.u9.Project35
import com.example.proyectoalbalatet4.u9.Project36
import com.example.proyectoalbalatet4.u9.Project37
import com.example.proyectoalbalatet4.u9.Project38
import com.example.proyectoalbalatet4.u9.Project39
import com.example.proyectoalbalatet4.u9.Project40
import com.example.proyectoalbalatet4.u9.Project41
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
                        composable("Project63") { Project63(navController = navController) }
                        composable("Project64") { Project64(navController = navController) }
                        composable("Project65") { Project65(navController = navController) }
                        composable("Project69") { Project69(navController = navController) }
                        composable("FrontPageU4") { FrontPageU4(navController = navController) }
                        composable("FrontPageU5") { FrontPageU5(navController = navController) }
                        composable("FrontPageU6") { FrontPageU6(navController = navController) }
                        composable("FrontPageU7") { FrontPageU7(navController = navController) }
                        composable("FrontPageU8") { FrontPageU8(navController = navController) }
                        composable("FrontPageU9") { FrontPageU9(navController = navController) }
                        composable("FrontPageU10") { FrontPageU10(navController = navController) }
                        composable("FrontPageU11") { FrontPageU11(navController = navController) }
                        composable("FrontPageU12") { FrontPageU12(navController = navController) }
                        composable("FrontPageU13") { FrontPageU13(navController = navController) }
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