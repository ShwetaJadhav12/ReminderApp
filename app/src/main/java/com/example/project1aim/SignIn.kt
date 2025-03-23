package com.example.project1aim

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lint.kotlin.metadata.Visibility
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignIn(navController: NavController) {
    val myPurple1 = Color(0xFF0D3C62)
    val myPurple2 = Color(0xFF33A7B7)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val myPurple3 = Color(0xFFC0D7EA)
        var email by remember { mutableStateOf("") }
        var passwordVisible by remember { mutableStateOf(false) }

        Text(
            text = "Sign Up",
            modifier = Modifier.padding(56.dp),
            color = myPurple1,
            style = MaterialTheme.typography.headlineLarge,
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
            fontStyle = MaterialTheme.typography.headlineLarge.fontStyle
        )

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            placeholder = { Text("Enter your email") },
            modifier = Modifier
                .width(250.dp)
                .background(
                    myPurple3,
                    shape = RoundedCornerShape(8.dp)
                ), // Add shape and background
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = myPurple3,
                unfocusedContainerColor = myPurple3,
                focusedIndicatorColor = myPurple1,
                unfocusedIndicatorColor = Color.Gray
            )

        )


        Spacer(modifier = Modifier.height(36.dp))

        var password by remember { mutableStateOf("") }
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            placeholder = { Text("Enter your password") },
            modifier = Modifier
                .width(250.dp)
                .background(myPurple3, shape = RoundedCornerShape(8.dp)),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = myPurple3,
                unfocusedContainerColor = myPurple3,
                focusedIndicatorColor = myPurple1,
                unfocusedIndicatorColor = Color.Gray
            ),

            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                val image =
                    if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector = image, contentDescription = "Toggle Password Visibility")
                }
            }
        )
        Spacer(modifier = Modifier.height(12.dp))
        TextButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .width(200.dp)
                .height(50.dp),
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = myPurple1,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.White
            )

        ) {
            Text(
                text = "forgot password",
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 20.sp,
                fontWeight = MaterialTheme.typography.bodyLarge.fontWeight,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily
            )

        }


        Spacer(modifier = Modifier.height(44.dp))

        Button(
            onClick = {  },
            colors = ButtonDefaults.buttonColors(containerColor = myPurple1),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.width(180.dp)
        ) {
            Text(
                text = "Sign In",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically

        ) {
            Text(
                text = "Already have account",
                style = MaterialTheme.typography.bodyLarge,
                fontSize = 20.sp,
                fontWeight = MaterialTheme.typography.bodyLarge.fontWeight,
                fontFamily = MaterialTheme.typography.bodyLarge.fontFamily
            )
            Spacer(modifier = Modifier.width(1.dp))
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
                Text(
                    text = "Log In",
                    style = MaterialTheme.typography.bodyLarge,
                    fontSize = 20.sp,
                    fontWeight = MaterialTheme.typography.bodyLarge.fontWeight,
                    fontFamily = MaterialTheme.typography.bodyLarge.fontFamily
                )

            }

        }

    }
    }

