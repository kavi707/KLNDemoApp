package com.kavi.droid.kln.demo.stat.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.togetherWith
import androidx.compose.animation.with
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kavi.droid.color.palette.extension.quaternary
import com.kavi.droid.color.palette.extension.shadow
import com.kavi.droid.kln.demo.stat.R
import javax.inject.Inject

class StatDeptUI @Inject constructor() {

    @OptIn(ExperimentalAnimationApi::class)
    @Composable
    internal fun StatDeptUI() {

        var isExpanded by remember { mutableStateOf(false) }

        Scaffold { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(8.dp),
                        text = "Dept of Statistics",
                        style = MaterialTheme.typography.titleLarge
                    )
                }

                Box(
                    modifier = Modifier
                        .width(360.dp) // Adjust width as needed
                        .height(240.dp) // Adjust height as needed
                        .shadow(8.dp, shape = RoundedCornerShape(16.dp))
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White) // Optional to enhance shadow visibility
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.stat_image),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Column {
                    AnimatedContent(
                        targetState = isExpanded,
                        transitionSpec = {
                            (fadeIn()).togetherWith(fadeOut())
                        }
                    ) { isExpanded ->
                        Text(
                            modifier = Modifier
                                .padding(start = 12.dp, end = 12.dp, top = 8.dp, bottom = 4.dp),
                            text = if (isExpanded) stringResource(R.string.stat_dpt_desc) else stringResource(
                                R.string.stat_dpt_desc_short
                            ),
                            style = TextStyle(
                                fontSize = MaterialTheme.typography.bodySmall.fontSize
                            )
                        )
                    }

                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 12.dp, end = 12.dp, top = 4.dp)
                            .clickable { isExpanded = !isExpanded },
                        text = if (isExpanded) stringResource(R.string.read_less) else stringResource(
                            R.string.read_more
                        ),
                        textAlign = TextAlign.End,
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.bodySmall.fontSize,
                            color = MaterialTheme.colorScheme.quaternary
                        )
                    )
                }

                NoticeBoard()

                Button(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp),
                    onClick = {}
                ) {
                    Text(text = "Staff")
                }
            }
        }
    }

    @Composable
    private fun NoticeBoard() {
        Column {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 2.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    text = "Notice Board",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Column (
                modifier = Modifier
                    .height(205.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                NoticeItem(
                    heading = "Calling Applications for MSc. in Statistics & Masters of Statistics - 2025 Intake",
                    content = "Deadline for applications: 15th of  February 2025"
                )

                NoticeItem(
                    heading = "Calling Applications for MSc. in Computer Science - 2024 Intake",
                    content = "Deadline for applications: 15th of January 2025"
                )

                NoticeItem(
                    heading = "Calling Applications for BSc External Degree - 2024 Intake",
                    content = "Deadline for applications: 15th of December 2024"
                )
            }
        }
    }

    @Composable
    private fun NoticeItem(heading: String, content: String) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(12.dp))
                .shadow(6.dp, shape = RoundedCornerShape(12.dp), spotColor = MaterialTheme.colorScheme.shadow)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.surface)
        ) {
            Column {
                Text(
                    modifier = Modifier
                        .padding(top = 12.dp, start = 12.dp, end = 12.dp),
                    text = heading,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    modifier = Modifier
                        .padding(bottom = 12.dp, top = 8.dp, start = 12.dp, end = 12.dp),
                    text = content,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun StatDeptUIPreview() {
    StatDeptUI().StatDeptUI()
}