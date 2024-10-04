package com.example.targetapresentacion

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Horizontal
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.targetapresentacion.R.drawable.tomnook
import com.example.targetapresentacion.ui.theme.TargetaPresentacionTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.rounded.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material.icons.twotone.*
import androidx.compose.material.icons.sharp.*
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.ui.graphics.vector.DefaultTintColor
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.targetapresentacion.ui.theme.TargetaPresentacionTheme

//HECHO
//Personaliza la ap con tu foto o un logotipo que quieras diferente al de Android.
//Modifica el color de los iconos.
//Para los textos, modifica al menos el tamaño de fuente, el color y usa alguna vez negrita.

//Organiza los elementos usando weight y padding. Con weight vas a a conseguir que en dispositivos de otro tamaño, el look&feel sea similar ya que evitas usar dimensiones absolutas que pueden provocar elementos que se salgan de la pantalla.
//Si ves estructuras de elementos que se repitan, crea funciones Composable reutilizables.
//Extrae las cadenas de texto como recursos.
//El cargo ha de aparecer en inglés si el idioma del dispositivo es inglés y español si está configurado en español.

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TargetaPresentacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Titulo(modifier = Modifier.padding(innerPadding))
                    footer(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun Titulo(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.tomnook),
            contentDescription = "Descripción de la imagen",
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = stringResource(R.string.titulo),
            style = TextStyle(
                fontSize = 40.sp,

                ),
            modifier = Modifier.padding(top = 8.dp, bottom = 5.dp)
        )
        Text(
            text = stringResource(R.string.subtitulo),
            style = TextStyle(
                fontSize = 15.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(bottom = 30.dp)

        )
    }
}



@Preview
@Composable
fun footer(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom,
            modifier = modifier
                .padding(16.dp)
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Rounded.Call,
                    contentDescription = "Call",
                    tint = Color.Blue,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = "+34 547 423 432")
            }


            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Rounded.Share,
                    contentDescription = "Share",
                    tint = Color.Blue,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = "@Tomasincafeina")
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Rounded.Email,
                    contentDescription = "Email",
                    tint = Color.Blue,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = "tomasin@gmail.com")
            }
        }
    }
}


//@Preview
//@Composable
//fun footer2(modifier: Modifier = Modifier) {
//
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Bottom,
//        modifier = modifier
//            .fillMaxSize()
//            .padding(10.dp)
//    ) {
//        Row(
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            modifier = Modifier
//                .padding(3.dp)
//                .padding(3.dp)
//        ) {
//
//            Icon(
//                imageVector = Icons.Rounded.Call, contentDescription = "Call",
//                tint = Color.Blue
//            )
//            Spacer(modifier = Modifier.width(10.dp))
//            Text(
//                text = "+34 547 423 432",
//
//                )
//
//        }
//        Row(
//            horizontalArrangement = Arrangement.Center,
//            modifier = Modifier.padding(3.dp)
//        ) {
//            Icon(
//                imageVector = Icons.Rounded.Share,
//                contentDescription = "share",
//                tint = Color.Blue
//            )
//            Spacer(modifier = Modifier.width(10.dp))
//            Text(
//                text = "@Tomasincafeina"
//            )
//        }
//        Row(
//            horizontalArrangement = Arrangement.Center,
//            modifier = Modifier.padding(3.dp)
//        ) {
//            Icon(
//                imageVector = Icons.Rounded.Email,
//                contentDescription = "share",
//                tint = Color.Blue
//            )
//            Spacer(modifier = Modifier.width(10.dp))
//
//            Text(
//                text = "tomas.sincafeina@gmail.com"
//            )
//        }
//
//    }
//}
