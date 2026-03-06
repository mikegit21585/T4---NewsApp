package com.example.t4newsapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.t4newsapp.models.News
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun NewsItem(news: News) {

    Box(
        modifier = Modifier
            .height(180.dp)
            .clip(RoundedCornerShape(25.dp))
    ) {

        Image(
            painter = painterResource(id = news.image),
            contentDescription = news.new,
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .background(
                    Color.LightGray,
                    RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp
                    )
                )
                .padding(10.dp)
        ) {
            Text(
                text = news.new,
                fontWeight = FontWeight.Bold
            )
        }
    }
}