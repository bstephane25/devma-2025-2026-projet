package com.example
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.ui.screens.EcoBudgetScreen
import com.example.ui.theme.MyApplicationTheme
import com.example.viewmodel.EcoBudgetViewModel
@Composable fun App() {
    val vm=remember { EcoBudgetViewModel() }
    DisposableEffect(vm) { onDispose { vm.clear() } }
    MyApplicationTheme { Surface(Modifier.fillMaxSize()) { EcoBudgetScreen(vm) } }
}
