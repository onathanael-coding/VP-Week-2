package com.oliver.vpweek2

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val Poppins = FontFamily(
    Font(
        R.font.poppins_regular,
        FontWeight.Normal
    ),
    Font(
        R.font.poppins_extra_bold,
        FontWeight.Bold
    )
)

@Composable
fun TravelView() {

    var kesenangan by remember { mutableStateOf("") }
    var tempat by remember { mutableStateOf("") }
    var tambah by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Image(
            painter = painterResource(R.drawable.aurora_background),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(
                            topStart = 24.dp,
                            topEnd = 24.dp
                        )
                    )
                    .background(Color(0xFF383C5C))
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = 20.dp,
                            end = 20.dp,
                            top = 20.dp,
                            bottom = 10.dp
                        )
                ) {

                    Text(
                        text = "My Travel",
                        color = Color.White,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 15.dp)
                    )

                    Text(
                        text = "Aurora",
                        color = Color.White,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )

                    Text(
                        text = "Tromsø, Norway",
                        color = Color.White,
                        fontFamily = Poppins,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(top = 2.dp)
                    )

                    Row(
                        modifier = Modifier.padding(top = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "★★★★★",
                            color = Color(0xFFFFD166),
                            fontFamily = Poppins,
                            fontSize = 15.sp
                        )

                        Text(
                            text = "4.9",
                            color = Color(0xFFFFD166),
                            fontFamily = Poppins,
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 12.dp)
                        )
                    }

                    TextField(
                        value = kesenangan,
                        onValueChange = {
                            kesenangan = it
                        },
                        placeholder = {
                            Text(
                                text = "What did you enjoy most about your trip?",
                                fontFamily = Poppins,
                                fontSize = 8.sp,
                                color = Color(0xFF000000)
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp)
                            .clip(RoundedCornerShape(6.dp)),
                        textStyle = TextStyle(
                            fontFamily = Poppins,
                            fontSize = 10.sp,
                            color = Color.Black
                        ),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color(0xFFD9ECFF),
                            unfocusedContainerColor = Color(0xFFD9ECFF),
                            disabledContainerColor = Color(0xFFD9ECFF),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            cursorColor = Color.Black
                        )
                    )

                    TextField(
                        value = tempat,
                        onValueChange = {
                            tempat = it
                        },
                        placeholder = {
                            Text(
                                text = "What was your favorite spot?",
                                fontFamily = Poppins,
                                fontSize = 8.sp,
                                color = Color(0xFF000000)
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp)
                            .clip(RoundedCornerShape(6.dp)),
                        textStyle = TextStyle(
                            fontFamily = Poppins,
                            fontSize = 10.sp,
                            color = Color.Black
                        ),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color(0xFFD9ECFF),
                            unfocusedContainerColor = Color(0xFFD9ECFF),
                            disabledContainerColor = Color(0xFFD9ECFF),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            cursorColor = Color.Black
                        )
                    )

                    TextField(
                        value = tambah,
                        onValueChange = {
                            tambah = it
                        },
                        placeholder = {
                            Text(
                                text = "Anything else you'd like to add?",
                                fontFamily = Poppins,
                                fontSize = 8.sp,
                                color = Color(0xFF000000)
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp)
                            .clip(RoundedCornerShape(6.dp)),
                        textStyle = TextStyle(
                            fontFamily = Poppins,
                            fontSize = 10.sp,
                            color = Color.Black
                        ),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color(0xFFD9ECFF),
                            unfocusedContainerColor = Color(0xFFD9ECFF),
                            disabledContainerColor = Color(0xFFD9ECFF),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            cursorColor = Color.Black
                        )
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 12.dp),
                        horizontalArrangement = Arrangement.End
                    ) {

                        FloatingActionButton(
                            onClick = {
                            },
                            modifier = Modifier.size(38.dp),
                            shape = RoundedCornerShape(10.dp),
                            containerColor = Color(0xFFD9ECFF),
                            contentColor = Color.Black
                        ) {

                            Text(
                                text = "+",
                                fontFamily = Poppins,
                                fontWeight = FontWeight.Bold,
                                fontSize = 22.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TravelViewPreview() {
    TravelView()
}