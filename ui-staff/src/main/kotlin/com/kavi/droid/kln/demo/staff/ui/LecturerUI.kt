package com.kavi.droid.kln.demo.staff.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.kavi.droid.color.palette.extension.shadow
import com.kavi.droid.kln.demo.parent.model.Lecturer
import com.kavi.droid.kln.demo.staff.R
import javax.inject.Inject

class LecturerUI @Inject constructor() {

    @Composable
    fun LecturerDetailUI(lecturer: Lecturer) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .shadow(6.dp, shape = RoundedCornerShape(12.dp), spotColor = MaterialTheme.colorScheme.shadow)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.surface)
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Box (
                    modifier = Modifier
                        .height(160.dp)
                        .width(160.dp)
                        .padding(12.dp)
                ) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(lecturer.imageUrl)
                            .crossfade(true)
                            .build(),
                        contentDescription = "Staff Image",
                        placeholder = painterResource(R.drawable.profile_image),
                        modifier = Modifier
                            .height(160.dp)
                            .width(160.dp)
                            .clip(CircleShape)
                            .border(2.dp, MaterialTheme.colorScheme.outline, CircleShape)
                    )
                }
            }

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .shadow(6.dp, shape = RoundedCornerShape(12.dp), spotColor = MaterialTheme.colorScheme.shadow)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.background),
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 12.dp, bottom = 8.dp, top = 18.dp),
                ) {
                    Text(
                        text = "Name: ",
                        modifier = Modifier.weight(.3f),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = lecturer.name,
                        modifier = Modifier.weight(.7f)
                    )
                }

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 12.dp, top = 8.dp, bottom = 8.dp),
                ) {
                    Text(
                        text = "Description: ",
                        modifier = Modifier.weight(.3f),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Text(
                        text = lecturer.description,
                        modifier = Modifier.weight(.7f)
                    )
                }

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 12.dp, top = 8.dp, bottom = 8.dp),
                ) {
                    Text(
                        text = "Contacts: ",
                        modifier = Modifier.weight(.3f),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Column (
                        modifier = Modifier.weight(.7f)
                    ) {
                        Text(
                            text = lecturer.phone,
                        )
                        Text(
                            text = lecturer.email,
                        )
                    }
                }

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 12.dp, top = 8.dp, bottom = 8.dp),
                ) {
                    Text(
                        text = "Research Areas: ",
                        modifier = Modifier.weight(.3f),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.titleMedium.fontSize,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Column (
                        modifier = Modifier.weight(.7f)
                    ) {
                        lecturer.researchInterests.forEach { item ->
                            Text(
                                text = item,
                            )
                        }
                    }
                }
            }
        }
    }
}