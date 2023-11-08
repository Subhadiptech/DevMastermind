package com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.presentation.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
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

@Composable
fun TextWithShadow(
    modifier: Modifier = Modifier,
    text: String,
    textStyle: TextStyle = TextStyle.Default.copy(
        fontSize = 24.sp,
        fontWeight = FontWeight.W600,
        fontFamily = LexendDecaRegular
    ),
    shadowSize: Dp = 8.dp
) {

    val infiniteTransition = rememberInfiniteTransition(label = "infinite_transition")

    val offset by infiniteTransition.animateFloat(
        initialValue = LocalDensity.current.run { -16.dp.toPx() },
        targetValue = LocalDensity.current.run { 0.dp.toPx() },
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 1000,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Reverse
        ),
        label = "gradient_rotation"
    )

    val textMeasurer = rememberTextMeasurer()

    val textLayoutResult = remember(text) {
        textMeasurer.measure(
            text = text,
            style = textStyle
        )
    }
    val textSize = LocalDensity.current.run { textLayoutResult.size.toSize().toDpSize() }

    Canvas(
        modifier = modifier
            .size(textSize * 2)
    ) {
        translate(top = offset) {
            drawText(
                textLayoutResult = textLayoutResult,
                topLeft = Offset(
                    x = 0f,
                    y = textLayoutResult.size.height.toFloat() / 2
                ),
                color = Color.White,
                shadow = Shadow(
                    color = Color.Gray,
                    offset = Offset(
                        x = 2.dp.toPx(),
                        y = offset * -2
                    ),
                    blurRadius = shadowSize.toPx()
                )
            )
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0x000000
)
@Composable
fun TextWithShadowPreview() {
    TextWithShadow(text = "Text")
}