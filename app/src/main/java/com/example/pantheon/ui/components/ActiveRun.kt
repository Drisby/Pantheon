package com.example.pantheon.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pantheon.R

@Composable
fun ActiveRunApp (
){
    PauseRun()
    Stats()
}

@Composable
fun Stats (){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopInfoCard(title = "Time", info = "PlaceHolder")
        InfoRow(title1 = "Pace", title2 = "Distance", stats1 = "Placeholder", stats2= "Placeholder")
        InfoRow(title1 = "Elevation", title2 = "Calories", stats1 = "Placeholder", stats2= "Placeholder")
    }
}

@Composable
fun InfoRow(title1: String, title2: String, stats1: String, stats2: String){
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        MiddleInfoCard(title = title1, stats = stats1)
        MiddleInfoCard(title = title2, stats = stats2)
        }
}

@Composable
fun TopInfoCard(title: String, info: String){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Text(
            text = info,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 40.dp)
        )
        Card(
            modifier = Modifier
                .padding(bottom = 60.dp),
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Text(text = title,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,)
        }
    }
}

@Composable
fun MiddleInfoCard (title: String, stats: String){
    Card(
        modifier = Modifier
            .padding(20.dp)
            .width(150.dp),
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Text(
            text = stats,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 40.dp)
        )
        Card(
            modifier = Modifier
                .padding(bottom = 60.dp)
                .width(150.dp),
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Text(text = title,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Composable
fun PauseRun () {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {}, //fill button
            modifier = Modifier
                .fillMaxWidth()
                .height(175.dp)
                .background(Color.Green)
        )
        { Text(
            text = stringResource(id = R.string.asdas),
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        ) }
    }
}


@Preview
@Composable
fun ActiveRunPreview(){
    ActiveRunApp()
}