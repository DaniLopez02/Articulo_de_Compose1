package com.example.artculodecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artculodecompose.ui.theme.ArtículoDeComposeTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtículoDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Imagen(Texto1 = stringResource(R.string.Titulo) ,
                        Texto2 = stringResource(R.string.Titulo2),
                        Texto3 = stringResource(R.string.Titulo3)
                    )
                }
            }
        }
    }
}

@Composable
fun Texto(Texto1 : String ,Texto2 : String ,Texto3 : String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier){
        Text(
            text = Texto1,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)

        )
        Text(
            text = Texto2,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = Texto3,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun Imagen(Texto1 : String ,Texto2 : String ,Texto3 : String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(painter = image,
            contentDescription = null
        )
        Texto(Texto1 = Texto1,
                Texto2 = Texto2 ,
                Texto3 = Texto3,
                modifier = Modifier.padding(8.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtículoDeComposeTheme {

        Imagen(Texto1 = stringResource(R.string.Titulo) ,
                Texto2 = stringResource(R.string.Titulo2),
                Texto3 = stringResource(R.string.Titulo3)
        )
    }
}