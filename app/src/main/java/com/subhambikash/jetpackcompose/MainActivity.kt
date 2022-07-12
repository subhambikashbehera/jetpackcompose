package com.subhambikash.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.subhambikash.jetpackcompose.ui.theme.JetpackcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Column(modifier = Modifier
//                .background(Color.DarkGray)
//                .fillMaxSize().padding(20.dp),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//
//                ) {
//
//               ViewFunctions()
//
//            }

            BoxLayout(name = "add To Cart")

        }
    }
}



@Composable
fun BoxLayout(name: String){

    Box{
       Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "dummy Image", modifier = Modifier
           .fillMaxWidth()
           ,
            contentScale = ContentScale.Crop
           )
       
        Text(text = "dummy image", modifier = Modifier
            .align(Alignment.BottomStart)
            .padding(10.dp), style = MaterialTheme.typography.h4, fontWeight = FontWeight.Bold)
        
        Button(onClick = { /*TODO*/ }, modifier = Modifier
            .padding(10.dp)
            .border(4.dp,
                Color.DarkGray, RectangleShape).align(Alignment.TopEnd), colors =ButtonDefaults.textButtonColors(
            backgroundColor = Color.White, contentColor = Color.Black
        ) ) {
            Text(text = name)
        }
        
        
        
        
    }

}











@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
        fontSize = 32.sp,
        modifier = Modifier
            .background(Color.Green)
            .border(2.dp, Color.Red)
            .padding(5.dp)
            .fillMaxWidth()
            .padding(0.dp, 10.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackcomposeTheme {
       BoxLayout(name = "subham")
    }
}

@Composable
fun ViewFunctions(){

    Greeting("Android")

    Greeting("Android")

    Greeting("Android")
}