package com.example.proyectoalbalatet4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectoalbalate.fronts.*
import com.example.proyectoalbalate.u10.Project42
import com.example.proyectoalbalate.u10.Project43
import com.example.proyectoalbalate.u10.Project44
import com.example.proyectoalbalate.u10.Project45
import com.example.proyectoalbalate.u10.Project46
import com.example.proyectoalbalate.u16.Project84
import com.example.proyectoalbalate.u17.Project90
import com.example.proyectoalbalate.u11.Project47
import com.example.proyectoalbalate.u11.Project48
import com.example.proyectoalbalate.u11.Project49
import com.example.proyectoalbalate.u11.Project50
import com.example.proyectoalbalate.u11.Project51
import com.example.proyectoalbalate.u11.Project52
import com.example.proyectoalbalate.u11.Project53
import com.example.proyectoalbalate.u11.Project54
import com.example.proyectoalbalate.u11.Project55
import com.example.proyectoalbalate.u11.Project56
import com.example.proyectoalbalate.u11.Project57
import com.example.proyectoalbalate.u11.Project58
import com.example.proyectoalbalate.u16.Project82
import com.example.proyectoalbalate.u13.Project69
import com.example.proyectoalbalate.u12.Project63
import com.example.proyectoalbalate.u12.Project64
import com.example.proyectoalbalate.u12.Project65
import com.example.proyectoalbalate.u14.Project72
import com.example.proyectoalbalate.u14.Project73
import com.example.proyectoalbalate.u15.Project77
import com.example.proyectoalbalate.u15.Project78
import com.example.proyectoalbalate.u22.Project107
import com.example.proyectoalbalate.u22.Project108
import com.example.proyectoalbalate.u17.Project91
import com.example.proyectoalbalate.u16.Project83
import com.example.proyectoalbalate.u17.Project88
import com.example.proyectoalbalate.u17.Project89
import com.example.proyectoalbalate.u18.Project93
import com.example.proyectoalbalate.u19.Project95
import com.example.proyectoalbalate.u23.Project111
import com.example.proyectoalbalate.u20.Project97
import com.example.proyectoalbalate.u21.Project103
import com.example.proyectoalbalate.u21.Project104
import com.example.proyectoalbalate.u24.Project115
import com.example.proyectoalbalate.u24.Project116
import com.example.proyectoalbalate.u25.Project118
import com.example.proyectoalbalate.u26.Project121
import com.example.proyectoalbalate.u27.Project124
import com.example.proyectoalbalate.u28.Project126
import com.example.proyectoalbalate.u28.Project127
import com.example.proyectoalbalate.u29.Project130
import com.example.proyectoalbalate.u30.Project133
import com.example.proyectoalbalate.u31.Project136
import com.example.proyectoalbalate.u33.Project141
import com.example.proyectoalbalate.u32.Project139
import com.example.proyectoalbalate.u4.Project5
import com.example.proyectoalbalate.u4.Project6
import com.example.proyectoalbalate.u4.Project7
import com.example.proyectoalbalate.u4.Project8
import com.example.proyectoalbalate.u4.Project9
import com.example.proyectoalbalate.u5.Project10
import com.example.proyectoalbalate.u5.Project11
import com.example.proyectoalbalate.u5.Project12
import com.example.proyectoalbalate.u5.Project13
import com.example.proyectoalbalate.u5.Project14
import com.example.proyectoalbalate.u6.Project15
import com.example.proyectoalbalate.u6.Project16
import com.example.proyectoalbalate.u6.Project17
import com.example.proyectoalbalate.u7.Project18
import com.example.proyectoalbalate.u7.Project19
import com.example.proyectoalbalate.u7.Project20
import com.example.proyectoalbalate.u7.Project21
import com.example.proyectoalbalate.u7.Project22
import com.example.proyectoalbalate.u8.Project23
import com.example.proyectoalbalate.u8.Project24
import com.example.proyectoalbalate.u8.Project25
import com.example.proyectoalbalate.u8.Project26
import com.example.proyectoalbalate.u8.Project27
import com.example.proyectoalbalate.u8.Project28
import com.example.proyectoalbalate.u8.Project29
import com.example.proyectoalbalate.u8.Project30
import com.example.proyectoalbalate.u9.Project31
import com.example.proyectoalbalate.u9.Project32
import com.example.proyectoalbalate.u9.Project33
import com.example.proyectoalbalate.u9.Project34
import com.example.proyectoalbalate.u9.Project35
import com.example.proyectoalbalate.u9.Project36
import com.example.proyectoalbalate.u9.Project37
import com.example.proyectoalbalate.u9.Project38
import com.example.proyectoalbalate.u9.Project39
import com.example.proyectoalbalate.u9.Project40
import com.example.proyectoalbalate.u9.Project41
import com.example.proyectoalbalate.ui.theme.ProyectoAlbalateT4Theme


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
                        composable("Project72") { Project72(navController = navController) }
                        composable("Project73") { Project73(navController = navController) }
                        composable("Project77") { Project77(navController = navController) }
                        composable("Project78") { Project78(navController = navController) }
                        composable("Project82") { Project82(navController = navController) }
                        composable("Project83") { Project83(navController = navController) }
                        composable("Project84") { Project84(navController = navController) }
                        composable("Project88") { Project88(navController = navController) }
                        composable("Project89") { Project89(navController = navController) }
                        composable("Project90") { Project90(navController = navController) }
                        composable("Project91") { Project91(navController = navController) }
                        composable("Project93") { Project93(navController = navController) }
                        composable("Project95") { Project95(navController = navController) }
                        composable("Project97") { Project97(navController = navController) }
                        composable("Project103") { Project103(navController = navController) }
                        composable("Project104") { Project104(navController = navController) }
                        composable("Project107") { Project107(navController = navController) }
                        composable("Project108") { Project108(navController = navController) }
                        composable("Project111") { Project111(navController = navController) }
                        composable("Project115") { Project115(navController = navController) }
                        composable("Project116") { Project116(navController = navController) }
                        composable("Project118") { Project118(navController = navController) }
                        composable("Project121") { Project121(navController = navController) }
                        composable("Project124") { Project124(navController = navController) }
                        composable("Project126") { Project126(navController = navController) }
                        composable("Project127") { Project127(navController = navController) }
                        composable("Project130") { Project130(navController = navController) }
                        composable("Project133") { Project133(navController = navController) }
                        composable("Project136") { Project136(navController = navController) }
                        composable("Project139") { Project139(navController = navController) }
                        composable("Project141") { Project141(navController = navController) }
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
                        composable("FrontPageU14") { FrontPageU14(navController = navController) }
                        composable("FrontPageU15") { FrontPageU15(navController = navController) }
                        composable("FrontPageU16") { FrontPageU16(navController = navController) }
                        composable("FrontPageU17") { FrontPageU17(navController = navController) }
                        composable("FrontPageU18") { FrontPageU18(navController = navController) }
                        composable("FrontPageU19") { FrontPageU19(navController = navController) }
                        composable("FrontPageU20") { FrontPageU20(navController = navController) }
                        composable("FrontPageU21") { FrontPageU21(navController = navController) }
                        composable("FrontPageU22") { FrontPageU22(navController = navController) }
                        composable("FrontPageU23") { FrontPageU23(navController = navController) }
                        composable("FrontPageU24") { FrontPageU24(navController = navController) }
                        composable("FrontPageU25") { FrontPageU25(navController = navController) }
                        composable("FrontPageU26") { FrontPageU26(navController = navController) }
                        composable("FrontPageU27") { FrontPageU27(navController = navController) }
                        composable("FrontPageU28") { FrontPageU28(navController = navController) }
                        composable("FrontPageU29") { FrontPageU29(navController = navController) }
                        composable("FrontPageU30") { FrontPageU30(navController = navController) }
                        composable("FrontPageU31") { FrontPageU31(navController = navController) }
                        composable("FrontPageU32") { FrontPageU32(navController = navController) }
                        composable("FrontPageU33") { FrontPageU33(navController = navController) }
                        composable("FrontPage") { FrontPage(navController = navController)}
                        }
                    }
                }
            }
        }
    }


