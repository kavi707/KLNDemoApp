package com.kavi.droid.kln.demo.runner.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kavi.droid.color.palette.KvColorPalette

// Set of Material typography styles to start with
val AppTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        lineHeight = 54.sp,
        letterSpacing = .5.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)

@Composable
fun KLNDemoTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    // If you want to ignore the color theme generation and use the dynamic color according to the device colors, then make this true.
    isDynamicColor: Boolean = false,
    appColorScheme: MutableState<ColorScheme?> = remember { mutableStateOf(null) },
    content: @Composable () -> Unit
) {
    val dynamicColor = isDynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

    appColorScheme.value?.let { colorScheme ->
        MaterialTheme(
            colorScheme = colorScheme,
            typography = AppTypography,
            content = content
        )
    }?: run {
        val newColorScheme = when {
            dynamicColor && isDarkTheme -> {
                dynamicDarkColorScheme(LocalContext.current)
            }
            dynamicColor && !isDarkTheme -> {
                dynamicLightColorScheme(LocalContext.current)
            }
            isDarkTheme -> KvColorPalette.colorSchemeThemePalette.darkColorScheme
            else -> KvColorPalette.colorSchemeThemePalette.lightColorScheme
        }

        MaterialTheme(
            colorScheme = newColorScheme,
            typography = AppTypography,
            content = content
        )
    }
}