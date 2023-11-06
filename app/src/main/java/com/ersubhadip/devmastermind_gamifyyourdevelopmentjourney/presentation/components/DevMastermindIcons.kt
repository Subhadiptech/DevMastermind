package com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.R
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.Black800
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.PrimaryWhite

@Composable
fun BackButton(onBackClicked: () -> Unit) {
    Icon(
        painter = painterResource(R.drawable.ic_back_btn),
        tint = PrimaryWhite,
        modifier = Modifier
            .clip(RoundedCornerShape(200.dp))
            .clickable { onBackClicked() }
            .background(Black800)
            .padding(16.dp),
        contentDescription = "back"
    )
}

@Composable
@Preview
fun BackButtonPreview(onBackClicked: () -> Unit = {}) {
    BackButton {}
}
