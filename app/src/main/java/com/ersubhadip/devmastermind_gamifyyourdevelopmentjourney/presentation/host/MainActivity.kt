package com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.presentation.host

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.DevMastermindGamifyYourDevelopmentJourneyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevMastermindGamifyYourDevelopmentJourneyTheme {

            }
        }
    }
}