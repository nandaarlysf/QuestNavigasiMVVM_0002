package com.example.praktikum2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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

@composable
fun TataletakBox(modifier: Modifier=Modifier){
    Box(
       modifier=modifier.
       .fillMaxWidth()
       .fillMaxHeight(),
       contentAlignment=Alignment.Center
    ){
        Text(text="Box 1")
    }
}

@composable
fun TataletakBoxColumnRow(modifier:Modifier=Modifier){
    column(
        modifier=modifier
            .padding(16.dp)
            .fillMaxWidth()
    ){
        //bagian Row 1 di dalam column
        Row(
            modifier=Modifier.fillMaxWidth(),
            horizontalArrangement=Arrangement.SpaceEvenly
        ){
            Text(text="komponen 1.1")
            Text(text="komponen 1.2")
            Text(text="komponen 1.3")
        }

        Spacer(modifier=Modifier.height(16.dp))

        //bagian Box dengan Latar Belakang dan Gambar/texts
        Box(
            modifier= Modifier {
                .fillMaxWidth()
                .height(200.dp)
                .background(color.LightGray),
               contentAlignment=Alignment.Center
        ){
            column(
                horizontalAlignment=Alignment.CenterHorizontally
            )}
            Text(
                text="pembuatan applikasi digital absen",
                fontSize=18.sp,
                fontWeight=FontWeight.Bold,
                fontFamily=FontFamily.SansSerif,
            )


@Composable