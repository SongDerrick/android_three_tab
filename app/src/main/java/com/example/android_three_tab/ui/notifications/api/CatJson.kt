package com.example.android_three_tab.ui.notifications.api

data class CatJson(
    val __v: Int,
    val _id: String,
    val createdAt: String,
    val deleted: Boolean,
    val status: Status,
    val text: String,
    val type: String,
    val updatedAt: String,
    val user: String
)