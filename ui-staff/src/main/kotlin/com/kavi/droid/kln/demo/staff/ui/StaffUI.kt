package com.kavi.droid.kln.demo.staff.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.request.ImageRequest
import coil.compose.AsyncImage
import com.kavi.droid.color.palette.extension.shadow
import com.kavi.droid.kln.demo.parent.model.StaffData
import com.kavi.droid.kln.demo.staff.R
import javax.inject.Inject

class StaffUI @Inject constructor() {

    @Composable
    internal fun StaffListUI(staffData: StaffData?) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, bottom = 8.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(8.dp),
                    text = "Academic Staff - ${staffData?.deptName}",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }

            staffData?.let {
                it.staffList.forEach { lecturer ->
                    LecturerItem(
                        imageUrl = lecturer.imageUrl,
                        name = lecturer.name,
                        description = lecturer.description
                    )
                }
            }?: run {
                Text(text = "No Data Found")
            }
        }
    }

    @Composable
    internal fun NoStaffDataUI() {
        Text(text = "No Staff Data Found")
    }

    @Composable
    private fun LecturerItem(
        imageUrl: String,
        name: String,
        description: String
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .border(1.dp, MaterialTheme.colorScheme.outline, RoundedCornerShape(12.dp))
                .shadow(6.dp, shape = RoundedCornerShape(12.dp), spotColor = MaterialTheme.colorScheme.shadow)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.surface)
        ) {
            Box (
                modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)
                    .padding(12.dp)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(imageUrl)
                        .crossfade(true)
                        .build(),
                    contentDescription = "Staff Image",
                    placeholder = painterResource(R.drawable.profile_image),
                    modifier = Modifier
                        .height(80.dp)
                        .width(80.dp)
                        .clip(CircleShape)
                )
            }
            Column {
                Text(
                    modifier = Modifier
                        .padding(top = 12.dp, end = 12.dp),
                    text = name,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    modifier = Modifier
                        .padding(bottom = 12.dp, top = 8.dp, end = 12.dp),
                    text = description,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MathDeptUIPreview() {
    /*LecturerItem(
        imageUrl = "https://science.kln.ac.lk/depts/maths/images/Staff/Academic/10.jpg",
        name = "Dr. (Mrs.) L. P. N. D. Premarathna",
        description = "Head of the department and Senior Lecturer (Grade I) Ph.D (Massey, NZ), M.Sc.(Moratuwa), B.Sc.(Kelaniya)"
    )*/
}