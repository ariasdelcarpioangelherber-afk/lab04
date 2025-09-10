package com.example.lab04arias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab04arias.ui.theme.Lab04AriasTheme // ✅ Cambiado el import del theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab04AriasTheme { // ✅ Tema del proyecto actual
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyLazyRow() // ✅ Componente LazyRow
                }
            }
        }
    }
}

@Composable
fun MyLazyRow() {
    val items = (1..50).map { "Item $it" }

    LazyRow(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items) { item ->
            Text(
                text = item,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyRowPreview() {
    Lab04AriasTheme {
        MyLazyRow()
    }
}

