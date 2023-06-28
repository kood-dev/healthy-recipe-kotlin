package com.godkoo.healthyrecipe.common.exception

import org.springframework.http.HttpStatus

enum class ExceptionType(
    val code: String,
    val status: Int,
    val messageCode: String
) {
    // universal
    U_EXPIRED_SESSION("001", HttpStatus.UNAUTHORIZED.value(), "message.properties setting");

    val errorCode = status.toString() + code

    /**
     * Notice.Use after application context loading
     */
    fun getMessage(): String {
        return messageCode
    }

}
