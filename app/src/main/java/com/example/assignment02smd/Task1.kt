package com.example.assignment02smd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment02smd.ui.theme.Assignment02SMDTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment02SMDTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Question3()
                }
            }
        }
    }
}


@Composable
fun Question1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .width(300.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        val painter: Painter = painterResource(id = R.drawable.bg_compose_background)
        Image(
            painter = painter,
            contentDescription = null, // Provide a description for accessibility
        )
        val text = rememberUpdatedState("Jetpack Compose Tutorial")
        Text(
            text = text.value,
            color = Color.Black,
            fontSize = 24.sp, // Font size
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp) // Padding
        )
        val shortText = rememberUpdatedState(newValue = "Jetpack compose is a modern toolkit for " +
                "building native android UI. Compose " +
                "simplifies and accelerates UI development on " +
                "Android with less code, powerful tools and " +
                "intuitive Kotlin API's")
        Text(
            text = shortText.value,
            color = Color.Black,
            modifier = Modifier.padding(start= 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )

        val longText = rememberUpdatedState(newValue = "In this tutorial, you build a simple UI " +
                "component with declarative functions. You " +
                "call Compose functions to say what elements " +
                "you want and the Compose compiler does the " +
                "rest. Compose is built around Composable " +
                "functions. These functions let you define your " +
                "app's UI programmatically because they let " +
                "you describe how it should look and provide " +
                "data dependencies, rather than focus on the " +
                "process of the UI's construction, such as " +
                "initializing an element and then attaching it to " +
                "a parent. To create a Composable function, " +
                "you add the @Composable annotation to the " +
                "function name.")
        Text(
            text = longText.value,
            color = Color.Black,
            modifier = Modifier.padding(start= 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp),
            textAlign = TextAlign.Justify
        )

    }
}

@Composable
fun Question2(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val painter: Painter = painterResource(id = R.drawable.ic_task_completed)
        Image(
            painter = painter,
            contentDescription = null, // Provide a description for accessibility
        )
        val text1 = rememberUpdatedState("All Tasks Completed")
        Text(
            text = text1.value,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold,
        )
        val text2 = rememberUpdatedState(newValue = "Nice Work!")
        Text(
            text = text2.value,
            fontSize = 16.sp,
        )

    }

}



@Composable
fun Question3(){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Composable_Information(
                title = "Text Composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Composable_Information(
                title = "Image Composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Composable_Information(
                title = "Row Composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Composable_Information(
                title = "Column Composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }

}

@Composable
private fun Composable_Information(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor).padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = description,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
fun Task1Preview() {
    Assignment02SMDTheme {
        Question3()
    }
}