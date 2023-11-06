package com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.presentation.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.Black1000
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.LexendDecaLight
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.LexendDecaRegular

@Composable
fun H1Text(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Black1000,
    fontFamily: FontFamily = LexendDecaRegular,
    fontWeight: FontWeight = FontWeight.SemiBold
) {
    Text(
        text = text,
        textAlign = textAlign,
        fontFamily = fontFamily,
        color = color,
        fontSize = 32.sp,
        modifier = modifier,
        fontWeight = fontWeight
    )
}

@Composable
fun H2Text(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Black1000,
    fontFamily: FontFamily = LexendDecaRegular,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        text = text,
        textAlign = textAlign,
        fontFamily = fontFamily,
        color = color,
        fontSize = 24.sp,
        modifier = modifier,
        fontWeight = fontWeight
    )
}

@Composable
fun H3Text(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Black1000,
    fontFamily: FontFamily = LexendDecaRegular,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        text = text,
        textAlign = textAlign,
        fontFamily = fontFamily,
        color = color,
        fontSize = 18.sp,
        modifier = modifier,
        fontWeight = fontWeight
    )
}

@Composable
fun H4Text(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Black1000,
    fontFamily: FontFamily = LexendDecaLight,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        text = text,
        textAlign = textAlign,
        fontFamily = fontFamily,
        color = color,
        fontSize = 16.sp,
        modifier = modifier,
        fontWeight = fontWeight
    )
}

@Composable
fun H5Text(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Black1000,
    fontFamily: FontFamily = LexendDecaLight,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        text = text,
        textAlign = textAlign,
        fontFamily = fontFamily,
        color = color,
        fontSize = 14.sp,
        modifier = modifier,
        fontWeight = fontWeight
    )
}

@Composable
fun H6Text(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Black1000,
    fontFamily: FontFamily = LexendDecaLight,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        text = text,
        textAlign = textAlign,
        fontFamily = fontFamily,
        color = color,
        fontSize = 10.sp,
        modifier = modifier,
        fontWeight = fontWeight
    )
}

@Composable
fun ParagraphText(
    modifier: Modifier = Modifier,
    text: String,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = Black1000,
    fontFamily: FontFamily = LexendDecaRegular,
    fontWeight: FontWeight = FontWeight.Normal
) {
    Text(
        text = text,
        textAlign = textAlign,
        fontFamily = fontFamily,
        color = color,
        fontSize = 14.sp,
        modifier = modifier,
        fontWeight = fontWeight
    )
}