package com.example.mycalculator

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val message = remember{mutableStateOf("")}
            val messageResult = remember{mutableStateOf("")}
            Box(modifier = Modifier) {
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.SpaceAround,
                ) {
                    TextField(modifier = Modifier.fillMaxWidth(),
                        value = message.value,
                        readOnly = true,
                        textStyle = TextStyle(fontSize=25.sp),
                        onValueChange = {})
                    TextField(modifier = Modifier.fillMaxWidth(),
                        value = messageResult.value,
                        readOnly = true,
                        textStyle = TextStyle(fontSize=25.sp),
                        onValueChange = {}
                    )
                    Row(modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Column(modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceBetween,
                        )
                        {
                            Button(modifier = Modifier.fillMaxWidth(0.25f),
                                onClick = {
                                    message.value = ""
                                    messageResult.value = ""
                                },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.Yellow,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("C", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.25f),
                                onClick = { message.value += "7" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("7", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.25f),
                                onClick = { message.value += "4" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("4", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.25f),
                                onClick = { message.value += "1" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("1", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.25f),
                                onClick = { message.value += "." },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.Transparent,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text(".", fontSize = 50.sp)
                            }
                        }
                        Column(modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceAround,) {
                            //Row() {
                            Button(modifier = Modifier.fillMaxWidth(0.33f),
                                onClick = { message.value += "(" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("(", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.33f),
                                onClick = { message.value += "8" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("8", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.33f),
                                onClick = { message.value += "5" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("5", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.33f),
                                onClick = { message.value += "2" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("2", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.33f),
                                onClick = { message.value += "0" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("0", fontSize = 50.sp)
                            }
                        }
                        Column(modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceAround,) {
                            //Row() {
                            Button(modifier = Modifier.fillMaxWidth(0.5f),
                                onClick = { message.value += ")" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text(")", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.5f),
                                onClick = { message.value += "9" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("9", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.5f),
                                onClick = { message.value += "6" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("6", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.5f),
                                onClick = { message.value += "3" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.White,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("3", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(0.5f),
                                onClick = { message.value = Back(message.value) },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.Transparent,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("d", fontSize = 50.sp)
                            }
                        }
                        Column(modifier = Modifier,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.SpaceAround,) {
                            //Row() {
                            Button(modifier = Modifier.fillMaxWidth(),
                                onClick = { message.value += "/" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("/", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(),
                                onClick = { message.value += "*" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("*", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(),
                                onClick = { message.value += "+" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("+", fontSize = 50.sp)
                            }
                            Button(modifier = Modifier.fillMaxWidth(),
                                onClick = { message.value += "-" },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.LightGray,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("-", fontSize = 50.sp)
                            }

                            Button(modifier = Modifier.fillMaxWidth(),
                                onClick = { messageResult.value = GetResult(message.value) },
                                shape = RectangleShape,
                                colors = ButtonDefaults.buttonColors(
                                    Color.Cyan,
                                    contentColor = Color.Black
                                ),
                                border = BorderStroke(1.5.dp, Color.DarkGray)
                            )
                            {
                                Text("=", fontSize = 50.sp)
                            }
                        }
                    }
                }
            }
        }
    }

    private fun Back(str: String): String {
        var newStr = ""
        if(str.isNotEmpty())
            newStr = str.substring(0, str.length-1)
        return newStr
    }

    private fun GetResult(str: String): String {
        var newStr = ""
        try{
            val ex = ExpressionBuilder(str).build()
            val result = ex.evaluate()
            //val longRes = result.toLong()
            //if(result == longRes.toDouble())
                newStr = result.toString()
        } catch(e:Exception){
            Log.d("Ошибка", "Сообщение: ${e.message}")
        }
        return newStr
    }
}
