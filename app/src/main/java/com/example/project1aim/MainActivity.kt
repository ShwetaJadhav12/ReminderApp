package com.example.project1aim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.project1aim.ui.theme.Project1aimTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project1aimTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    navigation()
                }
            }
        }
    }
}

@Composable
fun HomePage(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        val myPurple1 = Color(0xFF0D3C62)
        val myPurple2= Color(0xFF33A7B7)
        Spacer(modifier=Modifier.height(32.dp))
        Text(text="Remind me",
            modifier = Modifier.padding(26.dp),
            color = myPurple1,
            style = MaterialTheme.typography.headlineLarge,
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
            fontStyle = MaterialTheme.typography.headlineLarge.fontStyle
        )
        Spacer(modifier=Modifier.height(6.dp))
        Text(text="Never Forget, Always Succeed!",
            modifier = Modifier.padding(10.dp),
            color = myPurple2,
            style = MaterialTheme.typography.headlineLarge,
            fontSize = 26.sp,
            fontWeight = MaterialTheme.typography.headlineLarge.fontWeight,
            fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
            fontStyle = MaterialTheme.typography.headlineLarge.fontStyle
        )

        Spacer(modifier=Modifier.height(16.dp))
        Image(
            painter = painterResource(R.drawable.remind),
            contentDescription = "Test Image",
            modifier = Modifier
                .width(380.dp)
                .height(400.dp),
            alignment = Alignment.Center
        )

        Spacer(modifier=Modifier.height(40.dp))
        Button(
            onClick = { navController.navigate("sign_up") },

            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            shape = MaterialTheme.shapes.medium,
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = myPurple1,
                contentColor = Color.White,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.White
            )

        ) {
            Text(text="Sign Up",
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 20.sp,
                fontWeight = MaterialTheme.typography.bodyLarge.fontWeight,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily,
                fontStyle = MaterialTheme.typography.bodyLarge.fontStyle
            )



        }
        Spacer(modifier=Modifier.height(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(text="Already have account",
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 20.sp,
                fontWeight = MaterialTheme.typography.bodyLarge.fontWeight,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily
            )
            Spacer(modifier=Modifier.width(1.dp))
            TextButton(
                onClick = { navController.navigate("log_in") },
                modifier = Modifier
                    .width(82.dp)
                    .height(50.dp),
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = myPurple1,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.White
                )

            ) {
                Text(text="Log In",
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 20.sp,
                    fontWeight = MaterialTheme.typography.bodyLarge.fontWeight,
                    fontFamily = MaterialTheme.typography.bodyLarge.fontFamily)

            }




        }

    }
}


