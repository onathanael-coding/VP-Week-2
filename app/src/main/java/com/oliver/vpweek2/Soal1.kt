package com.oliver.vpweek2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Soal1View(innerPadding: PaddingValues) {
    val spotifyEverythingHasChangedGradient = Brush.verticalGradient(
        colors = listOf(
            Color(0xFFAD4333), Color(0xFF692B22), Color(0xFF121212)
        )
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(spotifyEverythingHasChangedGradient)
            .padding(paddingValues = innerPadding)
    )

    {
        Row(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("V", color = Color.White, fontSize = 17.sp)
            Text("Liked Song", color = Color.White, fontSize = 17.sp)
            Text("...", color = Color.White, fontSize = 20.sp)
        }


        Row(
            modifier = Modifier
                .padding(top = 20.dp, start = 30.dp, end = 30.dp, bottom = 30.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.photo_album),
                "gambar",
                modifier = Modifier.size(300.dp),
                contentScale = ContentScale.FillWidth
            )

        }
        Row(
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(2f)) {
                Row() {
                    Text(
                        "Everything has Changed",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
                Row() {
                    Text(
                        "Taylor Swift, Ed Sheeran", fontWeight = FontWeight.Bold, fontSize = 15.sp, color = Color.White
                    )

                }
            }
            Column(
                modifier = Modifier.weight(1f), horizontalAlignment = Alignment.End
            ) {
                Text(
                    "❤", color = Color.White,
                    fontSize =  20.sp
                )
            }
        }
        Row(modifier = Modifier.padding(horizontal = 20.dp)) {
            Text(
                "-------------------------------------------------------------------------------------------------",
                color = Color.White
            )

        }
        Row(modifier = Modifier.padding(horizontal = 20.dp)) {
            Column(
                modifier = Modifier
                    .padding(vertical = 5.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    "0:01", color = Color.White
                )
            }
            Column(
                modifier = Modifier
                    .padding(vertical = 5.dp)
                    .weight(1f),
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    "-4:03", color = Color.White
                )
            }

        }
        Row(
            modifier = Modifier
                .padding(20.dp)
                .padding(horizontal = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.ui),
                    "gambar mundur",
                    modifier = Modifier.size(30.dp),
                    contentScale = ContentScale.FillWidth
                )

            }
            Column(
                modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.pause),
                    "gambar pause",
                    modifier = Modifier.size(50.dp),

                    contentScale = ContentScale.FillWidth
                )
            }
            Column(
                modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(R.drawable.play),
                    "gambar maju",
                    modifier = Modifier.size(30.dp),
                    contentScale = ContentScale.FillWidth
                )
            }
        }

        Box(
            modifier = Modifier
                .padding(top = 10.dp, start = 20.dp, end = 20.dp)
                .background(
                    color = Color.Gray, shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
                )



        ) {

            Row(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .padding(top = 20.dp)
            ) {
                Column(modifier = Modifier.padding(30.dp).verticalScroll(rememberScrollState())) {
                    Text(
                        "Lyrics preview", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.ExtraBold

                    )
                    Spacer(modifier = Modifier.height(15.dp))
                    Text(
                        """All I knew this morning when I woke
Is I know something now
Know something now I didn't before
And all I've seen since 18 hours ago
Is green eyes and freckles and your smile
In the back of my mind, making me feel like

I just wanna know you better
Know you better, know you better now
I just wanna know you better
Know you better, know you better now
I just wanna know you better
Know you better, know you better now
I just wanna know you, know you, know you

'Cause all I know is we said, "Hello"
And your eyes look like coming home
All I know is a simple name
Everything has changed
All I know is you held the door
You'll be mine and I'll be yours
All I know since yesterday
Is everything has changed

And all my walls stood tall, painted blue
But I'll take 'em down, take 'em down
And open up the door for you
And all I feel in my stomach is butterflies
The beautiful kind, making up for lost time
Taking flight, making me feel right

I just wanna know you better
Know you better, know you better now
I just wanna know you better
Know you better, know you better now
I just wanna know you better
Know you better, know you better now
I just wanna know you, know you, know you

'Cause all I know is we said, "Hello"
And your eyes look like coming home
All I know is a simple name
Everything has changed
All I know is you held the door
You'll be mine and I'll be yours
All I know since yesterday
Is everything has changed

Come back and tell me why
I'm feeling like I've missed you all this time
And meet me there tonight
And let me know that it's not all in my mind

I just wanna know you better
Know you better, know you better now
I just wanna know you, know you, know you

All I know is we said, "Hello"
And your eyes look like coming home
All I know is a simple name
Everything has changed
All I know is you held the door
And you'll be mine and I'll be yours
All I know since yesterday
Is everything has changed

All I know is we said, "Hello"
So dust off your highest hopes
All I know is pouring rain
And everything has changed
All I know is a new found grace
All my days, I'll know your face
All I know since yesterday
Is everything has changed""", color = Color.White,
                        fontWeight = FontWeight.Bold,
                        lineHeight = (20.sp)
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun Soal1Preview() {
    Soal1View(innerPadding = PaddingValues())
}