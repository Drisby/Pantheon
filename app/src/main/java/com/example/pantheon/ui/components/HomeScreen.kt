package com.example.pantheon.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pantheon.R



@Composable
fun HomeMain (
    modifier: Modifier = Modifier,
){

    TopInfo()

    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    ) {
        NavButtons(
            image = painterResource(id = R.drawable.history_svgrepo_com),
            text = stringResource(id = R.string.history))
        NavButtons(
            image = painterResource(id = R.drawable.route_svgrepo_com),
            text = stringResource(id = R.string.route))
        NavButtons(
            image = painterResource(id = R.drawable.group_fill1_wght600_grad200_opsz48),
            text = stringResource(id = R.string.event))
        NavButtons(
            image = painterResource(id = R.drawable.running_svgrepo_com),
            text = stringResource(id = R.string.training))
    }
    StartRun()
}

@Composable
fun NavButtons(image: Painter, text: String){
    Card(modifier = Modifier.padding(20.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                contentScale = ContentScale.Crop,
            )
            Text(
                text = text,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(6.dp)
            )
        }
    }
}

@Composable
fun StartRun () {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = CenterHorizontally
    ) {
        Button(onClick = {}, //fill button
        modifier = Modifier
            .fillMaxWidth()
            .height(175.dp)
            .background(Color.Green)
        )
        { Text(
            text = stringResource(id = R.string.start_run),
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold
        ) }
    }
}

@Composable
fun TopInfo (){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = CenterHorizontally
    ) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    elevation = 5.dp,
                    border = BorderStroke(1.dp, Color.Black)
                ) {
                    Text(
                        text = "Meters Run",
                        fontSize = 24.sp,

                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_settings_24) ,
                    contentDescription = "Settings",
                    contentScale = ContentScale.Crop,

                )
            }
        }
    }

}

@Preview
@Composable
fun HomePreview(){
    HomeMain()
}