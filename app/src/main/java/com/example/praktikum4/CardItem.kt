package com.example.praktikum4

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun CardItem(
    @ColorRes backgroundColorRes: Int,
    @StringRes nameRes: Int,
    @StringRes addressRes: Int,
    @ColorRes addressColorRes: Int,
    modifier: Modifier = Modifier,
    @StringRes phoneRes: Int? = null,
    nameFontFamily: FontFamily = FontFamily.Default,
    nameFontStyle: FontStyle = FontStyle.Normal,
    nameFontWeight: FontWeight = FontWeight.Bold
)