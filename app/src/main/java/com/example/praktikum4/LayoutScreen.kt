package com.example.praktikum4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun LayoutScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.screen_background))
            .padding(dimensionResource(R.dimen.padding_screen)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.spacing_card))
    ) {
        Header()

        CardItem(
            backgroundColorRes = R.color.card_gray,
            nameRes = R.string.name_1,
            addressRes = R.string.address_1,
            addressColorRes = R.color.text_yellow,
            nameFontFamily = FontFamily.Cursive,
            nameFontStyle = FontStyle.Italic,
            nameFontWeight = FontWeight.Normal
        )
        CardItem(
            backgroundColorRes = R.color.card_purple,
            nameRes = R.string.name_2,
            phoneRes = R.string.phone_2,
            addressRes = R.string.address_2,
            addressColorRes = R.color.text_yellow
        )
        CardItem(
            backgroundColorRes = R.color.card_blue,
            nameRes = R.string.name_3,
            phoneRes = R.string.phone_3,
            addressRes = R.string.address_3,
            addressColorRes = R.color.text_white
        )
        CardItem(
            backgroundColorRes = R.color.card_green,
            nameRes = R.string.name_4,
            phoneRes = R.string.phone_4,
            addressRes = R.string.address_4,
            addressColorRes = R.color.text_white
        )

        Spacer(Modifier.weight(1f))

        Text(
            text = stringResource(R.string.footer_copyright),
            color = colorResource(R.color.text_primary),
            fontSize = dimensionResource(R.dimen.text_footer).value.sp
        )
    }
}

@Composable
private fun Header() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.spacing_header)),
        modifier = Modifier.padding(bottom = dimensionResource(R.dimen.spacing_header_bottom))
    ) {
        Text(
            text = stringResource(R.string.header_title),
            color = colorResource(R.color.text_primary),
            fontSize = dimensionResource(R.dimen.text_header_title).value.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.header_subtitle),
            color = colorResource(R.color.text_primary),
            fontSize = dimensionResource(R.dimen.text_header_subtitle).value.sp,
            fontWeight = FontWeight.Bold
        )
    }
}