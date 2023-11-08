package com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.presentation.components.AnimatedCircularProgressIndicator
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.presentation.components.H2Text
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.presentation.components.TextWithShadow
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.Black800
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.CardColor
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.PrimaryGreen
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.PrimaryWhite
import com.ersubhadip.devmastermind_gamifyyourdevelopmentjourney.ui.theme.PrimaryYellow

sealed class HomeSectionType {
    data object TrendingSection : HomeSectionType()
    data object QuizSection : HomeSectionType()
    data object CertificateCourseSection : HomeSectionType()
    data object ComingSoonSection : HomeSectionType()
}

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
                    .background(CardColor)
                    .padding(horizontal = 16.dp, vertical = 24.dp)
            ) {
                TextWithShadow(
                    text = "Hey Coder",
                    textStyle = TextStyle(
                        fontSize = 24.sp
                    )
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp)
                ) {
                    AnimatedCircularProgressIndicator(
                        currentValue = 30,
                        maxValue = 100,
                        progressBackgroundColor = Color.Black,
                        progressIndicatorColor = Black800,
                        completedColor = Black800,
                        modifier = Modifier.weight(1f),
                        content = {

                        }
                    )
                    AnimatedCircularProgressIndicator(
                        currentValue = 30,
                        maxValue = 100,
                        progressBackgroundColor = Color.Black,
                        progressIndicatorColor = PrimaryGreen,
                        completedColor = PrimaryGreen,
                        modifier = Modifier.weight(1f),
                        content = {

                        }
                    )
                    AnimatedCircularProgressIndicator(
                        currentValue = 30,
                        maxValue = 100,
                        progressBackgroundColor = Color.Black,
                        progressIndicatorColor = PrimaryYellow,
                        completedColor = PrimaryYellow,
                        modifier = Modifier.weight(1f),
                        content = {

                        }
                    )
                }
            }
            Spacer(modifier = Modifier.height(32.dp))
            H2Text(
                text = "Popular Courses",
                color = PrimaryWhite,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(32.dp))
        }

    }
}


data class HomeSectionResponse(
    val sectionData: List<HomeSectionData>,
    val sectionType: HomeSectionType
)

data class HomeSectionData(
    val id: Long? = -1,
    val title: String? = null,
    val description: String? = null

)


@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}