package com.godkoo.healthyrecipe.account.domain

data class Account(
    val accountId: Long,
    val accountName: String,
    val email: String,
    val mobile: String
)
