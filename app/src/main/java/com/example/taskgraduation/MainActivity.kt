package com.example.taskgraduation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskgraduation.ui.theme.TaskGraduationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskGraduationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ListItem(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ListItem(modifier: Modifier = Modifier) {
    Row(modifier.fillMaxWidth()
        .padding(10.dp)
        .background(
            color = androidx.compose.ui.graphics.Color.White,
            shape = RoundedCornerShape(10.dp))
        .clickable {  }
    ) {
        Image(
            modifier = Modifier
                .size(50.dp)
                .padding(top = 8.dp, start = 8.dp)
                .clip(shape = CircleShape),
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null
        )
        Column(
            Modifier.padding(10.dp)
        ) {
            Row(
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Hello"
                )
                Text(text = "World")
                Spacer(modifier = Modifier.width(5.dp))
                Image(
                    modifier = Modifier.size(15.dp),
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "Hello")
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                text = "World world world world World world world world World world world world World world world world"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskGraduationTheme {
        ListItem()
    }
}