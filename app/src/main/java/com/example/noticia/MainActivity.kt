package com.example.noticia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.noticia.ui.theme.NoticiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoticiaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App ()
                }
            }
        }
    }
}

@Composable
fun App() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = "Imagen de fondo",
            modifier = Modifier
                .fillMaxWidth()
        )

        Text(
            text = stringResource(R.string.titulo),
            fontSize = 24.sp,
            lineHeight = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp)
        )

        Text(
            text = stringResource(R.string.encabezado),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = stringResource(R.string.cuerpo),
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(
    showSystemUi = true,
    name = "Pantalla Principal"
)

@Composable
fun AppPreview() {
    App()
}