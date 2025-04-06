package com.kavi.droid.kln.demo.maths.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kavi.droid.color.palette.extension.quaternary
import com.kavi.droid.kln.demo.maths.R
import com.kavi.droid.kln.demo.maths.model.MenuItemModel
import javax.inject.Inject

class MathsDeptUI @Inject constructor() {

    @Inject
    lateinit var bottomModelUI: MenuItemModelUI

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    internal fun MathDeptUI() {

        val sheetState = rememberModalBottomSheetState()
        val showSheet = remember { mutableStateOf(false) }
        val menuItemModel = remember { mutableStateOf<MenuItemModel>(MenuItemModel.STAFF)}

        var isExpanded by remember { mutableStateOf(false) }

        Scaffold { innerPadding ->
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Row (
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(8.dp),
                        text = "Dept of Mathematics",
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
                        painter = painterResource(id = R.drawable.maths_image),
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
                                .padding(12.dp),
                            text = if (isExpanded) stringResource(R.string.maths_dpt_desc) else stringResource(R.string.maths_dpt_desc_short),
                            style = TextStyle(
                                fontSize = MaterialTheme.typography.bodySmall.fontSize
                            )
                        )
                    }

                    Text(
                        modifier = Modifier
                            .padding(start = 12.dp, top = 4.dp)
                            .clickable { isExpanded = !isExpanded },
                        text = if (isExpanded) stringResource(R.string.read_less) else stringResource(R.string.read_more),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.bodySmall.fontSize,
                            color = MaterialTheme.colorScheme.quaternary
                        )
                    )
                }

                MenuBoard(showSheet = showSheet, menuItemModel = menuItemModel)

                if (showSheet.value) {
                    bottomModelUI.MenuItemSheet(sheetState, showSheet, menuItemModel.value)
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    private fun MenuBoard(showSheet: MutableState<Boolean>, menuItemModel: MutableState<MenuItemModel>) {
        Column {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 2.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    text = "Menu Board",
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp)
            ) {
                Column (
                    Modifier
                        .weight(1f)
                        .padding(top = 4.dp)
                ) {
                    OutlinedButton(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        onClick = {
                            menuItemModel.value = MenuItemModel.STAFF
                            showSheet.value = true
                        }
                    ) {
                        Text(text = "Staff")
                    }

                    OutlinedButton(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        onClick = {
                            menuItemModel.value = MenuItemModel.ABOUT_US
                            showSheet.value = true
                        }
                    ) {
                        Text(text = "About Us")
                    }
                }
                Column (
                    Modifier
                        .weight(1f)
                        .padding(top = 4.dp)
                ) {
                    OutlinedButton(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        onClick = {
                            menuItemModel.value = MenuItemModel.NEWS
                            showSheet.value = true
                        }
                    ) {
                        Text(text = "News")
                    }

                    OutlinedButton(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        onClick = {
                            menuItemModel.value = MenuItemModel.CONTACT_US
                            showSheet.value = true
                        }
                    ) {
                        Text(text = "Contact Us")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MathDeptUIPreview() {
    //MathDeptUI()
}