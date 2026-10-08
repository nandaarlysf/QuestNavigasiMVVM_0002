package com.example.praktikum2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle.Alignment

@composable
fun TataletakColumn(modifier:Modifier){
    Column(modifier =modifier.panding(top =20.dp,start =20.dp,start =20.dp, end= 20.dp)){
        Text(text ="komponen1")
        Text(text ="komponen2")
        Text(text ="komponen3")
        Text(text ="komponen4")
    }
}

@Composable

@composable
fun TataletakRow(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
    }
}

fun Box(
    modifier: modifier,
    contentAlignment: Alignment,
    content: BoxScope.() -> Unit
) {
}

@composable
fun TataletakBox(modifier: Modifier=Modifier){
    Box(
       modifier=modifier.
            fillMaxWidth()
            fillMaxHeight(),
       contentAlignment=Alignment.Center
    ){
        Text(text="Box 1")
    }
}

private fun Companion.align(alignment: Alignment) {}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    val gambar = painterResource(id = R.drawable.notasinaton)

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col1 Row1 Komponen1")
                Text(text = "Col1 Row1 Komponen2")
                Text(text = "Col1 Row1 Komponen3")
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col1 Row2 Komponen1")
                Text(text = "Col1 Row2 Komponen2")
                Text(text = "Col1 Row2 Komponen3")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color.Cyan),
        contentAlignment = Alignment.Center
        ) {
        Image(
            painter = gambar,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Text(
            text = "My App",
            fontSize = 50.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.align(Alignment.Center)
        }
    }
}