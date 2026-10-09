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
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner)),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(backgroundColorRes)
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = dimensionResource(R.dimen.card_elevation)
        )
    ) {
        Row(
            modifier = Modifier.padding(
                horizontal = dimensionResource(R.dimen.padding_card_horizontal),
                vertical = dimensionResource(R.dimen.padding_card_vertical)
            ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.spacing_content))
        ) {
            LogoImage()

            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.spacing_text))
            ) {
                Text(
                    text = stringResource(nameRes),
                    color = colorResource(R.color.text_white),
                    fontSize = dimensionResource(R.dimen.text_name).value.sp,
                    fontWeight = nameFontWeight,
                    fontFamily = nameFontFamily,
                    fontStyle = nameFontStyle
                )
                if (phoneRes != null) {
                    Text(
                        text = stringResource(phoneRes),
                        color = colorResource(R.color.text_cyan),
                        fontSize = dimensionResource(R.dimen.text_detail).value.sp
                    )
                }
                Text(
                    text = stringResource(addressRes),
                    color = colorResource(addressColorRes),
                    fontSize = dimensionResource(R.dimen.text_detail).value.sp
                )
            }

            LogoImage()
        }
    }
}

@Composable
private fun LogoImage() {
    Image(
        painter = painterResource(R.drawable.logo_umy),
        contentDescription = stringResource(R.string.logo_description),
        modifier = Modifier.size(dimensionResource(R.dimen.logo_size))
    )
}