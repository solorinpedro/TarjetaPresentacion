package edu.ucne.tarjetapresentacion

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Bottom
import androidx.compose.foundation.layout.Arrangement.Top
import androidx.compose.foundation.layout.WindowInsetsSides.Companion.Bottom
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Directions
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.Top
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.ucne.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.DarkGray

                ) {
                    PresentacionImagen(
                        "Pedro Luis Solorin",
                        "Ingeniero en Sistemas",
                        "pedrosolorin@gmail.com",
                        "8096187821",
                        "Vista al Valle"
                    )
                }
            }
        }
    }
}

@Composable
fun PresentacionImagen(name:String, ocupacion: String, email:String, celular: String, direccion:String) {
    val image = painterResource(id = R.drawable.android_logo)

    Box {
        Column {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .wrapContentWidth(CenterHorizontally)
                    .padding(start = 160.dp, 200.dp, end = 150.dp)
                    .size(100.dp)
            )
            Box {
                Text(
                    text = name,
                    modifier = Modifier
                        .wrapContentWidth(CenterHorizontally)
                        .padding(start = 55.dp, end = 16.dp),
                    color = Color.White,
                    fontSize = 40.sp,
                )
                Text(
                    text = ocupacion,
                    modifier = Modifier
                        .wrapContentWidth(CenterHorizontally)
                        .padding(start = 115.dp, top = 50.dp),
                    color = Color.Green,
                    fontSize = 20.sp,
                )
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(vertical = 100.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                ) {

                    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "",
                        modifier = Modifier.background(color = Color.Green))
                        Text(
                            text = email,
                            modifier = Modifier
                                .padding(horizontal = 15.dp),
                            color = Color.White,
                            fontSize = 18.sp,
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
                        Icon(imageVector = Icons.Default.Directions, contentDescription = "",
                            modifier = Modifier.background(color = Color.Green))
                        Text(
                            text = direccion,
                            modifier = Modifier
                                .padding(horizontal = 15.dp),
                            color = Color.White,
                            fontSize = 18.sp,
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
                        Icon(imageVector = Icons.Default.PhoneAndroid, contentDescription = "",
                            modifier = Modifier.background(color = Color.Green))
                        Text(
                            text = celular,
                            modifier = Modifier
                                .padding(horizontal = 15.dp),
                            color = Color.White,
                            fontSize = 18.sp,
                        )
                    }
                }
            }
        }
    }
}