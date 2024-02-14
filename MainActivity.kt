package com.example.certificadocurso

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certificadocurso.ui.theme.CertificadoCursoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CertificadoCursoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CertificatingCourse("Pablo Garrido", "Android App Development", "4")
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(name: String, course: String, hour: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center
    ){

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_unam),
                contentDescription = null,
                modifier=modifier
                    .size(50.dp,50.dp)
            )
            Column {
                Text(
                    text = "Universidad Nacional Autónoma de México",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    modifier=modifier
                        .padding(30.dp,0.dp)
                )
                Text(
                    text = "Facultad de Ingeniería",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    modifier=modifier.padding(horizontal = 80.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.logo_fi),
                contentDescription = null, modifier= modifier
                    .size(50.dp, 50.dp)
                    .fillMaxWidth(),
            )
        }

        Text(
            text = "This certificate is presented to:",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()
        )

        Box(
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null, modifier = modifier.fillMaxWidth(),
                alpha = 0.4F
            )
            Text(
                text = name,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
        }

        Text(
            text = "Who has completed a $hour hour course on",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier=modifier.fillMaxWidth()
        )
        Text(
            text = course,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier=modifier.fillMaxWidth()
        )

        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .padding(60.dp,0.dp)
        ){
            Column {
                Image(
                    painter = painterResource(id = R.drawable.firma_falsa1),
                    contentDescription = null,
                    modifier = modifier.size(100.dp)
                )
                Text(
                    text = "Sebastián Coss",
                    fontSize = 10.sp
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = modifier
                    .padding(20.dp,0.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.firma_falsa2),
                    contentDescription = null,
                    modifier=modifier
                        .size(100.dp)
                        .fillMaxWidth()
                )
                Text(
                    text = "Andrés Escobedo",
                    fontSize = 10.sp,
                    //extAlign = TextAlign.End,
                    modifier = modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CertificadoCursoTheme {
        CertificatingCourse("Pablo Garrido","Android App Development", "4")
    }
}