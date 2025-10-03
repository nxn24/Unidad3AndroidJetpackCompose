package com.sm252.thirtydaycooking.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Recipe(
    @StringRes val day: Int,
    @StringRes val title: Int,
    @StringRes val description: Int,
    @DrawableRes val imageRes: Int
)
